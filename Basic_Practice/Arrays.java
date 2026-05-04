public class Arrays {

    public static void main(String[] args) {
        int marks[][] = new int[3][3];

        marks[0][0] = 1;
        marks[0][1] = 2;
        marks[0][2] = 3;
        
        
        marks[1][0] = 4;
        marks[1][1] = 5;
        marks[1][2] = 6;

        
        marks[2][0] = 77;
        marks[2][1] = 88;
        marks[2][2] = 10;

        for(int row=0; row<marks.length;row++) {
            for(int col=0; col<marks[row].length; col++) {
                System.out.print(marks[row][col]+" ");
            }
               System.out.println();
     
        } 
        
    }
 }