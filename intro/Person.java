// This is the way of create a setter and getter in java
public class Person{
	About about;
	public Person(About about) {
        this.about = about;
	}
	public static void main(String[] args) {
		About me = new About();
		me.setName("Sendra");
		me.setSurName("Rajaomalala");
		About another = new About();
		another.setName("J");
		another.setSurName("K");
		Person sendra = new Person(me);
		Person anotherOne = new Person(another);
		System.out.println("============================");
		System.out.print("Name: ");
		System.out.println(sendra.about.getName());
		System.out.print("Surname: ");
		System.out.println(sendra.about.getSurName());
		System.out.println("==============================");
		System.out.print("Name: ");
		System.out.println(anotherOne.about.getName());
		System.out.print("Surname: ");
		System.out.println(anotherOne.about.getSurName());
		System.out.println("==============================");
	}
}
class About {
    private String name;
    private String surname;
    // the getter and the setter
    public String getName() {
    	return this.name;
    }
    public String getSurName() {
    	return this.surname;
    }
    // the setter of the apps
    public void setName(String name) {
		if(name!=null && name.length()>2) {
			this.name = name;
		} else {
			this.name = "Anonymous";
		}
	}
	public void setSurName(String surname){
		if(surname!=null && surname.length()>3){
			this.surname = surname;
		}else{
			this.surname = "Anonymous";
		}
	}
}