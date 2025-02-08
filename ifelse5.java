import java.util.Scanner;

public class ifelse5 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int rollno;
        rollno=Sc.nextInt();
        String name;
        name=Sc.nextLine();
        int s1marks;
        s1marks=Sc.nextInt();
        int s2marks;
        s2marks=Sc.nextInt();
        int s3marks;
        s3marks=Sc.nextInt();
        int marks=s1marks+s2marks+s3marks;
        
        double percentage=((double)marks/300)*100;
        System.out.println("Rollno : "+rollno);
        System.out.println("name : "+name);
        System.out.println("Marks 1 : "+s1marks);
        System.out.println("Marks2 : "+s2marks);
        System.out.println("Marks 3: "+s3marks);
        System.out.println("Total : "+marks);

        
        
        
        System.out.println("percentage:"+percentage);
    }
}
