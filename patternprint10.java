public class patternprint10 {
    public static void main(String[] args) {

     int sp=2;
        for(int i=1;i<=5;i+=2){
            for(int k=1;k<=sp;k++){
                System.out.print(" ");
              }
          for(int j=1;j<=i;j++){
          System.out.print("*");
       
          }
          
               System.out.println(); 
               sp--;
       }
       int sp1=1;
       for(int i=3;i>=1;i-=2){
        for(int k=1;k<=sp1;k++){
            System.out.print(" ");
          }
      for(int j=1;j<=i;j++){
      System.out.print("*");
   
      }
      
           System.out.println(); 
           sp1++;
   }
       }
}
