public class AnotherTeam {
	TeamMember teamMember;
	Championat championat;
	Country country;
	public AnotherTeam(TeamMember teamMember, Championat championat, Country country) {
		this.teamMember = teamMember;
        this.championat = championat;
        this.country = country;
	}
	public static void main(String[] args) {
		TeamMember goalKeeper = new TeamMember("Buffon", "Materazi", "GoalKeeper");
		Championat championat = new Championat("Fifa world cup 2020", "Quatar");
		Country goalKeeperCountry = new Country("Italy");
		AnotherTeam another = new AnotherTeam(goalKeeper, championat, goalKeeperCountry);
		System.out.println("======================================================");
		System.out.println(another.teamMember.getName());
        System.out.println(another.teamMember.getSurName());
        System.out.println(another.teamMember.getOccuppation());
		System.out.println("======================================================");
		System.out.println(another.championat.getNameChampionat());
        System.out.println(another.championat.getHost());
		System.out.println("======================================================");
		System.out.println(another.country.getNameCountry());
		System.out.println("======================================================");
	}

}
class TeamMember {
	private String name;
	private String surname;
	private String occupation;
	public TeamMember(String name, String surname, String occupation){
		this.name = name;
		this.surname = surname;
		this.occupation = occupation;
	}
	public String getName() {
		return this.name;
	}
	public String getSurName() {
        return this.surname;
	}
	public String getOccuppation() {
		return this.occupation;
	}

}
class Championat {
	private String nameChampionat;
	private String host;
	public Championat(String nameChampionat, String host){
        this.nameChampionat = nameChampionat;
        this.host = host;
	}
	public String getNameChampionat(){
		return this.nameChampionat;
	}
	public String getHost() {
		return this.host;
	}

}
class Country {
	private String nameCountry;
	public Country(String nameCountry){
		this.nameCountry = nameCountry;
	}
	public String getNameCountry() {
		return this.nameCountry;
	}

}