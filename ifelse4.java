import java.util.Scanner;

public class ifelse4 {
    public static void main(String[] args) {
        char ch;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter any character:");
        ch=Sc.next().charAt(0);
        if(ch =='a'||ch =='e'|| ch=='i'|| ch=='o'|| ch=='u'){
          System.out.println("character is vowel");
        }
        else{
            System.out.println("character is constant");
        }
    }
}
