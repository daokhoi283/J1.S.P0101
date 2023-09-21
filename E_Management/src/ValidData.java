import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ValidData{
    Scanner sc = new Scanner(System.in);
    public String isNotDuplicate(EmployeeList e, String msg){ 
        while (true) {  
            boolean check = false;
            String inputID = inputString(msg);  
            for(Employee list: e){
            if(list.getID().equals(inputID)){   
                    check = true;
                    System.out.println("ID already exists, please re-enter!");
                    continue;
                }   
            }   
            if(!check){
                return inputID;
            }
        }  
    }
    // System.out.println("ID does not exists, please re-enter!");
    public String isDuplicate(EmployeeList e, String msg){ 
        while (true) {  
            String inputID = inputString(msg);  
            for(Employee list: e){
            if(list.getID().equals(inputID)){
                return inputID; 
                }   
            }   
            System.out.println("ID does not exists, please re-enter!");
            continue;
        }  
    }
    public String inputString(String msg){
        while (true) {
            System.out.print(msg);
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("Input can not empty, please re-enter!");
                continue;
            }
            return input;
        }
    }
    public Long inputLong(String msg){
        while (true) {
            try {
                System.out.print(msg);
                Long input = Long.parseLong(sc.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Input must number, please re-enter!");
            }
        }
    }
    public int inputInt(String msg){
        while (true) {
            try {
                System.out.print(msg);
                Integer input = Integer.parseInt(sc.nextLine()); 
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Input must number, please re-enter!");
            }
        }
    }
    public String inputDate(String msg){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        sdf.setLenient(false);
        while (true) {
            try { 
                System.out.print(msg);
                String date = sc.nextLine();
                sdf.parse(date); 
                return date;
            } catch (Exception e) {
                System.out.println("Date is not valid, please re-enter!");
            }   
        } 
    }
}
