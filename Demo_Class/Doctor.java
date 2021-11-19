package Demo_Class;
public class Doctor implements Staff
{
           
        int    ID;
        int    Age;
        String Name;
        String phone;
        String email;
        String address;
        String Depart;
        String Sex;
        double MonthlySalary;
    
    public void set_DAta(int id,int age,String name, String Phone, String Email, String Address ,String sex ,String depart,double monthly_salary)
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
    @Override
    public void GetSalary()
    {
        System.out.println("Doctor_MonthlySalary does not exceed : 20000 "); 
    }

    @Override
    public void getYearsOfWork() 
    {
        System.out.println("Years of work does not exceed : 40 years");
    }

    @Override
    public void Print_DAta()
    {
         System.out.println("Doctor_ID : "            + ID);
         System.out.println("Doctor_Age : "           + Age);
         System.out.println("Doctor_Name : "          + Name);
         System.out.println("Doctor_phone : "         + phone);
         System.out.println("Doctor_Email : "         + email);  
         System.out.println("Doctor_Address : "       + address); 
         System.out.println("Doctor_Sex : "           + Sex); 
         System.out.println("Doctor_Depart : "        + Depart); 
         System.out.println("Doctor_MonthlySalary : " + MonthlySalary);
    }
    
}
