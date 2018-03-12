import java.util.*;


public class Main {
    public static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        HashMap<String,Contact> map=new HashMap<>();
        Queue <Contact> queue=new LinkedList<>();
        int choix = 0;
        int choixapp = 0;

        Contact tabcontact[] = new Contact[20];
        int nbcontact = 0;
        boolean oui;

        boolean choice = true;
        int nbtel = 0;
        String modif;




        Scanner sc = new Scanner(System.in);


        while (oui = true) {
            int choix2 = 0;
            System.out.println("Bienvenue à votre liste de Contact.\n Que voulez-vous faire?");
            System.out.println("1. Ajouter un Contact.");
            System.out.println("2. Modifier un Contact.");
            System.out.println("3. Afficher les contacts.");
            System.out.println("4. Supprimer un contact.");
            System.out.println("5. Ajouter un contact à la liste de rappels.");
            System.out.println("6. Voir la liste de rappels.");
            System.out.println("7. Quitter le programme.");
            choix2 = sc.nextInt();

            if (choix2 == 1) {


                nbcontact++;
                tabcontact[nbcontact - 1] = new Contact();
                System.out.println("Ce Contact sera entré à la position" + nbcontact + ".\n" + "Veuillez entrer les informations suivantes :");

                tabcontact[nbcontact-1].ajouterContact(tabcontact);

                choice=true;
                while (choice == true) {
                    nbtel = 0;
                    System.out.println("Entrer un numéro de téléphone (1-oui 2-non)");
                    choix = sc.nextInt();
                    if (choix == 1) {
                     //  tabcontact[nbcontact-1].cr


                    } else if (choix == 2) {
                        choice = false;
                    }
                }
            } else if (choix2 == 2) {
                if (nbcontact >= 1) {
                    System.out.println("Quel conctact voulez-vous modifier?(Rien+Entrée si vous voulez modifier)");

                    for (int i = 0; i < tabcontact.length; i++) {
                        if (tabcontact[i] != null) {
                            System.out.println((i + 1) + "-" + tabcontact[i].getPrénom() + " " + tabcontact[i].getNom());}
                    }
                    choix = sc.nextInt();
                    tabcontact[choix-1].changerContact(tabcontact,nbcontact,choix,modif,nbcontact);
                }
                else if (nbcontact==0){
                    System.out.println("Vous n'avez pas de contact.");
                }
            }

            else if (choix2 == 3) {
                if(nbcontact>0) {
                    tabcontact[nbcontact - 1].voirContact(tabcontact, nbcontact);
                }
            } else if (choix2 == 4) {
                System.exit(0);
            } else
                System.out.println("Error.");

        }
    }
}

