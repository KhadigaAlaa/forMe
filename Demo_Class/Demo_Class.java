package Demo_Class;
import java.util.*;
public class Demo_Class 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Desired Member");
        String str = input.nextLine();   
        Factory f =new Factory();
        
        Staff s = f.getStaff(str);
        s.getYearsOfWork();
        s.GetSalary();
        s.set_DAta( 12345, 30, "Alaa", "010000242", "abcd@gmail.com", "Minia", "Female", "CS",2500 );
        s.Print_DAta();
    }
}
