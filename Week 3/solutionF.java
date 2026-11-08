import java.io.*;
import java.util.*;

public class solutionF {
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
        arr = helper(arr);
        for(int i = 0; i < len; i++){
            pw.print(arr[i]+" ");
        }
        pw.println();
        pw.flush();
    }
    public static int[] helper(int[] arr){
            int len = arr.length;
            if(len == 0) return arr;
            if(len == 1) return arr;
            if(len % 2 != 0){
            int[] arr1 = new int[len/2];
            int[] arr2 = new int[len/2];
            for(int i = 0; i < arr1.length; i++){
                arr1[i] = arr[i];
            }
            int index = (len+1)/2;
            for(int i = 0; i < arr2.length; i++){
                arr2[i] = arr[index++];
            }
            
            arr1 = helper(arr1);
            arr2 = helper(arr2);

            int[] ans = new int[len];
            ans[0] = arr[len/2];
            index = 1;
            for(int i = 0; i < arr1.length; i++){
                ans[index++] = arr1[i];
            }
            for(int i = 0; i < arr2.length; i++){
                ans[index++] = arr2[i];
            }
            return ans;
        }
        else{
            int[] arr1 = new int[(len/2)-1];
            int[] arr2 = new int[len/2];
            for(int i = 0; i < arr1.length; i++){
                arr1[i] = arr[i];
            }
            int index = (len)/2;
            for(int i = 0; i < arr2.length; i++){
                arr2[i] = arr[index++];
            }

            arr1 = helper(arr1);
            arr2 = helper(arr2);

            int[] ans = new int[len];
            ans[0] = arr[len/2 - 1];
            index = 1;
            for(int i = 0; i < arr1.length; i++){
                ans[index++] = arr1[i];
            }
            for(int i = 0; i < arr2.length; i++){
                ans[index++] = arr2[i];
            }
            return ans;
        }
    }
}