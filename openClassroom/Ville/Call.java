package openClassroom.Ville;

public class Call{
	public static void main(String[] args) {
		System.out.println("=============------------===============");
		City sity = new City("Antananarivo", "Madagascar", "101", 2000000);
		System.out.println("City: " +  sity.getCityName());
		System.out.println("Country: " + sity.getCountryName());
		System.out.println("Code Postal: " + sity.getCodePostal());
		System.out.println("Habitants: " + sity.getHabitantsNumber());
		System.out.println("Category: " + sity.getCategory());
		System.out.println("Number city: " + City.instancesNumbers);
		System.out.println("=============------------===============");
		City cityO = new City();
		System.out.println("City: " +  cityO.getCityName());
		System.out.println("Country: " + cityO.getCountryName());
		System.out.println("Code Postal: " + cityO.getCodePostal());
		System.out.println("Habitants: " + cityO.getHabitantsNumber());
		System.out.println("Category: " + cityO.getCategory());
		System.out.println("Number city: " + City.getInstancesNumbers());
		System.out.println("=========------------===============");
		System.out.println(sity.getDescription());
		System.out.println("=========------------===============");
		System.out.println(cityO.getDescription());
		System.out.println("=========------------===============");
		cityO.setCityName("Crowns");
		cityO.setHabitantsNumber(10000);
		System.out.println(sity.getComparison(cityO));
		System.out.println("=========------------===============");
		sity.setCityName("Create");
		System.out.println("City: " +  sity.getCityName());
		System.out.println("=========------------===============");
		cityO.setCityName("Crowns");
		System.out.println("City: " +  cityO.getCityName());
		System.out.println("=========------------===============");
		Capital cap = new Capital();
		System.out.println("City: " + cap.getCityName());
	}
}