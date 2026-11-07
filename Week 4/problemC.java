import java.util.*;
import java.io.*;
public class problemC{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());
        int test = 0;
        int[][] arr = new int[n][n];

        while(test < n){
            st = new StringTokenizer(bf.readLine());
            int temp = Integer.parseInt(st.nextToken());
            while(0<temp--){
                int x = Integer.parseInt(st.nextToken());;
                arr[test][x] = 1;
            }
            test++;
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