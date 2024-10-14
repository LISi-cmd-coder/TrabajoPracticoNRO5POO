
/**
 * Write a description of class ArtefactoHogar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ArtefactoHogar
{
   private String marca;
   private int precio;
   private int stock;
   
   public ArtefactoHogar(String p_marca,int p_precio, int p_stock){
          this.setMarca(p_marca);
          this.setPrecio(p_precio);
          this.setStock(p_stock);
    }  
    
   private void setMarca(String p_marca){
        this.marca=p_marca;
    }
   private void setPrecio(int p_precio)
   {
       this.precio=p_precio;
   }
   private void setStock(int p_stock){
       this.stock=p_stock; 
   }
   
   public String getMarca()
   {
       return this.marca;
   }
   public int getPrecio()
   {
       return this.precio;
   }
   public int getStock()
   {
       return this.stock;
   }
   
   public abstract float creditoConAdicional(int p_cuotas, double p_interes); 
   
   
   public  float cuotaCredito(int p_cuotas, double p_interes)
   {
       return (float)(this.getPrecio() + p_interes) / p_cuotas;
   }
   public void imprimir()
   {
        System.out.println("Marca: "+ this.getMarca()+"\t Precio: "+this.getPrecio()+ "\t Stock: " + this.getStock()+"\n");    
   }
   
   
   
   
}

