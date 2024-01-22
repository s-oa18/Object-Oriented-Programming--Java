
import java.util.ArrayList;

public class FootballTeam {
    
    //Fields for FootballTeam concrete class
    private ArrayList<Player> team;
    private String teamName;
    private String manager;

    //Full Specialised Constructor
    public FootballTeam(String name, String manager) {
        this.team = new ArrayList<>();
        this.teamName = name;
        this.manager = manager;
    }

    public void addPlayer(Player player){
        team.add(player);
    }
    
    public void removePlayer(Player player){
        team.remove(player);
    }

    public void listPlayerDetails(){
        for (Player player : team){
            if(player instanceof Defender){
                Defender defender = (Defender)player;
                System.out.println(player.toString() + " , Defensive moves = " + defender.getDefendingMoves());
            }else if(player instanceof Goalkeeper){
                Goalkeeper goalkeeper = (Goalkeeper)player;
                System.out.println(player.toString() + " , Goals Saved = " + goalkeeper.getGoalsSaved());
            }else if(player instanceof Forward){
                Forward forward = (Forward)player;
                System.out.println(player.toString() + " , Goals Scored = " + forward.getGoalsScored());
            }else if(player instanceof Midfielder){
                Midfielder midfielder = (Midfielder)player;
                System.out.println(player.toString() + " , Goals Scored = " + midfielder.getGoalsScored() + " , Important Moves = " + midfielder.getImportantMoves());
            }
        }
    }

    public void listPlayerDetails2(){
        for (Player player : team){
            if(player instanceof Defender){
                Defender defender = (Defender)player;
                System.out.println(defender.getDetails());
            }else if(player instanceof Goalkeeper){
                Goalkeeper goalkeeper = (Goalkeeper)player;
                System.out.println(goalkeeper.getDetails());
            }else if(player instanceof Forward){
                Forward forward = (Forward)player;
                System.out.println(forward.getDetails());
            }else if(player instanceof Midfielder){
                Midfielder midfielder = (Midfielder)player;
                System.out.println(midfielder.getDetails());
            }
        }
    }


    //Getters Methods
    public ArrayList<Player> getTeam() {
        return team;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getManager() {
        return manager;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }


    public double getTotalClubFees(){
        double totalFee = 0;
         for (Player player : team){
            totalFee += player.getTransferFee();
         }
         return totalFee;
    }
    
    //Other Method
    public String getPlayerList(){
        String output = "";
        for (Player player : team){
            output += player.getName() + "( Nationality: " + player.getNationality() + "  Transfer Fees: " + player.getTransferFee() + ")" + "\n";
        }
        return output;
    }

       public String getSpecificPlayerList(String nationality){
        String output = "";
        for (Player player : team){
            if (player.getNationality().compareTo(nationality) == 0)
            output += player.getName() + "( Nationality: " + player.getNationality() + "  Transfer Fees: " + player.getTransferFee() + ")" + "\n";
        }
        return output;
    }
    
    //toStrign Method
    public String toString() {
        String output = "";
        output += "\nThe Football Team name is " + getTeamName();
        output += "\nManager is " + getManager();
        output += "\nTotal Fees is " + this.getTotalClubFees();
        output += "\n\nThe Players are:\n" + getPlayerList();
        
        return output;
    }
      
    
}
