public class ErreurNotes extends Exception {
   /* public ErreurNotes(){
        System.out.println("Vous avez sollicité un gestionnaire d’exceptions ? Je ne suis pas tout à fait prêt, mais je répond quand même");
    }*/

    private int nbNotes;
    private int nbMatieres;
    private int note;

    public ErreurNotes(int nbNotes, int nbMatieres, int note)
    {
        this.nbNotes = nbNotes; this.nbMatieres = nbMatieres;
        this.note = note;
    }

    public String recuperMessageErreur() {
        String messageErr = "";
        if ( nbNotes >= nbMatieres ) {
            messageErr += "Nombre de notes à saisir supérieur au nombre de matières.\n";
        }
        if ( note < 0 || note > 20 ) {
            messageErr += "La note saisie doit être comprise entre 0 et 20.\n";
        }
        return messageErr;
    }

}
