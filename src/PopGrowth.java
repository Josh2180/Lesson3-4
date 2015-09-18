import BreezySwing.Format;
import hsa.*;
public class PopGrowth {

    public static void main(String[] args) {
        Console c=new Console(80,80);
        double pop=140000, growth, newpop=140000;
        int year;
        c.print(Format.justify('r',"YEAR",6));
        c.print(Format.justify('c',"POPULATION",20));
        c.print(Format.justify('c',"GROWTH",20));
        c.println(Format.justify('c',"NEW POPULATION",20)+"\n");
        for(year=2015; year<=2115; year+=10){
            c.print(Format.justify('r',year,6));
            c.print(Format.justify('c',pop,20,0));
            growth=pop*0.03;
            newpop+=growth;
            c.print(Format.justify('c',growth,20,0));
            c.println(Format.justify('c',newpop,20,0));
            pop=newpop;
        }
    }
    
}
