import java.util.Scanner;

public class countdigitsofno {
       public static void main(String[] args) {
        int c=0,n,d;
        Scanner Sc= new Scanner(System.in);
        System.out.println("entr any value of n :");
        n=Sc.nextInt();
        while(n>0){
            d=n%10;
         //   c++;//to counts the digit in no
           // c=c+d;//to add the digits of no 
           System.out.print(+d);//to print the reverse of digit 
            n=n/10;
        }
        System.out.println("no of digits are"+c);
       }    
}
