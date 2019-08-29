package com.vignesh.ProblemSolving;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class ParanthesisValidate2 {
    static String isBalanced(String s) {

        char[] charArray = s.toCharArray();

        Stack stack=new Stack();

        boolean isBalanced=true;
        if(charArray.length==1){
        isBalanced=false;
        }
        for (int i=0;i<charArray.length;i++){
            char c = charArray[i];
            if(c=='{'||c=='['||c=='('){
                stack.push(new Character(c));
            }else if(c=='}'||c==']'||c==')') {
                if(stack.isEmpty()){
                    isBalanced=false;
                }else if(!isMatchingParanthesis((Character) stack.pop(),c)){
                    isBalanced=false;
                    break;
                }
            }

        }
        if(isBalanced){
            return "YES";
        }else {
            return "NO";
        }


    }
    private static boolean isMatchingParanthesis(char character1,char character2){
        if(character1=='['&&character2==']'){
            return true;
        }else if(character1=='{'&&character2=='}'){
            return true;
        }else  if(character1=='('&&character2==')'){
            return true;
        }else return false;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);
            System.out.println(result);

            /*bufferedWriter.write(result);
            bufferedWriter.newLine();*/
        }

        //bufferedWriter.close();

        scanner.close();
    }
}
