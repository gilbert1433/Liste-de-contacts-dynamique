/**
 * Created by GilRa1731814 on 2018-01-22.
 */
public class Telephone {
    private String info;
    private String numero;


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public static Telephone creerTelephone() {

        Telephone telephone = new Telephone();
        System.out.print("  Information Téléphone: ");
        telephone.info = Main.sc.next();
        System.out.print(" Numéro de Téléphone: ");
        telephone.numero = Main.sc.next();
        return telephone;
    }

    public void modifierTelephone() {
        String var1;
        System.out.print("  " + info + " (" + numero + ") : ");
        var1 = Main.sc.nextLine().trim();
        if (!var1.equals("")) {
            numero=var1;
        }
}
}
