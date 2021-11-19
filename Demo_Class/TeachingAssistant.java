package Demo_Class;
public class TeachingAssistant implements Staff
{
    private int    ID;
            int    Age;
            String Name;
            String phone;
            String email;
            String address;
            String Depart;
            String Sex;
            double MonthlySalary;
         
 
 public TeachingAssistant()
    {
        ID            = 0;
        Age           = 0;
        Name          = null;
        phone         = null;
        email         = null;
        address       = null;
        Depart        = null;
        Depart        = null;
        MonthlySalary = 0.0;
       
        
    }
 
    public void set_ID( int id)
    {
         ID = id;
    }
    public int get_ID( int id)
    {
         return id;
    }
    


  @Override
    public void GetSalary( )
    {
         System.out.println("TeachingAssistant_MonthlySalary does not exceed : 10000 "); 
    }
    
    @Override
    
    public void getYearsOfWork()
    {
         System.out.println("Years of work does not exceed : 35 years");
    }
 
    @Override
    public void Print_DAta()
    {
         System.out.println("TeachingAssistant_ID : "            + ID);
         System.out.println("TeachingAssistant_Age : "           + Age);
         System.out.println("TeachingAssistant_Name : "          + Name);
         System.out.println("TeachingAssistant_phone : "         + phone);
         System.out.println("TeachingAssistant_Email : "         + email);  
         System.out.println("TeachingAssistant_Address : "       + address); 
         System.out.println("TeachingAssistant_Sex : "           + Sex); 
         System.out.println("TeachingAssistant_Depart : "        + Depart); 
         System.out.println("TeachingAssistant_MonthlySalary : " + MonthlySalary);
    }

    @Override
    public void set_DAta( int id, int age, String name, String Phone, String Email, String Address, String sex, String depart, double monthly_salary) 
    {
        ID              = id;
        Age             = age;
        Name            = name;
        phone           = Phone;
        email           = Email;
        address         = Address;
        Sex             = sex;
        Depart          = depart;
        MonthlySalary   = monthly_salary;
    }
}
