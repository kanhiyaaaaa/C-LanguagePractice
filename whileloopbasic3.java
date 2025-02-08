import java.util.Scanner;

public class whileloopbasic3 {
    public static void main(String[] args) {
        int f=1,n;
        Scanner Sc= new Scanner(System.in);
        System.out.println("entr any value of n to get fact :");
        n=Sc.nextInt();
        
        while(n>0){
            f=f*n;
            n--;
        }
        System.out.println("factorial is :"+f);
}
}