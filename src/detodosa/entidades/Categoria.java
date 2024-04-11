
package detodosa.entidades;

public class Categoria {
    private int codigo;
    private String nombre;

    public Categoria() {
    }

    public Categoria(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String toString(){
        return nombre;
    }
    
    @Override
    public boolean equals(Object obj) {
    // verifica si el objeto pasado es nulo
    if (obj == null) {
        return false;
    }
    
    // verifica si el objeto pasado es una instancia de Categoria
    if (!(obj instanceof Categoria)) {
        return false;
    }
   
    Categoria otraCategoria = (Categoria) obj;
    
    // Comparar los atributos relevantes para ver si sojn iguales si es asi retorna true
    return this.nombre.equals(otraCategoria.nombre) && this.codigo == otraCategoria.codigo;
}
    
}
