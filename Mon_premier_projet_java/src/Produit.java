// Création de ma class Produit qui va servir de "modèle" à mon objet produit

public class Produit {

	private String description;
	private int quantite;
	private double prixUnitaire;
	
	public Produit(String description, int quantite, double prixUnitaire) {
		this.description = description;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}	
}
