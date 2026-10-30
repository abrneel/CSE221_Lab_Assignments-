import java.util.*;
import java.io.*;

public class solutionB{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;

        String input1 = bf.readLine();
        String input2 = bf.readLine();
        String input3 = bf.readLine();

        st = new StringTokenizer(input1);
        int len1 = Integer.parseInt(st.nextToken());
        int len2 = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        
        st = new StringTokenizer(input2);
        for(int i = 0; i < len1; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(input3);
        for(int i = 0; i < len2; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        int index1 = 0;
        int index2 = len2-1;
        long min = Math.abs(arr1[index1] + arr2[index2] - K);

        int i = 0;
        int j = len2-1;
        while(i<len1 && j >= 0){
            long sum = arr1[i] + arr2[j];
            long diff = Math.abs(sum - K);
            if(diff<min){
                min = diff;
                index1 = i;
                index2 = j;
            }
            if(sum==K) break;
            else if(sum<K) i++;
            else j--;
        }
        
        pw.println((index1+1)+" "+(index2+1));
        pw.flush();
    }
}