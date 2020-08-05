import java.util.*;

class Question1 {
    private String[] stackArray;
    private int top;

    public Question1(int n) {
        System.out.print("Creating StackArray\n");
        stackArray = new String[n];
        top = -1;
    }

    public void push(String val) {
        top = top + 1;
        System.out.println(top);
        stackArray[top] = val;
    }

    public int size() {
        return (top + 1);
    }

    public boolean empty() {
        return (top == -1);
    }

    public String peek() {
        return stackArray[top];
    }

    public String pop() {
        String removingValue = stackArray[top];
        top -= 1;
        return removingValue;
    }

    public void print() {
        System.out.print("Top of stack");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i]);
            System.out.print("\n");
        }
        System.out.print("End of stack");
    }

    public static void main(String[] args) {
        Question1 stack = new Question1(10);
        Scanner scanner = new Scanner(System.in);
        String userInput = " ";

        while (!(userInput.equals("x"))) {
            userInput = scanner.nextLine();

            if (!(userInput.equals("o"))) {
                System.out.println(stack.pop());
            } else {
                stack.push(userInput);
            }
        }
    }
}