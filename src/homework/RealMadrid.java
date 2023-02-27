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
        setParameters(nameSurname, nationality, position);
    }

    private void setParameters(String nameSurname, String nationality, String position) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (nameSurname.equals(str[i][0]) && nationality.equals(str[i][1]) && position.equals(str[i][2])) {
                this.nameSurname = nameSurname;
                this.nationality = nationality;
                this.position = position;
                break;
            } else count++;
        }
        if (count == str.length) {
            System.out.println("Invalid input");
            System.exit(1);
        }
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




