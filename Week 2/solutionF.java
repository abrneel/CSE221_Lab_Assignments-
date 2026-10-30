import java.util.*;
import java.io.*;

public class solutionF{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;

        
        String input1 = bf.readLine();
        String input2 = bf.readLine();

        st = new StringTokenizer(input1);
        int len = Integer.parseInt(st.nextToken());
        int inputs = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(input2);
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while(0<inputs--){
            st = new StringTokenizer(bf.readLine());
            int lower = Integer.parseInt(st.nextToken());;
            int upper = Integer.parseInt(st.nextToken());
            int i = helperLower(arr, lower);
            int j = helperUpper(arr, upper);
            pw.println(j-i);
        }

        pw.flush();
    }
    public static int helperLower(int[] arr, int val){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int mid = (i+j)/2;
            if(arr[mid] < val) i = mid+1;
            else j = mid;
        }
        return i;
    }
    public static int helperUpper(int[] arr, int val){
        int i = 0;
        int j = arr.length;
        while(i<j){
            int mid = (i+j)/2;
            if(arr[mid] <= val) i = mid+1;
            else j = mid;
        }
        return j;
    }
}