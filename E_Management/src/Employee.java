public class Employee {
    String ID, fName, lName, phone, eMail, add, date, sex, agency;
    long salary;
    public Employee(){
    }
    public Employee(String ID, String fName, String lName, String Phone, String email, String add, String date, String sex, long salary, String agency){
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
        this.phone = Phone;
        this.eMail = email;
        this.add = add;
        this.date = date;
        this.sex = sex;
        this.salary = salary;
        this.agency = agency;
    }
    public String getID(){
        return this.ID;
    }
    public String getDate(){
        return this.date;
    }
    public long getSalary(){
        return this.salary;
    }
    public String getfName(){
        return this.fName;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getlName(){
        return this.lName;
    }
    public String geteMail(){
        return this.eMail;
    }
    public String getAdd(){
        return this.add;
    }
    public String getSex(){
        return this.sex;
    }
    public String getAgency(){
        return this.agency;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }
    @Override
    public String toString() {
        return "ID= " + ID + ", FirstName= " + fName + ", LastName= " + lName + ", Phone= " + phone + ", Email= " + eMail + ", Address= " + add + ", Date= " + date + ", Sex= " + sex + ", Salary= " + salary + ", Agency= " + agency;
    }
}
