package homework;

 class Player {
    private String position;
    private String nationality;
    private String nameSurname;

    private Player(String nameSurname, String nationality, String position) {
        this.nameSurname = nameSurname;
        this.nationality = nationality;
        this.position = position;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPosition() {
        return position;
    }

    static Player n1 = new Player("Thibaut Courtois", "Belgian", "Goalkeeper");
    static Player n2 = new Player("Dani Carvajal", "Spanish", "Defender");
    static Player n3 = new Player("Eder Militao", "Brasilian", "Defender");
    static Player n4 = new Player("David Alaba", "Austrian", "Defender");
    static Player n5 = new Player("Jesus Vallejo", "Spanish", "Defender");
    static Player n6 = new Player("Nacho", "Spanish", "Defender");
    static Player n7 = new Player("Eden Hazard", "Belgian", "Attacker");
    static Player n8 = new Player("Toni Kroos", "German", "Midfielder");
    static Player n9 = new Player("Karim Benzema", "French", "Attacker");
    static Player n10 = new Player("Luka Modric", "Croatian", "Midfielder");
    static Player n11 = new Player("Marco Asensio", "Spanish", "Attacker");
}

public class RealMadrid {

//    private static final String league = "La Liga";
//    private static final String ground = "Santiago Bernabeu";
//    private static String president = "Florentino Perez";
//    private static String headCoach = "Carlo Ancelotti";

    public static void main(String[] args) {
        System.out.println(Player.n1.getNameSurname());
        System.out.println(Player.n5.getNationality());
        System.out.println(Player.n8.getPosition());
    }
}







