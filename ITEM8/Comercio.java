
/**
 * Write a description of class Comercio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comercio
{
    public static void main(String[] args )
    {
       Heladera samsungh1 = new Heladera("Samsung",2500,2,3,4,true);
       Cocina cocina = new Cocina("Samsung",250,5,5,2000,"5x2x4");
       
       cocina.imprimir(9,3.4);
       samsungh1.imprimir(6,2.53);
       Heladera lg2 = new Heladera("LG",2300,4,2,4,false);
       lg2.imprimir(6,2.45);
    }
}
