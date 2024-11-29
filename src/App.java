public class App {

    
    public static void main(String[] args) throws Exception {
        //Ejemplo 1
        Generico generar = new Generico();
        final Integer result = generar.mostrar(2, 3);
        System.out.println(result);

        //Ejemplo 2
        Componentes componente = new  Componentes( "Procesador",931,"Intel Core I4");
        Computador<Componentes> computador1 = new Computador<>(componente);
        System.out.println(computador1);

        //Ejemplo3
        GenericoII<String, Double> genericoDoble = new GenericoII<>("Zomer", 25.0);
        System.out.println(genericoDoble);
    
    }
}
