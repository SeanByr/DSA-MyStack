/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mystack;

import java.util.ArrayList;


/**
 *
 * @author seanb
 */
public class MyStack<T> implements StackADT<T>{

  public ArrayList<T> Stack;
   
   public MyStack(){
    Stack = new ArrayList<T>();
}
   
   @Override
   public boolean isEmpty(){
       return Stack.isEmpty();
   }
   
   @Override
   public void push(T item){
    Stack.add(item);
   }
   
   @Override
   public T pop(){
       if(this.isEmpty()){
           System.out.println("Stack is Empty");
           return null;
       }
       return this.Stack.remove(Stack.size() - 1);
   }
    
   @Override
   public T peek(){
       if(Stack.isEmpty()){
           System.out.println("Stack is Empty");
           return null;     
       }
       return Stack.get(Stack.size() - 1);
   }
   
   @Override
   public int size(){
       return this.Stack.size();
   }
       
}
