import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class practiceF {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int len = Integer.parseInt(bf.readLine());
        int[] arr = new int[len];
        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        helper(arr);
    }
    public static void helper(int[] arr){
        if(arr.length == 0) return;
        PrintWriter pw = new PrintWriter(System.out);
        int len = arr.length;
        int mid = (len - 1) / 2;   //mid choosing logic
        int len1 = mid;
        int len2 = len - mid - 1;
        int[] a1 = new int [len1];
        int[] a2 = new int [len2];
        int j = 0;
        for(int i = 0; i < len1; i++){
            a1[i] = arr[j++];
        }
        for(int i = 0; i < len2; i++){
            a2[i] = arr[++j];
        }
        pw.print(arr[mid] + " ");
        pw.flush();
        helper(a1);
        helper(a2);
    }
}
