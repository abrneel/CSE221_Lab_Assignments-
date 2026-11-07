import java.util.*;
import java.io.*;
public class problemE{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        int[] arr = new int[n];

        while(0<m--){
            int x = Integer.parseInt(st1.nextToken()) - 1;
            int y = Integer.parseInt(st2.nextToken()) - 1;
            arr[x] -= 1;
            arr[y] += 1;
        }
        for(int i = 0; i < n; i++){
            pw.print(arr[i] + " ");
        }
        pw.flush();
    }
}
