import java.io.*;

public class solutionC{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        long inputs = Long.parseLong(bf.readLine());
        while(inputs>0){
            long N = Long.parseLong(bf.readLine());
            N = (N*(N+1))/2;
            pw.println(N);
            inputs--;
        }
        pw.flush();
    }
}