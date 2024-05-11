// Given an Integer n, perform the following conditional actions
// if n is odd print weird
// if n even and the inclusive range of 2-5, print not weird
// if n is even and the inclusive range of 6-20, print weird
// if n is even and greater than 20,, print not weird

// Input        ---> an integer
// Contraints   ---> 1=<n<=100
// Output       ---> Weird or Not Weird


import java.util.Scanner;
class LBP2{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = SC.nextInt();
        if(n>=1 && n<=100){
            if(n%2 !=0 ){ // Odd
                System.out.println("Odd: Weird");
            }
            else{
                if(n %2 == 0){
                    if(n>=2 && n<=5){
                        System.out.println("Even: Not Weird");
                    }else if(n>=6 && n<=20){
                        System.out.println("Even: Weird");
                    }else{
                        System.out.println("Even: Not Weird");
                    }
                }
            }
        }
        SC.close();
    }
}