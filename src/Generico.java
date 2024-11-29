
public class Generico {
    //Ejemplo basico de genericos
    public <Z, A> A mostrar(Z nota, A nota2){
        System.out.println("Esta es la clase del generico : " + nota.getClass());
        return nota2;
    }
}
