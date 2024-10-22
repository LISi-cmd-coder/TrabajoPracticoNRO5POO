
/**
 * Write a description of class Etiqueta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Etiqueta
{
   private double costo;
   
   
    public Etiqueta (double p_costo){
       this.setCosto(p_costo);
   }
   
   public abstract  double precio(int q );
   public  String toString()
   {
       return "$ "+ this.getCosto();
   }
   protected abstract String tipo();
   
  
   private void setCosto(double p_costo){
        this.costo=p_costo;
   }
   
   public double getCosto()
   {
       return this.costo;
   }
   
   
   
   
   
   
   
}
