package homework;

public class RealMadrid {
    private static String league = "La Liga";
    private static String ground = "Santiago Bernabeu";
    private static String president = "Florentino Perez";
    private static String headCoach = "Carlo Ancelotti";
    private String position;
    private String nationality;
    private String nameSurname;
    String[][] str = {
            {"Thibaut Courtois", "Belgian", "Goalkeeper"},
            {"Dani Carvajal", "Spanish", "Defender"},
            {"Eder Militao", "Brasilian", "Defender"},
            {"David Alaba", "Austrian", "Defender"},
            {"Jesus Vallejo", "Spanish", "Defender"},
            {"Nacho", "Spanish", "Defender"},
            {"Eden Hazard", "Belgian", "Attacker"},
            {"Toni Kroos", "German", "Midfielder"},
            {"Karim Benzema", "French", "Attacker"},
            {"Luka Modric", "Croatian", "Midfielder"},
            {"Marco Asensio", "Spanish", "Attacker"},
            {"Eduardo Camavinga", "French", "Midfielder"}
    };

    public RealMadrid(String nameSurname, String nationality, String position) {
        setNameSurname(nameSurname);
        setNationality(nationality);
        setPosition(position);
    }

    private void setNameSurname(String nameSurname) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (nameSurname.equals(str[i][0])) {
                this.nameSurname = nameSurname;
                break;
            }
            count++;
        }
        if (count == str.length) {
            System.out.println("Invalid input");
            System.exit(1);
        }
    }

    public String getNameSurname() {
        return nameSurname;
    }

    private void setNationality(String nationality) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (nationality.equals(str[i][1])) {
                this.nationality = nationality;
                break;
            } else count++;
        }
        if (count == str.length) {
            System.out.println("Invalid input");
            System.exit(1);
        }
    }

    public String getNationality() {
        return nationality;
    }

    private void setPosition(String position) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (position.equals(str[i][2])) {
                this.position = position;
                break;
            } else count++;
        }
        if (count == str.length) {
            System.out.println("Invalid input");
            System.exit(1);
        }
    }

    public String getPosition() {
        return position;
    }

    public static void main(String[] args) {
        RealMadrid player1 = new RealMadrid("Thibaut Courtois",  "Belgian", "Goalkeeper");
        RealMadrid player2 = new RealMadrid("Dani Carvajal", "Spanish","Defender");
        RealMadrid player3 = new RealMadrid("Eder Militao", "Brasilian","Defender");
        RealMadrid player4 = new RealMadrid("David Alaba", "Austrian","Defender");
        System.out.println(player1.getNationality());
        System.out.println(player2.getPosition());
        System.out.println(player3.getNameSurname());
        System.out.println(player4.getNameSurname());
    }
}



