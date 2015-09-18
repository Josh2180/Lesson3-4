import hsa.*;
public class Movie {

    public static void main(String[] args) {
        Console c=new Console();
        char day;
        int age;
        double price;
        while(true){
        c.print("Enter \"m\" for matinee. \"t\" for Tuesday,\"o\" for other:");
        day=c.getChar();
        if(day=='o'||day=='t'||day=='m') break;
        else
            c.println("\nInvalid try again");
        }
        if(day=='m')price=3;
        else if(day=='t')price=4;
        else{
         while(true){
             c.print("\nEnter your age from 1 to 99: ");
             age=c.readInt();
             if(age>=1&&age<=99)break;
             else
                 c.println("\nInvalid age try again");
        }
         price=(age<18)?5:8;
        }
        c.println("\nYour price will be: $"+price);
    }
    
}
