import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class practiceB {
    static long inversions; //global inversion counter
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;

        int len = Integer.parseInt(bf.readLine());
        int[] arr = new int[len];
        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        arr = mergeS(arr);
        pw.println(inversions);
        pw.flush();

    }
    public static int[] mergeS(int[] arr){
        int len = arr.length;
        if(len <= 1) return arr;
        int[] arr1 = new int[len/2];
        int[] arr2 = new int[len - len/2];
        int j = 0;
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = arr[j++];
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr[j++];
        }
        int[] a1 = mergeS(arr1);
        int[] a2 = mergeS(arr2);
        return merge(a1, a2);
    }
    public static int[] merge(int[] a1, int[] a2){
        int len1 = a1.length;
        int len2 = a2.length;

        for(int j = 0; j < len2; j++){
            countInversions(a1, (long)a2[j]*a2[j]);
        }

        int i = 0;
        int j = 0;

        int[] a = new int[len1+len2];
        int index = 0;

        while(true){
            if(i < len1 && j < len2){
                if(a1[i] < a2[j]) a[index++] = a1[i++];
                else a[index++] = a2[j++]; 
            }
            else{
                if(i == len1){
                    while(j < len2) a[index++] = a2[j++];
                }
                if(j == len2){
                    while(i < len1) a[index++] = a1[i++];
                }
                break;
            }
        }
        return a;
    }
    public static void countInversions(int[] a, long target){
        int i = 0;
        int j = a.length; //why not j = len? as the value might not even exist so i = len and inversions += 0
        while(i<j){
            int mid = (i+j)/2;
            if(a[mid] <= target) i = mid + 1;
            else j = mid;  //as I'm looking for a value strictly greater than target, that's why j = mid
        }
        inversions += a.length - i;
    }
}
