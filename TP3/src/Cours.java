public class Cours implements Comparable {

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

    public int compareTo(Object obj)
    {
        String intitule = ((Cours)obj).getIntitule();

        return this.intitule.compareTo(intitule);
    }

}
