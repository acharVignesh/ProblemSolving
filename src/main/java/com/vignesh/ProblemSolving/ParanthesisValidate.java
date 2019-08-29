package com.vignesh.ProblemSolving;

public class ParanthesisValidate {

    private static class MyStack{
        private int top=-1;

        private char[] items=new char[100];

        private void push(char c){
            if(top>=99){
                System.out.println("stack is full");
            }else {
                items[++top]=c;
            }
        }
        private char pop(){
            if(top<=-1){
                System.out.println("Stack is empty");
                return '\0';
            }else {
                char element=items[top];
                top--;
                return element;
            }
        }
        private boolean isEmpty(){
            if(top<=-1){
                return true;
            }else {
                return false;
            }
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

    private static boolean validateParanthese(String s){
        char[] chars = s.toCharArray();
        MyStack myStack=new MyStack();

        for(int i=0;i<chars.length;i++){

            char c = chars[i];
            if(c=='('||c=='{'||c=='['){
                myStack.push(c);
            }
            else if(c==')'||c=='}'||c==']'){
                if(myStack.isEmpty()){
                    return false;
                }
                else if(!isMatchingParanthesis(myStack.pop(),c)){
                    return false;
                }
            }

        }
        if(myStack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("'{}'  is balanced:"+validateParanthese("{[]}"));
        System.out.println("'{}[][{}])'  is balanced:"+validateParanthese(" {}[][{}])"));
        System.out.println("'{{}[]([{}])}'  is balanced:"+validateParanthese("{{}[]([{}])}"));
    }


}
