// importing different packages that are required for making GUI.
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
//Creating a class named INGNepal and implementing actionlistner for buttons
public class INGNepal implements ActionListener{
    //Declearing all the omponent which is added to this GUI
    JFrame frm;

    JPanel vacPanelFullTime, appPanelFullTime, vacPanelPartTime, appPanelPartTime;

    JLabel lblTitle, lblFullTime, lblVacancyNumberFV, lblDesignationFV, lblJobFV, lblSalaryFV, lblWorkingHoursFV,
    lblVacancyNumberFA, lblStaffNameFA, lblJoinedDateFA, lblQualificationFA, lblAppointedByFA,
    lblPartTime,  lblVacancyNumberPV, lblDesignationPV, lblJobPV, lblSalaryPV, lblWorkingHoursPV, lblShifts,
    lblVacancyNumberPA, lblStaffNamePA, lblJoinedDatePA, lblQualificationPA, lblAppointedByPA;

    JTextField txtVacancyNumberFV, txtDesignationFV, txtJobFV, txtSalaryFV, txtWorkingHoursFV,
    txtVacancyNumberFA, txtStaffNameFA, txtJoinedDateFA, txtQualificationFA, txtAppointedByFA,
    txtVacancyNumberPV, txtDesignationPV, txtJobPV, txtSalaryPV, txtWorkingHoursPV,
    txtVacancyNumberPA, txtStaffNamePA, txtJoinedDatePA, txtQualificationPA, txtAppointedByPA;

    JButton FullVacancyButton, FullAppointButton, PartVacancyButton, PartAppointButton, TerminateButton, DisplayButton, ClearButton;

    JComboBox cmbShifts;

    //Creating array list to add objects
    ArrayList<StaffHire> list=new ArrayList<StaffHire>();

    //Creating main Method for running the programm in command prompt
    public static void main(String[] args){
        INGNepal carry = new INGNepal();
        carry.StaffRegForm();
    }
    //Creating method for making GUI
    public void StaffRegForm(){
        //Creating main frame 
        frm=new JFrame("INGNepal Staff Registration Form");
        frm.setSize(1200,1000);
        frm.setLayout(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Giving title to the main frame
        lblTitle=new JLabel("INGNepal");
        lblTitle.setBounds(600,10,400,30);
        frm.add(lblTitle);

        lblFullTime=new JLabel("Full Time StaffHire");
        lblFullTime.setBounds(400,30,400,30);
        frm.add(lblFullTime);

        //Creating a panel for full time staff vacancy
        vacPanelFullTime=new JPanel();
        vacPanelFullTime.setBounds(30,60,400,320);
        vacPanelFullTime.setLayout(null);
        vacPanelFullTime.setBorder(BorderFactory.createEtchedBorder());
        vacPanelFullTime.setBackground(new Color(180,180,180,180));
        frm.add(vacPanelFullTime);

        lblVacancyNumberFV=new JLabel("Vacancy Number");
        lblVacancyNumberFV.setBounds(20,20,100,30);
        vacPanelFullTime.add(lblVacancyNumberFV);

        txtVacancyNumberFV=new JTextField();
        txtVacancyNumberFV.setBounds(120,20,100,30);
        vacPanelFullTime.add(txtVacancyNumberFV);

        lblDesignationFV=new JLabel("Designation");
        lblDesignationFV.setBounds(20,70,100,30);
        vacPanelFullTime.add(lblDesignationFV);

        txtDesignationFV=new JTextField();
        txtDesignationFV.setBounds(120,70,100,30);
        vacPanelFullTime.add(txtDesignationFV);

        lblJobFV=new JLabel("JobType");
        lblJobFV.setBounds(20,120,100,30);
        vacPanelFullTime.add(lblJobFV);

        txtJobFV=new JTextField();
        txtJobFV.setBounds(120,120,100,30);
        vacPanelFullTime.add(txtJobFV);

        lblSalaryFV=new JLabel("Salary");
        lblSalaryFV.setBounds(20,170,100,30);
        vacPanelFullTime.add(lblSalaryFV);

        txtSalaryFV=new JTextField();
        txtSalaryFV.setBounds(120,170,100,30);
        vacPanelFullTime.add(txtSalaryFV);

        lblWorkingHoursFV=new JLabel("WorkingHours");
        lblWorkingHoursFV.setBounds(20,220,100,30);
        vacPanelFullTime.add(lblWorkingHoursFV);

        txtWorkingHoursFV=new JTextField();
        txtWorkingHoursFV.setBounds(120,220,100,30);
        vacPanelFullTime.add(txtWorkingHoursFV);

        //Creating button to add vacancy for full time staff
        FullVacancyButton=new JButton("Add FullTime Vacancy");
        FullVacancyButton.setBounds(100,270,200,30);
        FullVacancyButton.addActionListener(this);
        vacPanelFullTime.add(FullVacancyButton);

        //Creating panel for appoining full time staff
        appPanelFullTime=new JPanel();
        appPanelFullTime.setBounds(460,60,400,320);
        appPanelFullTime.setLayout(null);
        appPanelFullTime.setBorder(BorderFactory.createEtchedBorder());
        appPanelFullTime.setBackground(new Color(180,180,180,180));
        frm.add(appPanelFullTime);

        lblVacancyNumberFA=new JLabel("Vacancy Number");
        lblVacancyNumberFA.setBounds(20,20,100,30);
        appPanelFullTime.add(lblVacancyNumberFA);

        txtVacancyNumberFA=new JTextField();
        txtVacancyNumberFA.setBounds(120,20,100,30);
        appPanelFullTime.add(txtVacancyNumberFA);

        lblStaffNameFA=new JLabel("Staff Name");
        lblStaffNameFA.setBounds(20,70,100,30);
        appPanelFullTime.add(lblStaffNameFA);

        txtStaffNameFA=new JTextField();
        txtStaffNameFA.setBounds(120,70,100,30);
        appPanelFullTime.add(txtStaffNameFA);

        lblJoinedDateFA=new JLabel("Joining Date");
        lblJoinedDateFA.setBounds(20,120,100,30);
        appPanelFullTime.add(lblJoinedDateFA);

        txtJoinedDateFA=new JTextField();
        txtJoinedDateFA.setBounds(120,120,100,30);
        appPanelFullTime.add(txtJoinedDateFA);

        lblQualificationFA=new JLabel("Qualification");
        lblQualificationFA.setBounds(20,170,100,30);
        appPanelFullTime.add(lblQualificationFA);

        txtQualificationFA=new JTextField();
        txtQualificationFA.setBounds(120,170,100,30);
        appPanelFullTime.add(txtQualificationFA);

        lblAppointedByFA=new JLabel("Appointed By");
        lblAppointedByFA.setBounds(20,220,100,30);
        appPanelFullTime.add(lblAppointedByFA);

        txtAppointedByFA=new JTextField();
        txtAppointedByFA.setBounds(120,220,100,30);
        appPanelFullTime.add(txtAppointedByFA);

        //Creating button to appoint a full time staff
        FullAppointButton=new JButton("Appoint FullTime Staff");
        FullAppointButton.setBounds(100,270,200,30);
        FullAppointButton.addActionListener(this);
        appPanelFullTime.add(FullAppointButton);

        lblPartTime=new JLabel("PartTime Time StaffHire");
        lblPartTime.setBounds(400,390,400,30);
        frm.add(lblPartTime);

        //Creating new panel for part time staff vacancy
        vacPanelPartTime=new JPanel();
        vacPanelPartTime.setBounds(30,420,400,350);
        vacPanelPartTime.setLayout(null);
        vacPanelPartTime.setBorder(BorderFactory.createEtchedBorder());
        vacPanelPartTime.setBackground(new Color(180,180,180,180));
        frm.add(vacPanelPartTime);

        lblVacancyNumberPV=new JLabel("Vacancy Number");
        lblVacancyNumberPV.setBounds(20,20,100,30);
        vacPanelPartTime.add(lblVacancyNumberPV);

        txtVacancyNumberPV=new JTextField();
        txtVacancyNumberPV.setBounds(120,20,100,30);
        vacPanelPartTime.add(txtVacancyNumberPV);

        lblDesignationPV=new JLabel("Designation");
        lblDesignationPV.setBounds(20,70,100,30);
        vacPanelPartTime.add(lblDesignationPV);

        txtDesignationPV=new JTextField();
        txtDesignationPV.setBounds(120,70,100,30);
        vacPanelPartTime.add(txtDesignationPV);

        lblJobPV=new JLabel("JobType");
        lblJobPV.setBounds(20,120,100,30);
        vacPanelPartTime.add(lblJobPV);

        txtJobPV=new JTextField();
        txtJobPV.setBounds(120,120,100,30);
        vacPanelPartTime.add(txtJobPV);

        lblSalaryPV=new JLabel("Wages/Hour");
        lblSalaryPV.setBounds(20,170,100,30);
        vacPanelPartTime.add(lblSalaryPV);

        txtSalaryPV=new JTextField();
        txtSalaryPV.setBounds(120,170,100,30);
        vacPanelPartTime.add(txtSalaryPV);

        lblWorkingHoursPV=new JLabel("WorkingHours");
        lblWorkingHoursPV.setBounds(20,220,100,30);
        vacPanelPartTime.add(lblWorkingHoursPV);

        txtWorkingHoursPV=new JTextField();
        txtWorkingHoursPV.setBounds(120,220,50,30);
        vacPanelPartTime.add(txtWorkingHoursPV);

        lblShifts=new JLabel("Shifts");
        lblShifts.setBounds(190,220,50,30);
        vacPanelPartTime.add(lblShifts);

        String Shifts[]={"Morning","Day","Night"};
        cmbShifts=new JComboBox(Shifts);
        cmbShifts.setBounds(250,220,120,30);
        vacPanelPartTime.add(cmbShifts);

        //Creating button to add vacancy in oart time staff
        PartVacancyButton=new JButton("Add PartTime Vacancy");
        PartVacancyButton.setBounds(100,270,200,30);
        PartVacancyButton.addActionListener(this);
        vacPanelPartTime.add(PartVacancyButton);

        //Creating new panel for appointing part time staff
        appPanelPartTime=new JPanel();
        appPanelPartTime.setBounds(460,420,400,350);
        appPanelPartTime.setLayout(null);
        appPanelPartTime.setBorder(BorderFactory.createEtchedBorder());
        appPanelPartTime.setBackground(new Color(180,180,180,180));
        frm.add(appPanelPartTime);

        lblVacancyNumberPA=new JLabel("Vacancy Number");
        lblVacancyNumberPA.setBounds(20,20,100,30);
        appPanelPartTime.add(lblVacancyNumberPA);

        txtVacancyNumberPA=new JTextField();
        txtVacancyNumberPA.setBounds(120,20,100,30);
        appPanelPartTime.add(txtVacancyNumberPA);

        lblStaffNamePA=new JLabel("Staff Name");
        lblStaffNamePA.setBounds(20,70,100,30);
        appPanelPartTime.add(lblStaffNamePA);

        txtStaffNamePA=new JTextField();
        txtStaffNamePA.setBounds(120,70,100,30);
        appPanelPartTime.add(txtStaffNamePA);

        lblJoinedDatePA=new JLabel("Joining Date");
        lblJoinedDatePA.setBounds(20,120,100,30);
        appPanelPartTime.add(lblJoinedDatePA);

        txtJoinedDatePA=new JTextField();
        txtJoinedDatePA.setBounds(120,120,100,30);
        appPanelPartTime.add(txtJoinedDatePA);

        lblQualificationPA=new JLabel("Qualification");
        lblQualificationPA.setBounds(20,170,100,30);
        appPanelPartTime.add(lblQualificationPA);

        txtQualificationPA=new JTextField();
        txtQualificationPA.setBounds(120,170,100,30);
        appPanelPartTime.add(txtQualificationPA);

        lblAppointedByPA=new JLabel("Appointed By");
        lblAppointedByPA.setBounds(20,220,100,30);
        appPanelPartTime.add(lblAppointedByPA);

        txtAppointedByPA=new JTextField();
        txtAppointedByPA.setBounds(120,220,100,30);
        appPanelPartTime.add(txtAppointedByPA);

        //Creating button to appoint a part time staff
        PartAppointButton=new JButton("Appoint PartTime Staff");
        PartAppointButton.setBounds(20,270,180,30);
        PartAppointButton.addActionListener(this);
        appPanelPartTime.add(PartAppointButton);

        //Creating button to terminate a staff
        TerminateButton=new JButton("Terminate a Staff");
        TerminateButton.setBounds(220,270,150,30);
        TerminateButton.addActionListener(this);
        appPanelPartTime.add(TerminateButton);

        //Creating button to show all information stored
        DisplayButton=new JButton("Display");
        DisplayButton.setBounds(900,350,100,100);
        DisplayButton.addActionListener(this);
        frm.add(DisplayButton);

        //Creating button to clear everything from text field
        ClearButton=new JButton("Clear");
        ClearButton.setBounds(1050,350,100,100);
        ClearButton.addActionListener(this);
        frm.add(ClearButton);

        //By writing visibilty of the frame in last it allows other item in the form to load first.
        frm.setVisible(true);
    }   

    /* This is abstract method for ActionListener.
     * INGNepal class overrides this method as it implements ActionListener class which is an abstract class.
     * IN this method various metthods are called accoring to the button which is being clicked.
     */
    public void actionPerformed(ActionEvent e){
        //giving actions to perform for Clear button
        if(e.getSource()==ClearButton){
            txtVacancyNumberFV.setText("");
            txtDesignationFV.setText("");
            txtJobFV.setText("");
            txtSalaryFV.setText("");
            txtWorkingHoursFV.setText("");
            txtVacancyNumberFA.setText("");
            txtStaffNameFA.setText("");
            txtJoinedDateFA.setText("");
            txtQualificationFA.setText("");
            txtAppointedByFA.setText("");
            txtVacancyNumberPV.setText("");
            txtDesignationPV.setText("");
            txtJobPV.setText("");
            txtSalaryPV.setText("");
            txtWorkingHoursPV.setText("");
            txtVacancyNumberPA.setText("");
            txtStaffNamePA.setText("");
            txtJoinedDatePA.setText("");
            txtQualificationPA.setText("");
            txtAppointedByPA.setText("");
            cmbShifts.setSelectedIndex(0);

        }
        else if(e.getSource()==DisplayButton){
            DisplayButton();
        }
        else if(e.getSource()==FullVacancyButton){
            FullVacancyButton();
        }
        else if(e.getSource()==FullAppointButton){
            FullAppointButton();
        }
        else if(e.getSource()==PartVacancyButton){
            PartVacancyButton();
        }
        else if(e.getSource()==PartAppointButton){
            PartAppointButton();
        }
        else if(e.getSource()==TerminateButton){
            TerminateButton();
        }
    }

    /* This method is called when user clicks add FullTime Vacancy button
     * First it access the required values from GUI and stores in variables.
     * then it checks many conditions
     * if the conditions doesnot matchs the a pop up appears in screen
     * if condition matches it creats object of Full Time Staff hire and added to an arraylist
     */
    public void FullVacancyButton(){

        try{
            String VacancyNumber=txtVacancyNumberFV.getText();
            String Designation=txtDesignationFV.getText();
            String JobType=txtJobFV.getText();
            String Salary=txtSalaryFV.getText();
            String WorkingHours=txtWorkingHoursFV.getText();

            if(VacancyNumber.isEmpty() || Designation.isEmpty()|| JobType.isEmpty()|| Salary.isEmpty() || WorkingHours.isEmpty()) {
                JOptionPane.showMessageDialog(frm, "Sorry, You can not add vacancy with empty fields!!","Notice",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(Designation.matches(".*\\d.*") || JobType.matches(".*\\d.*")){
                JOptionPane.showMessageDialog(frm,"Sorry, You have entered wrong data type please read carefully and enter right data type in text field!!","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                boolean isDuplicateVacancyNumber=false;
                for(StaffHire var:list){
                    int VacancyNumber1=Integer.parseInt(VacancyNumber);
                    if(var.getvacancyNumber()==VacancyNumber1){
                        isDuplicateVacancyNumber=true;
                        break;
                    }
                }
                float Salary1=Float.parseFloat(Salary);
                int VacancyNumber5=Integer.parseInt(VacancyNumber);
                if(Salary1 < 10000 || Salary1 > 200000){
                    JOptionPane.showMessageDialog(frm,"Sorry, Salary should be between 10000 to 200000!!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(VacancyNumber5<=0 && VacancyNumber5> list.size()){
                    JOptionPane.showMessageDialog(frm,"Sorry, You can not enter that vacancy number in text field!!","Error",JOptionPane.ERROR_MESSAGE);
                }

                else if(isDuplicateVacancyNumber==false){
                    int VacancyNumber2=Integer.parseInt(VacancyNumber);
                    float Salary2=Float.parseFloat(Salary);
                    float WorkingHours1=Float.parseFloat(WorkingHours);
                    FullTimeStaffHire obj=new FullTimeStaffHire(VacancyNumber2, Designation, JobType, Salary2, WorkingHours1);
                    list.add(obj);
                    JOptionPane.showMessageDialog(frm,"Congratulations, FullTime vacancy has been added successfully!!","Notice",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(frm,"Sorry, This vacancy number already eixsts!!","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(NumberFormatException E){
            JOptionPane.showMessageDialog(frm,"Sorry, You have entered wrong data type please read carefully and enter right data type in text field!!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    //This method is called when user clicks on Appoint FullTime Staff
    public void FullAppointButton(){
        try{
            String VacancyNumber=txtVacancyNumberFA.getText().trim();
            String StaffName=txtStaffNameFA.getText();
            String JoinedDate=txtJoinedDateFA.getText();
            String Qualification=txtQualificationFA.getText();
            String AppointedBy=txtAppointedByFA.getText();

            if(VacancyNumber.isEmpty()|| StaffName.isEmpty()|| JoinedDate.isEmpty()|| Qualification.isEmpty()|| AppointedBy.isEmpty()) {
                JOptionPane.showMessageDialog(frm, "Sorry, You can not appoint staff with empty fields!!","Notice",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(StaffName.matches(".*\\d.*") || Qualification.matches(".*\\d.*") || AppointedBy.matches(".*\\d.*")){
                JOptionPane.showMessageDialog(frm,"Sorry, You have entered wrong data type please read carefully and enter right data type in text field!!","Error",JOptionPane.ERROR_MESSAGE);
            }

            else{
                boolean VacancyNumberFound=false;
                for(StaffHire obj:list){
                    int VacancyNumber3=Integer.parseInt(VacancyNumber);
                    if(obj.getvacancyNumber()==VacancyNumber3){
                        VacancyNumberFound=true;
                        if(obj instanceof FullTimeStaffHire){
                            FullTimeStaffHire h=(FullTimeStaffHire)obj;
                            if(h.getjoined()==true){
                                JOptionPane.showMessageDialog(frm,"Sorry, A staff has already been appointed in this vacancy number!!","Notice",JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                h.appointFullTimeStaff(StaffName, JoinedDate, Qualification, AppointedBy);
                                JOptionPane.showMessageDialog(frm,"Congratulations, You have been appointed as a FullTime staff!!","Notice",JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }else{
                            JOptionPane.showMessageDialog(frm,"Sorry,This vacancy number is not for FullTime staff!!","Error",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }

                }
                if(!VacancyNumberFound){
                    JOptionPane.showMessageDialog(frm,"Sorry, The vacancy number you entered did not match in our system try right vacancy number!!","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(NumberFormatException E){
            JOptionPane.showMessageDialog(frm,"Sorry, You have entered wrong data type please read carefully and enter right data type in text field!!","Error",JOptionPane.ERROR_MESSAGE);

        }

    }

    //This method is called when user clicks on add PartTime Vacancy button
    public void PartVacancyButton(){
        try{
            String VacancyNumber=txtVacancyNumberFV.getText();
            String Designation=txtDesignationFV.getText();
            String JobType=txtJobFV.getText();
            String Salary=txtSalaryFV.getText();
            String WorkingHours=txtWorkingHoursFV.getText();
            String Shifts=(cmbShifts.getSelectedItem()).toString();

            if(VacancyNumber.isEmpty() || Designation.isEmpty()|| JobType.isEmpty()|| Salary.isEmpty() || WorkingHours.isEmpty()) {
                JOptionPane.showMessageDialog(frm, "Sorry, You can not add vacancy with empty fields!!","Notice",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(Designation.matches(".*\\d.*") || JobType.matches(".*\\d.*")){
                JOptionPane.showMessageDialog(frm,"Sorry, You have entered wrong data type please read carefully and enter right data type in text field!!","Error",JOptionPane.ERROR_MESSAGE);
            }
            else

            {
                boolean isDuplicateVacancyNumber=false;
                for(StaffHire var:list){
                    int VacancyNumber4=Integer.parseInt(VacancyNumber);
                    if(var.getvacancyNumber()==VacancyNumber4){
                        isDuplicateVacancyNumber=true;
                        break;
                    }
                }
                int VacancyNumber6=Integer.parseInt(VacancyNumber);
                if(VacancyNumber6<=0 && VacancyNumber6> list.size()){
                    JOptionPane.showMessageDialog(frm,"Sorry, You can not enter that vacancy number in text field!!","Error",JOptionPane.ERROR_MESSAGE);
                }
                if(isDuplicateVacancyNumber==false){
                    int VacancyNumber5=Integer.parseInt(VacancyNumber);
                    float Salary3=Float.parseFloat(Salary);
                    float WorkingHours2=Float.parseFloat(WorkingHours);
                    PartTimeStaffHire obj=new PartTimeStaffHire(VacancyNumber5, Designation, JobType, Salary3, WorkingHours2, Shifts);
                    list.add(obj);

                    JOptionPane.showMessageDialog(frm,"Congratulations, PartTime vacancy has been added successfully!!","Notice",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(frm,"Sorry, This vacancy number already exists","Notice",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }catch(NumberFormatException E){
            JOptionPane.showMessageDialog(frm,"Sorry, You have entered wrong data type please read carefully and enter right data type in text field!!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    //This method is called when user clicks on appoint PartTime Staff button
    public void PartAppointButton(){
        try{
            String VacancyNumber=txtVacancyNumberPA.getText().trim();
            String StaffName=txtStaffNamePA.getText();
            String JoinedDate=txtJoinedDatePA.getText();
            String Qualification=txtQualificationPA.getText();
            String AppointedBy=txtAppointedByPA.getText();

            if(VacancyNumber.isEmpty()|| StaffName.isEmpty()|| JoinedDate.isEmpty()|| Qualification.isEmpty()|| AppointedBy.isEmpty()) {
                JOptionPane.showMessageDialog(frm, "Sorry, You can not appoint staff with empty fields!!","Notice",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(StaffName.matches(".*\\d.*") || Qualification.matches(".*\\d.*") || AppointedBy.matches(".*\\d.*")){
                JOptionPane.showMessageDialog(frm,"Sorry, You have entered wrong data type please read carefully and enter right data type in text field!!","Error",JOptionPane.ERROR_MESSAGE);
            }

            else{

                boolean VacancyNumberFound=false;
                for(StaffHire obj:list){
                    int VacancyNumber2=Integer.parseInt(VacancyNumber);
                    if(obj.getvacancyNumber()==VacancyNumber2){
                        VacancyNumberFound=true;
                        if(obj instanceof PartTimeStaffHire){
                            PartTimeStaffHire h1=(PartTimeStaffHire)obj;
                            if(h1.getjoined()==true){
                                JOptionPane.showMessageDialog(frm,"Sorry, A staff has already been appointed in this vacancy number!!","Notice",JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                h1.appointPartTimeStaff(StaffName, JoinedDate, Qualification, AppointedBy);
                                JOptionPane.showMessageDialog(frm,"Congratulations, You have been appointed as a PartTime staff!!","Notice",JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }else{
                            JOptionPane.showMessageDialog(frm,"Sorry, This vacancy number is only for FullTime staff hire!!","Notice",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
                if(!VacancyNumberFound){
                    JOptionPane.showMessageDialog(frm,"Sorry, The vacancy number you entered did not match in our system try right vacancy number!!","Notice",JOptionPane.ERROR_MESSAGE);
                } 
            }
        }
        catch(NumberFormatException E){
            JOptionPane.showMessageDialog(frm,"Sorry, You have entered wrong data type please read carefully and enter right data type in text field!!","Error",JOptionPane.ERROR_MESSAGE);

        }
    }

    //This method is called when user clocks on Terminate button
    public void TerminateButton(){
        try{
            String vacancyNumber=txtVacancyNumberPA.getText().trim();

            if(vacancyNumber.isEmpty()){
                JOptionPane.showMessageDialog(frm,"Please enter vacancy number of staff you want to terminate.","Notice",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                boolean terminateVacancy=false;
                for(StaffHire obj:list){
                    int intvacancyNumber=Integer.parseInt(vacancyNumber);
                    if(obj.getvacancyNumber()==intvacancyNumber){
                        terminateVacancy=true;
                        if(obj instanceof PartTimeStaffHire){
                            PartTimeStaffHire h1=(PartTimeStaffHire)obj;
                            if(h1.getjoined()==true){
                                h1.staffTermination();
                                JOptionPane.showMessageDialog(frm,"Staff with given vacancy number has been terminated.","Notice",JOptionPane.INFORMATION_MESSAGE);
                            }
                            else{
                                JOptionPane.showMessageDialog(frm, "There is no staff with such vacancy number to terminate.","Notice", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }
                if(!terminateVacancy){
                    JOptionPane.showMessageDialog(frm,"Sorry, Vacancy did not match our list\nPlease check and input valid unused vacancy or create a vacancy in this number..","Notice",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(NumberFormatException E){
            JOptionPane.showMessageDialog(frm,"Sorry, You have entered wrong data type please read carefully and enter right data type in text field!!","Notice",JOptionPane.ERROR_MESSAGE);
        }
    }

    //This method is called when user clicks on Display button
    public void DisplayButton(){
        if(list.size()==0){
            JOptionPane.showMessageDialog(frm,"No staff has been appointed to show information!!","Notice",JOptionPane.INFORMATION_MESSAGE);
        }
        for(StaffHire obj:list){
            if(obj instanceof FullTimeStaffHire){
                System.out.println("----------------------------------------");
                System.out.println("Full Time Staff Informations");
                System.out.println("----------------------------------------");
                ((FullTimeStaffHire)obj).display();
            }
            if(obj instanceof PartTimeStaffHire){
                System.out.println("----------------------------------------");
                System.out.println("Part Time Staff Informations");
                System.out.println("----------------------------------------");
                ((PartTimeStaffHire)obj).display();
            }
        }

    }
}
