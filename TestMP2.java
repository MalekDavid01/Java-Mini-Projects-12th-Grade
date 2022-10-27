public class TestMP2 
{
    public static void main(String[] args) 
    {
        /**Instance 1 de l'objet Emballage */
        Emballage first = new Emballage("hi", 4.0);//initialisation de l'instance 1 de type Emballage

        /**Instance 1 de l'objet BoiteNoire */
        BoiteNoire box1 = new BoiteNoire(3.0);//initialisation de l'instance 1 de type BoiteNoire
        
        //test des méthodes de l'objet Emballage

        //test setNom()
        first.setNom("David");
        
        //test getNom()
        String name = first.getNom();
        System.out.println("(test de setNom() et getNom()) Nom fixé à : " + name);
        

        //test setBoite()
        first.setBoite();

        //test getBoite()
        BoiteNoire a = first.getBoite();
        System.out.println("test de getBoite(): " + a);

        //test toString()
        System.out.println(first);



        //test des méthodes de l'objet box1

        //test getId()
        int id = box1.getId();
        System.out.println("box1 ID: " + id);

        //test getValeur()
        double value = box1.getValeur();
        System.out.println("Valeur de box1: " + value);

        //test quitteOuDouble()
        box1.quitteOuDouble();

        //test equals()
        if (box1.equals(first.getBoite()))
            System.out.println("Les boites sont identiques!");
        else
            System.out.println("Les boites ne sont pas identiques");

        //test toString()
        System.out.println(box1.toString());


        /**Instance 2 de l'objet Emballage */
        Emballage second = new Emballage( "M.Crowley", 2.0);

        /**Instance 2 de l'objet BoiteNoire*/
        BoiteNoire box2 = new BoiteNoire(4.0);

        System.out.println(second);
        System.out.println(box2);
    }
}
