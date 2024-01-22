public class Staff extends Person{
    String staffID;
    String NI;
    public Staff(String name, int age, String staffID, String NI){
        super(name, age);
        this.staffID = staffID;
        this.NI = NI;
    }
    public String getStaffID(){
        return staffID;
    }
}


