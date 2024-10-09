public class Facultad
{
  private String nombre;
  private ArrayList <Profesor> profesores;
  private Profesor profe;
  public Facultad (String p_nombre,Profesor p_profe)
  {
    this.setName(p_nombre);
    this.setUnProfe(p_profe)
    this.setProfesores(new ArrayList <Profesor>())
  }

    public Facultad (String p_nombre,<Profesor> p_profes)
  {
    this.setName(p_nombre);
    this.setProfesores(p_profes)
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
    this.profesores=profes;
}
s
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
        profes.mostrarLinea();
    }
  }
  public double totalAPagar()
  {
    double sueldoTOTAL;
    for(Profesor profes : this.getProfesores())
    {
        sueldoTOTAL+= profes.getSueldoBasico();
    }
    return sueldoTOTAL;
  }
  public void listarProfesorCargos()
  {
    System.out.println("***** Detalle de Profesores y cargos de Facultad:  *****"+this.getName());
    for(Profesor profes : this.getProfesores())
    {
        profes.mostrar();
        profes.listaCargos();

    }

  }







}
