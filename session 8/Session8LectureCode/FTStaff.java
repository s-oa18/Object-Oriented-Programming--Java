public class FTStaff extends Staff {
    double yearlyWage;
    public FTStaff(String name, int age, String staffID, String NI, double yearlyWage) {
        super(name, age, staffID, NI);
        this.yearlyWage = yearlyWage;
    }
    public double getSalary(){
        return yearlyWage;
    }
    public String toString(){
        String st = "\n";
        st += "Yearly Salary: " + this.yearlyWage;
        st += "\n";
        return st;
    }
}



