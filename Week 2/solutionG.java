import java.util.*;
import java.io.*;

public class solutionG{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;

        
        String input1 = bf.readLine();
        String input2 = bf.readLine();

        st = new StringTokenizer(input1);
        int len = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        st = new StringTokenizer(input2);
        long[] arr = new long[len];
        long max = -1;
        long sum = 0;
        for(int i = 0; i < len; i++){
            arr[i] = Long.parseLong(st.nextToken());
            sum += arr[i];
            if(max<arr[i]) max = arr[i];
        }

        long i = max;
        long j = sum;
        while(i<j){
            long mid = (i+j)/2;
            long currSum = 0;
            long currK = 1;
            for(int x = 0; x < len; x++){
                if(currSum+arr[x] > mid){
                    currSum = 0;
                    currK++;
                }
                if(currK>k){
                    break;
                }
                currSum += arr[x];
            }
            if(currK <= k){
                j = mid;
            }
            else{
                i = mid + 1;
            }
        }
        pw.println(i);
        pw.flush();
    }
}
