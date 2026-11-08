import java.io.*;
import java.util.*;

public class solutionE {
    public static long halfPower; //most important to escape TLE
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
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;

        int tests = Integer.parseInt(bf.readLine());

        while(tests-->0){
            halfPower = 1;
            st = new StringTokenizer(bf.readLine());

            long a = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            pw.println(sum(a, n, m));
        }
        pw.flush();
    }
    public static long sum(long a, long n, long m){
        if(a == 1) return n % m;
        if(n == 0) return 0;
        if(n % 2 != 0){
            long temp = sum(a, n-1, m);
            halfPower = (halfPower * a) % m;
            return (temp + halfPower) % m;
        }
        else{
            long temp = sum(a, n/2, m);
            long ans = (temp + (halfPower * temp) % m) % m;  
            halfPower = (halfPower * halfPower) % m;              
            return ans;
        }
    }
}


