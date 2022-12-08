package MP2;
public class Emballage 
{
    /** Champ privé nom de l'emballage*/
    private String nom;

    /**Champ privé boite de type BoiteNoire */
    private BoiteNoire boite;

    /**fixe le nom de l'emballage */
    public void setNom(String a) {nom = a;};

    /**fixe statut de la boite */
    public void setBoite() {boite.quitteOuDouble();}

    /**Retourne le nom de l'emballage */
    public String getNom() {return nom;};

    /**retourne boite de type BoitNoire */
    public BoiteNoire getBoite() {return boite;};

    /**Retourne */
    public String toString()
    {
        return "nom: " + nom + "\nCorrespond à la " + boite.toString();
    }

    
    Emballage( String s, double v )
    {
        nom = s;
        boite = new BoiteNoire( v );
    } 

}
