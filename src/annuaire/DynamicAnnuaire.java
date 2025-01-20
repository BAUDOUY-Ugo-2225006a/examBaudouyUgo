package annuaire;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DynamicAnnuaire {
    static Map<String, Carte> annuaireAssociative = new HashMap<>();
    public static void main(String[] args) {
        lectureCommandeClavier();
    }
    public static void lectureCommandeClavier() {
        Scanner scanner = new Scanner(System.in);
        String commande;
        while (true) {
            System.out.println("\nTapez une commande :");
            commande = scanner.nextLine();
            if (commande.equals("C")) {
                System.out.println("Quel est le nom de la personne que vous souhaitez ajouter dans l'annuaire ?");
                String nom = scanner.nextLine();
                System.out.println("Quel est le numéro de téléphone de la personne?");
                String numero = scanner.nextLine();
                System.out.println("Quelle est son adresse ?");
                String adresse = scanner.nextLine();

                Carte carte = new Carte(nom, numero, adresse);
                annuaireAssociative.put(nom, carte);

                System.out.println("Ajout de la carte réussi");

            } else if (commande.equals("R")) { 
                System.out.println("Qui recherchez vous?");
                String nom = scanner.nextLine();

                Carte carte = annuaireAssociative.get(nom);
                if (carte != null) {
                    System.out.println("Carte trouvée : " + carte);
                } else {
                    System.out.println("Aucune carte ne correspond à ce nom...");
                }

            } else if (commande.equals("U")) {
                System.out.println("Quei voulez vous mettre à jour?");
                String nom = scanner.nextLine();

                Carte carte = annuaireAssociative.get(nom);
                if (carte != null) {
                    System.out.println("Quel est son nouveau numéro de téléphone ?");
                    String nouveauNumero = scanner.nextLine();
                    carte.setNumero(nouveauNumero);

                    System.out.println("Mise à jour du numéro de téléphone réussi");
                } else {
                    System.out.println("Aucune carte ne correspond à ce nom.");
                }

            } else if (commande.equals("D")) {
                System.out.println("Qui voulez vous supprimer?");
                String nom = scanner.nextLine();

                if (annuaireAssociative.containsKey(nom)) {
                    annuaireAssociative.remove(nom);
                    System.out.println("Carte supprimée avec succès.");
                } else {
                    System.out.println("Aucune carte ne correspond à ce nom.");
                }

            } else if (commande.equals("L")) {
                if (annuaireAssociative.isEmpty()) {
                    System.out.println("L'annuaire est vide.");
                } else {
                    System.out.println("Contenu de l'annuaire :");
                    for (Map.Entry<String, Carte> entry : annuaireAssociative.entrySet()) {
                        System.out.println(entry.getValue());
                    }
                }

            } else if (commande.equals("Merci")) {
                System.out.println("Fermeture de l'annuaire");
                return;

            } else {
                System.out.println("Veuillez affecter une autre commande");
            }
        }
    }
}
