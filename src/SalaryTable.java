import BreezySwing.Format;
import hsa.*;
public class SalaryTable {

    public static void main(String[] args) {
        Console c=new Console(80,80);
        double salary=40000, raise, newsalary=40000;
        int year=1, nopay=0;
        c.print(Format.justify('r',"YEAR",6));
        c.print(Format.justify('c',"SALARY",20));
        c.print(Format.justify('c',"RAISE",20));
        c.println(Format.justify('c',"NEW SALARY",20)+"\n");
        raise=40000;
        c.print(Format.justify('r',year,6));
        c.print(Format.justify('c',nopay,20,0));
        c.print(Format.justify('c',raise,21,0));
        c.println(Format.justify('c',newsalary,18,0));
        for(year=2; year<=10; year+=1){
            c.print(Format.justify('r',year,6));
            c.print(Format.justify('c',salary,20,0));
            raise=salary*0.03;
            newsalary+=raise;
            c.print(Format.justify('c',raise,20,0));
            c.println(Format.justify('c',newsalary,20,0));
            salary=newsalary;
        }
    }
    
}
