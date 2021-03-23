/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;
import java.util.Scanner;
/**
 *
 * @author Optimoes
 */
public class Tugas4 {
    public static void main(String[] args) {
       String temp;
       String kota[] = new String[2];
       Scanner input = new Scanner(System.in);
       
       //input string
       for(int i=0;i<2;i++){
           System.out.print("Masukan nama kota "+(i+1)+" : ");
           kota[i] = input.nextLine();
       }
       
       //Sorting the strings
        for (int i=0;i<2;i++) 
        {
            for (int j = i + 1; j < 2; j++) { 
                if (kota[i].compareTo(kota[j])>0) 
                {
                    temp = kota[i];
                    kota[i] = kota[j];
                    kota[j] = temp;
                }
            }
        }
        
        //display strings
        System.out.println("\nKota setelah diurutkan : ");
        for (int i = 0; i <= 1; i++) 
        {
            System.out.println(kota[i]);
        }
    }
    
}
