package com.vignesh.ProblemSolving;

import java.io.IOException;
import java.util.Scanner;

public class ValleyCount {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int seaLevel=0;
        int valleyCount=0;
        int seaLevelReset=0;
        char[] charArray = s.toCharArray();
        if(n<=1||!s.contains("D")&&!s.contains("U")){
            return 0;
        }
        int Dcount=0,Ucount=0;
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]=='U'){
                Ucount++;
                seaLevel++;
                if(seaLevel==0){
                    seaLevelReset=0;
                }

            }else {
                seaLevel--;
                Dcount++;
                if(seaLevel<0&&seaLevelReset==0){
                    valleyCount++;
                    seaLevelReset=-1;
                }
            }
            System.out.println("D:"+Dcount+" , U:"+Ucount);
        }
        return valleyCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      /*  int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();*/
        int n=100;
        String s="DUDUUUUUUUUDUDDUUDUUDDDUUDDDDDUUDUUUUDDDUUUUUUUDDUDUDUUUDDDDUUDDDUDDDDUUDDUDDUUUDUUUDUUDUDUDDDDDDDDD";

        int result = countingValleys(n, s);

       /* bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

*/
        System.out.println(result);
        scanner.close();
    }
}
