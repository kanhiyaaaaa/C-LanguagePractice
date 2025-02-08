import java.util.Scanner;
public class asciivaluecharcheck {
    public static void main(String[] args) {
        char ch;
        Scanner Sc =new Scanner(System.in);
        System.out.println("entr any character");
        ch=Sc.next().charAt(0);
        if(ch>=65 && ch<=90){
            System.out.println("upper case character");
        }
        else if(ch>=97 && ch<=122){
            System.out.println("lower case character");   
        }
        else if(ch>=48 && ch<= 57){
            System.out.println("digit character");
        }
        else{
            System.out.println("special symbol character");
        }
    }
}
