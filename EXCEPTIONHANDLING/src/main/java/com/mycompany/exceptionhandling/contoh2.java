/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;

import java.io.FileInputStream;

/**
 *
 * @author user
 */
public class contoh2 {
    public static void main(String args[]){
    try {
  file = new FileInputStream(namaFile);
  x = (byte) file.read();
}
catch(FileNotFoundException f) {
  f.printStackTrace();
  return -1;
}
catch(IOException i) {
  i.printStackTrace();
  return -1;
}

  }
}
