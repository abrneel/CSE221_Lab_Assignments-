import java.util.*;
import java.io.*;
public class H4{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        
        st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n+1][n+1];
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < n+1; j++){
                if(i != j){
                    if(gcd(i, j) == 1){
                        arr[i][j] = 1;
                    }
                }
            }
        }

        while(0<q--){
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            int count = 0;
            int ans = -1;                    //example ans has -1 if value not present
            for(int j = 1; j < n+1; j++){
                if(arr[i][j] == 1){
                    count++;
                    if(count == t) ans = j; //print if count just incremented 
                }                           
            }
            pw.println(ans);
        }
        pw.flush();
    }
    public static int gcd(int i, int j){
        if(i == 0) return j;
        if(j == 0) return i;
        return gcd(j, i%j);
    }
}