import java.util.*;
import java.io.*;
public class problemG{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        
        String input = bf.readLine();
        st = new StringTokenizer(input);

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int inputs = k;
        boolean flag = false;
        int[][] arr = new int[n][m];
        int[] xPositions = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] yPositions = {1, 2, 2, 1, -1, -2, -2, -1};
        while(0 < inputs--){
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            arr[x][y] = 1;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 1){  //forgot to check if the current index itself has a knight or not
                    for(int z = 0; z < 8; z++){
                        int xCo = i + xPositions[z];
                        int yCo = j + yPositions[z];
                        if(xCo>=0 && yCo>=0 && xCo<n && yCo<m){
                            if(arr[xCo][yCo] == 1){
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