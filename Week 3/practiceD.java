import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class practiceD {
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
    public static long[] helper(long[] arr, int power){  // x^4 = x^2 . x^2 or x^5 = x^2 . x^2 . x
        if(power == 1) return arr;
        long[] temp = helper(arr, power/2);
        if(power % 2 == 0) return multiply(temp, temp);
        else return multiply(multiply(temp, temp), arr);
    }   
    public static long[] multiply(long[] arr1, long[] arr2){
        long mod = 1000000000 + 7;
        long[] arr = new long[4];
        arr[0] = ( arr1[0]*arr2[0] + arr1[1] * arr2[2] ) % mod;
        arr[1] = ( arr1[0]*arr2[1] + arr1[1] * arr2[3] ) % mod;
        arr[2] = ( arr1[2]*arr2[0] + arr1[3] * arr2[2] ) % mod;
        arr[3] = ( arr1[2]*arr2[1] + arr1[3] * arr2[3] ) % mod;
        return arr;
    }
}
