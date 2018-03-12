
public class Entreprise {
    private String nom;
    private Adresse adresse1;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(Adresse adresse1) {
        this.adresse1 = adresse1;
    }
    public void ajouterEntreprise(){
        System.out.println("   Entreprise:");
        System.out.print("   Nom:");
        nom=Main.sc.next();
    }
}
