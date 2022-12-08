package MP4;
import java.util.Random;
import java.util.Scanner;

import java.util.ArrayList;

public class App4 
{

    private static Scanner clavier = new Scanner( System.in );
    private static Random rnd = new Random();
    private static String[] itemsPossibles = {"ballon", "crampons", "filet", "siflet", "protège tibias"};
    private static Acteur actif = new Acteur("");

    public static void main(String[] args) 
    {
        String choix;
        boolean onJoue = true;
        String menu = 
            "\n\n" 
            + "Trouver tous les items pour gagner! Faites un choix [1-6].\n"
            +"\t1 - Ajouter un joueur.\n"
            +"\t2 - Explorer pour trouver des items.\n"
            +"\t3 - Changer de joueur actif.\n"
            +"\t4 - Afficher le statut du joueur actif.\n"
            +"\t5 - Afficher le statut de tous les joueurs.\n"
            +"\t6 - Quitter le jeu.\n";
        
        
        //boucle du jeu
        while ( onJoue )
        {
            System.out.println( menu ); //afficher les options
            choix = "a";
            while("123456".indexOf( choix ) == -1 )
            {
                System.out.print("> ");
                choix = clavier.nextLine();
            }

            if (choix.equals("1"))
            {
                
                //Créer un Acteur
                System.out.println("Donner un nom pour le nouveau joueur > ");
                String n = clavier.nextLine();
                if (actif.getNom().equals ("par défaut"))
                {
                    actif.setNom( n );
                    System.out.println( "Le joueur par défaut a été renommé " + actif.getNom() );
                }

                else
                {
                    actif = new Acteur( n );

                    //message de confirmation
                    System.out.println("Joueur " + actif.getNom() + " créé");
                }
            }

            else if (choix.equals("2"))
            {
                // trouver des items
                System.out.println( actif.getNom() + " part à la recherche... " );
                trouveItem();

                //Verifier si le jeu est terminé
                if ( aGagner() )
                {
                    System.out.println("Bravo " + actif.getNom() + " !");
                    System.out.println("Vous avez gagné!");
                    onJoue = false;
                }
            }

            else if (choix.equals("3"))
            {
                //Changer de joueurs
                System.out.println("Choisir le joueur à rendre actif > ");
                String nouveau = clavier.nextLine();
                Acteur possible = Acteur.trouveActeur( nouveau );
                if ( possible == null)
                {
                    //message d'échec
                    System.out.println("Ce joueur n'existe pas.");
                    System.out.println("Le joueur actif est toujours " + actif.getNom() + ".");
                }

                else 
                {
                    actif = possible;
                    
                    //message de confirmation
                    System.out.println("Le joueur actif est maintenant " + actif.getNom() + " .");
                }
            }

            else if (choix.equals("4"))
            {
                //afficher le statut du joueur actif
                System.out.println( actif );
            }

            else if (choix.equals("5"))
            {
                //afficher tous les joueurs
                for (Acteur a : Acteur.getActeurs() )
                {
                    System.out.println( a );
                }
            }

            else if (choix.equals("6"))
            {
                onJoue = false; // quitter
            }
        }

        System.out.println("Fin du jeu");
    }

    
    //méthode trouveItem()
    private static void trouveItem()
    {
        double chance = Math.random();
        //rnd.nextInt(list.size());
        if ( chance < 0.6 )
        {
            //piger un item aléatoire d'itempossibles
            int index = rnd.nextInt( itemsPossibles.length );
            String item = itemsPossibles[ index ];

            //l'ajouter à l'inventaire
            System.out.println( actif.getNom() + " a trouvé " + item);
            actif.addItem ( item );
            
        }

        else if (chance < 0.9)
        {
            System.out.println( actif.getNom() + " n'a rien trouvé ;-(" );
        }

        else 
        {
            ArrayList<String> items = actif.getInventaire();
            if ( items.size()== 0 )
            {
                System.out.println( actif.getNom() + " n'a aucun item à perdre");
            }
            // piger un item aléatoirement de l'inventaire actif
            int index = rnd.nextInt( items.size());
            String item = items.get( index );

            // et le retirer de l'inventaire
            System.out.println( actif.getNom() + " a perdu " + item );
            actif.removeItem( item );
        }
    }


    //méthode aGagner()
    private static Boolean aGagner()
    {
        //méthode rusée
        //return actif.getInventaire().size() == itemsPossibles.length;

        ArrayList<String> inventaire = actif.getInventaire();

        for (String item : itemsPossibles )
        {
            if (! inventaire.contains ( item ) )
                return false;
        }
        return true;
    }
}
