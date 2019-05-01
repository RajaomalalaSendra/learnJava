package openClassroom.abstraire.three;

public class Madagascar extends Africa {
    public Madagascar(){
    	this.continent = "Africa";
    	this.country = "Madagascar";
        this.capital = "Antananarivo";
        this.language = "Malagasy French English";
        this.president = "Andry Nirina Rajoelina";
        this.populationNumber = 30000000;
    }
    public Madagascar(String continent, String country, String capital, String language, String president, int populationNumber){
    	this.continent = continent;
    	this.country = country;
        this.capital = capital;
        this.language = language;
        this.president = president;
        this.populationNumber = populationNumber;
    }
    String getPresident(){
        return "The president of Madagascar is " + this.president;
    }
    void getHistory(){
        System.out.println("The history of Madagascar is begin at......");
    }
}