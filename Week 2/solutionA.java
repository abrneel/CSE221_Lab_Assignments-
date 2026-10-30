import java.util.*;
import java.io.*;

public class solutionA {
    public static void main(String[] agrs)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;

        int len = -1;
        int target = -1;

        String input1 = bf.readLine();
        String input2 = bf.readLine();
        st = new StringTokenizer(input1);
        len = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());

        int[] arr = new int[len];
        st = new StringTokenizer(input2);
        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int left = 0;
        int right = len-1;
        boolean found = false;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                found = true;
                break;
            }
            else{
                if(sum<target){
                   left++;
                }
                else{
                   right--;
                }
            }
        }
        if(found){
            pw.println((left+1)+" "+(right+1));
        }
        else pw.println(-1);
        pw.flush();
    }
}
