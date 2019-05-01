package openClassroom.abstraire.one;

public class Chien extends Canin implements Rintintin {
	public Chien(){
		this.couleur = "Black";
		this.poids = 12;
	}
	public Chien(String couleur, int poids){
		this.couleur = couleur;
		this.poids = poids;
	}
	public void crier() {
		System.out.println("J'aboie sans raison !");
	}
	public void faireCalin() {
		System.out.println("Je te fais un GROS CÂLIN");
	}
	public void faireLeBeau() {
		System.out.println("Je fais le beau !");
	}
	
	public void faireLechouille() {
		System.out.println("Je fais de grosses léchouilles...");
	}
}