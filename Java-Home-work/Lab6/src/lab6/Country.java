package lab6;

import java.util.List;

public class Country {


    private String code;
    private String name;
    private String continent;
    private double surfAcearea;
    private int population;
    private double gnp;
    private int capital;


       
    
    public String getCountrycode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public double getSurfAcearea() {
        return surfAcearea;
    }

    public void setSurfAcearea(double surfAcearea) {
        this.surfAcearea = surfAcearea;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getGnp() {
        return gnp;
    }

    public void setGnp(double gnp) {
        this.gnp = gnp;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public Country(String code, String name, String continent, double surfAcearea, int population, double gnp, int capital) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.surfAcearea = surfAcearea;
        this.population = population;
        this.gnp = gnp;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Country{" + "code=" + code + ", name=" + name + ", continent=" + continent + ", surfAcearea=" + surfAcearea + ", population=" + population + ", gnp=" + gnp + ", capital=" + capital + '}';
    }
    
}
