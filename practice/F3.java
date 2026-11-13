import java.util.*;
import java.io.*;
public class F3{
    public static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        int len = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        helper(arr);
    }
    public static void helper(int[] arr){
        int len = arr.length;
        if(len == 0) return;
        int mid = (len - 1) / 2;
        int root = arr[mid];
        pw.print(root + " ");
        pw.flush();
        int[] aL = new int[mid];
        int[] aR = new int[len-mid-1];
        int index = 0;
        for(int i = 0; i < aL.length; i++){
            aL[i] = arr[index++];
        }
        for(int i = 0; i < aR.length; i++){
            aR[i] = arr[++index];
        }
        helper(aL);
        helper(aR);
    }
}