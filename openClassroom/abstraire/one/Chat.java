package openClassroom.abstraire.one;

public class Chat extends Felin {
	public Chat(){
	    this.couleur = "Black and White";
	    this.poids = 2;
	}
	public Chat(String couleur, int poids){
		this.couleur = couleur;
		this.poids = poids;
	}

	public void crier() {
	   System.out.println("Je miaule sur les toits !");
	}
}