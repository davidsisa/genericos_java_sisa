public class Componentes {
    private String nombre;
    private int modelo;
    private String marca;

    
    public Componentes(String nombre, int modelo, String marca) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca =  marca;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "Componentes [nombre=" + nombre + ", modelo=" + modelo + ", marca=" + marca + "]";
    }
    

   
    
}
