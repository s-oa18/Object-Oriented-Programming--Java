
public class Forward extends Player {

    // Field for Striker subclass
    private int goalsScored;

    // Full Specialised Constructor
    public Forward(int goalsScored, String name, double transferFee, String nationality, int position) {
        super(name, transferFee, nationality, position);
        this.goalsScored = goalsScored;
    }

    // Getter Methods
    public int getGoalsScored() {
        return goalsScored;
    }

    // Setter Methods
    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    // Other methods
    // return the player details (superclass) and adds specific details (fields)
    public String getDetails() {
        return super.toString() + " Forward{" + " Goals Scored = " + goalsScored + '}';
    }

    // public static void main(String[] args) {
    // Forward forwar9 = new Forward(26, "BOJAN MIOVSKI", 234000, "North Macedonia", 9);
    // Forward forwar11 = new Forward(18, "DUK", 176800, "Cape Verde", 11);
    // Forward forwar14 = new Forward(0, "PAPE GUÈYE", 145600, "Senegal", 14);
    // Forward forwar19 = new Forward(1, "ESTER SOKLER", 119600, "Slovenia", 19);
    // Forward forwar36 = new Forward(0, "ALFIE BAVIDGE", 0, "Scotland", 36);
    // }
}

/*
 * Forward
 * 
 * Name: BOJAN MIOVSKI
 * Position: Forward
 * Age: 24
 * Apparences: 56
 * Goals: 26
 * Annual: 234000
 * From: North Macedonia
 * Number: 9
 * Attacking: 64
 * Defending: 32
 * Tactical: 48
 * 
 * 
 * Name: DUK
 * Position: Forward
 * Age: 23
 * Apparences: 56
 * Goals: 18
 * Annual: 176800
 * From: Cape Verde
 * Number: 11
 * Attacking: 0
 * Defending: 0
 * Tactical: 0
 * 
 * 
 * Name: PAPE GUÈYE
 * Position: Forward
 * Age: 24
 * Apparences: 4
 * Goals: 0
 * Annual: 145600
 * From: Senegal
 * Number: 14
 * Attacking: 0
 * Defending: 0
 * Tactical: 0
 * 
 * Name: ESTER SOKLER
 * Position: Forward
 * Age: 24
 * Apparences: 13
 * Goals: 1
 * Annual: 119600
 * From: Slovenia
 * Number: 19
 * Attacking: 0
 * Defending: 0
 * Tactical: 0
 * 
 * Name: ALFIE BAVIDGE
 * Position: Forward
 * Age: 17
 * Apparences: 4
 * Goals: 0
 * Annual:
 * From: Scotland
 * Number: 36
 * Attacking: 0
 * Defending: 0
 * Tactical: 0
 * 
 * 
 */