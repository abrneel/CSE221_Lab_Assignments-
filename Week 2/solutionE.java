import java.util.*;
import java.io.*;

public class solutionE{
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;

        String input1 = bf.readLine();
        String input2 = bf.readLine();

        st = new StringTokenizer(input1);
        int len = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(input2);
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int i = 0;
        int j = 0;
        int[] count = new int[len+1];
        count[arr[j]]++;
        int maxLen = 1;
        int currLen = 1;
        int distinct = 1;
        while(j<len-1 && i<len){
            j++;
            currLen++;
            if(count[arr[j]] == 0){
                distinct++;
            }
            count[arr[j]]++;
            if(distinct>K){
                while(distinct>K){
                    currLen--;
                    count[arr[i]]--;
                    if(count[arr[i]] == 0) distinct--;
                    i++;
                }
            }

            if(currLen>maxLen) maxLen = currLen;

        }
        pw.println(maxLen);
        pw.flush();

    }
}