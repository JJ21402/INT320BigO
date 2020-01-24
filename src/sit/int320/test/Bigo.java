/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.test;

import java.sql.Timestamp;
import static java.time.Clock.system;
import java.util.Arrays;
import java.util.Random;
import static jdk.nashorn.internal.objects.NativeArray.sort;

/**
 *
 * @author int320
 */
public class Bigo {
     public static void main(String[] args) {
         long begin1 = System.currentTimeMillis();
         
        int[] anArray;
        anArray = new int[10000];
        Random generator = new Random();
        for(int i=0; i<10000; i++){
            anArray[i] = (generator.nextInt(10000));
        }
         System.out.println(begin1);
        Arrays.sort(anArray);
        System.out.println(Arrays.toString(anArray));
         System.out.println("How many time to sort array "+ (System.currentTimeMillis()-begin1) +" Millisec");

     }
     
}
