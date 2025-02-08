import java.util.Scanner;
public class menudriven{
    public static void main (String []args){
        int dy ;
        Scanner Sc =new Scanner(System.in);
        System.out.println("enter any digit from 1-3 to get the day");
        dy=Sc.nextInt();
        switch(dy){
            case 1:
            int r;
            System.out.println("enter a radius for circle ");
            r=Sc.nextInt();
            final double pie=3.14;
            double aos=(pie*r*r);
            System.out.println("area of circle is:"+aos);
            break;
            case 2:
            int side;
            System.out.println("enter a side of sq ");
            side=Sc.nextInt();
            int aosq=side*side;
            System.out.println("area of sq. is:"+aosq);
            break;
            case 3:
            int l,b;
            System.out.println("enter a length and breadth ");
            l=Sc.nextInt();
            b=Sc.nextInt();;
            int aor=l*b;
            System.out.println("area of rectangle is:"+aor);
            break;
            default:
            System.out.println("no value match");

        }
    }
}