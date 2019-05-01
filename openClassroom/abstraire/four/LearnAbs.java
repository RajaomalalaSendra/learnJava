package openClassroom.abstraire.four;

public abstract class LearnAbs {
	protected String continent;
	protected String country;
	protected String capital;
	protected String language;
	protected String president;
	protected int populationNumber;

	abstract void getHistoryContinent();
	abstract void getHistory();
	abstract void getPresident();

	public String getDetail(){
        String str = "\tContinent: " + this.continent + "\n\tCountry: " + this.country  + "\n\tCapital: " + this.capital 
        + "\n\tPresident: " + this.president + "\n\tLanguages: " + this.language + "\n\tPopulation: " + this.populationNumber;
        return str;
	}
}