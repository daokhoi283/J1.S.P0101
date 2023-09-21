import java.util.ArrayList; 

public class Manager{
    public static void main(String[] args) { 
        int choice;
        EmployeeList el = new EmployeeList();
        ValidData vd = new ValidData();
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Add employees");
        arr.add("Update employees");
        arr.add("Remove employees");
        arr.add("Search employees");
        arr.add("Sort employees by salary");
        arr.add("Display employees information");
        arr.add("Exit");
        do {
            System.out.println();
            for(int i=0; i < arr.size();i++){
                System.out.println((i+1) + ".\t" + arr.get(i));
            } 
            choice = vd.inputInt("Enter the choice(1->6): ");
            switch (choice) {
                case 1:
                    el.AddE();
                    break;
                case 2:
                    el.UpdateE();
                    break;
                case 3:
                    el.RemoveE();
                    break;
                case 4:
                    el.SearchByName();
                    break;
                case 5:
                    el.SortBySalary();
                    break; 
                case 6:
                    el.Display();
                    break;
                default: 
                    break;
            }
        } while (choice > 0 && choice < 7);
    }
}