import java.io.*;
import java.util.*;

public class solutionB{
    public static void main(String[] agrs)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        int T = Integer.parseInt(bf.readLine());
        while(T > 0){
            String input = bf.readLine();
            st = new StringTokenizer(input);
            st.nextToken();
            Long x = Long.parseLong(st.nextToken());
            String OP = st.nextToken();
            Long y = Long.parseLong(st.nextToken());
            switch(OP){
                case "+":
                    pw.println(x+y);
                    break;
                case "-":
                    pw.println(x-y);
                    break;
                case "*":
                    pw.println(x*y);
                    break;
                case "/":
                    double temp = (double)x / (double)y;
                    pw.println(temp);
                    break;
                case "%":
                    pw.println(x%y);
                    break;
                case "&":
                    pw.println(x&y);
                    break;
                case "|":
                    pw.println(x|y);
                    break;
                case "^":
                    pw.println(x^y);
                    break;
                case "<<":
                    pw.println(x<<y);
                    break;
                case ">>":
                    pw.println(x>>y);
                    break;
            }
            T--;
        }
        pw.flush();
    }
}
