
/**
 * Crea objetos que simulan comida.
 *
 * @author D4s1ns
 * @version 2018/02/23
 */
public class Comida {
    // El nombre de la comida.
    private String nombre;
    // Cantidad de calorias.
    private int calorias;
    
    /* CONSTRUCTORES */
    /**
     * Construye objetos comida.
     * Se asume que los valores pasados son validos.
     * @param nombre El nombre de la comida.
     * @param calorias La cantidad de calorias que tiene la comida.
     */
    public Comida(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }
    
    /* METODOS GETTER */
    /**
     * Devuelve el nombre de la comida.
     * @return Devuelve el nombre de la comida.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Devuelve la cantidad de calorias de la comida.
     * @return Devuelve la cantidad de calorias de la comida.
     */
    public int getCalorias() {
        return calorias;
    }
    
    /* METODOS SETTER */
    /**
     * Modifica el nombre de la comida.
     * @param nombre El nuevo nombre de la comida.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Modifica las calorias de la comida.
     * @param calorias La nueva cantidad de calorias de la comida.
     */
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    
    /* METODOS GENERALES */
    /**
     * Devuelve una cadena con toda la informacion de la comida.
     * @return Devuelve una cadena con toda la informacion de la comida.
     */
    public String toString() {
        return "Nombre: " + nombre + "Calorias: " + calorias;
    }
    
    /**
     * Muestra por terminal de texto la informacion de la comida.
     */
    public void mostrar() {
        System.out.println(this);
    }
    
}
