
/**
 * 
 *Al observar las dos clases CajaDeAhorro y CajaCorriente, se pueden ver varias características similares 
 *que podrían generalizarse para reutilizar código. (AMBAS TIENES LOS MISMOS ATRIBUTOS)
 *
 * Cree una clase (superclase) llamada CuentaBancaria, la cual encapsula los atributos y comportamientos en comun deCajaDeAhorro y CajaCorriente,
 *y luego hacer que tanto CajaDeAhorro como CajaCorriente hereden de esta clase padre 
 *  
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaBancaria
{
   private int nro_cuenta;
   protected double saldo;
   private Persona persona ;//relacion de asociacion con clase Persona.
   
   public CuentaBancaria(int p_nroCuenta,double p_saldo, Persona p_persona)
   {
       this.setNroCuenta(p_nroCuenta);
       this.setSaldo(p_saldo);
       this.setPersona(p_persona);
   }
   
   //setters
   private void setNroCuenta(int p_nro)
   {
       this.nro_cuenta=p_nro;
   }
   protected void setSaldo(double p_saldo)
   {
       this.saldo=p_saldo;
   }
   private void setPersona(Persona p_persona)
   {
      this.persona=p_persona; 
   }
   //getters
  
   public int getNroCuenta() 
   {
       return this.nro_cuenta;
   }
   
   public double getSaldo()
   {
       return this.saldo;
   }
   public Persona getTitular(){
       return this.persona;
   }
   
   public boolean puedeExtraer(double p_importe){
       if(p_importe <= this.getSaldo())
       {
           return true;
       }else{
           return false;
        }
   }
   
   public void extraer(double p_importe) 
   {
       if(this.puedeExtraer(p_importe)==true)
       {
           this.setSaldo(this.getSaldo()-p_importe);
       }else
       {
           System.out.println("SALDO INSUFICIENTE!");
       }
   }
   public void depositar(double p_importe){
       this.setSaldo(this.getSaldo()+p_importe);
       
       
   }
   
   public void mostrar(){ 
    
       System.out.println("Nro de cuenta: "+ this.getNroCuenta()+"- Saldo:$ "+ this.getSaldo());
       
       
   }
   
   
}
