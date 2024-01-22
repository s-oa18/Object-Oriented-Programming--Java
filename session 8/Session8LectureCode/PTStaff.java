public class PTStaff extends Staff {
    double hourlyWage;
    double numberHours;
    public PTStaff(String name, int age, String staffID, String NI, double hourlyWage, double numberHours) {
        super(name, age, staffID, NI);
        this.hourlyWage = hourlyWage;
        this.numberHours = numberHours;
    }
    public double getHourlyWage(){
        return hourlyWage;
    }
    public double getHoursWorked(){
        return numberHours;
    }
    public String toString(){
        String st = "\n";
        st += "Hourly Wage: " + this.hourlyWage;
        st += "Hours: " + this.numberHours;
        st += "\n";
        return st;
    }
}




