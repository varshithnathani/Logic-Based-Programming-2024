// For each of 6 coffee cups, i brought i get a 7th cup free, In total i get 7 cups. Implement a program that takes
// n cups brought and print as an integer the total of cups i would get

// Input        ---> n number of cups
// constraints  ---> n>=1
// Output       ---> no of cups present there

// n=1  ==> 1
// n=2  ==> 2
// ----------- n=6 ==> 6+1
//             n =12 ==> 12+(12/6)   ====> n+(n/6)

import java.util.Scanner;
class LBP6{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter No of Cups: ");
        int n = SC.nextInt();
        int sol  = n + (n/6);
        System.out.println("Total Cups: "+ sol);
        SC.close();
    }
}