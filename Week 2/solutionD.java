import java.util.*;
import java.io.*;

public class solutionD{
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;

        String input1 = bf.readLine();
        String input2 = bf.readLine();

        st = new StringTokenizer(input1);
        int len = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(input2);
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxLen = 0;
        int currLen = 0;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j<len && i<len){
            sum += arr[j];
            currLen++;
            if(sum<=max){
                j++;
                if(currLen>maxLen) maxLen = currLen;
            }
            else{
                sum -= arr[i];
                sum -= arr[j];
                currLen -= 2;
                i++;
            }
        }
        pw.println(maxLen);
        pw.flush();

    }
}
