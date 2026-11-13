import java.util.*;
import java.io.*;
public class C3{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        
        st = new StringTokenizer(bf.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        pw.println(fme(a, b));
        pw.flush();
    }
    public static long fme(long a, long b){
        if(b == 0) return 1;
        if(b == 1) return a % 107;
        long q = b / 2;
        long r = b % 2;
        long ans = fme(a, q);
        if(r == 0){
            return (long) ans*ans % 107;
        }
        else{
            long temp = (long) ans*ans % 107;
            return (long) a * temp % 107;
        }
    }
}
