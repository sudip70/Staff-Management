/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author Sudip Shrestha
 * @version 0.1
 */
// creating child class (PartTimeStaffHire) of parent class (StaffHire)
public class PartTimeStaffHire extends StaffHire
{
    // declearing 9 instance variable of child class.
    // using private as an access modifier beacuse there is no further classes which needs to use these instance variables.
    
    private float workingHour;
    private float wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    public PartTimeStaffHire(int vacancyNumber, String designation,String jobType, float workingHour, float wagesPerHour, String shifts){
       // creating a constructor of this class for initializing instance variables.
       // it takes 7 parameters which are local variables.
       // values of local variables gets assigned to instance variables when this constructor gets called.
       super(vacancyNumber,designation,jobType);
       this.workingHour = workingHour;
       this.wagesPerHour = wagesPerHour;
       this.staffName = "";
       this.joiningDate = "";
       this.qualification = "";
       this.appointedBy = "";
       this.shifts = shifts;
       this.joined = false;
       this.terminated = false;
    }
    // creating 9 different accessor methods that returns valus of instance variables.
    // which are initializes in consutructor.
    public float getworkingHour(){
        return this.workingHour;
    }
    public float getwagesPerHour(){
        return this.wagesPerHour;
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
    public String getshifts(){
        return this.shifts;
    }
    public boolean getjoined(){
        return this.joined;
    }
    public boolean getterminated(){
        return this.terminated;
    }
      public void setshifts (String shifts){
          if(this.joined){
           System.out.println(staffName+" already joined, so new shifts not allowed");
        }
        else{
            this.shifts =shifts;
        }
    }
     // creating method which checks whether the staff has already joined or not.
     // if yess it shows message to user.
     // if no it sets parameter values to the instance variables. 
    public void appointPartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        if(this.joined){
        
            System.out.println("Sorry " +staffName+ " has been already appointed on " +joiningDate);
        }
        else{
        
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
            this.terminated = false;
        }
    }
     // creating method which checks whether the staff has been terminated or not.
     // if yess it shows message to user.
     // if no it sets parameter values to the instance variables. 
    
    public void staffTermination(){
        if(this.terminated){
            System.out.println("Sorry " +staffName+ " has been terminated.");
        }
        else{
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
            this.joined = false;
            this.terminated = true;
        }
    }
    public void display()
    {
    // method overriding to print out information about PartTimeStaffHire.
    super.display();
        if(getjoined()){
        
            System.out.println("staffName :" + this.getstaffName());
            System.out.println("wagesPerHour :" + this.getwagesPerHour());
            System.out.println("workingHour :" + this.getworkingHour());
            System.out.println("joiningDate :" + this.getjoiningDate());
            System.out.println("qualification :" + this.getqualification());
            System.out.println("appointedBy :" + this.getappointedBy());
            System.out.println("incomePerDay :" + this.getwagesPerHour() * this.getworkingHour());
        }
    }
}
