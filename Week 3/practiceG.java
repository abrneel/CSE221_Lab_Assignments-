import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class practiceG {
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1;
        StringTokenizer st2;

        int len = Integer.parseInt(bf.readLine());
        st1 = new StringTokenizer(bf.readLine());
        st2 = new StringTokenizer(bf.readLine());

        int[] arr1 = new int[len];
        int[] arr2 = new int[len];
        for(int i = 0; i < len; i++){
            arr1[i] = Integer.parseInt(st1.nextToken());
            arr2[i] = Integer.parseInt(st2.nextToken());
        }
        helper(arr1, arr2, 0);
    }
    public static void helper(int[] arr1, int[] arr2, int index){ //go over note
        if(arr1.length == 0) return;
        int root = arr2[index];
        int rootIndex = 0;
        for(int i = 0; i < arr1.length; i++){
            if(root == arr1[i]){
                rootIndex = i;
                break;
            }
        }

        int[] arrL = new int[rootIndex];
        int[] arrR = new int[arr1.length-rootIndex-1];
        int j = 0;
        for(int i = 0; i < arrL.length; i++){
            arrL[i] = arr1[j++];
        }
        for(int i = 0; i < arrR.length; i++){
            arrR[i] = arr1[++j];
        }
        helper(arrL, arr2, index + 1);
        helper(arrR, arr2, index + 1 + arrL.length);
        pw.print(root + " ");
        pw.flush();
    }
}
