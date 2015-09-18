import hsa.*;
public class Divide {

    public static void main(String[] args) {
        Console c=new Console();
        int large=0, small=0, num, quotient, remainder;
        outer:
        while (true){
        c.print("Enter the first number to divide: ");
        large=c.readInt();
        c.print("Enter the second number to divide: ");
        small=c.readInt();
        if (small>large){
            num=small;
            small=large;
            large=num; 
            break;
        }
        if(large==0||small==0){
         c.print("You can't divide by 0!\n");
         continue outer;
        }
        quotient=large/small;
        remainder=large%small;
        c.println(""+quotient+"r "+remainder);
    }
    }
}
