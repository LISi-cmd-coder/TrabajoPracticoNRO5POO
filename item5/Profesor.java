import java.util.ArrayList;

/**
 * Clase Profesor que hereda atributos y metodos de la clase persona 
 * 
 * @author Valenzuela Jose Lisandro
 * @version 11032002
 * 
 */
public class Profesor extends Persona
{
    private String titulo;
    private ArrayList<Cargo> listaCargos;
    private Cargo cargo;

    
     public Profesor(String p_apellido,String p_nombre,int p_dni,int p_anio,String p_titulo, ArrayList <Cargo>  p_cargo)
     {
         super(p_apellido,p_nombre,p_dni,p_anio);
         this.setTitulo(p_titulo);
         this.setCargos(p_cargo);
         
     }

     public Profesor(String p_apellido,String p_nombre,int p_dni,int p_anio,String p_titulo, Cargo  p_cargo)
     {
        super(p_apellido,p_nombre,p_dni,p_anio);
        this.setTitulo(p_titulo);
        this.setCargo(p_cargo);
        this.setCargos(new ArrayList<Cargo>());
     }
    private void setTitulo(String p_titulo){
        this.titulo=p_titulo;
    }
    private void setCargo(Cargo p_cargo)
    {
        this.cargo=p_cargo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    private void setCargos (ArrayList<Cargo>  p_cargos)
    {
        this.listaCargos=p_cargos;
    }
    public ArrayList <Cargo>  getCargos()
    {
        return this.listaCargos;
    }
    public Cargo getCargo()
    {
        return this.cargo;
    }
    
    
    
    public void mostrar()
    {
        super.mostrar();
    }

   public String mostrarLinea()
   {
      return "DNI: " +this.getDni()+ " Nombre: " + this.getNombre() + " \t Sueldo: $  "+ this.getCargo().getSalario();
   }

    public void listarCargos()
    {
        for(Cargo cargo: this.getCargos())
        {
            cargo.mostrarCargo();
        }
    }
    
    public void agregarCargo(Cargo nuevoCargo)
    {
        if(this.getCargos().size() <= 3){
            this.getCargos().add(nuevoCargo);
            
        }else{
            System.out.println("error! supero el maximo de cargos x PROFESOR");
        }
    }
    
    
    public boolean  eliminarCargo(Cargo  p_cargo)
    {
        if(this.getCargos().size() > 1 ){
          this.getCargos().remove(p_cargo);
          return true;
    }else{
        return false;
    } 
    } 
} 

