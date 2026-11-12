import java.io.*;

public class solutionA{
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int inputs = Integer.parseInt(bf.readLine());
        while(inputs > 0){
            int temp = Integer.parseInt(bf.readLine());
            if(temp % 2 == 0){
                pw.println(temp + " is an Even number.");
            }
            else pw.println(temp + " is an Odd number.");
            inputs--;
        }
        pw.flush();
    }
} 