
public class Player {

    // Fields for Player superclass
    private String name;
    private double transferFee;
    private String nationality;
    private int position;

    // Full Specialised Constructor
    public Player(String name, double transferFee, String nationality, int position) {
        this.name = name;
        this.transferFee = transferFee;
        this.nationality = nationality;
        this.position = position;
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String getNationality() {
        return nationality;
    }

    public double getTransferFee() {
        return transferFee;
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setTransferFee(double transferFee) {
        this.transferFee = transferFee;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // toString Method
    public String toString() {
        return "Player{" + "Name = " + getName() + ", Position = " + getPosition() + ", TransferFee = £"
                + (int) getTransferFee();
    }

}
