/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersarray.to.wordsarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user-pc
 */
public class NumbersArrayToWordsArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();

Scanner list_input = new Scanner(System.in);
System.out.print("Enter list ");
System.out.println("(Write EOF to terminate list): ");

while(list_input.hasNextInt()){
         list.add(list_input.nextInt());
    }

int listLength = list.size();

     String numberToWord = "";
          
     for (int i = 0; i < listLength; i++) {
        int numberList = list.get(i);
        System.out.println(numberList);
            switch (numberList) {
                
                case 1: {  
                    numberToWord = numberToWord + "one,";

                    break;
                }
                case 2: { 
                    numberToWord = numberToWord + "two,";
                    break;
                }
                
                case 3: { 
                    numberToWord = numberToWord + "three,";
                    break;
                }
                
                case 4: { 
                    numberToWord = numberToWord + "four,";
                    break;
                }
                
                
                case 5: { 
                    numberToWord = numberToWord + "five,";
                    break;
                }
                
                case 6: { 
                    numberToWord = numberToWord + "six,";
                    break;
                }
                
                case 7: { 
                    numberToWord = numberToWord + "seven,";
                    break;
                }
                
                case 8: { 
                    numberToWord = numberToWord + "eight,";
                    break;
                }
                case 9: { 
                    numberToWord = numberToWord + "nine,";
                    break;
                }
               
                default: {
                    numberToWord = numberToWord + "zero,";
                }
            }
        }
          
String fullText = numberToWord;
List<String> wordsArray = Arrays.asList(fullText.split(","));
        
System.out.println(wordsArray);
        
    }   
}
