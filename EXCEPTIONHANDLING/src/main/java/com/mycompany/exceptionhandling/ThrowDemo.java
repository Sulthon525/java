/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;

/**
 *
 * @author user
 */
class ThrowDemo {
    public static void main(String[] args) {
        String input = "invalid input";
        try
        {
            if (input.equals("invalid input"))
            {
                throw new RuntimeException ("throw demo");
            }
            else 
            {
                
            }
        }
    }
}
