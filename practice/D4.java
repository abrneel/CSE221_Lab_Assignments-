import java.util.*;
import java.io.*;
public class D4{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        
        st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        StringTokenizer st2 = new StringTokenizer(bf.readLine());

        int[] arr = new int[n+1]; //READ THE QUESTION WE ONLY CARE ABOUT THE DEGREE
        int tests = m;
        while(0<tests--){
            int i = Integer.parseInt(st1.nextToken());
            int j = Integer.parseInt(st2.nextToken());
            arr[i]--;
            arr[j]++;
        }
        boolean flag = true;
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0) oddCount++;
            if(oddCount > 2) break;
        }
        if(oddCount > 2) flag = !flag;
        if(flag) pw.println("YES");
        else pw.println("NO");
        pw.flush();
    }
}