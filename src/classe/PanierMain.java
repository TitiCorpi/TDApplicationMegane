package classe;
import java.util.ArrayList;

public class PanierMain {

	public static void main(String[] args) {
		ArrayList<Orange> panier = new ArrayList<Orange>();
		ArrayList<Orange> panier2 = new ArrayList<Orange>();
		ArrayList<Orange> panier3 = new ArrayList<Orange>();
		ArrayList<Orange> panier4 = new ArrayList<Orange>();


		//Test des paniers identiques sans JUnit
	try {
		Panier p1 = new Panier(panier,10);
		p1.ajouter(new Orange(0.80, "France"));
		p1.ajouter(new Orange(0.80, "Espagne"));
		p1.ajouter(new Orange(0.90, "Floride"));
		
		Panier p2 = new Panier(panier2,10);
		p2.ajouter(new Orange(0.80, "France"));
		p2.ajouter(new Orange(0.80, "Espagne"));
		p2.ajouter(new Orange(0.90, "Floride")); 

		Panier p3 = new Panier(panier3,5);
		p3.ajouter(new Orange(0.80, "France"));
		p3.ajouter(new Orange(0.80, "Espagne"));
		
		Panier p4 = new Panier(panier4,10);
		p4.ajouter(new Orange(0.80, "France"));
		p4.ajouter(new Orange(0.80, "Espagne"));
		p4.ajouter(new Orange(0.90, "Miami"));
		
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p4));
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	

}
