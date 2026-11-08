import java.io.*;
import java.util.*;

public class solutionG {
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
        helper(arr2, arr1, 0);
    }
    public static void helper(int[] arr1, int[] arr2, int index){
        PrintWriter pw = new PrintWriter(System.out);
        if(arr2.length == 0) return;
        int root = arr1[index];
        int flag = -1;
        for(int i = 0; i < arr2.length; i++){
            if(arr2[i] == root){
                flag = i;
                break;
            }
        }
        int[] arrL = new int[flag];
        int[] arrR = new int[arr2.length-flag-1];
        int tempIndex = 0;
        for(int i = 0; i < arrL.length; i++){
            arrL[i] = arr2[tempIndex++];
        }
        tempIndex++;
        for(int i = 0; i < arrR.length; i++){
            arrR[i] = arr2[tempIndex++];
        }
        helper(arr1, arrL, index+1); //pre-order left root increments 
        helper(arr1, arrR, index + 1 + arrL.length);
        pw.print(root+" ");
        pw.flush();
    }
}
