
/**
 * Write a description of class CajaAhorro here.
 * 
 * @author (lisandro Valenzueal) 
 * @version 11032002
 */
public class CajaAhorro extends CuentaBancaria
{
    // instance variables - replace the example below with your own
    private int extraccionesPosibles;  

    /**
     * Constructor for objects of class CajaAhorro
     */
    public CajaAhorro(int p_nroCuenta,double p_saldo,Persona p_persona)
    {
        super(p_nroCuenta,p_saldo,p_persona);
        this.setExtraccionesPosi(10);
    }

    //setters
    private void setExtraccionesPosi(int p_extra)
    {
        this.extraccionesPosibles=p_extra;
    }
    public int getExtraccionesPos()
    {
        return  this.extraccionesPosibles;
    }
    /**
     * 
     * @override
    */
    public boolean puedeExtraer(double p_importe)
    {
        return super.puedeExtraer(p_importe) && this.getExtraccionesPos() > 0;
    }
   public void extraer(double p_importe) {
    if (this.puedeExtraer(p_importe)) {
        super.extraer(p_importe); // Llama al método de la superclase para realizar la extracción
        this.setExtraccionesPosi(this.getExtraccionesPos()-1); // Decrementa el número de extracciones posiblesd
    } else {
        System.out.println("NO ES POSIBLE EXTRAER!");
    }
}
    public void mostrar(){
        super.mostrar();
        System.out.println("CANTIDAD DE EXTRACCIONES DISPONIBLES: "+this.getExtraccionesPos());
    }
}
