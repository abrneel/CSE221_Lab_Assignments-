import java.io.*;
import java.util.*;

public class solutionC {
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
    public static long helper(long a, long b, long n){
        if(b == 0) return (long)1;
        if(b == 1) return a; 
        long remainder = b % 2; //check this for op
        long dividedVal = b / 2; //pass in the function instead of b
        long operand = helper(a, dividedVal, n);
        if(remainder == 0) return (long)(operand*operand % n);
        if(remainder == 1){
            long temp = operand*operand % n;
            return temp*a % n;
        }
        else{
            return 0; //dummy return as compiler needs an else statement:)
        }
    }
}
