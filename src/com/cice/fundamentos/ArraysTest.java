/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.fundamentos;

import java.util.Arrays;

/**
 *
 * @author Mario Ramirez
 */
public class ArraysTest {
    
    static int[] arrayNumeros;
    public static void main (String ...args){
     // Array simple
     arrayNumeros = new int[5] ;
     arrayNumeros[0] = 1;  
     arrayNumeros[1] = 2;
     int [] arrayNumeros2 = Arrays.copyOf(arrayNumeros, 12);
     for (int i : arrayNumeros2){
         System.out.println(i);
     }
     //Array de 2 dimensiones.
     int [][] ArrayBidi = new int[2][4];
     
     int [][] bi = new int [2][2];
           
    }
}
