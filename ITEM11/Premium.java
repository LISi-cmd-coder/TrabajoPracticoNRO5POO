
/**
 * Write a description of class Premium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Premium extends Etiqueta
{
    // instance variables - replace the example below with your own
    private int colores;
    

    /**
     * Constructor for objects of class Premium
     */
    public Premium(double p_costo,int p_color)
    {
       super(p_costo);
       this.setColor(p_color);
    }
    
   protected  String tipo(){
       return "Premium";
   }
    
    private void setColor(int p_color){
        this.colores =p_color;
    }
    
    public double precio(int q)
    {
        return (double) super.getCosto()*q;
    }
    private double adicional()
    {
        
    }


}
