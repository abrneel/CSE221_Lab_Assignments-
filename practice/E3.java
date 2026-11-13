import java.util.*;
import java.io.*;
public class E3{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        int tests = Integer.parseInt(bf.readLine());
        while(0<tests--){
            st = new StringTokenizer(bf.readLine());
            long a = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            long[] ans = helper(a, n, m);
            pw.println(ans[0]);
        }
        pw.flush();
    }
    public static long[] helper(long a, long n, long m){
	    if(n == 0) return new long[] {0, 1 % m};
	    if(n % 2 == 0){
	        long[] temp = helper(a, n/2, m);
	        long sum = (temp[0] + temp[0] * temp[1]) % m;
	        long power = (temp[1] * temp[1]) % m;
	        return new long[] {sum, power};
	    }
	    else{
	        long[] temp = helper(a, n-1, m);
	        long sum = temp[0];
	        long power = (temp[1]*a) % m;
	        sum = (sum + power) % m;
	        return new long[] {sum, power};
	    }
	}
}