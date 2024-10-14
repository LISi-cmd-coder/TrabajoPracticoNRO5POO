
/**
 * Write a description of class Heladera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heladera extends ArtefactoHogar
{
    private int puertas;
    private int pies;
    private boolean compresor;
    
    public Heladera(String p_marca,int p_precio,int p_stock,int p_puertas,int p_pies,boolean p_tieneono)
    {
        super( p_marca, p_precio,p_stock);
        this.setPuertas(p_puertas);
        this.setPies(p_pies);
        this.setCompresor(p_tieneono);
    }
    private void setPuertas(int p_puertas)
    {
       this.puertas=p_puertas;
    }
    
    private void setPies(int p_pies)
    {
        this.pies=p_pies;
    }
    private void setCompresor(boolean p_compresor){
        this.compresor=p_compresor;
    }
    
  
    public boolean getCompresor()
    {
        return this.compresor;
    }
    public int getPuertas()
    {
        return this.puertas;
    }
    
    public int  getPies()
    {
        return this.pies;
    } 
    
    
    public float creditoConAdicional(int p_cuotas, double p_interes)
    {
        if(getCompresor()==true)
        {
            return (float)super.cuotaCredito(p_cuotas,p_interes) + 50; 
        }else
        {
            return (float)super.cuotaCredito(p_cuotas,p_interes);
        }
    }
    //habia otra forma de hacer esto, pero no recuerdo como,asi  que queda como tarea mejorar este metodo.
    public String tieneCompresorOno()
    {
        if(this.getCompresor()==true)
        {
            return "Si";
        }else{
            return "No";
        }
    }
    
     /**
         * Imprime la información detallada sobre el lavaropas, incluyendo 
         * sus características y detalles del crédito.
         
         * @param p_cuotas Número de cuotas del crédito.
         * @param p_interes Tasa de interés aplicada al crédito.
         */
    public void imprimir(int p_cuotas,double interes)
    {   
        
        System.out.println("***HELADERA***\n");
        super.imprimir();
        System.out.println("Pies: " +this.getPies());
        System.out.println("Puertas: "+ this.getPuertas());
        System.out.println("Compresor: " + this.tieneCompresorOno());
        System.out.println("cuota: "+p_cuotas+ "\t- "+"Interés: " + interes);
        System.out.println("Valor cuota:$ " + super.cuotaCredito(p_cuotas,interes));
        System.out.println("Valor cuota adicional:$ "+ this.creditoConAdicional(6,interes)); 
    }
}
