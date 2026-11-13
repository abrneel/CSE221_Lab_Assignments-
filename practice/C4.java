import java.util.*;
import java.io.*;
public class C4{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        
        int n = Integer.parseInt(bf.readLine());
        int test = n;
        int[][] arr = new int[n][n];
        int index = 0;
        while(0<test--){
            st = new StringTokenizer(bf.readLine());
            int k = Integer.parseInt(st.nextToken());
            while(0<k--){
                int i = Integer.parseInt(st.nextToken());
                arr[index][i] = 1;
            }
            index++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                pw.print(arr[i][j] + " ");
            }
            pw.println("");
        }
        pw.flush();
    }
}
