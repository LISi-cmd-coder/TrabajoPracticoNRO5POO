
/**
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Servicios
{
    
    private String descripcion;
    private double precio;

   
    public Servicios(String p_descripcion,double p_precio)
    {
       this.setDescripcion( p_descripcion);
       this.setPrecio( p_precio);
    }

    private void setDescripcion(String p_descrip)
    {
        this.descripcion=p_descrip;
    }
    private void setPrecio(double p_precio)
    {
        this.precio=p_precio;
    }
    public String getDescripcion()
    {
        return this.descripcion;
    }
    public double getPrecio()
    {
        return this.precio;
    }
//metodo que implemente para poder utilizar en la clase alojamiento a la hora de listar los servicios
    public void imprimir()
    {
        System.out.println("Descripcion: " + this.getDescripcion()+"\t Precio:$ " + this.getPrecio());
        System.out.println("\n");
    }
}
