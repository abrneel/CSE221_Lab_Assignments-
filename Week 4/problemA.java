import java.util.*;
import java.io.*;
public class problemA{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];
        int inputs = m;
        while(0<inputs--){
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            int weight = Integer.parseInt(st.nextToken());
            arr[x][y] = weight;
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