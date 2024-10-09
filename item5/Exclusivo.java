
/**
 * Write a description of class Exclusivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exclusivo extends Cargo
{
    private  int horasdeInvestigacion;
    private  int horasDeExtension;


    public Exclusivo (String p_nombre, double p_salario,  int p_anioIngreso,int p_horasDeDocencia,int p_horasExten,int p_horasdeInvestigacion)
    {
      super(p_nombre, p_horasdeInvestigacion, p_anioIngreso, p_horasDeDocencia);
      this.setHorasdeInvestigacion(p_horasdeInvestigacion);
      this.setHorasDeExtension(p_horasExten);
    }
    private void setHorasdeInvestigacion(int p_horas)
    {
      this.horasdeInvestigacion=p_horas;
    }
    private void setHorasDeExtension(int p_horas)
    {
        this.horasDeExtension=p_horas;
    }
    public int getHorasExtension()
    {
        return this.horasDeExtension;
    }
    public int getHorasDeInvestigacion(){
      return this.horasdeInvestigacion; 
    } 
     
   //@override
    public void mostrarCargo()
    {
      super.mostrarCargo();
      System.out.println("Este es un cargo Exclusivo");
    }
}
