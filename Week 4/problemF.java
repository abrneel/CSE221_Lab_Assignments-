import java.util.*;
import java.io.*;
public class problemF{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        
        int k = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int Nums = 0;

        for(int i = -1; i <= 1; i++){
            int xCo = x + i;
            for(int j = -1; j <=  1; j++){
                int yCo = y + j;
                if(xCo >= 1 && yCo >= 1 && xCo <= k && yCo <= k){
                    if(xCo == x && yCo == y){
                        continue;
                    }
                    else Nums++;
                }
            }
        }
        pw.println(Nums);

        for(int i = -1; i <= 1; i++){
            int xCo = x + i;
            for(int j = -1; j <=  1; j++){
                int yCo = y + j;
                if(xCo >= 1 && yCo >= 1 && xCo <= k && yCo <= k){
                    if(xCo == x && yCo == y){
                        continue;
                    }
                    else pw.println(xCo + " " + yCo);
                }
            }
        }
        pw.flush();
    }
}