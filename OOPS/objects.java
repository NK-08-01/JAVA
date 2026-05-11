public class objects {
    public static void main(String[] args) {
        Variable v1 = new Variable(4,5);
       
        System.out.println(v1.x+" , "+ v1.y );
        
        addTen(v1);

        System.out.println(v1.x+" , "+ v1.y);
    }

    static void addTen(Variable v) {
           v.x = v.x + 10;
           v.y = v.y + 10;
    }
}

class Variable {
    int x;
    int y;
      
        Variable(int x,int y) {
            this.x = x;
            this.y = y;

        }
        
    }

