import java.util.*;
import java.io.*;

public class solutionH{
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
        int[] arr = new int[len];
        int low = 1;
        int high = -1;
        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]>high) high = arr[i];
        }
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            long sum = 0;
            for(int i = 0; i < len; i++){
                sum += arr[i]/mid;
            }
            if(sum>=k){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }


        pw.println(ans);
        pw.flush();
    }
}