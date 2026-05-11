// 1. Create a class MessagePrinter with a method printMessage(String name) which prints the message "hello <name>".

 class MessagePrinter {
     void printMessage(String name) {
        System.out.println("hello "+ name);
     }
}
public class Practice1 {
    public static void main(String[] args) {
        MessagePrinter mp = new MessagePrinter();
        mp.printMessage("nikhil");

    }

}
