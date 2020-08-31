/**
This program lets the user insert as many numbers as they want into a array, and then sorts the array, in numerical order, as the numbers are inserted.
@author Isaiah Quattlebaum
@version 1.0, 08/31/20
*/
import java.util.Arrays; 
import java.util.Scanner;

public class numericSort{
    public static int [] arraySorter(int [] sortedArray, int num){
        //This function is responsible for inserting a integer into an array in ascending order.
        int temporaryStorage = 0; //Temporarily holds a number during the sorting process.
        
        for (int i = (sortedArray.length - 1); i >= 0; --i){
            if (num > sortedArray[i]){
                temporaryStorage = sortedArray[i]; //Stores the number into the temporaryStorage varible.
                sortedArray[i] = num;   
                num = temporaryStorage; //Assigns the value of the number stored in the temporaryStorage varible, to the num varible.
            }

            else if (i == 0){
                sortedArray[0] = num;
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) 
    { 
        int totalNumbers = 0; //The amount of numbers the users would like to insert.
        int usersNumber = 0;  //The number the user wants to insert into numberArray.
        int loopSentinel = 0; //Controlls the while loop on line 35.
        int [] numberArray;   //An array that contain numbers inserted by the user. 
        Scanner userInput = new Scanner(System.in);

        System.out.println("How many numbers do you wish to enter?");
        totalNumbers = Integer.valueOf(userInput.nextLine());
        numberArray = new int[totalNumbers]; //The size of the array becomes the amount of numbers the user is going to insert into the array.

        while(loopSentinel < totalNumbers){
            System.out.println("Enter a number.");
            usersNumber = Integer.valueOf(userInput.nextLine());
            System.out.println(" "); //Improves the terminal's readability.
            numberArray = arraySorter(numberArray, usersNumber);
            ++loopSentinel;
        }    
    
        System.out.println("Your sorted array is: "+Arrays.toString(numberArray)+"."); //Prints out the sorted array.
    }
} 
