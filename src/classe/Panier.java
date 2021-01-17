package classe;

import java.util.ArrayList;

public class Panier {
	// Création des deux attributs de la classe (liste d'orange et taille du panier)
	private ArrayList<Orange> panier;
	private int size;

	// Création du constructeur de la classe
	public Panier(ArrayList<Orange> panier, int size) {
		this.panier = panier;
		this.size = size;
	}

	// Création d'une méthode booléenne pour vérifier si le panier a atteint sa
	// taille maximale
	public boolean estPlein() {
		if (panier.size() == size) 
			return true;
		return false;
	}

	// Création d'une méthode booléenne pour vérifier si le panier ne possède aucune
	// orange
	public boolean estVide() {
		if (panier.isEmpty())
			return true;
		return false;
	}

	// Création d'une méthode qui renvoie le panier (et son contenu)
	public ArrayList<Orange> getPanier() {
		return panier;
	}

	// Création de la méthode toString qui va lister chaque élément présent dans le
	// panier
	public String toString() {
		String s = "";
		for (Orange orange : panier) {
			s += orange.toString() + "\n";
		}
		return s;
	}

	// Création d'une méthode pour ajouter une orange au panier
	public Panier ajouter(Orange o) {
		// Création d'une nouvelle liste d'orange qui est initialisée au panier déjà
		// utilisé
		ArrayList<Orange> P = this.panier;
		// Vérification si le panier est plein avant d'ajouter l'orange
		if (estPlein() == true)
			// Si le panier est plein, l'orange n'est pas ajoutée et on retourne le panier
			// déjà existant
			return this;
		else
			// Si le panier n'est pas plein, l'orange est ajoutée au panier
			P.add(o);
		// Le panier avec l'orange ajoutée et celles déjà présentes est retourné
		return this;
	}

	// Création de la méthode pour retirer la dernière orange ajoutée
	public Panier retirer() {
		// Vérification que le panier n'est pas vide (contient au moins une orange)
		if (!this.estVide())
			// (Le panier n'est pas vide donc la dernière orange est retirée via la fonction
			// size()
			this.panier.remove((panier.size() - 1));
		// L'orange est retirée ou non, le panier est retourné
		return this;
	}

	// Cration de la méthode qui permet d'obtenir le prix de la totalité du contenu
	// du panier
	public int getPrix() {
		// Initialisation d'une variable prix à 0€ qui être incrémenter suivant le prix
		// des oranges présentes
		int prix = 0;
		// Création d'une boucle for each qui va balayer toutes les oranges du panier
		for (Orange orange : panier)
			// Le prix de chaque orange est additionné jusqu'à la fin de la boucle
			prix += orange.getPrix();
		// On retourne le prix total du panier
		return prix;
	}

	// Création d'une méthode qui va permettre de supprimer du panier une ou
	// plusieurs suivant son origine
	public Panier boycotteOrigine(String pays) {
		// Balayage de toutes les oranges du panier
		for (Orange o : this.panier) {
			// Pour chaque orange qui est balayé dans la boucle, vérification de son pays
			// d'origine
			if (o.getOrigine() == pays)
				// Lorsque le pays d'origine de l'origine est le même que le pays que l'on souhaite supprimer
				// alors l'orange est supprimé
				panier.remove(o);
				// Une fois l'orange supprimé, le balayage du panier continu
			// Une fois toutes les oranges du pays que l'on ne veut plus sont supprimées, le panier est retourné
			return this;
		}
		// Le panier est de nouveau retourné
		return this;
	}

	// Modification de la méthode equals pour comparer deux paniers
	public boolean equals(Panier p) {
		// Création d'une variable booléenne initialisé "false"
		boolean test = false;
		// Vérification que les paniers ont la même taille
		if (p.panier.size() != this.panier.size()) {
			// Si les paniers n'ont pas la même taille alors la méthode renvoie faux
			return false;
		}
		// Vérification que les oranges de chaque panier sont les mêmes
		// Balayage du premier panier
		for (int i = 0; i < (p.panier.size()); i++) {
			test = false;
			// Balayage du deuxième panier
			for (int j = 0; j < (this.panier.size()); j++) {
				// Vérification que l'orange 1 du panier 1 est la même que l'orange 1 du panier 2
				if (p.panier.get(i).equals(panier.get(j))) {
					// System.out.println(("--------"+panier.get(i)));
					test = true;
					// Tant que la vérification est vraie, la boucle continue sinon celle-ci s'arrête
					break;
				}
			}
//Autre façon de faire la vérification des oranges entre chaque panier			
//		for(Orange o : p.getPanier()) {
//			test=false;
//			for(Orange o2 : this.getPanier()) {
//				if(o.equals(o2))
//					test=true;
//					break;
//			}
			if (!test)
				return false;
		}
		return true;
	}
}
