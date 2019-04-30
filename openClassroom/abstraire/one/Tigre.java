package  openClassroom.abstraire.one;

public class Tigre extends Felin {
	public Tigre(){
	    this.couleur = "Yellow and black";
	    this.poids = 20;
	}
	public Tigre(String couleur, int poids){
		this.couleur = couleur;
		this.poids = poids;
	}

	void crier() {
		System.out.println("Je grogne très fort !");
	}
}