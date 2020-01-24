/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.test;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author int320
 */
public class Bigo1 {
     public static void main(String[] args) {        
            
         
        //Initialize array     
        int [] arr = new int [10000];      
        int temp = 0;    
           Random generator = new Random();
        for(int i=0; i<10000; i++){
            arr[i] = (generator.nextInt(10000));
        } 
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting 
        
        System.out.println("Elements of array sorted in ascending order: "); 
                long begin1 = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
                 System.out.println("\n How many time to sort array "+ (System.currentTimeMillis()-begin1) +" Millisec");

    }   
     

} 
     
    
 

