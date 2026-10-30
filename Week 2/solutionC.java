import java.util.*;
import java.io.*;

public class solutionC{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;

        int len1 = Integer.parseInt(bf.readLine());
        String input1 = bf.readLine();
        int len2 = Integer.parseInt(bf.readLine());
        String input2 = bf.readLine();

        st = new StringTokenizer(input1);
        int[] arr1 = new int[len1];
        for(int i = 0; i < len1; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(input2);
        int[] arr2 = new int[len2];
        for(int i = 0; i < len2; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        int[] ans = new int[len1+len2];
        int ii = 0;
        int jj = 0;
        int index = 0;
        while(ii<len1 && jj<len2){
            if(arr1[ii]<arr2[jj]){
                ans[index] = arr1[ii];
                ii++;
            }
            else{
                ans[index] = arr2[jj];
                jj++;
            }
            index++;
        }
        if(index != ans.length){
            if(ii==len1){
                while(jj<len2){
                    ans[index] = arr2[jj];
                    jj++;
                    index++;
                }   
            }
            else if(jj==len2){
                while(ii<len1){
                    ans[index] = arr1[ii];
                    ii++;
                    index++;
                }
            }
        }
        
        
        for(int i = 0; i < ans.length; i++){
            pw.print(ans[i]+" ");
        }
        pw.println("");
        pw.flush();
    }
}