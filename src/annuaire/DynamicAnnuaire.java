package annuaire;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DynamicAnnuaire {
    static Map<String, Carte> annuaire = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nCommande (C: créer, R: lire, U: MAJ, D: supprimer, L: lister, Merci: quitter) :");
            String cmd = scanner.nextLine();
            if (cmd.equals("C")) {
                System.out.println("Nom :");
                String nom = scanner.nextLine();
                System.out.println("Téléphone :");
                String tel = scanner.nextLine();
                System.out.println("Adresse :");
                String adresse = scanner.nextLine();
                annuaire.put(nom, new Carte(nom, tel, adresse));
                System.out.println("Ajouté avec succès.");
            } else if (cmd.equals("R")) {
                System.out.println("Rechercher le nom :");
                String nom = scanner.nextLine();
                Carte carte = annuaire.get(nom);
                System.out.println(carte != null ? carte : "Nom introuvable.");
            } else if (cmd.equals("U")) {
                System.out.println("Nom à mettre à jour :");
                String nom = scanner.nextLine();
                Carte carte = annuaire.get(nom);
                if (carte != null) {
                    System.out.println("Nouveau téléphone :");
                    carte.setNumero(scanner.nextLine());
                    System.out.println("Mise à jour réussie.");
                } else {
                    System.out.println("Nom introuvable.");
                }
            } else if (cmd.equals("D")) {
                System.out.println("Nom à supprimer :");
                String nom = scanner.nextLine();
                if (annuaire.remove(nom) != null) {
                    System.out.println("Supprimé avec succès.");
                } else {
                    System.out.println("Nom introuvable.");
                }
            } else if (cmd.equals("L")) {
                if (annuaire.isEmpty()) {
                    System.out.println("Annuaire vide.");
                } else {
                    System.out.println("Annuaire :");
                    annuaire.values().forEach(System.out::println);
                }
            } else if (cmd.equals("Merci")) {
                System.out.println("Fermeture de l'annuaire.");
                break;
            } else {
                System.out.println("Commande inconnue.");
            }
        }
    }
}
