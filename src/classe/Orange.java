package classe;

public class Orange {
	// D�claration des variables de la classe
	private double prix;
	private String origine;

	// Cr�ation du constructeur de la classe
	public Orange(double prix, String origine) throws Exception  {
		// Insertion d'une exception si le prix �crit est n�gatif
		if (prix < 0) {
			throw new Exception("Prix n�gatif");
		}
		this.prix = prix;
		this.origine = origine;
	}

	// Cr�ation de la m�thode qui donne le prix
	public double getPrix() {
		return prix;
	}

	// Cr�ation de la m�thode qui donne l'origine
	public String getOrigine() {
		return origine;
	}

	// Cr�ation de la m�thode toString qui va renvoyer l'origine et le prix du
	// produit
	public String toString() {
		return "Orange : origine=" + origine + ", prix=" + prix;
	}

	// Modification de la m�thode bool�enne equals
	public boolean equals(Orange o) {
		// V�rification que l'origine des deux oranges sont �gales
		if (!o.getOrigine().equals(this.getOrigine()))
			return false;
		// V�rification que le prix des deux oranges sont �gaux
		if (o.getPrix() != this.getPrix()) {
			return false;
		}
		// Si les deux v�rifications sont correctes alors les oranges ont le m�me prix
		// et la m�me origine
		return true;
	}

}
