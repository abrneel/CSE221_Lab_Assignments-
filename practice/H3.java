import java.util.*;
import java.io.*;
public class H3{
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int len = Integer.parseInt(bf.readLine());
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];
        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < len; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < len; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        helper(arr1, arr2, arr2.length-1);
    }
    public static void helper(int[] arr1, int[] arr2, int index){
        if(arr1.length == 0) return;  //forgot base case and write it down!
        int mid = arr2[index];
        int midIndex = 0;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i]==mid){
                midIndex = i;
                break;
            }
        }
        int[] a1 = new int[midIndex];
        int[] a2 = new int[arr1.length-midIndex-1];
        int tempIndex = 0;
        for(int i = 0; i < a1.length; i++){
            a1[i] = arr1[tempIndex++];
        }
        for(int i = 0; i < a2.length; i++){
            a2[i] = arr1[++tempIndex];
        }
        pw.print(mid + " ");
        pw.flush();
        helper(a1, arr2, index-a2.length-1);
        helper(a2, arr2, index-1);
    }
}