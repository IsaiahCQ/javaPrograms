/**
This program uses a GUI to prompt the user for 10 grades and stores the grades into a array. The array is then bubble sorted and the average grade is Calculated.
@author Isaiah Quattlebaum
@version 1.0, 08/29/20
*/

import  javax.swing.*;
import java.util.Arrays;

public class gradeStorage{
    public static void storageProgram(){
        //This function contains the grade storage system.
        int[] gradeArray = new int[10];//A array with a size of 10 that will contain the user's grades.
        int gradeAverage = 0; //Contains the average of the grades entered by the user.
        
        for (int i = 0; i < 10; ++i){
            gradeArray[i] = Integer.valueOf(JOptionPane.showInputDialog("Please enter a grade."));//A GUI that prompts the user to enter in a grade.
        }

        gradeArray = gradeSort(gradeArray);

        for (int y = 0; y < 10; ++y){
            gradeAverage = gradeAverage + gradeArray[y]; //Calculates the sum of the grades the user entered.
        }
        
        gradeAverage = gradeAverage/10; //divides the sum of the grades by 10 in order to calculate the average grade.

        JOptionPane.showMessageDialog(null, "The average of your grades is "+gradeAverage+". "+
            "The lowest grade is "+gradeArray[0]+" and the highest grade is "+gradeArray[9]+".");
    }

    public static int[] gradeSort(int[] arrayGrades){
        //This function uses a bubble sort to sort through the arrayGrade array and then returns the array to the storageProgram function.     
        int loopSentinel = 0; //Controlls the while loop that the buuble sort resides in.
        int tempStorage = 0; //Temporarily holds a grade during the bubble sort.

        while (loopSentinel < 10){
            for (int x = 0; x < 10; ++x){
                //The following if and else if statements make sure exceed the index of the arrayGrades array.
                if (x != 9 && arrayGrades[x] > arrayGrades[x + 1]){
                    tempStorage = arrayGrades[x + 1];
                    arrayGrades[x + 1] = arrayGrades[x];
                    arrayGrades[x] = tempStorage;
                }

                else if(x == 9 && arrayGrades[x] < arrayGrades[x - 1]){
                    tempStorage = arrayGrades[x];
                    arrayGrades[x] = arrayGrades[x - 1];
                    arrayGrades[x] = tempStorage;
                }
            }
            loopSentinel = loopSentinel + 1;
        }
        return arrayGrades; //Returns the bubble sorted array.
    }

    public static void main(String [] args){
        storageProgram();
    }
}
