import java.io.*;
import java.util.*;

public class solutionD{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        int inputs = Integer.parseInt(bf.readLine());
        while(inputs>0){
            int len = Integer.parseInt(bf.readLine());
            st = new StringTokenizer(bf.readLine());
            int[] arr = new int[len];
            int index = 0;
            while(index < len){
                arr[index] = (Integer.parseInt(st.nextToken()));
                index++;
            }
            boolean flag = true;
            for(int i = 0; i < len - 1; i++){
                if(arr[i]>arr[i+1]){
                    flag = false;
                }
            }
            if(flag) pw.println("YES");
            else pw.println("NO");
            inputs--;
        }
        pw.flush();
    }
}