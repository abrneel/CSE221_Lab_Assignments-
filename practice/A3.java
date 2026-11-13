import java.util.*;
import java.io.*;
public class A3{
    public static long inversions;
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;

        int len = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        long[] arr = new long[len];
        for(int i = 0; i < len; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        arr = ms(arr);
        pw.println(inversions);
        for(int i = 0; i < len; i++){
            pw.print(arr[i] + " ");
        }
        pw.flush();
    }
    public static long[] ms(long[] arr){
        if(arr.length == 1) return arr;
        long[] a1 = new long[arr.length/2];
        long[] a2 = new long[arr.length - arr.length/2];
        int index = 0;
        for(int i = 0; i < a1.length; i++){
            a1[i] = arr[index++];
        }
        for(int i = 0; i < a2.length; i++){
            a2[i] = arr[index++];
        }
        a1 = ms(a1);
        a2 = ms(a2);
        return merge(a1, a2);
    }
    public static long[] merge(long[] a1, long[] a2){
        long[] arr = new long[a1.length+a2.length];
        int i = 0; 
        int j = 0;
        int index = 0;
        while(true){
            if(i < a1.length && j < a2.length){
                if(a1[i]<a2[j]) arr[index++] = a1[i++];
                else{
                    inversions += a1.length - i;
                    arr[index++] = a2[j++];
                }
            }
            else{
                if(i == a1.length){
                    while(j != a2.length) arr[index++] = a2[j++];
                    break;
                }
                if(j == a2.length){
                    while(i != a1.length) arr[index++] = a1[i++];
                    break;
                }
            }
        }
        return arr;
    }
}