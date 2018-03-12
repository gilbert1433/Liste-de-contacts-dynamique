import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String prénom;
    private String nom;
    private Adresse adresse1;
    private Occupation occupation1;
    private List<Telephone> liste=new ArrayList<Telephone>();

    public List<Telephone> getListe() { return liste; }

    public void setListe(List<Telephone> liste) { this.liste = liste; }

    private Scanner sc = new Scanner(System.in);

    public String getPrénom() {return prénom;}

    public void setPrénom(String prénom) {this.prénom = prénom;}

    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}

    public Adresse getAdresse1() {return adresse1;}

    public void setAdresse1(Adresse adresse1) {this.adresse1 = adresse1;}

    public Occupation getOccupation1() {return occupation1;}

    public void setOccupation1(Occupation occupation1) {this.occupation1 = occupation1;}


    public void  ajouterContact(Contact[]tabcontact,int nbcontact, boolean choice,int nbtel,int choix){
        int choixapp = 0;

        System.out.print("Prénom:");
        tabcontact[nbcontact - 1].setPrénom(sc.next());
        System.out.print("Nom;");
        tabcontact[nbcontact - 1].setNom(sc.next());
        //Adresse
        tabcontact[nbcontact-1].getAdresse1().ajouterAdresse();

        //Occupation

        tabcontact[nbcontact-1].getOccupation1().ajouterOccupation();
        //Entreprise
        tabcontact[nbcontact-1].getOccupation1().getEntreprise1().ajouterEntreprise();

        //Adresse de l'Entreprise
        tabcontact[nbcontact-1].getOccupation1().getEntreprise1().getAdresse1().ajouterAdresseEntreprise();

        //telephone
        while (choice == true) {
            nbtel = 0;
            System.out.println("Entrer un numéro de téléphone (1-oui 2-non)");
            choix = sc.nextInt();
            if (choix == 1) {
                tabcontact[nbcontact-1].setListe(new Telephone());
                tabcontact[nbcontact-1].


            } else if (choix == 2) {
                choice = false;
            }
        }
    }

    public void voirContact(Contact[]tabcontact,int nbcontact){
        System.out.println("Prénom: " + tabcontact[nbcontact - 1].getPrénom());
        System.out.println("Nom: " + tabcontact[nbcontact - 1].getNom());
        //Adresse
        System.out.println("Adresse: \n   Numéro de porte: " + tabcontact[nbcontact - 1].getAdresse1().getNumadresse());
        System.out.println("   Rue: " + tabcontact[nbcontact - 1].getAdresse1().getNomderue());
        System.out.println("   Appartement: " + tabcontact[nbcontact - 1].getAdresse1().getAppartement());
        System.out.println("   Ville: " + tabcontact[nbcontact - 1].getAdresse1().getVille());
        System.out.println("   Province: " + tabcontact[nbcontact - 1].getAdresse1().getProvince());
        System.out.println("   Pays: " + tabcontact[nbcontact - 1].getAdresse1().getPays());
        //Occupation
        System.out.println("Occupation: ");
        System.out.println("   Poste: " + tabcontact[nbcontact - 1].getOccupation1().getPoste());
        //Entreprise
        System.out.println("   Entreprise: ");
        System.out.println("   Nom: " + tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getNom());
        System.out.println("   Adresse: ");
        //Adresse de l'Entreprise
        System.out.println("      Numéro de porte: " + tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getAdresse1().getNumadresse());
        System.out.println("      Rue: " + tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getAdresse1().getNomderue());
        System.out.println("      Ville: " + tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getAdresse1().getVille());

        System.out.println("      Province: " + tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getAdresse1().getProvince());

        System.out.println("      Pays: " + tabcontact[nbcontact - 1].getOccupation1().getEntreprise1().getAdresse1().getPays());

        for (int i = 0; i < tabcontact.length; i++) {
            if (tabcontact[i] != null) {

                for (int j = 0; j < 10; j++) {
                    System.out.println("      Information Téléphone: " + tabcontact[nbcontact - 1].getTelephone1()[j].getInfo());
                    System.out.println("      Numéro de Téléphone: " + tabcontact[nbcontact - 1].getTelephone1()[j].getInfo());
                }
            }
        }

    }

    public void changerContact(Contact[]tabcontact, int nbcontact, int choix,String modif,int choixapp){


        System.out.println("Prénom (" + tabcontact[choix - 1].getPrénom() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {
            tabcontact[choix - 1].setPrénom(sc.next());
        }

        System.out.println("Nom: (" + tabcontact[choix - 1].getNom() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {
            tabcontact[choix - 1].setNom(sc.next());
        }

        //Adresse
        System.out.println("Adresse: \n   Numéro de porte: (" + tabcontact[choix - 1].getAdresse1().getNumadresse() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {
            tabcontact[choix - 1].getAdresse1().setNumadresse(sc.next());
        }

        System.out.println("   Rue: (" + tabcontact[choix - 1].getAdresse1().getNomderue() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {
            tabcontact[choix - 1].getAdresse1().setNomderue(sc.next());
        }

        if (choixapp == 1) {
            System.out.println("   Appartement: (" + tabcontact[choix - 1].getAdresse1().getAppartement() + ") : ");
            modif = sc.nextLine().trim();
            if (modif.equals("")) {
            } else {
                tabcontact[choix - 1].getAdresse1().setAppartement(sc.next());
            }
        }

        System.out.println("   Ville: (" + tabcontact[choix - 1].getAdresse1().getVille() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {
            tabcontact[choix - 1].getAdresse1().setVille(sc.next());
        }

        System.out.println("   Province: (" + tabcontact[choix - 1].getAdresse1().getProvince() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {
            tabcontact[choix - 1].getAdresse1().setProvince(sc.next());
        }

        System.out.println("   Pays: (" + tabcontact[choix - 1].getAdresse1().getPays() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {
            tabcontact[choix - 1].getAdresse1().setpays(sc.next());
        }

        //Occupation
        System.out.println("Occupation: ");
        System.out.println("   Poste: (" + tabcontact[choix - 1].getOccupation1().getPoste() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {
            tabcontact[choix - 1].getOccupation1().setPoste(sc.next());
        }

        //Entreprise
        System.out.println("   Entreprise: ");
        System.out.println("   Nom: (" + tabcontact[choix - 1].getOccupation1().getEntreprise1().getNom() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {
            tabcontact[choix - 1].getOccupation1().getEntreprise1().setNom(sc.next());
        }

        System.out.println("   Adresse: ");
        //Adresse de l'Entreprise
        System.out.println("      Numéro de porte: (" + tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().getNumadresse() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {
            tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().setNumadresse(sc.next());
        }


        System.out.println("      Rue: (" + tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().getNomderue() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {
            tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().setNomderue(sc.next());
        }

        System.out.println("      Ville: (" + tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().getVille() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {
            tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().setVille(sc.next());
        }

        System.out.println("      Province: (" + tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().getProvince() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {
            tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().setProvince(sc.next());
        }

        System.out.println("      Pays: (" + tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().getPays() + ") : ");
        modif = sc.nextLine().trim();
        if (modif.equals("")) {
        } else {
            tabcontact[choix - 1].getOccupation1().getEntreprise1().getAdresse1().setpays(sc.next());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("      information téléphone: (" + tabcontact[choix - 1].getTelephone1()[i].getInfo() + ")");
            modif = sc.nextLine().trim();
            if (modif.equals("")) {
            } else {
                tabcontact[choix - 1].getTelephone1()[i].setInfo(sc.next());
            }

            System.out.println("      numéro de téléphone: (" + tabcontact[choix - 1].getTelephone1()[i].getNumero() + ")");
            modif = sc.nextLine().trim();
            if (modif.equals("")) {
            } else {
                tabcontact[choix - 1].getTelephone1()[i].setNumero(sc.next());
            }

        }
    }


}
