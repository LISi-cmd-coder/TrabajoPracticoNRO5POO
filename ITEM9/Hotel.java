
/**
 * Write a description of class Hotel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hotel extends Alojamiento
{
    // instance variables - replace the example below with your own
    private String tipoHabitacion;

   
    public Hotel(String p_nombre,double p_precio,int p_dias,String p_tipoHabitacion)
    {
        super(p_nombre, p_precio, p_dias);
        this.setTipoHabitacion(p_tipoHabitacion);
    }

    private void setTipoHabitacion(String p_tipoHabitacion)
    {
        this.tipoHabitacion=p_tipoHabitacion;
    }
    public String getTipoHabitacion()
    {
        return this.tipoHabitacion;
    }

    
    public double costo(String p_tipoHabitacion)
    {
        double costoSimple=super.costo();
       if("Single".equalsIgnoreCase(p_tipoHabitacion))
       {
            return (costoSimple+20)*this.getDiasAlquiler();
       }else if("Double".equalsIgnoreCase(p_tipoHabitacion))
       {
        return (costoSimple+30)*this.getDiasAlquiler();
       }
            return 0;//tipo de habitacion  no compatible
    }

   
    public int contar(String p_tipoHabitacion) {
        if (p_tipoHabitacion.equalsIgnoreCase(this.getTipoHabitacion())) {
            return 1; // Cuenta esta habitación si coincide con el tipo
        }
        return 0; // No cuenta si no coincide
    }
    
    public void liquidar() {
        double costoTotal = costo(this.getTipoHabitacion()); // Calcula el costo total
        System.out.println("Habitacion " + this.getTipoHabitacion() + "\nTotal: ------> $" + costoTotal);  // Formato de la liquidación
    }


}
