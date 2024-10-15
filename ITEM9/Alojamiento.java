import java.util.ArrayList;

/**
 * Write a description of class Alojamiento here.
 * 
 * @author Valenzuela Lisandro
 * @version 11032002
 */
public abstract class  Alojamiento
{
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList <Servicios> servicios;
    public Alojamiento(String p_nom,double p_precioBase,int p_dias)
    {
        this.setNombre(p_nom);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquier(p_dias);
        this.setServicios(new ArrayList<Servicios>());//SE INICIALIZA EL ARRAY IGUAL POR MAS QUE ESTE VACIO

    }

    public Alojamiento(String p_nom,double p_precioBase,int p_dias,ArrayList <Servicios> p_servicios)
    {
        this.setNombre(p_nom);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquier(p_dias);
        this.setServicios(p_servicios);

    }

    private void setServicios(ArrayList<Servicios> p_servicios)
    {
        this.servicios=p_servicios;
    }
    private void setNombre(String p_nombre)
    {
        this.nombre=p_nombre;
    }
    private void setPrecioBase(double p_precioBase)
    {
        this.precioBase=p_precioBase;
    }
    private void setDiasAlquier(int dias)
    {
        this.diasAlquiler=dias;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public double getPrecioBase()
    {
        return this.precioBase;
    }
    public int getDiasAlquiler()
    {
        return this.diasAlquiler;
    }
    public ArrayList<Servicios> getServicios()
    {
        return this.servicios;
    }


    /**
 * Agrega un servicio a la lista de servicios de la instancia actual.
 * 
 * Este método verifica si el servicio proporcionado es válido (no nulo) antes de 
 * agregarlo a la lista de servicios. Si el servicio es nulo, no se realiza ninguna 
 * acción y se devuelve `false`. En caso contrario, el servicio es añadido y 
 * se retorna `true` como confirmación.
 *
 * @param p_servicio el objeto de tipo Servicios que se desea agregar.
 * @return true si el servicio fue agregado con éxito, false si el servicio es nulo.
 */

    public boolean agregarServicio(Servicios p_servicio)
    {
        if(p_servicio!=null)
        {
            this.getServicios().add(p_servicio);
            return true;
        }else
        {
            return false;
        }
    }


 /**
 * Elimina un servicio de la lista de servicios de la instancia actual.
 * 
 * Este método verifica si la lista de servicios no es nula y si el servicio proporcionado 
 * no es nulo. Si ambos son válidos, intenta eliminar el servicio y retorna `true` si la 
 * eliminación fue exitosa (es decir, si el servicio estaba en la lista). Si el servicio 
 * no estaba presente o si la lista o el servicio son nulos, retorna `false`.
 *
 * @param p_Servicio el objeto de tipo Servicios que se desea eliminar.
 * @return true si el servicio fue encontrado y eliminado, false en caso contrario.
 */
public boolean eliminarServicio(Servicios p_Servicio)
{
    if (this.getServicios() != null && p_Servicio != null) {
        return this.getServicios().remove(p_Servicio); // Devuelve true si se eliminó
    }
    return false; // Devuelve false si la lista o el servicio son nulos
}

/**
 * Cuenta y retorna un valor numérico basado en el tipo de alojamiento dado.
 * 
 * Este método debe ser implementado por las subclases, según su lógica de conteo.
 *
 * @param p_alojamiento el tipo de alojamiento a contar.
 * @return el número relacionado con el alojamiento.
 */

   public abstract int contar(String p_alojamiento);

   /**
 * Calcula el costo total del alquiler.
 * 
 * El costo se obtiene multiplicando el precio base del alquiler por la cantidad 
 * de días de alquiler.
 *
 * @return el costo total del alquiler.
 */
   public double costo()
   {
    return this.getPrecioBase() * this.getDiasAlquiler();
   }

/**
 * Lista e imprime los servicios asociados a la instancia actual.
 * 
 * Este método recorre la lista de servicios y llama al método `imprimir()` 
 * de cada objeto `Servicios` para mostrar la información de cada servicio.
 */


   public void listarServicios()
   {
        for(Servicios servicios : this.getServicios())
        {
            servicios.imprimir();
        }
   }


   /**
 * Calcula el costo total de todos los servicios asociados.
 * 
 * Recorre la lista de servicios y suma el precio de cada uno para obtener 
 * el costo total de los servicios.
 *
 * @return el costo total de los servicios.
 */
   public double costoServicios()
   {
       double laplatuca=0;
       for (Servicios servicios: this.getServicios())
       {
            laplatuca+=servicios.getPrecio();
       }
       return laplatuca;
   }

   public double total()
   {
        double costoServicios=this.costoServicios();
        double precioAlquiler=this.costo();

        return costoServicios+precioAlquiler;
   }
   public void liquidar()
   {
       
        System.out.println("Alojamiento: "+ this.getNombre());
        System.out.println("Costo por: " + this.getDiasAlquiler() +" dias:$ " + this.costo());
        this.listarServicios();

   }

}
    