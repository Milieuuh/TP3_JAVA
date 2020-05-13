import java.util.ArrayList;

public class Formation {

    //ATTRIBUTS
    private ArrayList<Cours> listeCours;
    private String codeFormation;
    private String nomFormation;

    //CONSTRUCTEUR
    public Formation(String code, String nom)
    {
        this.listeCours = new ArrayList<>();
        this.codeFormation = code;
        this.nomFormation = nom;
    }

    //AUTRES METHODES
    public String toString()
    {
        String s="";
        for(int i=0; i<this.listeCours.size(); i++)
        {
            s+=listeCours.get(i).toString()+" \n";
        }
        return s;
    }

}
