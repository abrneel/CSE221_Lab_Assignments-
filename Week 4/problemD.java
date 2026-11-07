import java.util.*;
import java.io.*;
public class problemD{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        
        st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for(int i = 0; i < m; i ++){
            int x = Integer.parseInt(st1.nextToken());
            int y = Integer.parseInt(st2.nextToken());
            arr[x] += 1;
            arr[y] += 1;
        }
        boolean flag = true;
        int count = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] % 2 != 0) count++;
            if(count>2){
                flag = false;
                break;
            }
        }

        if(flag) pw.println("YES");
        else pw.println("NO");
        pw.flush();
    } 
}