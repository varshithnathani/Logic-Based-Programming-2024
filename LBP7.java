// Extract Digits from Numbers
// Implement a program to extract digits from the given number

import java.util.Scanner;
class LBP7{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = SC.nextInt();

        System.out.println("Output: ");
        
        while(n != 0){
            int d = n%10;
            System.out.print(d+" ");
            n /= 10;
        }
        SC.close();
    }
}