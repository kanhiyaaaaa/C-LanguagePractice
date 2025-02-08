import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        int i,n,s=0;
        Scanner Sc= new Scanner(System.in);
        System.out.println("entr any value of n to get factors :");
        n=Sc.nextInt();
        
        for(i=1;i<n;i++){
            if((n%i)==0){
                s=s+i;
            }
            
        }
        if(s==n)
        {
        System.out.println("yes "+ n+ "is a perfect no:");
        }
        else
        {
            System.out.println(" n is  not a perfect no:");
        }
}
}