package classe;

import java.util.ArrayList;

public class Panier1 {

	public static void main(String[] args) {

		//Test des diff�rentes m�thodes pr�sentes dans la classe Panier
		ArrayList<Orange> panier = new ArrayList<Orange>();
		Panier p = new Panier(panier,10);
		try {
			p.ajouter(new Orange(0.80, "France"));
			p.ajouter(new Orange(0.80, "Espagne"));
			p.ajouter(new Orange(0.90, "Floride"));
			System.out.println("Contenance du panier\n"+p); 
			p.retirer();
			System.out.println("le dernier produit ajout� est retir� :\n"+p);
			p.boycotteOrigine("France");
			System.out.println("la panier en boycottant la France :\n"+p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
