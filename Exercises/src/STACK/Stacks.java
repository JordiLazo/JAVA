package src.STACK;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack stk= new Stack();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4.9);
        stk.push("Hello");


        System.out.println(stk);
        System.out.println(stk.get(0));
        System.out.println(stk.get(4));

        stk.pop();
        System.out.println(stk);
        stk.pop();
        stk.pop();
        System.out.println(stk);


    }
}
