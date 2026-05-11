// 2. Create a class Calculator with the following methods:
// calculateSum(int number1, int number2) to calculate the sum of two numbers.
// calculateDifference(int number1, int number2) to calculate the difference between two numbers.

class calculator  {

    int calculateSum(int num1,int num2) {
        return num1+num2;
        // System.out.println(sum);
    }

    int  calculateDifference(int num1,int num2) {
         return num1-num2;
       // System.out.println(diff);
    }
}
public class Practice2 {
    public static void main(String[] args) {
        calculator c = new calculator();
       int sum =  c.calculateSum(50, 40);
        int diff= c.calculateDifference(30, 20);
    
        System.out.println("sum == "+ sum+" diff = " +diff);
    }
}
