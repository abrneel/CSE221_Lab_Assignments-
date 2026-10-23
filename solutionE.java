import java.io.*;
import java.util.*;

public class solutionE{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        int len = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int[] arr = new int[len];
        int x = 0;
        int steps = 0;
        ArrayList<String> operations = new ArrayList<>();
        while(st.hasMoreTokens()){
            arr[x] = Integer.parseInt(st.nextToken());
            x++;
        }
        //Bubble Sort the even and odd indices
        for(int i = 0; i < len; i++){
            for(int j = 0; j + 2 < len; j+=2){
                if(arr[j] > arr[j+2]){
                    int temp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j+2] = temp;
                    steps++;
                    operations.add((j+1) + " " +(j+2+1));
                }
            }
        }
        for(int i = 1; i < len; i++){
            for(int j = 1; j + 2 < len; j+=2){
                if(arr[j] > arr[j+2]){
                    int temp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j+2] = temp;
                    steps++;
                    operations.add((j+1) + " " +(j+2+1));
                }
            }
        }

        //check if sorted or not
        boolean flag = true;
        for(int i = 0; i < len - 1; i++){
            if(arr[i]>arr[i+1]) flag = false;
        }
        if(flag == true){
            pw.println("YES");
            pw.println(steps);
            for(int i = 0; i < steps; i++){
                pw.println(operations.get(i));
            }
        }
        else{ 
            pw.println("NO");
        }
        pw.flush();
    }
}