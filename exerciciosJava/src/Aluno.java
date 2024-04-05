public class Aluno {
    private String nome;
    private int matricula;
    private double notaGrauA, notaGrauB;
    public Aluno(String nome, int matricula, double notaGrauA, double notaGrauB) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaGrauA = notaGrauA;
        this.notaGrauB = notaGrauB;
    }

    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return  matricula;
    }
    public double getNotaGrauA() {
        return notaGrauA;
    }
    public double getNotaGrauB() {
        return notaGrauB;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setNotaGrauA(double notaGrauA) {
        this.notaGrauA = notaGrauA;
    }
    public void setNotaGrauB(double notaGrauB) {
        this.notaGrauB = notaGrauB;
    }

    public double calculaMediaFinal() {
        return (notaGrauA * 0.33) +  (notaGrauB * 0.67);
    }
    
    public void  imprimeInfo() {
        System.out.println("Nome aluno: " + nome);
        System.out.println("Matrícula aluno: " + matricula);
        System.out.println("Nota Grau A: " + notaGrauA);
        System.out.println("Nota Grau B: " + notaGrauB);
        System.out.println("A sua média foi: " + calculaMediaFinal());
    }

}
