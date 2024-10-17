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
    
    public void listarPorFecha(Calendar p_fecha, String p_visitante)
    {
        
        //me parece la forma mas sensata de comparar fechas pero el calendar solo tambien tiene hora..............
        Calendar fechaVisita= super.getFecha(); 
        if(this.tipoVisitante().equalsIgnoreCase(p_visitante) && p_fecha.equals(fechaVisita))
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
