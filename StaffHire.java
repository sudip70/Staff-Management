
/**
 * Write a description of class StaffHire here.
 *
 * @author Sudip Shestha
 * @version 0.1
 */
// creating a parent class named "StaffHire" which has 3 attributes.
public class StaffHire
{ 
    private int vacancyNumber;
    private String designation;
    private String jobType;
    
    // Creating method
    public StaffHire(int vacancyNumber, String designation,String jobType){
        this.vacancyNumber = vacancyNumber;
        this.designation = designation;
        this.jobType = jobType;
    }
    public int getvacancyNumber(){
        return this.vacancyNumber;
    }
    public String getdesignation(){
        return this.designation;
    }
    public String getjobType(){
        return this.jobType;
    }
    public void setvacancyNumber(int vacancyNumber){
        this.vacancyNumber = vacancyNumber;
    }
    public void setdesignation(String designation){
        this.designation = designation;
    }
    public void setjobType(String jobType){
        this.jobType = jobType;
    }
    public void display(){
        System.out.println("vacancyNumber: " + this.getvacancyNumber());
        System.out.println("designation: " + this.getdesignation());
        System.out.println("jobType: " + this.getjobType());
    }

}
