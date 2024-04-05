public class Fruta {
    private String nome;
    private double preco;

    public static void main(String[] args) {
        Fruta f = new Fruta("maça",3.99);
        String fruta = f.getNome();
        System.out.println("O nome da fruta é: " + fruta);
        double preco = f.getPreco();
        System.out.println("O preco da fruta é: " + preco);
        double imposto = 0.1;
        System.out.println("O preco da fruta com impostos é: " + f.calculaPreco(imposto));
    }

    public Fruta(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double calculaPreco(double imposto){
        return preco + (preco * imposto);
    }
}
