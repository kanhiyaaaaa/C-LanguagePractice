import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args){
        int age;
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter your age:");
        age=Sc.nextInt();
        if(age>=18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }
    }
}
