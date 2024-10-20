
/**
 * Write a description of class Renglon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Renglon
{
    private int cantidad;
    private double importe;
    private Etiqueta item;
    public Renglon(Etiqueta p_item,int p_cantidad, double p_importe){
            this.setItem(p_item);
            this.setCantidad(p_cantidad);
            this.setImporte(p_importe);
    }
    
    private void setItem(Etiqueta p_item){
        this.item=p_item;
    }
      private void setCantidad(int p_cantidad){
        this.cantidad=p_cantidad;
    }
     private void setImporte(double p_importe){
        this.importe=p_importe;
    }
    
    public Etiqueta getItem(){
        return this.item;
    }
    public double getImporte(){
        return this.importe;
    }
    public int getCantidad(){
        return this.cantidad;
    }
       /**
     * Método para mostrar los detalles del renglón.
     * Muestra la cantidad de etiquetas, el tipo, el costo y, si es Premium, la cantidad de colores.
     */
    public void mostrar() {
        // Usamos el getter para obtener la etiqueta (item)
        Etiqueta etiqueta = this.getItem(); 
        String tipoEtiqueta = etiqueta.tipo(); // Obtener el tipo de etiqueta (Premium o Comun)
        double costoEtiqueta = etiqueta.getCosto(); // Obtener el costo de la etiqueta
        String detalles = cantidad + " Etiquetas de tipo " + tipoEtiqueta + " - Costo: $" + costoEtiqueta;

        // Si el item es de tipo Premium, mostrar también la cantidad de colores
        if (etiqueta instanceof Premium) {
            Premium etiquetaPremium = (Premium) etiqueta; // Casting a Premium
            detalles += " - Colores: " + etiquetaPremium.getColores(); // Obtener cantidad de colores
        }

        // Imprimir los detalles del renglón
        System.out.println(detalles);
    }
    
    
    
}
