import java.util.*;
import java.io.*;
public class F4{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        
        int len = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int counter = 0;
        for(int i = -1; i < 2; i++){
            for(int j = -1; j < 2; j++){
                int xCo = x + i;
                int yCo = y + j;
                if(xCo > 0 && xCo <= len && yCo > 0 && yCo <= len){
                    if(xCo == x && yCo == y) continue; //if it is current index continue to skip
                    else counter++;
                }
            }
        }
        pw.println(counter);
        for(int i = -1; i < 2; i++){
            for(int j = -1; j < 2; j++){
                int xCo = x + i;
                int yCo = y + j;
                if(xCo > 0 && xCo <= len && yCo > 0 && yCo <= len){
                    if(xCo == x && yCo == y) continue;
                    else pw.println(xCo + " " + yCo);
                    
                }
            }
        }
        pw.flush();
    }
}