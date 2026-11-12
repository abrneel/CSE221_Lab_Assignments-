import java.io.*;
import java.util.*;

public class solutionG{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st1;
        StringTokenizer st2;
        int cases = Integer.parseInt(bf.readLine());
        while(cases > 0){
            int len = Integer.parseInt(bf.readLine());
            String id = bf.readLine();
            int[] arrIDs = new int[len];
            st1 = new StringTokenizer(id);

            String marks = bf.readLine();
            int[] arrMarks = new int[len];
            st2 = new StringTokenizer(marks);

            for(int i = 0; i < len; i++){
                arrIDs[i] = Integer.parseInt(st1.nextToken());
                arrMarks[i] = Integer.parseInt(st2.nextToken());
            }
            
            //now the swapping begins!
            int swaps = 0;
            for(int i = 0; i < len; i++){
                int max = -1;
                int maxIndex = -1;
                for(int j = i; j < len; j++){
                    if(arrMarks[j]>max){
                        max = arrMarks[j];
                        maxIndex = j;
                    }
                    else if(arrMarks[j]==max){
                        if(arrIDs[j]<arrIDs[maxIndex]){
                            max = arrMarks[j];
                            maxIndex = j;
                        }
                    }
                }
                if(maxIndex == i) continue;
                else{
                        int temp1 = arrMarks[i];
                        arrMarks[i] = arrMarks[maxIndex];
                        arrMarks[maxIndex] = temp1;

                        int temp2 = arrIDs[i];
                        arrIDs[i] = arrIDs[maxIndex];
                        arrIDs[maxIndex] = temp2;
                        swaps++;
                }
            }


            //print the data
            pw.println("Minimum swaps: "+swaps);
            for(int i = 0; i < len; i++){
                pw.println("ID: "+arrIDs[i]+" Mark: "+arrMarks[i]);
            }
            cases--;
        }
        pw.flush();
    }
}
