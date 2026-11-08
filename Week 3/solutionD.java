import java.io.*;
import java.util.*;

public class solutionD {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;

        int tests = Integer.parseInt(bf.readLine());

        while(0<tests--){
            long[] arr = new long[4];
            st = new StringTokenizer(bf.readLine());
            for(int i = 0; i < 4; i++){
                arr[i] = Long.parseLong(st.nextToken());
            }
            int power = Integer.parseInt(bf.readLine());
            arr = helper(arr, power);
            pw.println(arr[0] + " " + arr[1]);
            pw.println(arr[2] + " " + arr[3]);
        }
        pw.flush();
    }
    public static long[] helper(long[] arr, int power){
        if(power == 1) return arr;
        long[] temp = helper(arr, power/2);
        
        if(power % 2 != 0){
            return multiply(multiply(temp, temp), arr);
        }
        else{
            return multiply(temp, temp);
        }
    }
    public static long[] multiply(long arr1[], long[] arr2){
        long[] result = new long[4];
        long mod = 1000000000 + 7;
        result[0] = (arr1[0]*arr2[0] + arr1[1]*arr2[2]) % mod;
        result[1] = (arr1[0]*arr2[1] + arr1[1]*arr2[3]) % mod;
        result[2] = (arr1[2]*arr2[0] + arr1[3]*arr2[2]) % mod;
        result[3] = (arr1[2]*arr2[1] + arr1[3]*arr2[3]) % mod;
        return result;
    }
}