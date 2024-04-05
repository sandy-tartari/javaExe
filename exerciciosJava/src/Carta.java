public class Carta { // clase
    private String naipe; // atributo
    private int valor; // atributo
    private char simbolo; // atributo

    public static void main(String[] args) {
        Carta c = new Carta("matheus", 23, '3');
        String naipe = c.getNaipe();
        System.out.println(naipe);
        int valor = c.getValor();
        System.out.println(valor);
        c.setSimbolo('2');
        char simbolo = c.getSimbolo();
        System.out.println(simbolo);
    }

    public Carta(String naipe, int valor, char simbolo) { // construtor
        this.naipe = naipe;
        this.valor = valor;
        this.simbolo = simbolo;
        // this referencia o objeto
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }
}
