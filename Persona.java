
/**
 * Crea objetos que simulan personas.
 *
 * @author d4s1ns
 * @version 2018/02/23
 */
public class Persona {
    // El nombre de la persona.
    private String nombre;
    // Genero de la persona. [Verdadero] para mujer, [falso] para hombre.
    private boolean sexo;
    // Peso(kg).
    private int peso;
    // Altura(cm).
    private int altura;
    // Edad (anos).
    private int edad;
    // Calorias ingeridas.
    private int caloriasIngeridas;
    // Calorias maximas.
    private int maxCalorias;
    
    /* CONSTRUCTORES */
    /**
     * Construye objetos persona.
     * Se asume que se pasan valores validos.
     * @param nombre El nombre de la persona.
     * @param sexo El genero biologico de la persona.
     * El valor [Verdadero] indica una mujer.
     * [Falso] indica un hombre.
     * @param peso El peso de la persona expresada kilogramos.
     * @param altura La altura de la persona expresada en centimetros.
     * @param edad La edad de la persona en anos.
     */
    public Persona(String nombre, boolean sexo, int peso, int altura, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        caloriasIngeridas = 0;
        // Calculo metabolismo basal
        maxCalorias = (10 * peso) + (6 * altura) + (5 * edad);
        maxCalorias = (sexo)?maxCalorias + 5 : maxCalorias - 161; 
    }
    
    /* METODOS GETTER */
    /**
     * Devuelve el nombre de la persona.
     * @return Devuelve el nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Devuelve el genero biologico de la persona. [Verdadero] para mujer, [Falso] para hombre.
     * @return Devuelve el genero biologico de la persona. [Verdadero] para mujer, [Falso] para hombre.
     */
    public boolean getSexo() {
        return sexo;
    }
    
    /**
     * Devuelve el peso en kg de la persona.
     * @return Devuelve el peso en kg de la persona.
     */
    public int getPeso() {
        return peso;
    }
    
    /**
     * Devuelve la altura en cm de la persona.
     * @return Devuelve la altura en cm de la persona.
     */
    public int getAltura() {
        return altura;
    }
    
    /**
     * Devuelve la edad en anos de la persona.
     * @return Devuelve la edad en anos de la persona.
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Devuelve las calorias ingeridas hasta el momento.
     * @return Devuelve las calorias ingeridas hasta el momento.
     */
    public int getCaloriasIngeridas() {
        return caloriasIngeridas;
    }
    
    /* METODOS SETTER */
    /**
     * Modifica el nombre de la persona.
     * @param nombre El nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Modifica el genero biologico de la persona.
     * @param sexo [Verdadero] para una mujer, [Falso] para un hombre.
     */
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    /**
     * Modifica el peso de la persona.
     * @param peso El nuevo peso de la persona expresado en kg.
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    /**
     * Modifca la altura de la persona.
     * @param altura La nueva altura de la persona expresada en cm.
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    /**
     * Modifica la edad de la persona.
     * @param edad La nueva edad de la persona expresada en anos.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /* METODOS GENERALES */
    /**
     * Devuelve una cadena con toda la informacion de la persona.
     * @return Devuelve una cadena con toda la informacion de la persona.
     */
    public String toString() {
        String sexo = (this.sexo)?"Mujer":"Hombre";
        return "Nombre: " + nombre + "Sexo: " + sexo + "Peso: " + peso + "Altura :" + altura + "Edad :" + edad;
    }
    
    /**
     * Muestra por terminal de texto la informacion de la persona.
     */
    public void mostrar() {
        System.out.println(this);
    }
    
    /**
     * Da de comer la comida especificada por parametro a esta persona. 
     * Devuelve la cantidad de calorias consumidas en esa comida o -1 en caso de que no la coma.
     * @param comida La comida que se quiere que coma la persona.
     * @return Devuelve la cantidad de calorias consumidas en esa comida.
     * Si no ha ingerido nada, devuelve -1.
     */
    public int comer(Comida comida) {   
        int caloriasIngeridas = comida.getCalorias();
        if(this.caloriasIngeridas > maxCalorias) {
            caloriasIngeridas = -1;
        }
        else {
            this.caloriasIngeridas += caloriasIngeridas;
        }
        return caloriasIngeridas;
    }
    
}
