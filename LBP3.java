// To check whether the given year is a leap year or not

// Input        ---> an Integer
// Constraints  ---> No Constraints
// Output       ---> Leap Year or Not Leap Year

import java.util.Scanner;
class LBP3{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int Year = SC.nextInt();
        if((Year%4 == 0 && Year%100 != 0) || (Year % 400 == 0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }

        SC.close();
    }
}