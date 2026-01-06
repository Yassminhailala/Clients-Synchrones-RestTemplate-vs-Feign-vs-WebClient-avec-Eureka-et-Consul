package ma.example.vehicule;

public class Voiture {
    private Long identifiant;
    private String constructeur;
    private String typeModele;
    private Long idProprietaire;

    public Voiture() {
    }

    public Voiture(Long identifiant, String constructeur, String typeModele, Long idProprietaire) {
        this.identifiant = identifiant;
        this.constructeur = constructeur;
        this.typeModele = typeModele;
        this.idProprietaire = idProprietaire;
    }

    public Long obtenirIdentifiant() {
        return identifiant;
    }

    public void definirIdentifiant(Long identifiant) {
        this.identifiant = identifiant;
    }

    public String obtenirConstructeur() {
        return constructeur;
    }

    public void definirConstructeur(String constructeur) {
        this.constructeur = constructeur;
    }

    public String obtenirTypeModele() {
        return typeModele;
    }

    public void definirTypeModele(String typeModele) {
        this.typeModele = typeModele;
    }

    public Long obtenirIdProprietaire() {
        return idProprietaire;
    }

    public void definirIdProprietaire(Long idProprietaire) {
        this.idProprietaire = idProprietaire;
    }
}