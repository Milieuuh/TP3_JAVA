public class Main {

    public static void main(String[] args) {
        Etudiant etu = new Etudiant("X", "Y", 28);
        try {
            etu.ajouterNote(12);
            etu.ajouterNote(9);
            etu.ajouterNote(7);
            etu.ajouterNote(19);

        } catch (ErreurNotes e)
        {
            //System.out.println("Gestionnaire d’exceptions demandé...");
            e.recuperMessageErreur();
        }
    }
}
