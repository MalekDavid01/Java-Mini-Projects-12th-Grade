package MP4;
public class TestActeur {
    public static void main(String[] args)
    {
        Acteur test = new Acteur("dave");
        System.out.println(test);

        test.addItem("Hair");
        test.addItem("peigne");
        System.out.println(test);

        //test.removeItem("peigne");
        //System.out.println(test);

        Acteur test2 = new Acteur("sam");
        
        Acteur recherche = Acteur.trouveActeur("sam");
        if (recherche == null)
            System.out.println("not found");
        else
            System.out.println(recherche);

      //  test2.setNom("Dave");
       // System.out.println(Acteur.getActeurs());
    }    
}
