package MP1;
public class AppMP1 //Le "driver" class
{
    public static void main(String[] args) // Instantie les objets 
    {
        //Création de nouveau objets
        ObjetMP1 A = new ObjetMP1("David", 17); //Prend le nom et l'age de David
        ObjetMP1 B = new ObjetMP1("James", 16); //Prend le nom et l'age de James
        ObjetMP1 C = new ObjetMP1("Jason", 12); //Prend le nom et l'age de Jason

        int sum = 0; //Initialize une valeur 0 au int "sum" 
        ObjetMP1 [] Liste = {A, B, C}; //Liste des objets créés ci-dessus
        for (ObjetMP1 L : Liste) //Boucle qui associe chaque objet dans "Liste" à la variable L 
        {
            L.afficher(); // Pour chaque L dans "Liste", executer la méthode afficher
            sum += L.age; //prend la valeur int de l'objet et l'ajoute à la vairbale "sum"
        }
        System.out.println("\nLa somme des ages est: " + sum);  // sort à la commande la valeur finale de "sum" après la fin de la boucle
    }   
}