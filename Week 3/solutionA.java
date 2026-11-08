import java.io.*;
import java.util.*;

public class solutionA {
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
        for(int i = 0; i < len; i++){
            pw.print(arr[i] + " ");
        }
        pw.println("");
        pw.flush();

    }
    public static int[] mergeS(int[] arr){
        if(arr.length == 1) return arr;
        int[] arr1 = new int[arr.length/2];
        int[] arr2 = new int[arr.length-arr.length/2];
        for(int i = 0; i < arr.length/2; i++){
            arr1[i] = arr[i];
        }
        int j = arr.length/2;
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = arr[j++];
        }
        int[] a1 = mergeS(arr1);
        int[] a2 = mergeS(arr2);
        return merge(a1, a2);
    }
    public static int[] merge(int[] arr1, int[] arr2){
     int i = 0;
     int j = 0;
     int[] arr = new int[arr1.length+arr2.length];
     int index = 0;
    while(true){
        if(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr[index] = arr1[i];
                index++;
                i++;
            }
            else{
                inversions += (long)(arr1.length - i); //counter increment 
                arr[index] = arr2[j];
                index++;
                j++;
            }
        }
        else if(i==arr1.length){
            while(j<arr2.length){
                arr[index] = arr2[j];
                index++;
                j++;
            }
            return arr;
            }
        else if(j==arr2.length){
            while(i<arr1.length){
                arr[index] = arr1[i];
                index++;
                i++;
            }
            return arr;
            }
        }
    }
}
