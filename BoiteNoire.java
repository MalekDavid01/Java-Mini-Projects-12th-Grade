/**
 * Une {@code class} encapsulée -> ses champs sont {@code private}.
 * <p>
 * Le champ {@code boites} est aussi {@code static}. Le champ static est accessible à toutes les instances 
 * de la class. Il est incrémenté lors de chaque appel du constructeur, alors il sert de variable 
 * qui compte le nombre d'instances.
 * <p>
 * Le champ {@code id} n'a pas de méthode modificateur car il est fixé lors de la création de 
 * l'instance. <i>Il prend la valeur de {@code boites } au moment de la création de l'instance.</i>.
 * <p>
 * Le champ {@valeur} est passé comme paramètre au constructeur et a un modificateur qui s'appelle 
 * {@code quitteOuDouble() } qui change {@code valeur} à soit le double de sa valeur initiale ou 0.
 * <p>
 * Les méthodes standards {@code toString()}  et {@code equals() } ont aussi été écrites.
 * 
 * @author physcrowley
 * @version 2021-12-09
 */
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