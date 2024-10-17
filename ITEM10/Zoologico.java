noimport java.util.ArrayList;

public class Zoologico
{
   private String nombre;
   private ArrayList <Visitante> visitantes;

   public Zoologico(String p_nombre)
   {
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList<Visitante>());
   }
   

   private void setNombre(String p_nombre)
   {
      this.nombre=p_nombre;
   }
   private void setVisitantes(ArrayList<Visitante> p_lVisitantes)
   {
      this.visitantes=p_lVisitantes;
   }


   public  String getNombre()
   {
      return this.nombre;
   }
   public ArrayList<Visitante> getListaVisitantes()
   {
     return this.visitantes;
   }



   /**
 * Agrega un nuevo visitante a la lista de visitantes.
 *
 * Este método verifica que la lista de visitantes no sea nula y que el visitante 
 * a agregar también sea válido. Si ambas condiciones se cumplen, se añade el 
 * nuevo visitante a la lista. En caso contrario, se imprime un mensaje de error.
 *
 * @param p_nuevoVisitante El visitante que se desea agregar a la lista.
 */
   public void nuevoVisitante(Visitante p_nuevoVisitante)
   {
        if(this.getListaVisitantes()!=null && p_nuevoVisitante!=null){
            this.getListaVisitantes().add(p_nuevoVisitante);
        }else{System.out.println("ERROR!!");}
    }

 /** Elimina un visitante de la lista de visitantes.
 *
 * Este método verifica que la lista de visitantes no sea nula y que el visitante 
 * a eliminar sea válido. Si ambas condiciones se cumplen, se intenta eliminar 
 * el visitante de la lista. Devuelve true si el visitante fue eliminado 
 * exitosamente y false en caso contrario o si las condiciones no se cumplen.
 *
 * @param p_visitante El visitante que se desea eliminar de la lista.
 * @return true si el visitante fue eliminado; false si la lista es nula, 
 *         el visitante es nulo o no se pudo eliminar.
 */

   public boolean quitarVisitante(Visitante p_visitante)
   {
        if(this.getListaVisitantes()!=null && p_visitante!=null){
            return this.getListaVisitantes().remove(p_visitante);
        }else{return false;}
   }

   /**
 * Calcula la recaudación total de entradas en un período de fechas específico.
 *
 * Este método itera a través de la lista de visitantes y suma el total de entradas 
 * vendidas entre las fechas proporcionadas. Solo se consideran las entradas de los 
 * visitantes cuya fecha se encuentra entre p_fechaDesde y p_fechaHasta.
 *
 * @param p_fechaDesde La fecha de inicio del período de recaudación.
 * @param p_fechaHasta La fecha de fin del período de recaudación.
 * @return El total de dinero recaudado en el período especificado.
 */
   public double recaudacion(Calendar p_fechaDesde,Calendar p_fechaHasta)
   {
      double dinerPeriodo=0;
      for(Visitante visitante :this.getListaVisitantes())
      {
            if(visitante.getFecha().after(p_fechaDesde) && visitante.getFecha().before(p_fechaHasta))
            {
               dineroPeriodo+= visitante.entrada();
            }      
      }
      return dineroPeriodo;
   }
   
   public void listarTipoVisitante(Calendar p_fecha,String tipo_visitante)
   {
      for(Visitante visitante : this.getListaVisitante())
      {
        visitante.listarPorFecha(p_fecha,tipo_visitante);
      }
      
   }

   public void listarPorFecha(Calendar p_fecha)
   {
      for (Visitante visitante : this.getListaVisitante())
      {
         if(visitante.getfecha().compareTo(p_fecha)==0)
         {
            visitante.mostrar();
         }
      }
   }

   public HashSet<Persona> listaPersonasVisitaronElZoo()
   {
      HashSet<Persona> listaPersona = new HashSet<>();
      for(Individuo unIndividuo: this.getListaVisitantes())
      {
          listaPersona.add(unIndividuo.listarPersona());

      }
     return lista persona;

   }
       

   
}
