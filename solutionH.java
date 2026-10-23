import java.util.*;
import java.io.*;

public class H{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        int inputs = Integer.parseInt(bf.readLine());
        int len = inputs;
        String[] firstWord = new String[inputs];
        String[] lines = new String[inputs];
        double[] times = new double[inputs];
        int[] inputOrder = new int[inputs];
        while(inputs > 0){
            //process the data and keep them in the arrays
            lines[len-inputs] = bf.readLine();
            inputOrder[len-inputs] = len-inputs;
            st = new StringTokenizer(lines[len-inputs]);
            firstWord[len-inputs] = st.nextToken();
            st.nextToken();st.nextToken();st.nextToken();st.nextToken();st.nextToken();
            String temp = st.nextToken();
            times[len-inputs] = Double.parseDouble(""+temp.charAt(0)+temp.charAt(1)) + (Double.parseDouble(""+temp.charAt(3)+temp.charAt(4))/60.0);
            inputs--;
        }
        //sort the data
        for(int i = 0; i < len - 1; i++){
            for(int j = i + 1; j < len; j++){
                if(firstWord[i].equals(firstWord[j])){
                    if(times[i]==times[j]){
                        if(inputOrder[j]<inputOrder[i]){
                            //then swap
                            swap(lines, firstWord, times, inputOrder, i, j);
                        }
                    }
                    else if(times[j]>times[i]){
                        //then swap
                        swap(lines, firstWord, times, inputOrder, i, j);
                    }
                }
                else{
                    int k = 0;
                    boolean flag = true;
                    //if true i wins and if false j wins
                    //if i wins no swap, if j wins swap
                    while(true){
                        if(lines[i].charAt(k) == lines[j].charAt(k)){
                            k++;
                        }
                        else if(lines[i].charAt(k)<lines[j].charAt(k) || lines[i].charAt(k)==' '){
                            break;
                        }
                    else if(lines[i].charAt(k)>lines[j].charAt(k) || lines[j].charAt(k)==' '){
                            flag = false;
                            break;
                        }
                    }
                    if(!flag){
                        //swap
                        swap(lines, firstWord, times, inputOrder, i, j);
                    }
                }
            }
        }

        //print the data
        for(int i = 0; i < len; i++){
            pw.println(lines[i]);
        }
        pw.flush();
    }
    public static void swap(String[] lines, String[] firstWord, double[] times, int[] inputOrder, int i, int j){
                    String tempLine = lines[i];
                    String tempWord = firstWord[i];
                    double tempTime = times[i];
                    int tempOrder = inputOrder[i];

                    lines[i] = lines[j];
                    firstWord[i] = firstWord[j];
                    times[i] = times[j];

                    lines[j] = tempLine;
                    firstWord[j] = tempWord;
                    times[j] = tempTime;

                    inputOrder[i] = inputOrder[j];
                    inputOrder[j] = tempOrder;
    }
}
