package com.example.tp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Entreprise entreprise = new Entreprise();

        List<Object> employes = creerEmployes();

        for (Object emp : employes) {
            entreprise.ajouterEmploye(emp);
        }

        afficherResultat(entreprise);
    }

    private static List<Object> creerEmployes() {
        List<Object> liste = new ArrayList<>();

        liste.add(new EmployeHoraire("Fatima", "Khalil", 18.0, 150));
        liste.add(new EmployeSalarie("Amine", "Bennani", 3000.0));
        liste.add(new Vendeur("Sara", "El Idrissi", 2200.0, 700.0));
        liste.add(new EmployeHoraire("Youssef", "Naji", 14.0, 130));

        return liste;
    }

    private static void afficherResultat(Entreprise entreprise) {
        System.out.println("=== Calcul des salaires ===");
        entreprise.afficherPaie();
        System.out.println("===========================");
    }
}
