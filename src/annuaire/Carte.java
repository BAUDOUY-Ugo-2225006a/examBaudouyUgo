package annuaire;

public class Carte {
    private String nom;
    private String numero;
    private String adresse;

    // Constructeur
    public Carte(String nom, String numero, String adresse) {
        this.nom = nom;
        this.numero = numero;
        this.adresse = adresse;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // toString pour afficher les détails de la carte
    @Override
    public String toString() {
        return "Nom: " + nom + ", Téléphone: " + numero + ", Adresse: " + adresse;
    }
}
