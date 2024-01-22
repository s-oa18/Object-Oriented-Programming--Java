public class Defender extends Player {

    // Field for Defender subclass
    // this is the attacking or defending moves added together
    private int defendingMoves;

    public Defender(int defendingMoves, String name, double transferFee, String nationality, int position) {
        super(name, transferFee, nationality, position);
        this.defendingMoves = defendingMoves;
    }

    // Getter Method
    public int getDefendingMoves() {
        return defendingMoves;
    }

    // Setter Method
    public void setDefendingMoves(int defendingMoves) {
        this.defendingMoves = defendingMoves;
    }

    // Other methods
    // return the player details (superclass) and adds specific details (fields)
    public String getDetails() {
        return super.toString() + " Defender{" + " Defending moves = " + defendingMoves + '}';
    }

    // public static void main(String[] args) {
    // Defender defender18 = new Defender(0, "RHYS WILLIAMS", 416000,"England",18);
    // Defender defender33 = new Defender(108, "SLOBODAN RUBEZIC", 135200,
    // "Serbia",33);
    // Defender defender2 = new Defender(103, "NICKY DEVLIN", 150800, "Scotland",2);
    // Defender defender3 = new Defender(89, "JACK MACKENZIE", 109200,"Scotland",3);
    // Defender defender5 = new Defender(93, "RICHARD JENSEN", 140400,"Finland",5);
    // Defender defender6 = new Defender(115, "STEFAN GARTENMANN",
    // 135200,"Denmark",6);
    // Defender defender15 = new Defender(98, "JAMES MCGARRY", 161200, "New
    // Zealand",15);
    // Defender defender27 = new Defender(103, "ANGUS MACDONALD",
    // 182000,"England",27);
    // Defender defender28 = new Defender(0, "JACK MILNE", 47320,"Scotland",28);
    // Defender defender30 = new Defender(0, "JOR DADIA", 93600,"Israel",30);
    // Defender defender_1 = new Defender(0, "KIERAN NGWENYA", 0,"Malawi",-1);
    // Defender defender_2 = new Defender(0, "JAYDEN RICHARDSON", 0,"England",-1);
    // Defender defender_3 = new Defender(0, "ANTHONY STEWART", 0,"England",-1);
    // }
}

/*
 * Defenders
 * 
 * Name: RHYS WILLIAMS
 * Position: Defender
 * Age: 22
 * Apparences: 0
 * Goals: 0
 * Annual: 416000
 * From: England
 * Number: 18 (loaned out)
 * Attacking: 0
 * Defending: 0
 * Tactical: 0
 * 
 * 
 * Name:SLOBODAN RUBEZIC
 * Position: Defender
 * Age: 23
 * Apparences: 18
 * Goals: 0
 * Annual: 135200
 * From: Serbia
 * Number: 33
 * Attacking: 34
 * Defending: 69
 * Tactical: 50
 * 
 * Name: NICKY DEVLIN
 * Position: Defender
 * Age: 30
 * Apparences: 18
 * Goals: 2
 * Annual: 150800
 * From: Scotland
 * Number: 2
 * Attacking: 41
 * Defending: 62
 * Tactical: 47
 * 
 * Name: JACK MACKENZIE
 * Position: Defender
 * Age: 23
 * Apparences: 64
 * Goals: 2
 * Annual: 109200
 * From: Scotland
 * Number: 3
 * Attacking: 37
 * Defending: 52
 * Tactical: 32
 * 
 * Name: RICHARD JENSEN
 * Position: Defender
 * Age: 27
 * Apparences: 14
 * Goals: 0
 * Annual: 140400
 * From: Finland
 * Number: 5
 * Attacking: 35
 * Defending: 68
 * Tactical: 49
 * 
 * Name: STEFAN GARTENMANN
 * Position: Defender
 * Age: 26
 * Apparences: 11
 * Goals: 1
 * Annual: 135200
 * From: Denmark
 * Number: 6
 * Attacking: 39
 * Defending: 76
 * Tactical: 64
 * 
 * Name: JAMES MCGARRY
 * Position: Defender
 * Age: 25
 * Apparences: 6
 * Goals: 0
 * Annual: 161200
 * From: New Zealand
 * Number: 15
 * Attacking: 41
 * Defending: 57
 * Tactical: 35
 * 
 * Name: ANGUS MACDONALD
 * Position: Defender
 * Age: 31
 * Apparences: 20
 * Goals: 0
 * Annual: 182000
 * From: England
 * Number: 27
 * Attacking: 33
 * Defending: 70
 * Tactical: 54
 * 
 * Name: JACK MILNE
 * Position: Defender
 * Age: 20
 * Apparences: 3
 * Goals: 0
 * Annual: 47320
 * From: Scotland
 * Number: 28
 * Attacking: 0
 * Defending: 0
 * Tactical: 0
 * 
 * Name: OR DADIA
 * Position: Defender
 * Age: 26
 * Apparences: 3
 * Goals: 0
 * Annual: 93600
 * From: Israel
 * Number: 30
 * Attacking: 0
 * Defending: 0
 * Tactical: 0
 * 
 * 
 * Name: KIERAN NGWENYA
 * Position: Defender
 * Age: 21
 * Apparences: 0
 * Goals: 0
 * Annual:
 * From: Malawi
 * Number: Loaned Out
 * Attacking: 0
 * Defending: 0
 * Tactical: 0
 *
 * Name: JAYDEN RICHARDSON
 * Position: Defender
 * Age: 23
 * Apparences: 21
 * Goals: 0
 * Annual:
 * From: England
 * Number: Loaned Out
 * Attacking: 0
 * Defending: 0
 * Tactical: 0
 * 
 * Name: ANTHONY STEWART
 * Position: Defender
 * Age: 31
 * Apparences: 24
 * Goals: 1
 * Annual:
 * From: England
 * Number: Loaned Out
 * Attacking: 0
 * Defending: 0
 * Tactical: 0
 */