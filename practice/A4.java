import java.util.*;
import java.io.*;
public class A4{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        
        st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][n];
        int tests = m;

        while(0<tests--){
            st = new StringTokenizer(bf.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            arr[u-1][v-1] = w;
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
