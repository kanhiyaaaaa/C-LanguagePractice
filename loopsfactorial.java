import java.util.*;
public class loopsfactorial {
    public static void main(String[] args) {
        int i,f=1,n;
        Scanner Sc= new Scanner(System.in);
        System.out.println("entr any value of n to get fact :");
        n=Sc.nextInt();
        for(i=n;i>0;i--){
            f=f*i;
        }
        System.out.println("factorial is :"+f);
    }
}
