
/**
 * Write a description of class SemiExclusivo here.
 * 
 * @author Lisandro Valenzuela
 * @version 11032002
 */
public class SemiExclusivo extends Cargo
{
  private  int horasdeInvestigacion;

  public SemiExclusivo (String p_nombre, double p_salario,  int p_anioIngreso,int p_horasDeDocencia,int p_horasdeInvestigacion)
  {
    super(p_nombre, p_horasdeInvestigacion, p_anioIngreso, p_horasDeDocencia);
    this.setHorasdeInvestigacion(p_horasdeInvestigacion);
  }
  private void setHorasdeInvestigacion(int p_horas)
  {
    this.horasdeInvestigacion=p_horas;
  }

  public int getHorasDeInvestigacion(){
    return this.horasdeInvestigacion; 
  }  //@override
  public void mostrarCargo()
  {
    super.mostrarCargo();
    System.out.println("Este es un cargo Semi exclusivo");
  }
}
