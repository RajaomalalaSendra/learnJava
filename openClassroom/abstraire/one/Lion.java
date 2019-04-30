package openClassroom.abstraire.one;

public class Lion extends Felin {
	public Lion(){
		this.couleur = "Orange";
		this.poids = 50;
	}
	public Lion(String couleur, int poids){
		this.couleur = couleur;
		this.poids = poids;
	}

	public void crier() {
		System.out.println("Je rugis dans la savane !");
	}
}