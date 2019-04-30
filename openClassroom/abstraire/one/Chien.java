package openClassroom.abstraire.one;

public class Chien extends Canin{
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
}