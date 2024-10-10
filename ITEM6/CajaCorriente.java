
/**
 * Write a description of class CajaCorriente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CajaCorriente extends CuentaBancaria
{
    // instance variables - replace the example below with your own
    private double limiteDescubierto ;

    /**
     * Constructor for objects of class CajaCorriente
     */
    public CajaCorriente(int p_nroCuenta,double p_saldo,Persona p_persona)
    {
       super(p_nroCuenta,p_saldo,p_persona);
       this.setLimite(500.0);
    }

    private void setLimite(double p_limite)
    {
        this.limiteDescubierto=p_limite;
    }
   public double getLimite()
   {
       return this.limiteDescubierto;
   }
   public boolean puedeExtraer(double p_importe)
   {
       return this.getSaldo()+this.getLimite()> p_importe;
   }
   
   public void extraer(double p_importe){
     if(this.puedeExtraer(p_importe)==true){
       super.extraer(p_importe);
     }else{
        System.out.println("Error. importe sobrepasa el limite!");
    }
   }
   
   
}

