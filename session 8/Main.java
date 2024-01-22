
public class Main {

    public static void main(String[] args) {

        FootballTeam aberdeenFC = new FootballTeam("Aberdeen FC", "BARRY ROBSON");

        Player goalkeeper24 = new Goalkeeper(72, "KELLE ROOS", 208000, "Netherlands", 24);
        Player goalkeeper25 = new Goalkeeper(0, "TOM RITCHIE", 36920, "Scotland", 25);
        Player goalkeeper31 = new Goalkeeper(51, "ROSS DOOHAN", 140400, "Scotland", 31);
        Player defender18 = new Defender(0, "RHYS WILLIAMS", 416000, "England", 18);
        Player defender33 = new Defender(108, "SLOBODAN RUBEZIC", 135200, "Serbia", 33);
        Player defender2 = new Defender(103, "NICKY DEVLIN", 150800, "Scotland", 2);
        Player defender3 = new Defender(89, "JACK MACKENZIE", 109200, "Scotland", 3);
        Player defender5 = new Defender(93, "RICHARD JENSEN", 140400, "Finland", 5);
        Player defender6 = new Defender(115, "STEFAN GARTENMANN", 135200, "Denmark", 6);
        Player defender15 = new Defender(98, "JAMES MCGARRY", 161200, "New Zealand", 15);
        Player defender27 = new Defender(103, "ANGUS MACDONALD", 182000, "England", 27);
        Player defender28 = new Defender(0, "JACK MILNE", 47320, "Scotland", 28);
        Player defender30 = new Defender(0, "JOR DADIA", 93600, "Israel", 30);
        Player midfielder4 = new Midfielder(139, 15, "GRAEME SHINNIE", 218400, "Scotland", 4);
        Player midfielder7 = new Midfielder(155, 4, "JAMIE MCGRATH", 161200, "Ireland", 7);
        Player midfielder8 = new Midfielder(153, 1, "CONNOR BARRON", 45760, "Scotland", 8);
        Player midfielder23 = new Midfielder(0, 1, "RYAN DUNCAN", 36400, "Scotland", 23);
        Player midfielder32 = new Midfielder(0, 0, "FINDLAY MARSHALL", 28600, "Scotland", 32);
        Player midfielder10 = new Midfielder(110, 6, "LEIGHTON CLARKSON", 312000, "England", 10);
        Player midfielder22 = new Midfielder(0, 5, "VICENTE BESUIJEN", 78000, "Netherlands", 22);
        Player midfielder20 = new Midfielder(0, 0, "SHAYDEN MORRIS", 135200, "England", 20);
        Player midfielder21 = new Midfielder(155, 2, "DANTE POLVARA", 72800, "United States", 21);
        Player midfielder17 = new Midfielder(143, 28, "JONNY HAYES", 109200, "Ireland", 17);
        Player forwar9 = new Forward(26, "BOJAN MIOVSKI", 234000, "North Macedonia", 9);
        Player forwar11 = new Forward(18, "DUK", 176800, "Cape Verde", 11);
        Player forwar14 = new Forward(0, "PAPE GUÈYE", 145600, "Senegal", 14);
        Player forwar19 = new Forward(1, "ESTER SOKLER", 119600, "Slovenia", 19);
        Player forwar36 = new Forward(0, "ALFIE BAVIDGE", 0, "Scotland", 36);

       

        // Can add Player objects but also Player subclasses to an arrayList of Player
        // objects
        aberdeenFC.addPlayer(goalkeeper24);
        aberdeenFC.addPlayer(goalkeeper25);
        aberdeenFC.addPlayer(goalkeeper31);
        aberdeenFC.addPlayer(defender18);
        aberdeenFC.addPlayer(defender33);
        aberdeenFC.addPlayer(defender2);
        aberdeenFC.addPlayer(defender3);
        aberdeenFC.addPlayer(defender5);
        aberdeenFC.addPlayer(defender6);
        aberdeenFC.addPlayer(defender15);
        aberdeenFC.addPlayer(defender27);
        aberdeenFC.addPlayer(defender28);
        aberdeenFC.addPlayer(defender30);
        aberdeenFC.addPlayer(midfielder4);
        aberdeenFC.addPlayer(midfielder7);
        aberdeenFC.addPlayer(midfielder8);
        aberdeenFC.addPlayer(midfielder23);
        aberdeenFC.addPlayer(midfielder32);
        aberdeenFC.addPlayer(midfielder10);
        aberdeenFC.addPlayer(midfielder22);
        aberdeenFC.addPlayer(midfielder20);
        aberdeenFC.addPlayer(midfielder21);
        aberdeenFC.addPlayer(midfielder17);
        aberdeenFC.addPlayer(forwar9);
        aberdeenFC.addPlayer(forwar11);
        aberdeenFC.addPlayer(forwar14);
        aberdeenFC.addPlayer(forwar19);
        aberdeenFC.addPlayer(forwar36);


        // System.out.println("Team Information:" + aberdeenFC.toString());
        // System.out.println("\n--------------------------------\n");

        System.out.println(aberdeenFC.getSpecificPlayerList("Scotland"));

        //System.out.println(aberdeenFC.toString());
        aberdeenFC.listPlayerDetails2();

    }

}
