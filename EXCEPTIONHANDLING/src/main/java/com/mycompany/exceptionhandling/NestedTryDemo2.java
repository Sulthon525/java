/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;

/**
 *
 * @author user
 */
class NestedTryDemo2 {
    static void nestedTry(String args[])
    {
        try 
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by zero error!");
        }
    }
    
    public static void main(String[] args) {
        try 
        {
            nestedTry(args);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("2 parameters are required!");
        }
    }
}
