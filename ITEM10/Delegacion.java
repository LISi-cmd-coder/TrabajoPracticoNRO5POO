import java.util.ArrayList;
import java.util.Calendar;

import java.util.HashSet;

/**
 * Write a description of class Delagacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Delegacion extends Visitante
{
   private ArrayList <Individuo> listaIndivuos;
   public Delegacion(String p_nombre,Calendar p_fecha)
   {
      super(p_nombre,p_fecha);
      this.setListaIndivuos(new ArrayList<Individuo>());
   }

   private void setListaIndivuos(ArrayList<Individuo> p_listaIndivuos)
   {  
         this.listaIndivuos=p_listaIndivuos;
   }
   public ArrayList<Individuo> getListaIndividuos()
   {
      return this.listaIndivuos;
   }

   public String  tipoVisitante()
   {
      return super.getNombre();
   }

   public void inscribirIndiviuos(Individuo p_individuo)
   {
      if (p_individuo!=null && this.getListaIndividuos()!=null) {
         this.getListaIndividuos().add(p_individuo);
      }else{
         System.out.println("ERROR!!!!");
      }
   }

   public boolean quitarIntegrante(Individuo p_Individuo)
   {
      if (this.getListaIndividuos()!=null && p_Individuo!=null) {
        this.getListaIndividuos().remove(p_Individuo);
        return true;
      }else
      {
         return false;
      }
   }

   /**
 * Calcula la cantidad total de individuos en la lista.
 * 
 * @return el número total de individuos.
 */
   public int cantidadIntegrantes()
   {
      int contarCantidad=0; // Inicializa el contador de individuos.
       // Recorre la lista de individuos
      for(Individuo individuos: this.getListaIndividuos())
      {
      // Por cada individuo encontrado en la lista, incrementa el contador en 1.
         contarCantidad+=1;

      }
    // Retorna la cantidad total de individuos.
      return contarCantidad;
   }

   public void  mostrar()
   {
      for(Individuo individuo : this.getListaIndividuos())
      {
         individuo.mostrar();
      }
      System.out.println("Cantidad de integrantes: "+ this.cantidadIntegrantes());
   }

   /**
 * Calcula el monto total de la entrada para todos los individuos, aplicando un descuento del 10%.
 * 
 * @return el monto total de entradas después de aplicar el descuento.
 */
   public double entrada()
   {
      double sumaTotal=0;// Inicializa la variable para almacenar la suma total de las entradas.
      double porcentaje=0; // Variable para almacenar el 10% de la suma total.

        // Recorre la lista de individuos
      for(Individuo individuo:this.getListaIndividuos())
      {
       // Suma la entrada de cada individuo al total.
         sumaTotal+= individuo.entrada();
      }

       // Calcula el 10% de la suma total.
      porcentaje = sumaTotal*10/100;
     
       // Retorna la suma total menos el 10%, es decir, con el descuento aplicado.
      return sumaTotal-porcentaje; 
   }

  
      public HashSet<Persona> listarPersonas() {
         HashSet<Persona> personas = new HashSet<>();
 
         // Recorre la lista de individuos
         for (Individuo individuo : this.getListaIndividuos()) {
             // Añadir las personas del individuo al HashSet (sin duplicados)
             personas.addAll(individuo.listarPersonas());
         }
 
         return personas; // Devuelve el HashSet con todas las personas de la delegación
     }

      public boolean esMismaFecha(Calendar p_Calendar1,Calendar p_Calendar2)
     {
        return p_Calendar1.compareTo(p_Calendar2==0);
     }

   
     /*otra forma mucho mas compleja de comparar dos fechas.
     public boolean esMismaFecha(Calendar p_Calendar1,Calendar p_Calendar2)
     {
         return p_Calendar1.get(Calendar.YEAR)==p_Calendar2.get(Calendar.YEAR) && 
         p_Calendar1.get(Calendar.MONTH)== p_Calendar2.get(Calendar.MONTH)
          && p_Calendar1.get(Calendar.DAY_OF_MONTH)==p_Calendar2.get(Calendar.DAY_OF_MONTH);
     };
     */



     public void listarPorFecha(Calendar p_fecha, String p_visitante) {
      // Recorremos cada Individuo en la delegación
      for (Individuo individuo : this.getListaIndividuos()) {
          // Verificamos si el tipo de visitante y la fecha coinciden
          if (individuo.tipoVisitante().equalsIgnoreCase(p_visitante) 
              && esMismaFecha(individuo.getFecha(), p_fecha)) {
              
              // Si coinciden, mostramos los datos del individuo
              individuo.mostrar();
          }
      }
  }


}  
