import java.util.*;
public class input {
    public static void main(String[]args){
        int rollno;
        String name;
        double wt;
        char gender;
        boolean m_status;
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter ur name:");
        name=Sc.nextLine();
        
        System.out.println("enter your rollno");
        rollno=Sc.nextInt();
        
        System.out.println("enter your weight");
        wt=Sc.nextDouble();
        
        System.out.println("enter your gender (M/F)");
        gender=Sc.next().charAt(0);
        System.out.println("rollno:"+rollno);
        System.out.println("name:"+name);
        System.out.println("weight:"+wt);
        System.out.println("GENDER "+gender);

    }
}

