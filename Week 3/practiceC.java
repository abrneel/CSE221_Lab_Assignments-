import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class practiceC {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;

        st = new StringTokenizer(bf.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long n = 107;
        long ans = helper(a, b, n);
        pw.println(ans);
        pw.flush();
    }
    public static long helper(long a, long b, long n){   //fast modular exponentiation 
        if(b == 0) return (long)1;
        if(b == 1) return a % n;
        long remainder = b % 2;
        long quotient = b / 2;
        long returned = helper(a, quotient, n);
        if(remainder == 0){
            return (long)((returned*returned) % n);
        }
        else{
            long temp = (long)((returned*returned) % n);
            return (temp * a) % n;
        }
    }
}
