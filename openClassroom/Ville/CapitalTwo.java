package  openClassroom.Ville;

public  class CapitalTwo extends City{
	private String another;
	private String situation;
	private String history;
	public CapitalTwo(){
		super();
        this.another = "None";
        this.situation = "No Situation for the moment.";
        this.history = "No history for the moment.";
        System.out.println("Creation of the capital inside of our apps.");
	}
	public CapitalTwo(String cityName, String countryName, String codePostal, int habitantsNumber, String another, String situation, String history){
		super(cityName, countryName, codePostal, habitantsNumber);
        this.another = another;
        this.situation = situation;
        this.history = history;
        System.out.println("Creation of the capital inside of our apps.");
	}
	public String getDescription(){
		String	str = super.getDescription() + "\n\tEt a un autre  " + this.another + ".\n\tSon histoire:\t"+this.history+"\n\tSituation: "+this.situation;
		return str;
	}
	// the getter
	public String getAnother(){
		return this.another;
	}
	public String getSituation(){
		return this.situation;
	}
	public String getHistory(){
		return this.history;
	}
	// the setter
	public void setAnother(String another){
		if (another!=null) {
			this.another = another;
		} else {
			this.another = "None";
		}
	}
	public void setSituation(String situation){
		if (situation!=null) {
			this.situation = situation;
		} else {
			this.situation = "No Situation for the moment.";
		}
	}
	public void setHistory(String history){
		if (history!=null) {
			this.history = history;
		} else {
			this.history = "No history for the moment.";
		}
	}
}