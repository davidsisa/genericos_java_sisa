public class Computador <A> {

    private A tipo ;

    public Computador(A tipo) {
        this.tipo = tipo;
    }

    public A getTipo() {
        return tipo;
    }

    public void setTipo(A tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Computador = " + tipo.toString();
    }

    

}
