public class totalmarksandperc {
    public static void main(String[] args) {
        int rollno=40;
        String name="kanu";
        int s1marks=40;
        int s2marks=90;
        int s3marks=80;
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
