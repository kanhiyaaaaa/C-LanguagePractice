import java.util.Scanner;

public class upperlowercase {
    public static void main(String[]args){
        char ch,r;
        Scanner Sc =new Scanner(System.in);
        System.out.println("entr any character");
        ch=Sc.next().charAt(0);
       /*  if(Character.isUpperCase(ch)){
         r=Character.toLowerCase(ch);
         System.out.println("upper to lower is:"+r);
        }
        if(Character.isLowerCase(ch)){
            r=Character.toUpperCase(ch);
            System.out.println("lower to upper is:"+r);
           }*/
          if(ch>=65&&ch<=90){
            ch=(char)(ch+32);
            System.out.println("upper case to lower case :"+ch);

          }
          else if(ch>=97 && ch<=122){
            ch=(char)(ch-32);
            System.out.println("lower case to upper case: "+ch);   
        }
        //both methods are applicable 
    }
}
