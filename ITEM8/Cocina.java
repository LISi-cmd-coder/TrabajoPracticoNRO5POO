
/**
 * Write a description of class Cocina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cocina extends ArtefactoHogar
{
    private int hornallas;
    private int calorias;
    private String dimensiones;
    public Cocina(String p_marca,int p_precio,int p_stock,int p_hornallas,int p_calorias,String p_dimen)
    {
        super(p_marca,p_precio,p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimen);
    }
    
    private void setHornallas(int p_hornallas)
    {
        this.hornallas=p_hornallas;
    }
    private void setCalorias(int p_calorias)
    {
        this.calorias=p_calorias;
    }
    private void setDimensiones(String p_dimensiones)
    {
        this.dimensiones=p_dimensiones;
    }
    public int  getHornallas()
    {
        return this.hornallas;
    }
    
    public String getDimensiones()
    {
        return this.dimensiones;
    }
    
    public int getCalorias()
    {
        return this.calorias;
    }
    
    public  float creditoConAdicional(int p_cuotas, double p_interes)
    {
        return (float)super.cuotaCredito(p_cuotas,p_interes);
    }
    
     /**
         * Imprime la información detallada sobre la cocina, incluyendo 
         * sus características y detalles del crédito.
         
         * @param p_cuotas Número de cuotas del crédito.
         * @param p_interes Tasa de interés aplicada al crédito.
         */
    
    public void imprimir(int p_cuotas,double interes)
    {   
        
        System.out.println("***COCINA***\n");
        super.imprimir();
        System.out.println("Hornallas: "+this.getHornallas());
        System.out.println("Calorias: "+ this.getCalorias());
        System.out.println("Dimensiones: "+ this.getDimensiones());
        System.out.println("cuota: "+p_cuotas + "\t- "+"Interés: " + interes);
        System.out.println("Valor cuota:$ " + super.cuotaCredito(p_cuotas,interes));
        System.out.println("Valor cuota adicional:$ "+ this.creditoConAdicional(p_cuotas,interes));
    }
    
}
