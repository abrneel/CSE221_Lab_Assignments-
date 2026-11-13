import java.util.*;
import java.io.*;
public class G4{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        while(0<k--){
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            arr[x][y] = 1;
        }
        boolean flag = false;
        int[] xCo = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] yCo = {1, 2, 2, 1, -1, -2, -2, -1};
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 1){
                    for(int x = 0; x < 8; x++){
                        int tempX = i + xCo[x];
                        int tempY = j + yCo[x];
                        if(tempX>=0 && tempY >= 0 && tempX < n && tempY < m){
                            if(arr[tempX][tempY] == 1){
                                flag = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if(flag) pw.println("YES");
        else pw.println("NO");
        pw.flush();
    }
}
