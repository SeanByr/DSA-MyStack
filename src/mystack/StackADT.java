/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mystack;

/**
 *
 * @author seanb
 */
public interface StackADT<T> {
    void push(T item);
    T pop();
    boolean isEmpty();
    int size();
    T peek();
}
