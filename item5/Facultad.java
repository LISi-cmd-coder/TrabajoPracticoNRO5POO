import java.util.ArrayList;

public class Facultad
{
  private String nombre;
  private ArrayList <Profesor> profesores;
  private Profesor profe;
  public Facultad (String p_nombre,Profesor p_profe)
  {
    this.setName(p_nombre);
    this.setUnProfe(p_profe);
    this.setProfesores(new ArrayList <Profesor>());
  }

    public Facultad (String p_nombre,ArrayList<Profesor> p_profes)
  {
    this.setName(p_nombre);
    this.setProfesores(p_profes);
  }

private void setName(String p_nombre)
{
    this.nombre=p_nombre;
}

private void setUnProfe(Profesor p_profe)
{
    this.profe=p_profe;
}

private void setProfesores(ArrayList <Profesor>p_profes)
{
    this.profesores=p_profes;
}

public String getName()
{
    return this.nombre;
} 
public Profesor getProfesor()
{
    return this.profe;
}

public ArrayList <Profesor> getProfesores()
{
  return this.profesores;
}

  public void nominaProfesores()
  {
    for(Profesor profes : this.getProfesores())
    {
        System.out.println(profes.mostrarLinea());
    }
  }
  
 
  /**
 * Calcula el total a pagar en salarios a todos los profesores de la facultad.
 * 
 * Este método itera sobre la lista de profesores de la facultad y llama al método 
 * sueldoCargos() de cada profesor, el cual se encarga de calcular el sueldo total 
 * asociado a sus cargos. El total acumulado se suma a la variable sueldoTOTAL, 
 * que se devuelve al final.
 * 
 * @return El monto total a pagar en salarios a todos los profesores de la facultad.
 * 
 * @see Profesor.sueldoCargos() Método que calcula el sueldo total de los cargos 
 *                               asignados a un profesor.
 */
  
  
  public double totalAPagar()
  {
    double sueldoTOTAL=0;
    for(Profesor profes : this.getProfesores())
    {
       sueldoTOTAL += profes.sueldoCargos();
    }
    return sueldoTOTAL;
  }
  
  
  /**
 * Lista los profesores y los cargos que tienen asignados en la facultad.
 * 
 * Este método recorre la lista de profesores de la facultad, mostrando los datos 
 * de cada uno de ellos, así como los cargos que tienen asignados. Para cada profesor, 
 * se llama a su método mostrar() para visualizar la información del profesor, 
 * y luego se itera sobre su lista de cargos, llamando al método mostrarCargo() 
 * de cada cargo para mostrar los detalles correspondientes.
 * 
 * Si un profesor no tiene cargos asignados, no se mostrará ningún cargo para ese profesor.
 * 
 * @see Profesor#mostrar() Muestra la información del profesor
 * @see Cargo#mostrarCargo() Muestra los detalles del cargo
 */
  public void listarProfesorCargos()
  {
    System.out.println("***** Detalle de Profesores y cargos de Facultad:  "+this.getName()+"*****");
    for(Profesor profes : this.getProfesores())
    {
        profes.mostrar();
       for(Cargo cargo: profes.getCargos())
    {
        cargo.mostrarCargo();
    }

  }
  System.out.println("TOTAL A PAGAR:$ " + this.totalAPagar());
}







}
