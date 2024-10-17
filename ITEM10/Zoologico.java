import java.util.ArrayList;

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
   
   public void nuevoVisitante(Visitante p_nuevoVisitante)
   {
        if(this.getListaVisitantes()!=null && p_nuevoVisitante!=null){
            this.getListaVisitantes().add(p_nuevoVisitante);
        }else{System.out.println("ERROR!!");}
    }
   public boolean quitarVisitante(Visitante p_visitante)
   {
        if(this.getListaVisitantes()!=null && p_visitante!=null){
            return this.getListaVisitantes().remove(p_visitante);
        }else{return false;}
   }
   
   
   
   
       

   
}
