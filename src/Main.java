import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //création des 7 cours
        Cours c1 = new Cours("G201","Système",350);
        Cours c2 = new Cours("G501","Hsitoire",50);
        Cours c3 = new Cours("G502","Géographie",20);
        Cours c4 = new Cours("G200","Mathématiques",450);
        Cours c5 = new Cours("G101","Sport",10);
        Cours c6 = new Cours("F101","Français",300);
        Cours c7 = new Cours("F201","Anglais",5);

        //Création d'une formation
        Formation f1 = new Formation("F0014", "Complète");

        //Ajoute des cours
        f1.AjouterCours(c1);
        f1.AjouterCours(c2);
        f1.AjouterCours(c3);
        f1.AjouterCours(c4);
        f1.AjouterCours(c5);
        f1.AjouterCours(c6);
        f1.AjouterCours(c7);

        System.out.println(f1);

        //Supprimer le deuxième de la liste
        f1.supprimerAIndex(1);
        System.out.println(f1);


        //Trier la liste des cours
        Collections.sort(f1.getListeCours());
        System.out.println(f1);
    }
}
