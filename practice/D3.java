import java.util.*;
import java.io.*;
public class D3{
    public static long mod = (long)1000000000 + 7;
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        int tests = Integer.parseInt(bf.readLine());
        while(0<tests--){
            st = new StringTokenizer(bf.readLine());
            long[] arr = new long[4];
            for(int i = 0; i < 4; i++){
                arr[i] = Long.parseLong(st.nextToken());
            }
            long power = Long.parseLong(bf.readLine());
            arr = helper(arr, power);
            pw.println(arr[0] + " " + arr[1]);
            pw.println(arr[2] + " " + arr[3]);
        }
        pw.flush();
    }
    public static long[] helper(long[] arr, long power){
        if(power == 1) return arr; //bug, power == 0  should return identity matrix so stay at power 1
        long[] temp = helper(arr, (long)power/2);
        if(power % 2 == 0) return multiply(temp, temp);
        else return multiply(multiply(temp, temp), arr);
    }
    public static long[] multiply(long[] a1, long[] a2){
        long[] arr = new long[4];
        arr[0] = (long)(a1[0]*a2[0] + a1[1]*a2[2]) % mod;
        arr[1] = (long)(a1[0]*a2[1] + a1[1]*a2[3]) % mod;
        arr[2] = (long)(a1[2]*a2[0] + a1[3]*a2[2]) % mod;
        arr[3] = (long)(a1[2]*a2[1] + a1[3]*a2[3]) % mod;
        return arr;
    }
}