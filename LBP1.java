// Program to check whether the given number is odd or even.

// Input        ---> an Integer
// Constraints  ---> n>0
// Output       ---> even or odd or Invalid

import java.util.Scanner;
class LBP1{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Eneter a Number: ");

        int a = SC.nextInt();

        if(a >=0){
            if(a%2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }else{
            System.out.println("Invalid");
        }
        SC.close();
    }
}

