// An E-comerce company Bookshelf whishes to analyse its monthly sales data b/w min range 30 to max range 100
// The company categorized these book sales into

// Sales Range          Groups

// 30 - 50              D
// 51 - 60              C
// 61 - 80              B
// 81 - 100             A
// Write an algorithm to find the group for the given book sale count

// Input        ---> an Integer sales count represent total sales of a book
// Constraints  ---> 30<= sales count <=100
// Output       ---> a Character representing the group of given sale count 

import java.util.Scanner;
class LBP4{
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Sales Count: ");
        int SalesCount = SC.nextInt();
        if(SalesCount >= 30 && SalesCount<=100){
            if(SalesCount>=30 && SalesCount <= 50){
                System.out.println("D");
            }else if(SalesCount >= 51 && SalesCount<=60 ){
                System.out.println("C");
            }else if(SalesCount >= 61 && SalesCount <= 80){
                System.out.println("B");
            }else{
                System.out.println("A");
            }
        }
        SC.close();
    }
}