
import java.util.Scanner;

public class basicpractise {
    public static void main(String[] args) {
        int n;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the value of n to gets the factor");
        n=Sc.nextInt();
        for(int i=0;i<n/2;i++){
            if(n%i==0){
                System.out.println("factors of is"+i);
            }

        }
    }
}
