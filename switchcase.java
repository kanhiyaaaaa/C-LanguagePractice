import java.util.Scanner;

public class switchcase {
    public static void main(String[]args){
        int dy ;
        Scanner Sc =new Scanner(System.in);
        System.out.println("enter any digit from 1-7 to get the day");
        dy=Sc.nextInt();
        switch(dy){
              case 1:
              System.out.println("Monday");
              break;
              case 2:
              System.out.println("tueday");
              break;
              case 3:
              System.out.println("wednesday");
              break;
              case 4:
              System.out.println("thursday");
              break;
              case 5:
              System.out.println("friday");
              break;
              case 6:
              System.out.println("saturday");
              break;
              case 7:
              System.out.println("sunday");
              break;
              default:
              System.out.println("invalid day of the week");

        }
    }
}
