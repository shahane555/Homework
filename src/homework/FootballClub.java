package homework;

class Footballist {
    private String position;
    private String nationality;
    private String nameSurname;

    Footballist(String nameSurname, String nationality, String position) {
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
}

public class FootballClub {
    private String name;
    private String coach;
    private String president;
    private Footballist[] players;

    FootballClub(String clubName, String coach, String president, Footballist[] players) {
        this.name = clubName;
        this.coach = coach;
        this.president = president;
        this.players = players;
    }

    public String getClubName() {
        return name;
    }

    public String getCoach() {
        return coach;
    }

    public String getPresident() {
        return president;
    }

    public Footballist[] getPlayers() {
        return players;
    }

    public static void main(String[] args) {
        Footballist n1 = new Footballist("Karim Benzema", "French", "Attacker");
        Footballist n2 = new Footballist("Henrikh Mkhitharyan", "Armenian", "Midfielder");
        System.out.println(n1.getNameSurname());
        System.out.println(n2.getNationality());
    }
}







