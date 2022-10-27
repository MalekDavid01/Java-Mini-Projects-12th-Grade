import java.util.ArrayList;

/** Pour le mini-projet 4 (en lien avec les ArrayList) */
public class Acteur {

    /** liste static de tous les Acteur */
    private static ArrayList<Acteur> acteurs = new ArrayList<Acteur>();
    
    /** inventaire des items de chaque Acteur */
    private ArrayList<String> inventaire;
    
    /** nom de chaque Acteur */
    private String nom;

    /** Constructeur */
    Acteur( String n ) 
    {
        nom = n;
        inventaire = new ArrayList<String>();
        acteurs.add( this );
    }

    

    public static int combien()
    {
        return acteurs.size();
    }
    
    

    public static ArrayList<Acteur> getActeurs()
    {
        return acteurs;
    }
    

    
    public static Acteur trouveActeur( String name )
    {
        int matches = 0;       
        int index = -1;

        // voir combien d'Acteur ont le nom (name)
        for ( int i = 0; i < acteurs.size(); i++)
        {
            if (( acteurs.get(i).nom).equals(name))
            {
                matches++;
                if (matches == 1)
                    index = i;
            }
        }

        if (matches == 0)
        {
            return null;
        }

        if (matches>1)
        {
            System.out.println("Plusieurs acteur nommés ' " + name + " ' ont été trouvés. \n Apparu: " + matches + " fois.");
            System.out.println("\t Seulement le premier est retourné:");
        }
        return acteurs.get( index );
    }



    public void setNom( String n ) 
    {
        this.nom = n;
    }



    public String getNom() 
    {
        return this.nom;
    }



    public void addItem( String item )
    {
        if (this.inventaire.contains(item))
        {
            System.out.println(item + " déjà dans l'inventaire");
        }
        else
        {
            this.inventaire.add( item );
        }
    }



    public void removeItem(String item)
    {
        if ( !this.inventaire.contains(item))
        {
            System.out.println(item + " not found");
        }

        else
        {
            this.inventaire.remove( item );
        }
    }



    public String afficheinventaire()
    {
        return this.inventaire.toString();
    }



    public ArrayList<String> getInventaire()
    {
        return this.inventaire;
    }


    /* redéfinition du toString()*/
    public String toString() 
    {
        String str = String.format("Acteur '%s':\n\t", this.nom);
        str += this.getInventaire();
        return str;
    }
}
