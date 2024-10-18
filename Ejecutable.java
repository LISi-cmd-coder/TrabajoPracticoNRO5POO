import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Write a description of class Ejecutable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejecutable
{
    public static void main()
    {
      
        
        Calendar fecha = Calendar.getInstance();
        // Establecer la fecha 22/09/2024
        // Meses en Calendar comienzan en 0, por lo que septiembre es el mes 8 (0 es enero, 1 es febrero, etc.)
        fecha.set(2024, Calendar.SEPTEMBER, 22);
        
        Persona persona = new Persona("Valenzuela","Lisandro",43268917,2002);
        Persona persona1 = new Persona("Valenzuela","Vanesa",40996960,1998);
        Persona persona2 = new Persona ("Ledesma","Marta",20089493,1968);
    
        
        Individuo indi1 = new Individuo("Individuo", fecha, persona);
        Individuo indi2 = new Individuo("Delegacion",fecha,persona1);
        Individuo indi3 = new Individuo("Delegacion",fecha,persona2);
        
        Delegacion pami = new Delegacion("Pami",fecha);
        
        pami.inscribirIndiviuos(indi1);
        pami.inscribirIndiviuos(indi2);
        
        Zoologico  ElCaribu = new Zoologico("El caribu");
        
        ElCaribu.nuevoVisitante(pami);
         ElCaribu.nuevoVisitante(indi3);
        //ElCaribu.listarPorFecha(fecha);
        ElCaribu. listarTipoVisitante( fecha,"Delegacion");
        
        
}}