package speech.sendra;

public class Sendra {
	String numberOne;
	String numberTwo;
	public Sendra(String numberOne, String numberTwo){
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}
	public String getNumberOne(){
		return this.numberOne;
	}
	public String getNumberTwo(){
		return this.numberTwo;
	}
    public static void main(String[] args) {
    	String numberOne = "C est facile,d'abord Il suffit d'avoir de l'internet pour l'accéder;c'est plus pratique; On peut travailler dessus à plusieur sans réunir  l'équipe au même endroit.creer des taches et assigner des membres à votre projet,  partager des commentaires, et le plus important c'est qu'il facilite  la collaboration entre les membres de votre équipe. ";
        String numberTwo = "Zara-o sera en freemium dans les 3 premier mois pour recuperer les avis des utilisateur et ensuite sortir la version pro qui sera payante! ça va se faire en abonnement par mois par entreprise. payement via par carte bancaire ou mobile monnaie ou virement bancaire! avec le nombres d'entreprise situe a mada!ce sera un application rentable! ";
    	Sendra sendra = new Sendra(numberOne, numberTwo);
    	System.out.println("======================================");
    	System.out.println(sendra.getNumberOne());
    	System.out.println("======================================");
    	System.out.println(sendra.getNumberTwo());
    	System.out.println("======================================");
    }
}