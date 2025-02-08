import java.util.Scanner;

public class ifelse3 {
    public static void main(String[] args) {
        int no;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter any no:");
        no=Sc.nextInt();
        if(no%2==0){
           System.out.println("if no is even then the sq. of no. is"+(no*no));
        }
        else{
            System.out.println("if not even:"+(no*no*no));
        }
    }
}
