package classe;

import java.util.ArrayList;

public class Panier {
	// Cr�ation des deux attributs de la classe (liste d'orange et taille du panier)
	private ArrayList<Orange> panier;
	private int size;

	// Cr�ation du constructeur de la classe
	public Panier(ArrayList<Orange> panier, int size) {
		this.panier = panier;
		this.size = size;
	}

	// Cr�ation d'une m�thode bool�enne pour v�rifier si le panier a atteint sa
	// taille maximale
	public boolean estPlein() {
		if (panier.size() == size) 
			return true;
		return false;
	}

	// Cr�ation d'une m�thode bool�enne pour v�rifier si le panier ne poss�de aucune
	// orange
	public boolean estVide() {
		if (panier.isEmpty())
			return true;
		return false;
	}

	// Cr�ation d'une m�thode qui renvoie le panier (et son contenu)
	public ArrayList<Orange> getPanier() {
		return panier;
	}

	// Cr�ation de la m�thode toString qui va lister chaque �l�ment pr�sent dans le
	// panier
	public String toString() {
		String s = "";
		for (Orange orange : panier) {
			s += orange.toString() + "\n";
		}
		return s;
	}

	// Cr�ation d'une m�thode pour ajouter une orange au panier
	public Panier ajouter(Orange o) {
		// Cr�ation d'une nouvelle liste d'orange qui est initialis�e au panier d�j�
		// utilis�
		ArrayList<Orange> P = this.panier;
		// V�rification si le panier est plein avant d'ajouter l'orange
		if (estPlein() == true)
			// Si le panier est plein, l'orange n'est pas ajout�e et on retourne le panier
			// d�j� existant
			return this;
		else
			// Si le panier n'est pas plein, l'orange est ajout�e au panier
			P.add(o);
		// Le panier avec l'orange ajout�e et celles d�j� pr�sentes est retourn�
		return this;
	}

	// Cr�ation de la m�thode pour retirer la derni�re orange ajout�e
	public Panier retirer() {
		// V�rification que le panier n'est pas vide (contient au moins une orange)
		if (!this.estVide())
			// (Le panier n'est pas vide donc la derni�re orange est retir�e via la fonction
			// size()
			this.panier.remove((panier.size() - 1));
		// L'orange est retir�e ou non, le panier est retourn�
		return this;
	}

	// Cration de la m�thode qui permet d'obtenir le prix de la totalit� du contenu
	// du panier
	public int getPrix() {
		// Initialisation d'une variable prix � 0� qui �tre incr�menter suivant le prix
		// des oranges pr�sentes
		int prix = 0;
		// Cr�ation d'une boucle for each qui va balayer toutes les oranges du panier
		for (Orange orange : panier)
			// Le prix de chaque orange est additionn� jusqu'� la fin de la boucle
			prix += orange.getPrix();
		// On retourne le prix total du panier
		return prix;
	}

	// Cr�ation d'une m�thode qui va permettre de supprimer du panier une ou
	// plusieurs suivant son origine
	public Panier boycotteOrigine(String pays) {
		// Balayage de toutes les oranges du panier
		for (Orange o : this.panier) {
			// Pour chaque orange qui est balay� dans la boucle, v�rification de son pays
			// d'origine
			if (o.getOrigine() == pays)
				// Lorsque le pays d'origine de l'origine est le m�me que le pays que l'on souhaite supprimer
				// alors l'orange est supprim�
				panier.remove(o);
				// Une fois l'orange supprim�, le balayage du panier continu
			// Une fois toutes les oranges du pays que l'on ne veut plus sont supprim�es, le panier est retourn�
			return this;
		}
		// Le panier est de nouveau retourn�
		return this;
	}

	// Modification de la m�thode equals pour comparer deux paniers
	public boolean equals(Panier p) {
		// Cr�ation d'une variable bool�enne initialis� "false"
		boolean test = false;
		// V�rification que les paniers ont la m�me taille
		if (p.panier.size() != this.panier.size()) {
			// Si les paniers n'ont pas la m�me taille alors la m�thode renvoie faux
			return false;
		}
		// V�rification que les oranges de chaque panier sont les m�mes
		// Balayage du premier panier
		for (int i = 0; i < (p.panier.size()); i++) {
			test = false;
			// Balayage du deuxi�me panier
			for (int j = 0; j < (this.panier.size()); j++) {
				// V�rification que l'orange 1 du panier 1 est la m�me que l'orange 1 du panier 2
				if (p.panier.get(i).equals(panier.get(j))) {
					// System.out.println(("--------"+panier.get(i)));
					test = true;
					// Tant que la v�rification est vraie, la boucle continue sinon celle-ci s'arr�te
					break;
				}
			}
//Autre fa�on de faire la v�rification des oranges entre chaque panier			
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
