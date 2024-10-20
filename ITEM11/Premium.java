/**
 * Clase Premium que hereda de Etiqueta y representa una etiqueta de tipo premium.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Premium extends Etiqueta {
    // Atributo privado que almacena la cantidad de colores de la etiqueta premium
    private int colores;

    /**
     * Constructor de la clase Premium.
     * 
     * @param p_costo Costo base de la etiqueta.
     * @param p_color Cantidad de colores usados en la etiqueta.
     */
    public Premium(double p_costo, int p_color) {
        super(p_costo); // Llama al constructor de la clase base Etiqueta
        this.setColor(p_color); // Utiliza el método privado para asignar el color
    }

    public int getColores(){
        return this.colores;
    }
    /**
     * Método protegido que retorna el tipo de etiqueta.
     * 
     * @return El tipo de etiqueta como un String ("Premium").
     */
    protected String tipo() {
        return "Premium";
    }

    /**
     * Método privado para establecer la cantidad de colores de la etiqueta.
     * Este método encapsula el acceso al atributo colores.
     * 
     * @param p_color Cantidad de colores.
     */
    private void setColor(int p_color) {
        this.colores = p_color;
    }

    /**
     * Método público para calcular el precio total de las etiquetas.
     * Utiliza la cantidad de unidades, el costo base y el adicional por colores.
     * 
     * @param cantidad Cantidad de etiquetas solicitadas.
     * @return El precio total de las etiquetas premium.
     */
    public double precio(int cantidad) {
        // Calcula el precio total con el costo base y el adicional
        double precioBase = super.getCosto() * cantidad;
        return precioBase + this.adicional(precioBase);
    }

    /**
     * Método privado para calcular el costo adicional según la cantidad de colores.
     * El cálculo sigue la siguiente lógica:
     * - 1 color: 0% adicional.
     * - 2 colores: 5% adicional.
     * - 3 colores: 7% adicional.
     * - Más de 3 colores: 7% + 3% por cada color adicional.
     * 
     * @param precioBase El precio base sin adicionales.
     * @return El costo adicional calculado.
     */
    private double adicional(double precioBase) {
        double porcentajeAdicional = 0.0;

        // Determinar el porcentaje de adicional según la cantidad de colores
        if (colores == 1) {
            porcentajeAdicional = 0.0;
        } else if (colores == 2) {
            porcentajeAdicional = 5.0;
        } else if (colores == 3) {
            porcentajeAdicional = 7.0;
        } else if (colores > 3) {
            porcentajeAdicional = 7.0 + ((this.getColores() - 3) * 3.0);
        }

        // Retorna el monto adicional basado en el porcentaje y el precio base
        return precioBase * (porcentajeAdicional / 100);
    }
}
