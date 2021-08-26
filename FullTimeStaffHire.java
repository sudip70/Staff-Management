/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author Sudip Shrestha
 * @version 0.1
 */
// creating child class(FullTimeStaffHire) of parents class (StaffHire).
public class FullTimeStaffHire extends StaffHire
{
    // declearing 7 instance variable of child class.
     // using private as an access modifier beacuse there is no further classes which needs to use these instance variables.
    private float salary;
    private float workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    public FullTimeStaffHire(int vacancyNumber, String designation,String jobType, float salary, float workingHour){
        // creating a constructor of this class for initializing instance variables.
         // it takes 6 parameters which are local variables.
         // values of local variables gets assigned to instance variables when this constructor gets called.
        super(vacancyNumber,designation,jobType);
        // super keyword is used to access instance variables and methods from parents class.
        // we dont have to declear these instance variables and methods again and agian in child classes. 
        this.salary = salary;
        this.workingHour = workingHour;
        this.staffName = "";
        this.joiningDate = "";
        this.qualification = "";
        this.appointedBy = "";
        this.joined = false;
    }
    // creating 7 different accessor methods that returns valus of instance variables.
     // which are initializes in consutructor.
    public float getsalary(){
        return this.salary;
    }
    public float getworkingHour(){
        return this.workingHour;
    }
    public String getstaffName(){
        return this.staffName;
    }
    public String getjoiningDate(){
        return this.joiningDate;
    }
    public String getqualification(){
        return this.qualification;
    }
    public String getappointedBy(){
        return this.appointedBy;
    }
    public boolean getjoined(){
        return this.joined;
    }
    public void setsalary(float salary){
        if (this.joined){
            System.out.println(staffName+" has been appointed .\nYour salary can not be changed.");
        }
        else{
            this.salary = salary;
        }
    }
     public void setworkingHour(float workingHour){
        this.workingHour = workingHour;
    }
       // creating method which checks whether the staff has already joined or not.
        // if yess it shows message to user.
        // if no it sets parameter values to the instance variables. 
    public void appointFullTimeStaff (String staffName, String joiningDate, String qualification, String appointedBy){
        if(this.joined){
        System.out.println("Sorry " +staffName+ " has already joined on " +joiningDate);
        }
        else{
        this.staffName = staffName;
        this.joined = true;
        this.joiningDate = joiningDate;
        this.qualification = qualification;
        this.appointedBy = appointedBy;
    }
    }
    public void display(){
        // method overriding to print out information about FullTimeStaffHire.
        super.display();
        if (this.joined){
            System.out.println("staffName :" + this.getstaffName());
        System.out.println("salary :" + this.getsalary());
        System.out.println("workingHour :" + this.getworkingHour());
        System.out.println("joiningDate :" + this.getjoiningDate());
        System.out.println("qualification :" + this.getqualification());
        System.out.println("appointedBy :" + this.getappointedBy());
    }
} 
}
