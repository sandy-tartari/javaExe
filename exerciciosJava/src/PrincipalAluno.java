public class PrincipalAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Brandamente Brasil",1585258,5,9);
        Aluno aluno2 = new Aluno("Radigunda Cercená",2254879,8,2);
        Aluno aluno3 = new Aluno("Vitimado José Araújo",85994,7,1);

        System.out.println("ALUNOS:");
        aluno1.imprimeInfo();
        aluno2.imprimeInfo();
        aluno3.imprimeInfo();


        aluno2.setNotaGrauA(9); 
        System.out.println("Nova nota GA de radigunda é: " + aluno2.getNotaGrauA());

        System.out.println("Média final de Radigunda é: " + aluno2.calculaMediaFinal());

        System.out.println("Mátricula de Vitimado é: " + aluno3.getMatricula());

        aluno1.setMatricula(1585228);
        System.out.println("A nova mátricula de Brandamente é: " + aluno1.getMatricula());

        aluno2.setNotaGrauB(Teclado.leDouble("Digite a nova nota Grau B: "));
        System.out.println("Nova nota de grau B de Radigunda: "+aluno2.getNotaGrauB());
    }
}   
