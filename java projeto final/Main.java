// import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("**Tuc Tuc v12 \n**");
        
        Cliente cliente = new cliente("Luuy poha loca", "luuy.cachorro@gmail.com", "61982824145", "", rg_cnh, dtNascimento, genero, senhaLogin, nomeUsuario, situacao);
            prof.armazenar();
            // prof.setNome("Andre");
            // prof.setIdade(20);
            // prof.setEmail("prof@gmail.com");
            // prof.setSexo("M");
            // prof.setDisciplina("Analise Dev Sis");
            // prof.setSalario(5000);

        Aluno a = new Aluno("Antoio", 34, "toin@senac.df", "M", 0202, "Tec Dev Sistema");
            a.armazenar();
            // a.setNome("Toin");
            // a.setIdade(34);
            // a.setMatricula(33218181);
            // a.setEmail("toin@gmail.com");
            // a.setSexo("M");
            // a.atualizarCurso("Tec Dev Sist");
            
        // Aluno a1 = new Aluno();
        //     a1.setNome("Dionisio");
        //     a1.setIdade(28);
        //     a1.setMatricula(3524);
        //     a1.setEmail("dionisio@gmail.com");
        //     a1.setSexo("M");
        //     a1.atualizarCurso("Tec Dev Sist");

        // Aluno a2 = new Aluno();
        //     a2.setNome("Souza");
        //     a2.setIdade(31);
        //     a2.setMatricula(1254);
        //     a2.setEmail("Souza@gmail.com");
        //     a2.setSexo("M");
        //     a2.atualizarCurso("Tec Dev Sist");

        Colaborador severino = new Colaborador("Tonhao", 65, "tonhao@severino.senac.com", "M", "Severino", 1420);
        Colaborador severino1 = new Colaborador("Lurdes", 48, "lurdes@severino.senac.com", "F", "Tia da Merenda", 1720);
        severino.armazenar();
        severino1.armazenar();

        
        // array Alunos
        ArrayList<Aluno> alunos = new ArrayList<>();
            alunos.add(a);
            // alunos.add(a1);
            // alunos.add(a2);

        // array funcionario
        ArrayList<Colaborador> severinos = new ArrayList<>();
            severinos.add(severino);
            severinos.add(severino1);
            String str = "";

                for (Colaborador colaborador : severinos) {
                    str += "\n" + colaborador.exibirDados();
                }                

        Curso c = new Curso();
            c.setNome("Tec Desenvolvimento de Sistema");
            c.setAlunos(alunos);
            c.setProfessor(prof);


        // System.out.println("**Aluno**");
        // String alunoDados = a.exibirDados();
        // System.out.println(alunoDados);

        // System.out.println("\n");

        // System.out.println("**Professor**");
        // String dados = prof.exibirDados();
        // System.out.println(dados);

        System.out.println("**Curso**");
        String dadosCursos = c.exibirCurso();
        String dadosCursos1 = prof.exibirDados();
        System.out.println(dadosCursos);
        System.out.println(dadosCursos1);
        System.out.println();
        System.out.println(str);
    }
}

// a.setNome("Antonio");
// a.setIdade(34);
// a.setMatricula(123);
// a.setCurso("ADS");

// Professor pro = new Professor();
// pro.setNome("Andre");
// pro.setDisciplina("Analise e Desenvolvimento de Sistema");
// pro.setSalario(4877);

// System.out.println( "Nome: " + a.getNome()                      + '\n' + 
//                     "Matricula: " + a.getMatricula()            + '\n' +
// "_____________________");

// a.exibeDados();