package openClassroom.abstraire.one;

public  class Test{
	public static void main(String[] args) {
		System.out.println("--------------------------------");
		Chien l = new Chien("Gris bleuté", 20);
		l.boire();
		l.manger();
		l.deplacement();
		l.crier();
		System.out.println(l.toString());
		System.out.println("--------------------------------");
		l.faireCalin();
		l.faireLechouille();
		l.faireLeBeau();
		System.out.println("--------------------------------");
	}
}