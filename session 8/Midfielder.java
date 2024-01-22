
public class Midfielder extends Player {

    // Field for Midfielder subclass
    // this is the attacking, tactical or defending moves added together
    private int importantMoves;
    private int goalScored;

    // Full Specialised Constructor
    public Midfielder(int numberOfAssists, int goalScored, String name, double transferFee, String nationality,
            int position) {
        super(name, transferFee, nationality, position);
        this.importantMoves = numberOfAssists;
        this.goalScored = goalScored;
    }

    // Getter Method
    public int getImportantMoves() {
        return importantMoves;
    }

    public int getGoalsScored() {
        return goalScored;
    }

    // Setter Method
    public void setImportantMoves(int numberOfAssists) {
        this.importantMoves = numberOfAssists;
    }

    public void setGoalsScored(int goalScored) {
        this.goalScored = goalScored;
    }

    // Other Methods
    // return the player details (superclass) and adds specific details (fields)
    public String getDetails() {
        return super.toString() + " Midfielder{" + " Important Moves = " + importantMoves + '}';
    }

    // public static void main(String[] args) {
    // Midfielder midfielder4 = new Midfielder(139, 15, "GRAEME SHINNIE", 218400, "Scotland", 4);
    // Midfielder midfielder7 = new Midfielder(155, 4, "JAMIE MCGRATH", 161200, "Ireland", 7);
    // Midfielder midfielder8 = new Midfielder(153, 1, "CONNOR BARRON", 45760, "Scotland", 8);
    // Midfielder midfielder23 = new Midfielder(0, 1, "RYAN DUNCAN", 36400, "Scotland", 23);
    // Midfielder midfielder32 = new Midfielder(0, 0, "FINDLAY MARSHALL", 28600, "Scotland", 32);
    // Midfielder midfielder10 = new Midfielder(110, 6, "LEIGHTON CLARKSON", 312000, "England", 10);
    // Midfielder midfielder22 = new Midfielder(0, 5, "VICENTE BESUIJEN", 78000, "Netherlands", 22);
    // Midfielder midfielder20 = new Midfielder(0, 0, "SHAYDEN MORRIS", 135200, "England", 20);
    // Midfielder midfielder21 = new Midfielder(155, 2, "DANTE POLVARA", 72800, "United States", 21);
    // Midfielder midfielder17 = new Midfielder(143, 28, "JONNY HAYES", 109200, "Ireland", 17);
    // }
}

/*
 * Midfielders
 * 
 * Name: GRAEME SHINNIE
 * Position: Midfielder
 * Age: 32
 * Apparences: 219
 * Goals: 15
 * Annual: 218400
 * From: Scotland
 * Number: 4
 * Attacking: 46
 * Defending: 49
 * Tactical: 44
 * 
 * Name: JAMIE MCGRATH
 * Position: Midfielder
 * Age: 27
 * Apparences: 15
 * Goals: 4
 * Annual: 161200
 * From: Ireland
 * Number: 7
 * Attacking: 62
 * Defending: 43
 * Tactical: 50
 * 
 * Name: CONNOR BARRON
 * Position: Midfielder
 * Age: 21
 * Apparences: 43
 * Goals: 1
 * Annual: 45760
 * From: Scotland
 * Number: 8
 * Attacking: 51
 * Defending: 54
 * Tactical: 48
 * 
 * 
 * Name: RYAN DUNCAN
 * Position: Midfielder
 * Age: 19
 * Apparences: 34
 * Goals: 1
 * Annual: 36400
 * From: Scotland
 * Number: 23
 * Attacking: 0
 * Defending: 0
 * Tactical: 0
 * 
 * Name: FINDLAY MARSHALL
 * Position: Midfielder
 * Age: 17
 * Apparences: 0
 * Goals: 0
 * Annual: 28600
 * From: Scotland
 * Number: 32
 * Attacking: 0
 * Defending: 0
 * Tactical: 0
 * 
 * 
 * 
 * Name: LEIGHTON CLARKSON
 * Position: Midfielder
 * Age: 22
 * Apparences: 53
 * Goals: 6
 * Annual: 312000
 * From: England
 * Number: 10
 * Attacking: 56
 * Defending: 55
 * Tactical: 50
 * 
 * 
 * Name: VICENTE BESUIJEN
 * Position: Midfielder
 * Age: 22
 * Apparences: 38
 * Goals: 5
 * Annual: 78000
 * From: Netherlands
 * Number: 22
 * Attacking: 0
 * Defending: 0
 * Tactical: 0
 * 
 * Name: SHAYDEN MORRIS
 * Position: Midfielder
 * Age: 22
 * Apparences: 19
 * Goals: 0
 * Annual: 135200
 * From: England
 * Number: 20
 * Attacking: 0
 * Defending: 0
 * Tactical: 0
 * 
 * 
 * 
 * Name: DANTE POLVARA
 * Position: Midfielder
 * Age: 23
 * Apparences: 23
 * Goals: 2
 * Annual: 72800
 * From: United States
 * Number: 21
 * Attacking: 50
 * Defending: 54
 * Tactical: 51
 * 
 * 
 * 
 * 
 * Name: JONNY HAYES
 * Position: Midfielder
 * Age: 36
 * Apparences: 255
 * Goals: 28
 * Annual: 109200
 * From: Ireland
 * Number: 17
 * Attacking: 51
 * Defending: 52
 * Tactical: 40
 * 
 * 
 * 
 * 
 * 
 * 
 */

/*
 * Name: NICKY DEVLIN
 * Position: Full Back (Defender)
 * Age: 30
 * Apparences: 18
 * Goals: 2
 * Annual: 150800
 * From: Scotland
 * 
 * Name: JACK MACKENZIE
 * Position: Full Back (Defender)
 * Age: 23
 * Apparences: 64
 * Goals: 2
 * Annual: 109200
 * From: Scotland
 * 
 * 
 * Name: GRAEME SHINNIE
 * Position: DEFENSIVE MIDFIELDER (Midfielder)
 * Age: 32
 * Apparences: 219
 * Goals: 15
 * Annual: 218400
 * From: Scotland
 * 
 * Name: RICHARD JENSEN
 * Position: DEFENSIVE MIDFIELDER (Defender)
 * Age: 27
 * Apparences: 14
 * Goals: 0
 * Annual: 140400
 * From: Finland
 * 
 * 
 * 
 * Name: STEFAN GARTENMANN
 * Position: CENTRAL MIDFIELDER (Defender)
 * Age: 26
 * Apparences: 11
 * Goals: 1
 * Annual: 135200
 * From: Denmark
 * 
 * 
 * 
 * Name: JAMIE MCGRATH
 * Position: DEFENSIVE MIDFIELDER (Forward)
 * Age: 27
 * Apparences: 15
 * Goals: 4
 * Annual: 161200
 * From: Ireland
 * 
 * 
 * 
 * 
 * Name: CONNOR BARRON
 * Position: CENTRAL MIDFIELDER (Forward)
 * Age: 21
 * Apparences: 43
 * Goals: 1
 * Annual: 45760
 * From: Scotland
 * 
 * 
 * 
 * 
 * Name: BOJAN MIOVSKI
 * Position: STRIKER (Forward)
 * Age: 24
 * Apparences: 56
 * Goals: 26
 * Annual: 234000
 * From: North Macedonia
 * 
 * 
 * 
 * Name: LEIGHTON CLARKSON
 * Position: CENTRAL MIDFIELDER (Midfielder)
 * Age: 22
 * Apparences: 53
 * Goals: 6
 * Annual: 312000
 * From: England
 * 
 * 
 * 
 * Name: DUK
 * Position: STRIKER (Forward)
 * Age: 23
 * Apparences: 56
 * Goals: 18
 * Annual: 176800
 * From: Cape Verde
 * 
 * 
 * Name: PAPE GUÈYE
 * Position: STRIKER (Forward)
 * Age: 24
 * Apparences: 4
 * Goals: 0
 * Annual: £145600
 * From: Senegal
 * 
 * 
 * Name: JAMES MCGARRY
 * Position: FULLBACK (Defender)
 * Age: 25
 * Apparences: 6
 * Goals: 0
 * Annual: 161200
 * From: New Zealand
 * 
 * 
 * Name: JONNY HAYES
 * Position: WINGER (Midfielder)
 * Age: 36
 * Apparences: 255
 * Goals: 28
 * Annual: 109200
 * From: Ireland
 * 
 * Name: RHYS WILLIAMS
 * Position: CENTRAL DEFENDER (Defender)
 * Age: 22
 * Apparences: 0
 * Goals: 0
 * Annual: 416000
 * From: England
 * 
 * 
 * 
 * Name: ESTER SOKLER
 * Position: STRIKER (Forward)
 * Age: 24
 * Apparences: 13
 * Goals: 1
 * Annual: 119600
 * From: Slovenia
 * 
 * 
 * Name: SHAYDEN MORRIS
 * Position: WINGER (Forward)
 * Age: 22
 * Apparences: 19
 * Goals: 0
 * Annual: 135200
 * From: England
 * 
 * 
 * 
 * Name: DANTE POLVARA
 * Position: CENTRAL MIDFIELDER (Midfielder)
 * Age: 23
 * Apparences: 23
 * Goals: 2
 * Annual: 72800
 * From: United States
 * 
 * 
 * Name: VICENTE BESUIJEN
 * Position: WINGER (Forward)
 * Age: 22
 * Apparences: 38
 * Goals: 5
 * Annual: 78000
 * From: Netherlands
 * 
 * 
 * Name: RYAN DUNCAN
 * Position: CENTRAL MIDFIELDER (Midfielder)
 * Age: 19
 * Apparences: 34
 * Goals: 1
 * Annual: 36400
 * From: Scotland
 * 
 * 
 * Name: KELLE ROOS
 * Position: GOALKEEPER (Goalkeeper)
 * Age: 31
 * Apparences: 51
 * Saved: 18
 * Annual: 208000
 * From: Netherlands
 * 
 * 
 * Name: TOM RITCHIE
 * Position: GOALKEEPER (Goalkeeper)
 * Age: 20
 * Apparences: 0
 * Saved: 0
 * Annual: 36920
 * From: Scotland
 * 
 * 
 * Name: ANGUS MACDONALD
 * Position: CENTRAL DEFENDER (Defender)
 * Age: 31
 * Apparences: 20
 * Goals: 0
 * Annual: 182000
 * From: England
 * 
 * 
 * Name: JACK MILNE
 * Position: CENTRAL DEFENDER (Defender)
 * Age: 20
 * Apparences: 3
 * Goals: 0
 * Annual: 47320
 * From: Scotland
 * 
 * 
 * Name: OR DADIA
 * Position: FULL BACK (Defender)
 * Age: 26
 * Apparences: 3
 * Goals: 0
 * Annual: 93600
 * From: Israel
 * 
 * 
 * 
 * Name: FINDLAY MARSHALL
 * Position: MIDFIELDER (Midfielder)
 * Age: 17
 * Apparences: 0
 * Goals: 0
 * Annual: 28600
 * From: Scotland
 * 
 * Name: ROSS DOOHAN
 * Position: GOALKEEPER (Goalkeeper)
 * Age: 25
 * Apparences: 0
 * Saved: 0
 * Annual: 140400
 * From: Scotland
 * 
 * Name: SLOBODAN RUBEZIC
 * Position: MIDFIELDER (Midfielder)
 * Age: 23
 * Apparences: 18
 * Goals: 0
 * Annual: 135200
 * From: Serbia
 * 
 * Name: ALFIE BAVIDGE
 * Position: STRIKER (Forward)
 * Age: 17
 * Apparences: 4
 * Goals: 0
 * Annual:
 * From: Scotland
 * 
 * Name: KIERAN NGWENYA
 * Position: FULL BACK (Defender)
 * Age: 21
 * Apparences: 0
 * Goals: 0
 * Annual:
 * From: Malawi
 * 
 * 
 * 
 * Name: JAYDEN RICHARDSON
 * Position: FULL BACK (Defender)
 * Age: 23
 * Apparences: 21
 * Goals: 0
 * Annual:
 * From: England
 * 
 * Name: ANTHONY STEWART
 * Position: CENTRAL DEFENDER (Defender)
 * Age: 31
 * Apparences: 24
 * Goals: 1
 * Annual:
 * From: England
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
