public class Cours {

    private String code;
    private String intitule;
    private int volumeHoraire;

    public Cours(String code, String intitule, int volumeHoraire)
    {
        this.code=code;
        this.intitule=intitule;
        this.volumeHoraire=volumeHoraire;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getVolumeHoraire() {
        return volumeHoraire;
    }

    public void setVolumeHoraire(int volumeHoraire) {
        this.volumeHoraire = volumeHoraire;
    }

    public String toString()
    {
        return ""+code+" - "+intitule+" - Volume horaire :"+volumeHoraire+"H";
    }
}
