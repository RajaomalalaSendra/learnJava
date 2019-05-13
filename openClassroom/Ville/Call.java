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
		System.out.println("=========------------===============");
		CapitalTwo cap2 = new CapitalTwo();
		System.out.println(cap2.getDescription());
		System.out.println("=========------------===============");
		// polymorphisme in java
		//Définition d'un tableau de villes null
		City[] tableau = new City[6];
		String[] tab = {"Marseille", "Lille", "Caen", "Lyon", "Paris", "Nantes"};
		String[] tab3 = {"120", "102", "121", "103", "101", "122"};
		int[] tab2 = {1234560, 78456000, 6549870, 75832165, 15940000, 2130000};
		//Les trois premiers éléments du tableau seront des villes,
		//et le reste, des capitales
		for(int i = 0; i < 6; i++){
			if (i != 4) {
				City C = new City(tab[i], "France", tab3[i], tab2[i]);
				tableau[i] = C;
		    } else {
				CapitalTwo C = new CapitalTwo(tab[i], "France", tab3[i], tab2[i], "La tour Eiffel", "It is one of the bigest city in the world.", "It has been created by the people at 1400.");
				tableau[i] = C;
			}
		}
		//Il ne nous reste plus qu'à décrire tout notre tableau !
		for(City C : tableau){
			System.out.println(C.getDescription()+"\n");
		}
	}
}