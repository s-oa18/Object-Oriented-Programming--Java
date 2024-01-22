import java.util.ArrayList;
public class Employees {
    ArrayList<Staff> employees;
    public Employees() {
        employees = new ArrayList<>();
    }
    public void addStaff(Staff staff) {
        employees.add(staff);
    }
    public void listAllEmployees() {
        for (Staff staff : employees) {
            String st = "";
            st += "Name: " + staff.getName() + "\t";
            st += "Staff ID: " + staff.getStaffID() + "\n";
            if (staff instanceof PTStaff) { 
                PTStaff ptStaff = (PTStaff)staff;
                st += "PT - ";
                st += "\tHourly Wage: " + ptStaff.getHourlyWage();
                st += "\tHours Worked: " + ptStaff.getHoursWorked();
                st += "\tYearly Salary: " + ptStaff.getHourlyWage() *  ptStaff.getHoursWorked();
            }else if (staff instanceof FTStaff){ 
                FTStaff ftStaff = (FTStaff)staff;
                st += "FT - ";
                st += "\tYearly Salary: " + ftStaff.getSalary();
            }
            System.out.println(st);
        }
    }
    public static void main(String[] args) {
        PTStaff ptStaff1 = new PTStaff("JCG", 63, "1234", "NP114589N", 20.5, 120);
        PTStaff ptStaff2 = new PTStaff("MAX", 63, "4567", "NP194599N", 17.75, 80);
        FTStaff ftStaff1 = new FTStaff("MILES", 63, "8901", "NP122599N", 34000);
        FTStaff ftStaff2 = new FTStaff("STEPH", 63, "2345", "NP294879N", 29000);
        Employees employees = new Employees();
        employees.addStaff(ptStaff1);
        employees.addStaff(ptStaff2);
        employees.addStaff(ftStaff1);
        employees.addStaff(ftStaff2);
        employees.listAllEmployees();
    }
}


