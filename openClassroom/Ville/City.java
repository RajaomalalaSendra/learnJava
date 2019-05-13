package openClassroom.Ville;

public class City{
	protected String cityName;
	protected String countryName;
	protected String codePostal;
	protected int habitantsNumber;
    protected char category;
    public static int instancesNumbers = 0;
    protected static int instancesNumbersTwo = 0;
    // Without parameters
    public City(){
        System.out.println("City without parameters and variables");
        this.cityName = "Unknown";
        this.countryName = "Unknown";
        this.codePostal = "Unset";
        this.habitantsNumber = 0;
        this.setCategory();
        this.instancesNumbers++;
        this.instancesNumbersTwo++;
    }

	public City(String cityName, String countryName, String codePostal, int habitantsNumber){
		System.out.println("City with variables has been created!!!!!");
		this.cityName = cityName;
		this.countryName = countryName;
		this.codePostal = codePostal;
		this.habitantsNumber = habitantsNumber;
		this.setCategory();
		this.instancesNumbers++;
        this.instancesNumbersTwo++;
	}
	// All of our getter
	public String getCityName(){
		return this.cityName;
	}
	public String getCountryName(){
		return this.countryName;
	}
	public String getCodePostal(){
		return this.codePostal;
	}
	public int getHabitantsNumber(){
		return this.habitantsNumber;
	}
	public char getCategory(){
		return this.category;
	}
	public static int getInstancesNumbers(){
		return instancesNumbersTwo;
	}
	//Retourne la description de la ville
	public String getDescription(){
		return "\t"+this.cityName+" est une ville de "+this.countryName+ "\n\tElle comporte : "+this.habitantsNumber+" habitant(s) \n\t=> Elle est donc de catégorie : "+this.category;
	}
	public String getComparison(City C1){
			String str = new String();
			if (C1.getHabitantsNumber() > this.habitantsNumber){
				str = C1.getCityName()+" est une ville plus peuplée que "+this.cityName;
			} else {
                str = this.cityName+" est une ville plus peuplée que "+C1.getCityName();
			}
			return str;
	}
	// All of our setter
	public void setCityName(String cityName){
		if (cityName!=null) {
			this.cityName = cityName;			
		} else {
			this.cityName = "Unknown";
		}
	}
	public void setCountryName(String countryName){
		if (countryName!=null) {
			this.countryName = countryName;			
		}else {
			this.countryName = "Unknown";
		}
	}
	public void setCodePostal(String codePostal){
		if (codePostal!=null) {
			this.codePostal = codePostal;			
		} else {
			this.codePostal = "Unset";
		}
	}
	public void setHabitantsNumber(int habitantsNumber){
		if (habitantsNumber!=0) {
			this.habitantsNumber = habitantsNumber;
			this.setCategory();			
		} else {
			this.habitantsNumber = 0;
			this.setCategory();
		}
	}
	private void setCategory(){
		int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		int i = 0;
		while (i < bornesSuperieures.length && this.habitantsNumber > bornesSuperieures[i]){
			i++;
		}
		this.category = categories[i];
	}
}