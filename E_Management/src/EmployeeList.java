import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList extends ArrayList<Employee>{
    public EmployeeList(){}
    ValidData vd = new ValidData();
    Scanner sc = new Scanner(System.in);
    public void AddE(){
        long salary;
        String ID,fName, lName, date, phone, eMail, add, sex, agency;
        ID = vd.isNotDuplicate(this, "Enter employee ID: ");
        fName = vd.inputString("Enter the First Name: ");
        lName = vd.inputString("Enter the Last Name: "); 
        phone = vd.inputString("Enter the Phone: "); 
        eMail = vd.inputString("Enter the Email: "); 
        add = vd.inputString("Enter the Address: "); 
        date = vd.inputDate("Enter the Date: "); 
        sex = vd.inputString("Enter the Sex: "); 
        salary = vd.inputLong("Enter the Salary: "); 
        agency = vd.inputString("Enter the Agency: ");
        add(new Employee(ID, fName, lName, phone, eMail, add, date, sex, salary, agency));
        System.out.println("Added employee successfully!");
    }
    public int SearchByID(String ID){
        for(int i=0; i < this.size();i++){
            if(this.get(i).getID().equals(ID)){
                return i;
            }
        }
        return -1;
    }
    public void UpdateE(){
        long salary;
        String ID,fName, lName, date, phone, eMail, add, sex, agency; 
        ID = vd.isDuplicate(this, "Enter employee ID you want to update: ");
        fName = vd.inputString("Enter the new First Name: ");
        lName = vd.inputString("Enter the new Last Name: "); 
        phone = vd.inputString("Enter the new Phone: "); 
        eMail = vd.inputString("Enter the new Email: "); 
        add = vd.inputString("Enter the new Address: "); 
        date = vd.inputDate("Enter the new Date: "); 
        sex = vd.inputString("Enter the new Sex: "); 
        salary = vd.inputLong("Enter the new Salary: "); 
        agency = vd.inputString("Enter the new Agency: ");
        Employee e = this.get(SearchByID(ID));
        e.setfName(fName);
        e.setlName(lName);
        e.setPhone(phone);
        e.seteMail(eMail);
        e.setAdd(add);
        e.setDate(date);
        e.setSex(sex);
        e.setSalary(salary);
        e.setAgency(agency);
        System.out.println("Updated employee successfully!");
    }
    public void RemoveE(){ 
        String ID = vd.isDuplicate(this, "Enter employee ID you want to remove: ");
        remove(SearchByID(ID));
        System.out.println("Removed employee successfully!");
    } 
    public void SearchByName(){ 
        String pname = vd.inputString("Enter first or last name employee you want to search: ");
        for(Employee e: this){
            if(e.getfName().contains(pname) || e.getlName().contains(pname)){
                System.out.println(e);
            }
        }
        System.out.println("The employee does not exist!");
    }
    public void SortBySalary(){
        for(int i=0; i < this.size(); i++){
            for(int j = i +1; j < this.size(); j++){
                if(this.get(j).getSalary() < this.get(i).getSalary()){
                    Employee c = this.get(i);
                    this.set(i, this.get(j)); 
                    this.set(j, c); 
                }
            }
        }
        Display(); 
    }
    public void Display(){
        for(Employee e: this){
            System.out.println(e);
        } 
    }
}
