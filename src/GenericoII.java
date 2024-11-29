public class GenericoII <Z, A>{
    private Z valor1;
    private A valor2;
    
    public GenericoII(Z valor1, A valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    public Z getValor1() {
        return valor1;
    }
    public void setValor1(Z valor1) {
        this.valor1 = valor1;
    }
    public A getValor2() {
        return valor2;
    }
    public void setValor2(A valor2) {
        this.valor2 = valor2;
    }
    @Override
    public String toString() {
        return "GenericoII [valor1=" + valor1 + ", valor2=" + valor2 + "]";
    }
    
}
