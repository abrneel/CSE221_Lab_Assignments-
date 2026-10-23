import java.util.*;
import java.io.*;

public class solutionH{
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
        for(int i = 0; i < len-1; i++){

            
             
            
            for(int j = i+1; j < len; j++){
                int len1 = firstWord[i].length();
                boolean flag = true;
                //if true x wins
                //if false y wins
                boolean isEqual = false;
                if(firstWord[i].equals(firstWord[j]) == true){
                    isEqual = true;
                }
                else{
                int len2 = firstWord[j].length();
                int max = -1;
                if(len1>len2) max = len1;
                else max = len2;
                // this loop is to compare the values
                int k = 0;
                while(k<max){ //help
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
                }
                if(isEqual){
                //compare time
                    if(times[i]<times[j]){
                        //swap code
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
                    else if(times[i]==times[j]){
                        if(inputOrder[i]>inputOrder[j]){
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
                }
                else{
                    if(flag==false){
                    //swap code
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
            }
            
        }

        //print the data
        for(int i = 0; i < len; i++){
            pw.println(lines[i]);
        }
        pw.flush();
    }
}
