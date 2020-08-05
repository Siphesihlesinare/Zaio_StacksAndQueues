import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(areBracketsBalenced("[(1*2)(3*4)]+[(5+6)(7*8)]")); // system input
    }

    public static boolean matchingPair(char open , char close){
        if ( open == '(' && close == ')'){
            return true;
        } else if ( open == '[' && close == ']'){
            return true;
        } else if ( open == '<' && close == '>'){
            return true;
        } else{
            return false;
        }
    }    

    public static boolean areBracketsBalenced(String stringToTest){ // to check if Parentheses valid.
        char[] c = stringToTest.toCharArray();
        Stack <Character> myStack= new Stack <Character> ();
        
        for (int i = 0; i < c.length; i++){
            if(c[i]=='(' || c[i] == '[' ){
                myStack.push(c[i]);
            } else if (c[i]== ')' || c[i]==']'){
                if(matchingPair(myStack.peek(),c[i]) == true){
                    myStack.pop();
                } else {
                    return false;
                }
            }
        }

        if(myStack.isEmpty()){
            return true;
        }	
        else {
            return false;
        }
    }	    
}



