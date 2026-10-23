import java.io.*;
import java.util.*;

public class solutionF{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        int len = Integer.parseInt(bf.readLine());
        int[] arr = new int[len];
        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < len - 1; i++){
            int index = i + 1;
        // problem in sorting 
           while(index>0){
            if(arr[index] % 2 == 0 && arr[index-1] % 2 != 0 || arr[index-1] % 2 == 0 && arr[index] % 2 != 0) break;
            else{
                if(arr[index]<arr[index-1]){
                    int temp = arr[index];
                    arr[index] = arr[index-1];
                    arr[index-1] = temp;
                    index--;
                }
                else break;
            }
           }
        }
        for(int i = 0; i < len; i++){
            pw.print(arr[i] + " ");
        }
        pw.flush();
    }
}