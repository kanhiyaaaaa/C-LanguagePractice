public class patternprint11 {
    public static void main(String[] args) {

        int sp=4;
           for(int i=1;i<=5;i++){
               for(int k=1;k<=sp;k++){
                   System.out.print(" ");
                 }
             for(int j=1;j<=i;j++){
             System.out.print(j);
          
             }
             for(int t=i-1;t>=1;t--){
                System.out.print(t);
             }
                  System.out.println(); 
                  sp--;
          }
}
}