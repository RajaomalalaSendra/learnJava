public class Team {
	Member member;
	public Team(Member member) { // who is in this Team?
		this.member = member; // one 'member' is in this Team!
	}
	// here's our main method
public static void main(String[] args) {
		Member myMember = new Member("Aurieel", "light", 10, 1);
		Member theMember = new Member("Za", "goad", 12, 12);
		Team myTeam = new Team(myMember);
		Team theTeam = new Team(theMember);
		System.out.println(myTeam.member.getName());
		System.out.println(myTeam.member.getType());
		System.out.println(myTeam.member.getLevel());
		System.out.println(myTeam.member.getRank());
		System.out.println("===================================");
		System.out.println(theTeam.member.getName());
		System.out.println(theTeam.member.getType());
		System.out.println(theTeam.member.getLevel());
		System.out.println(theTeam.member.getRank());
	}
}
class Member {
	private String name;
	private String type;
	private int level; // note the data type here
	private int rank; // note the data type here as well
	public Member(String name, String type, int level, int rank) {
		this.name = name;
		this.type = type;
		this.level = level;
		this.rank = rank;
	}
	/* let's define our getter functions here */
	public String getName() { // what is your name?
		return this.name; // my name is ...
	}
	public String getType() { // what is your type?
		return this.type; // my type is ...
	}
	public int getLevel() { // what is your level?
		return this.level; // my level is ...
	}
	public int getRank() { // what is your rank?
		return this.rank; // my rank is
	}
}