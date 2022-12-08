package MP2;

public class BoiteNoire
{
    /** Nombre d'instances de type BoiteNoire */
    private static int boites = 0;

    private int id;
    private double valeur;

    BoiteNoire(double v)
    {
        boites++;
        id = boites;
        valeur = v;
    }

    public int getId() { return id; }
    public double getValeur() { return valeur; }

    /** Change la valeur au double de la valeur initiale ou à 0 aléatoirement */
    public void quitteOuDouble()
    {
        System.out.print("Valeur : " + valeur);
        if ( Math.random() > 0.5 ) valeur *= 2;
        else valeur = 0;
        System.out.println(" -> " + valeur);
    }

    public boolean equals(BoiteNoire autre)
    {
        return this.valeur == autre.valeur;
    }
    
    public String toString()
    {
        return String.format("Boite noire %d de %d. Valeur = %.2f", id, boites, valeur);
    }
}
