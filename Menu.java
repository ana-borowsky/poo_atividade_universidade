import java.util.Scanner;

public class Menu {
    public static void imprimeMenuPrincipal(Scanner sc) {
        int option = 0;
        boolean loop = true;

        String MENU = "\n--- MENU ---"
                + "\n1. Disciplinas"
                + "\n2. Alunos"
                + "\n3. Professores"
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
                	imprimeMenuDisciplinas(sc);
                    loop = false; 
                    break;

                case 2:
                	imprimeMenuAlunos(sc);
                    loop = false;
                    break;
                
                case 3:
                	imprimeMenuProfessores(sc);
                    loop = false;
                    break;

                case 4:
                    System.out.println("Até mais!");
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 3.");
            }
        }
    }

    public static void imprimeMenuDisciplinas(Scanner sc) {
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
                	Disciplina.listaDisciplinas();
                    break;

                case 2:
                	imprimeMenuBuscaDisciplinas(sc);
                    break;

                case 3:
                	menuAlunosPorDisciplina(sc);
                    break;

                case 4:
                	imprimeMenuPrincipal(sc);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 4.");
            }
        }
    }

    public static void imprimeMenuAlunos(Scanner sc) { 
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
                	Aluno.listaAlunos();
                    break;

                case 2:
                	imprimeMenuBuscaAluno(sc);
                    break;

                case 3:
                	imprimeMenuPrincipal(sc);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 3.");
            }
        }
    }
    
    public static void imprimeMenuBuscaAluno(Scanner sc) { 
        int option = 0;
        boolean loop = true;

        String MENU_BUSCA_ALUNOS = "\n---- BUSCA DE ALUNOS ----"
        		+ "\n1. Por nome"
        		+ "\n2. Por número de matrícula"
        		+ "\n3. Voltar"
        		+ "\nSua escolha: ";

        while (loop) {
            System.out.println(MENU_BUSCA_ALUNOS);

            if (!sc.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                sc.next(); 
                continue;
            }

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                	Aluno.buscaAlunoPorNome(sc);
                    break;

                case 2:
                	Aluno.buscaAlunoPorMatricula(sc);
                    break;

                case 3:
                	imprimeMenuAlunos(sc);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 3.");
            }
        }
    }
    
    public static void imprimeMenuProfessores(Scanner sc) {
        int option = 0;
        boolean loop = true;

        String MENU_PROFESSORES = "\n--- PROFESSORES ---"
                + "\n1. Listar professores"
                + "\n2. Voltar"
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
                	Professor.listaProfessores(sc);
                    break;

                case 2:
                	imprimeMenuPrincipal(sc);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 2.");
            }
        }
    }
    
    
    public static void imprimeMenuBuscaDisciplinas(Scanner sc) { 
        int option = 0;
        boolean loop = true;

        String MENU_BUSCA_DISCIPLINA = "\n---- BUSCA DE DISCIPLINAS ----"
        		+ "\n1. Por nome"
        		+ "\n2. Por código"
        		+ "\n3. Voltar"
        		+ "\nSua escolha: ";

        while (loop) {
            System.out.println(MENU_BUSCA_DISCIPLINA);

            if (!sc.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                sc.next(); 
                continue;
            }

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                	Disciplina.buscaDisciplinaPorNome(sc);
                    break;

                case 2:
                	Disciplina.buscaDisciplinaPorCodigo(sc);
                    break;

                case 3:
                	imprimeMenuDisciplinas(sc);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 3.");
            }
        }
    }

    
    public static void menuAlunosPorDisciplina(Scanner sc) { 
        int option = 0;
        boolean loop = true;

        String MENU_BUSCA_ALUNOS = "\n---- LISTA DE ALUNOS ----"
        		+ "\n1. Por nome da disciplina"
        		+ "\n2. Pelo código da disciplina"
        		+ "\n3. Voltar"
        		+ "\nSua escolha: ";

        while (loop) {
            System.out.println(MENU_BUSCA_ALUNOS);

            if (!sc.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                sc.next(); 
                continue;
            }

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                	Disciplina.buscaAlunoPorNomeDisciplina(sc);
                    break;

                case 2:
                	Disciplina.buscaAlunoPorCodigoDisciplina(sc);
                    break;

                case 3:
                	imprimeMenuDisciplinas(sc);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 3.");
            }
        }
    }   
}
