package classe;

public class Orange {
	// Déclaration des variables de la classe
	private double prix;
	private String origine;

	// Création du constructeur de la classe
	public Orange(double prix, String origine) throws Exception  {
		// Insertion d'une exception si le prix écrit est négatif
		if (prix < 0) {
			throw new Exception("Prix négatif");
		}
		this.prix = prix;
		this.origine = origine;
	}

	// Création de la méthode qui donne le prix
	public double getPrix() {
		return prix;
	}

	// Création de la méthode qui donne l'origine
	public String getOrigine() {
		return origine;
	}

	// Création de la méthode toString qui va renvoyer l'origine et le prix du
	// produit
	public String toString() {
		return "Orange : origine=" + origine + ", prix=" + prix;
	}

	// Modification de la méthode booléenne equals
	public boolean equals(Orange o) {
		// Vérification que l'origine des deux oranges sont égales
		if (!o.getOrigine().equals(this.getOrigine()))
			return false;
		// Vérification que le prix des deux oranges sont égaux
		if (o.getPrix() != this.getPrix()) {
			return false;
		}
		// Si les deux vérifications sont correctes alors les oranges ont le même prix
		// et la même origine
		return true;
	}

}
