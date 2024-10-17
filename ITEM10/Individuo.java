import java.util.Calendar;
import java.util.HashSet;


/**
 * Write a description of class Individuo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Individuo extends Visitante
{
    private Persona persona;


    public Individuo(String p_nombre,Calendar p_fecha, Persona p_Persona)
    {
        super(p_nombre, p_fecha);
        this.setPersona(p_Persona);
    }
    //setters
    private void setPersona(Persona p_persona)
    {
            this.persona=p_persona;
    }
    public Persona getPersona()
    {
        return this.persona;
    }

    public String tipoVisitante()
    {
        return super.getNombre();
    }

/**
 * Lista los detalles de un visitante si coincide con la fecha de visita 
 * y el tipo de visitante especificado.
 *
 * Este método compara el tipo de visitante del objeto actual con el 
 * tipo de visitante proporcionado y verifica si la fecha de visita 
 * coincide con la fecha dada. Si ambas condiciones son verdaderas, 
 * se llama al método `mostrar()` para presentar la información del visitante.
 *
 * @param p_fecha La fecha con la que se comparará la fecha de visita.
 * @param p_visitante El tipo de visitante que se desea verificar.
 */
    public void listarPorFecha(Calendar p_fecha, String p_visitante)
    {
        Calendar fechaVisita= super.getFecha(); 
        if(this.tipoVisitante().equalsIgnoreCase(p_visitante) && p_fecha.compareTo(fechaVisita)==0)
        {
            this.mostrar();
        }
    }
    /*no entendi este punto */
    public HashSet<Persona> listarPersonas()
    {
        HashSet <Persona> personas= new HashSet<>();
        return personas;
    }
    public void mostrar()
    {
        this.getPersona().mostrar();
    }
    
    public double entrada()
    {
        return 10.0;
    }

}
