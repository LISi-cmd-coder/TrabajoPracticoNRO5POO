
import java.util.Calendar;
/**
 * Write a description of class Cargo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cargo 
{
   private String nombreCargo;
   private double sueldoBasico;
   private int anioIngreso;
   private int horasDeDocencia;
   
   public Cargo(String p_NombreCargo,double p_sueldo,int p_anioIngreso,int horasDocencia)
   {
        this.setNombre(p_NombreCargo);
        this.setSueldo(p_sueldo);
        this.setIngreso(p_anioIngreso);
        this.setHorasDocencia(horasDocencia);
        
   }
   
   private void setNombre(String p_nombre)
   {    
       this.nombreCargo=p_nombre;
    
   }
   private void setSueldo(double p_sueldo)
   {
       this.sueldoBasico=p_sueldo;
   }
   private void setIngreso(int p_anio)
   {
       this.anioIngreso=p_anio;
   }
   private void setHorasDocencia(int p_horas)
   {
       this.horasDeDocencia= p_horas;
   }

   public int getAnioIngreso()
   {
    return this.anioIngreso;
   }
   public String getNombreCargo()
   {
    return this.nombreCargo;
   }
   public int getHorasDeDocencia()
   {
        return this.horasDeDocencia;
   }
   public double getSalario()
   {
        return this.sueldoBasico;
   }

   public int antiguedad()
   {
      int anio = Calendar.getInstance().get(Calendar.YEAR);
      return anio-this.getAnioIngreso();
   }

   /**
 * Calcula el sueldo total de un empleado sumando un adicional por antigüedad.
 * El adicional es del 1% del salario básico por cada año de antigüedad.
 *
 * @return El sueldo total que incluye el salario básico más el adicional por antigüedad.
 */

  public double adicionalXAntiguedad()
  {
    double adicional= this.getSalario()* 0.01 *this.antiguedad();
    return this.getSalario() + adicional; 
  }

  public void mostrarCargo()
 {
     System.out.println(" "+this.getNombreCargo() + " - Sueldo Basico:$  "  + this.getSalario()+"\t" +"Sueldo cargo: " + this.adicionalXAntiguedad()+"\t Antiguedad: " + this.antiguedad() + "Años"+"\n");
     System.out.println("Horas de docencia: "+ this.getHorasDeDocencia());
}
 
  
}
  



