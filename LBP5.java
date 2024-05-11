// Return the next number from the Integer Passed
// Implementing a program that takes a number as an argument, increments the number by +1 and return the result 

// Input        ---> Integer
// Constraints  ---> no constraints
// Output       ---> an Incrementd Value

import java.util.Scanner;
class LBP5{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = SC.nextInt();
        int sum = n+1;
        System.out.println("Value: "+sum);
        SC.close();
    }
}