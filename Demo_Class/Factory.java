package Demo_Class;
public class Factory 
{
public Staff getStaff(String desired_Member) 
{
     if(desired_Member == null)
            return null;
        else if (desired_Member.equalsIgnoreCase("DOCTOR"))
            return new Doctor();
        else if (desired_Member.equalsIgnoreCase("TEACHING ASSISTANT"))
            return new TeachingAssistant();
        return null;
}
}
