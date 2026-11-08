import java.io.*;
import java.util.*;

public class solutionH {
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
        helper(arr1, arr2, arr1.length-1);
    }
    public static void helper(int[] arr1, int[] arr2, int x){
        PrintWriter pw = new PrintWriter(System.out);
        int len = arr1.length;
        if(len == 0) return;
        int root = arr2[x];
        int flag = -1;
        for(int i = 0; i < len; i++){
            if(arr1[i] == root){
                flag = i;
                break;
            } 
        }
        int[] arrL = new int[flag];
        int[] arrR = new int[len-flag-1];
        int tempIndex = 0;
        for(int i = 0; i < arrL.length; i++){
            arrL[i] = arr1[tempIndex++];
        }
        tempIndex++;
        for(int i = 0; i < arrR.length; i++){
            arrR[i] = arr1[tempIndex++];
        }
        pw.print(root+" ");
        pw.flush();
        helper(arrL, arr2, x-1-arrR.length); 
        helper(arrR, arr2, x-1);
    }
}