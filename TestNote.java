package tableaux;

import java.util.Scanner;

/**
 * Created by momo on 14/09/15.
 */
public class TestNote
{ public static void main (String args[])
{ int i, nbEl, nbElSupMoy ;
    double somme ;
    double moyenne ;
    Scanner sc=new Scanner(System.in);
    System.out.print ("Combien d’eleves ") ;
    nbEl = sc.nextInt();
    double notes[] = new double[nbEl] ;
    for (i=0 ; i<nbEl ; i++)
    { System.out.print ("donnez la note numero " + (i+1) + " : " ) ;
        notes[i] = sc.nextDouble();
    }
    for (i=0, somme=0 ; i<nbEl ; i++) somme += notes[i] ;
    moyenne = somme / nbEl ;
    System.out.println ("\nmoyenne de la classe " + moyenne) ;
    for (i=0, nbElSupMoy=0 ; i<nbEl ; i++ )
        if (notes[i] > moyenne) nbElSupMoy++ ;
    System.out.println (nbElSupMoy + " eleves ont plus de cette moyenne") ;
}
}

