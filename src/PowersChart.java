import hsa.*;
public class PowersChart {
    public static void main(String[] args) {
        Console c=new Console();
        int exponent;
        int loop=0;
        int value;
        c.print("Enter a value for the exponent from 1-10: ");
        outer:
        while (loop==0){
        exponent=c.readInt();
        if (1<=exponent&&10>=exponent){
        c.println("X\t2^X\t=");
        c.println("--\t----\t--");
        for(int x=0; x<=exponent; x++){
         value=(int)Math.pow(2,x);
         c.println(x+"\t2^"+x+"\t"+value);
        }
        }
        else {
        c.print("You must enter a number from 1-10: ");
        continue outer;
                }
        }
        }
    }
