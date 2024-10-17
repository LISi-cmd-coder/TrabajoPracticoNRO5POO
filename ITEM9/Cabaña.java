
/**
 * Write a description of class Cabaña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cabaña extends Alojamiento
{
    // instance variables - replace the example below with your own
    private int nroHabitaciones;

    /**
     * Constructor for objects of class Cabaña
     */
    public Cabaña(String p_nombre,double p_precio,int p_dias,int p_nroHabitaciones)
    {
       super(p_nombre,p_precio,p_dias);
       this.setNroHabitaciones(p_nroHabitaciones);
    }

   
    private void setNroHabitaciones(int y)
    {
        this.nroHabitaciones=y;
    }
    public int getNroHabitaciones()
    {
        return this.nroHabitaciones;
    }
    @Override
   public  double costo()
   {
        double costoSimple=super.costo();
        double costoXhabitacion=this.getNroHabitaciones()*30*this.getDiasAlquiler();

        return costoSimple+costoXhabitacion;
   }
 
   
 /**
 * Cuenta el número de habitaciones de la cabaña si el tipo de alojamiento 
 * proporcionado coincide con "Cabaña", ignorando mayúsculas y minúsculas.
 * 
 * Este método utiliza `equalsIgnoreCase` para comparar el argumento `p_alojamiento` 
 * de manera que no distinga entre letras mayúsculas y minúsculas. Esto significa que 
 * el método devolverá el número de habitaciones si el argumento es "Cabaña", "cabaña", 
 * "CABAÑA" o cualquier otra combinación de capitalización. Si el argumento no coincide, 
 * el método devolverá 0.
 *
 * @param p_alojamiento el tipo de alojamiento a contar.
 * @return el número de habitaciones si `p_alojamiento` coincide con "Cabaña" en 
 *         cualquier combinación de mayúsculas y minúsculas, o 0 si no coincide.
 */
@Override
public int contar(String p_alojamiento)
{
    if ("Cabaña".equalsIgnoreCase(p_alojamiento)) {
        return this.nroHabitaciones;
    }
    return 0;
}

public void liquidar()
{
    super.liquidar();
    System.out.println("Cabaña con "+this.getNroHabitaciones()+"habitaciones");
    System.out.println("TOTAL-------> $ " + this.costo());
}



}
