/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mystack;

/**
 *
 * @author seanb
 */
public class Main{
    public static void main(String[] args){
    MyStack Stack = new MyStack();
    
    Stack.push(1);
    Stack.push(2);
    Stack.push(3);
    
        System.out.println(Stack.peek());
        Stack.pop();
        System.out.println(Stack.peek());
        Stack.pop();
        System.out.println(Stack.peek());
        System.out.println(Stack.isEmpty());
        System.out.println(Stack.size());
    }
}
