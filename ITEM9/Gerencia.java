import java.util.ArrayList;

/**
 * Write a description of class Gerencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gerencia 
{
    // instance variables - replace the example below with your own
    private String nombre;
    private ArrayList<Alojamiento> Listaalojamientos;
    private Alojamiento alojamiento;
    public Gerencia(Alojamiento p_alojamiento,String p_nombre)
    {
        this.setNombre(p_nombre);
        this.setAlojamiento(p_alojamiento);
        this.setListaAlojamientos(new ArrayList<Alojamiento>());//inicializa el array en 0.
    }
    
    public Gerencia(String p_nombre)
    {
        this.setNombre(p_nombre);
        this.setListaAlojamientos(new ArrayList<Alojamiento>());
    }
    
    public Gerencia (ArrayList<Alojamiento> p_Listaalojamientos,String p_nombre){
        this.setNombre(p_nombre);
        this.setListaAlojamientos(p_Listaalojamientos);
    }
    //setters
    private void setNombre(String p_nombre)
    {
        this.nombre=p_nombre;
    }
    private void setAlojamiento(Alojamiento p_aloja)
    {
        this.alojamiento=p_aloja;
    }
    private void setListaAlojamientos(ArrayList <Alojamiento> p_Alojamientos)
    {
        this.Listaalojamientos=p_Alojamientos;
    }
    //gettters
    public ArrayList <Alojamiento> getListaAlojamientos()
    {
        return this.Listaalojamientos;
    }

    public String getNombre()
    {
        return this.nombre;
    }


    public boolean agregarAlojamiento(Alojamiento p_alojamiento)
    {
        if(p_alojamiento!=null && this.getListaAlojamientos()!=null)
        {
           return  this.getListaAlojamientos().add(p_alojamiento);
           
        }else
        {
            return false;
        }
    }
    public boolean quitarAlojamiento(Alojamiento p_Alojamiento)
    {
        if (p_Alojamiento!=null && this.getListaAlojamientos()!=null) 
        {
           return  this.getListaAlojamientos().remove(p_Alojamiento);
        }else
        {
            return false;
        }
    }

    /**
 * Método que cuenta la cantidad de alojamientos cuyo nombre coincide con el tipo de alojamiento especificado.
 * La comparación del nombre se realiza de manera insensible a mayúsculas y minúsculas.
 *
 * @param tipoAlojamiento El nombre del tipo de alojamiento que se desea contar.
 * @return El número de alojamientos que coinciden con el tipo especificado.
 *
 * - Se inicializa un contador en 0.
 * - Se recorre la lista de alojamientos.
 * - Se compara el nombre del alojamiento con el tipoAlojamiento.
 * - Si coinciden, se incrementa el contador.
 * - Finalmente, se retorna el valor del contador.
 */


    public int  contarAlojamiento(String tipoAlojamiento)
    {
       int contador=0;
       for(Alojamiento alojamiento: this.getListaAlojamientos())
       {
            if(alojamiento.getNombre().equalsIgnoreCase(tipoAlojamiento))
            {
                contador++;
            }

       }
       return contador;
    }
    public void mostrarLiquidacion()
    {
        for (Alojamiento alojamiento:this.getListaAlojamientos())
        {
            alojamiento.liquidar();
        }
    }
    
}
