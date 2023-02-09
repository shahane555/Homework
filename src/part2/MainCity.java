package part2;

class City {
    String name = "Not defined";
    String countryName;
    int population;
    double area;

    City(String countryName, int population, double area) {
        this.name = "Paris";
        this.countryName = countryName;
        this.population = population;
        this.area = area;
    }
}

public class MainCity {
    public static void main(String[] args) {
        City newCity = new City("France", 2165423, 105.4);
        if (newCity.name.equals("Not defined")) {
            newCity.name = "Paris";
        }
        System.out.println("City name " + newCity.name);
        System.out.println("Country name " + newCity.countryName);
        System.out.println("Population " + newCity.population);
        System.out.println("Area " + newCity.area + " km²");
    }
}

