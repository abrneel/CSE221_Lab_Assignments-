import java.util.*;
import java.io.*;
public class problemH{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        
        String input = bf.readLine();
        st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int inputs = q;
        
        int[][] arr = new int[n+1][n+1];
        //make the array
        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j < arr[0].length; j++){
                if(gcd(i, j) == 1 && i != j){
                    arr[i][j] = 1;
                }
            }
        }

        while(0<inputs--){
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int ans = -1;
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[x][i] == 1){
                    count++;
                    if(count == k) ans = i;
                }
                
            }

            pw.println(ans);
        }

        pw.flush();
    }
    public static int gcd(int i, int j){ //figure ts
        if(i == 0) return j;
        if(j == 0) return i;
        return gcd(j, i%j);
    }
}
