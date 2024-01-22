
public class Goalkeeper extends Player{
    
    //Field for Goalkeeper subclass
    private int goalsSaved;
    
    //Specialised Constructor
    public Goalkeeper(int goalsSaved, String name, double transferFee, String nationality, int position){
        super(name, transferFee, nationality,position );
        this.goalsSaved = goalsSaved;
    }

    //Getter Method
    public int getGoalsSaved() {
        return goalsSaved;
    }

    //Setter Method
    public void setGoalsSaved(int goalsSaved) {
        this.goalsSaved = goalsSaved;
    }

    // Other methods
    // return the player details (superclass) and adds specific details (fields)
    public String getDetails() {
        return super.toString() + " Goalkeeper{" + " Goal Saved = " + goalsSaved + '}';
    }

    // public static void main(String[] args) {
    //Goalkeeper goalkeeper24 = new Goalkeeper(72, "KELLE ROOS", 208000, "Netherlands", 24);
    //Goalkeeper goalkeeper25 = new Goalkeeper(0, "TOM RITCHIE", 36920, "Scotland", 25);
    //Goalkeeper goalkeeper31 = new Goalkeeper(51, "ROSS DOOHAN", 140400, "Scotland", 31);
    //}
    
}

/* GoalKeepers

 Name: KELLE ROOS
Position: Goalkeeper
Age: 31
Apparences: 51
Saved: 18
Annual: 208000
From: Netherlands
Number: 24
Goal Saved: 10
Penalties: 0/1
Saves: 72
Anticipation: 46
Tactical: 57

Name: TOM RITCHIE
Position: Goalkeeper
Age: 20
Apparences: 0
Saved: 0
Annual: 36920
From: Scotland
Number: 25
Saved: 0
Penalties: 0/0
Saves: 0
Anticipation: 0
Tactical: 0

Name: ROSS DOOHAN
Position: Goalkeeper
Age: 25
Apparences: 0
Saved: 0
Annual: 140400
From: Scotland
Number: 31
Saves: 51
Anticipation: 39
Tactical: 44

 */