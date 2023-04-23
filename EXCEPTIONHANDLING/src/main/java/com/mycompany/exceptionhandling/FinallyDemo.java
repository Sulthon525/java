/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;

/**
 *
 * @author user
 */
class FinallyDemo {
    static void myMenthod (int n) throws Exception{
      try
      {
       switch(n)  
       {
           case 1: System.out.println("Case pertama");
           return;
           
           
           case 3: System.out.println("Case ketiga");
           
           throw new RuntimeException ("demo case ketiga");
           
           
           case 4: System.out.println("Case keempat");
           
           throw new Exception ("demo case keempat");
           
           
           case 2: System.out.println("Case kedua"); 
                
       } 
      } 
      catch(RuntimeException e)
      {
          System.out.println("Runtime exceptions terjadi: ");  
          System.out.println(e.getMessage());
      }
      
      finally 
      {
          System.out.println("Try-Block entered");
      }
    }
    
    public static void main(String args[]) {
     for (int i = 1; i<=4; i++)
     {
         try
         {
             FinallyDemo.myMethod(i);
         }
         
         catch (Exception e)
         {
             System.out.println("Exception terjadi: ");
             System.out.println(e.getMessage());
         }
         System.out.println();
     }
    }
}
