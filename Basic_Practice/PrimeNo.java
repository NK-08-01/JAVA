public class PrimeNo {
    public static void main(String[] args) {
        int p = 10;
        int i ;
        //2/3/5/7/11
        for( i =2;i<p;i++) {
            if(p%i==0) {
                System.out.println("No. is not  prime");
                break;
            }
         }

           if(i==p) {
                System.out.println("No. is prime");

            }

        
    }
}