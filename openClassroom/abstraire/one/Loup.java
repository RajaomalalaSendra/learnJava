package openClassroom.abstraire.one;

public class Loup extends Canin {
	public Loup(){
		this.couleur = "Black and white";
		this.poids = 13;
	}
	public Loup(String couleur, int poids){
		this.couleur = couleur;
		this.poids = poids;
	}

	public void crier() {
		System.out.println("Je hurle à la Lune en faisant ouhouh !");
	}
}