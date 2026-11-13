import java.util.*;
import java.io.*;
public class B4{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        
        st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        StringTokenizer st3 = new StringTokenizer(bf.readLine());

        int[] arr1 = new int[m];
        int[] arr2 = new int[m];
        int[] arr3 = new int[m];
        for(int i = 0; i < m; i++){
            arr1[i] = Integer.parseInt(st1.nextToken());
            arr2[i] = Integer.parseInt(st2.nextToken());
            arr3[i] = Integer.parseInt(st3.nextToken());
        }
        for(int i = 1; i <= n; i++){
            pw.print(i + ":");
            for(int j = 0; j < m; j++){
                if(arr1[j] == i){
                    pw.print(" ("+arr2[j]+","+arr3[j]+")");
                }
            }
            pw.println("");
        }
        pw.flush();
    }
}