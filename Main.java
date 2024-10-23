import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        System.out.println("Central de Matrículas");

        // Criando alunos
        ArrayList<Aluno> alunos = new ArrayList<>();
        String[] nomesAlunos = {
            "Ana Silva", "Carlos Souza", "Beatriz Oliveira", "João Santos", "Mariana Lima",
            "Lucas Costa", "Fernanda Rodrigues", "Ricardo Ferreira", "Julia Pereira", "Gustavo Almeida",
            "Camila Martins", "Pedro Melo", "Larissa Carvalho", "Thiago Rocha", "Isabela Cunha",
            "Felipe Duarte", "Renata Fonseca", "Gabriel Teixeira", "Roberta Farias", "André Barros"
        };
        for (int i = 0; i < nomesAlunos.length; i++) {
            Aluno aluno = new Aluno();
            aluno.setNome(nomesAlunos[i]);
            aluno.setNumeroMatricula("MAT" + (i + 1));
            aluno.setCursando(i % 2 == 0); 
            alunos.add(aluno);
        }

        // Criando disciplinas
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        String[] nomesDisciplinas = {
            "Matemática", "Física", "Química", "História", "Biologia"
        };
        String[] codigosDisciplinas = {
            "MAT101", "FIS102", "QUI103", "HIS104", "BIO105"
        };
        for (int i = 0; i < nomesDisciplinas.length; i++) {
            Disciplina disciplina = new Disciplina();
            disciplina.nome = nomesDisciplinas[i];
            disciplina.codigo = codigosDisciplinas[i];
            disciplina.ativa = i % 2 == 0; 
            disciplinas.add(disciplina);
        }

      
        ArrayList<Professor> professores = new ArrayList<>();
        String[] nomesProfessores = {
            "Prof. Maria", "Prof. João", "Prof. Letícia", "Prof. Eduardo", "Prof. Roberta"
        };
        String[] codigosRH = {
            "RH001", "RH002", "RH003", "RH004", "RH005"
        };
        String[] titulos = {
            "Doutora", "Mestre", "Doutora", "Doutor", "Mestre"
        };
        for (int i = 0; i < nomesProfessores.length; i++) {
            Professor professor = new Professor();
            professor.setNome(nomesProfessores[i]);
            professor.setCodigoRH(codigosRH[i]);
            professor.setTitulo(titulos[i]);
            professor.setDisciplina(disciplinas.get(i)); 
            disciplinas.get(i).setProfessor(professor); 
            professores.add(professor);
        }

      
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            for (int j = 0; j < disciplinas.size(); j++) {
                if (i % (j + 1) == 0) { 
                    aluno.adicionarDisciplina(disciplinas.get(j));
                }
            }
        }

       
        imprimeMenuPrincipal(sc, alunos, disciplinas, professores);
        sc.close();
 }

    public static void imprimeMenuPrincipal(Scanner sc, ArrayList<Aluno> alunos, ArrayList<Disciplina> disciplinas, ArrayList<Professor> professores) {
        int option = 0;
        boolean loop = true;

        String MENU = "\n--- MENU ---"
                + "\n1. Disciplinas"
                + "\n2. Professores"
                + "\n3. Alunos"
                + "\n4. Sair"
                + "\nDigite a opção desejada: ";

        while (loop) {
            System.out.println(MENU);

            if (!sc.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                sc.next(); 
                continue;
            }

            option = sc.nextInt();
            sc.nextLine(); 

            switch (option) {
                case 1:
                    imprimeMenuDisciplinas(sc, disciplinas); 
                    loop = false; 
                    break;

                case 2:
                	imprimeMenuProfessores(sc, professores);
                    loop = false; 
                    break;

                case 3:
                	imprimeMenuAlunos(sc, alunos); 
                    loop = false;
                    break;

                case 4:
                    System.out.println("Até mais!");
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 4.");
            }
        }
    }

    public static void imprimeMenuDisciplinas(Scanner sc, ArrayList<Disciplina> disciplinas) {
        int option = 0;
        boolean loop = true;

        String MENU_DISCIPLINAS = "\n--- DISCIPLINAS ---"
                + "\n1. Listar disciplinas"
                + "\n2. Buscar disciplinas"
                + "\n3. Listar Alunos"
                + "\n4. Voltar"
                + "\nDigite a opção desejada: ";

        while (loop) {
            System.out.println(MENU_DISCIPLINAS);

            if (!sc.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                sc.next(); 
                continue;
            }

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\nLista de Disciplinas:");
                    for (Disciplina disciplina : disciplinas) {
                        String nomeProfessor = (disciplina.getProfessor() != null) ? disciplina.getProfessor().getNome() : "Sem Professor";
                        System.out.println("\t - " + disciplina.nome + " - Código: " + disciplina.codigo + " - Ativa: " + disciplina.ativa + " - Professor: " + nomeProfessor);
                    }
                    break;

                case 2:
                    System.out.println("Buscar disciplinas");
                    loop = false; 
                    break;

                case 3:
                    System.out.println("Listar alunos por disciplina");
                    loop = false; 
                    break;

                case 4:
                	imprimeMenuPrincipal(sc, null, disciplinas, null);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 4.");
            }
        }
    }

    public static void imprimeMenuAlunos(Scanner sc, ArrayList<Aluno> alunos) {
        int option = 0;
        boolean loop = true;

        String MENU_ALUNOS = "\n--- ALUNOS ---"
                + "\n1. Listar alunos"
                + "\n2. Buscar alunos"
                + "\n3. Voltar"
                + "\nDigite a opção desejada: ";

        while (loop) {
            System.out.println(MENU_ALUNOS);

            if (!sc.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                sc.next(); 
                continue;
            }

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Lista de Alunos:");
                    for (Aluno aluno : alunos) {
                        System.out.println("\t - " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula() + " - Cursando: " + aluno.isCursando());
                    }
                    break;

                case 2:
                    System.out.println("Buscar alunos");
                    loop = false; 
                    break;

                case 3:
                	imprimeMenuPrincipal(sc, alunos, null, null);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 3.");
            }
        }
    }

    public static void imprimeMenuProfessores(Scanner sc, ArrayList<Professor> professores) {
        int option = 0;
        boolean loop = true;

        String MENU_PROFESSORES = "\n--- PROFESSORES ---"
                + "\n1. Listar professores"
                + "\n2. Buscar professores"
                + "\n3. Voltar"
                + "\nDigite a opção desejada: ";

        while (loop) {
            System.out.println(MENU_PROFESSORES);

            if (!sc.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                sc.next(); 
                continue;
            }

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\nLista de Professores:");
                    for (Professor professor : professores) {
                        System.out.println("\t - " + professor.getNome() + " - Código RH: " + professor.getCodigoRH() + " - Título: " + professor.getTitulo());
                    }
                    break;

                case 2:
                    System.out.println("Buscar professores");
                    loop = false; 
                    break;

                case 3:
                	imprimeMenuPrincipal(sc, null, null, professores);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 3.");
            }
        }
    }
}
