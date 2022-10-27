public class ObjetMP1
{
    public String name; //Champ string
    public int age; //Champ int

    // Création d'objets 
    public ObjetMP1() {} // Constructeur par défaut/ Constructeur vide dans le cas où un objet vide est instantié

    public ObjetMP1(String a, int b) // Constructeur qui prend un string "a" et un int "b" 
    {
        name = a; // La valeur "a" est associé à la variable de type string (name) 
        age = b;  // La valeur "b" est associé à la variable de type int (age)
    }

    public void afficher() // Initialization de la méthode afficher() qui affiche les valeurs des champs
    {
        System.out.println( "\n" + name+ " a " + age + " ans."); // affiche à la commande les champs "name" et "age"
    }
}
