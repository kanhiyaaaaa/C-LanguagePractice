import java.util.Scanner;

public class checkmagicno {
        public static void main(String[] args) {
        int n;
        Scanner Sc = new Scanner(System.in);
        n=Sc.nextInt();
        while(n>9)
        {
            int k=n;
            int sum=0;
            while(k>0){
                sum=sum+k%10;
                k=k/10;
            }
            n=sum;


        }
        
        if(n==1){
            System.out.println("magic no.");
        }
        else{
            System.out.println("not a magic no");
        }

        
    }
}
