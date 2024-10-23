import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        System.out.println("Central de Matrículas");

        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno1 = new Aluno(); aluno1.setNome("Ana Silva"); aluno1.setNumeroMatricula("001"); aluno1.setCursando(true); alunos.add(aluno1);
        Aluno aluno2 = new Aluno(); aluno2.setNome("Carlos Souza"); aluno2.setNumeroMatricula("002"); aluno2.setCursando(false); alunos.add(aluno2);
        Aluno aluno3 = new Aluno(); aluno3.setNome("Beatriz Oliveira"); aluno3.setNumeroMatricula("003"); aluno3.setCursando(true); alunos.add(aluno3);
        Aluno aluno4 = new Aluno(); aluno4.setNome("João Santos"); aluno4.setNumeroMatricula("004"); aluno4.setCursando(true); alunos.add(aluno4);
        Aluno aluno5 = new Aluno(); aluno5.setNome("Mariana Lima"); aluno5.setNumeroMatricula("005"); aluno5.setCursando(true); alunos.add(aluno5);
        Aluno aluno6 = new Aluno(); aluno6.setNome("Lucas Costa"); aluno6.setNumeroMatricula("006"); aluno6.setCursando(true); alunos.add(aluno6);
        Aluno aluno7 = new Aluno(); aluno7.setNome("Fernanda Rodrigues"); aluno7.setNumeroMatricula("007"); aluno7.setCursando(true); alunos.add(aluno7);
        Aluno aluno8 = new Aluno(); aluno8.setNome("Ricardo Ferreira"); aluno8.setNumeroMatricula("008"); aluno8.setCursando(true); alunos.add(aluno8);
        Aluno aluno9 = new Aluno(); aluno9.setNome("Julia Pereira"); aluno9.setNumeroMatricula("009"); aluno9.setCursando(true); alunos.add(aluno9);
        Aluno aluno10 = new Aluno(); aluno10.setNome("Gustavo Almeida"); aluno10.setNumeroMatricula("010"); aluno10.setCursando(true); alunos.add(aluno10);
       

        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        Disciplina disciplina1 = new Disciplina(); disciplina1.nome = "Performance em Sistemas Ciberfísicos"; disciplina1.codigo = "CB010"; disciplina1.ativa = true; disciplinas.add(disciplina1);
        Disciplina disciplina2 = new Disciplina(); disciplina2.nome = "Experiência Criativa"; disciplina2.codigo = "EC789"; disciplina2.ativa = true; disciplinas.add(disciplina2);
        Disciplina disciplina3 = new Disciplina(); disciplina3.nome = "Segurança da Informação"; disciplina3.codigo = "SI576"; disciplina3.ativa = true; disciplinas.add(disciplina3);
        Disciplina disciplina4 = new Disciplina(); disciplina4.nome = "Clínica TIC"; disciplina4.codigo = "CT108"; disciplina4.ativa = true; disciplinas.add(disciplina4);
        Disciplina disciplina5 = new Disciplina(); disciplina5.nome = "Programação Orientada a Objetos"; disciplina5.codigo = "PO102"; disciplina5.ativa = true; disciplinas.add(disciplina5);
      
        ArrayList<Professor> professores = new ArrayList<>();
        Professor professor1 = new Professor(); professor1.setNome("Marina"); professor1.setCodigoRH("RH001"); professor1.setTitulo("Mestre"); professor1.setDisciplina(disciplina1); disciplina1.setProfessor(professor1); professores.add(professor1);
        Professor professor2 = new Professor(); professor2.setNome("Alison"); professor2.setCodigoRH("RH002"); professor2.setTitulo("Mestre"); professor2.setDisciplina(disciplina2); disciplina2.setProfessor(professor2); professores.add(professor2);
        Professor professor3 = new Professor(); professor3.setNome("Andrey"); professor3.setCodigoRH("RH003"); professor3.setTitulo("Mestre"); professor3.setDisciplina(disciplina3); disciplina3.setProfessor(professor3); professores.add(professor3);
        Professor professor4 = new Professor(); professor4.setNome("Jonathan"); professor4.setCodigoRH("RH004"); professor4.setTitulo("Mestre"); professor4.setDisciplina(disciplina4); disciplina4.setProfessor(professor4); professores.add(professor4);
        Professor professor5 = new Professor(); professor5.setNome("Pedro"); professor5.setCodigoRH("RH005"); professor5.setTitulo("Mestre"); professor5.setDisciplina(disciplina5); disciplina5.setProfessor(professor5); professores.add(professor5);
      
        disciplina1.adicionarAluno(aluno10);
        disciplina1.adicionarAluno(aluno1);
        disciplina1.adicionarAluno(aluno9);
        disciplina1.adicionarAluno(aluno4);
        disciplina1.adicionarAluno(aluno5);
        
        disciplina2.adicionarAluno(aluno10);
        disciplina2.adicionarAluno(aluno2);
        disciplina2.adicionarAluno(aluno6);
        disciplina2.adicionarAluno(aluno8);
        disciplina2.adicionarAluno(aluno7);
        
        disciplina3.adicionarAluno(aluno10);
        disciplina3.adicionarAluno(aluno2);
        disciplina3.adicionarAluno(aluno6);
        disciplina3.adicionarAluno(aluno3);
        disciplina3.adicionarAluno(aluno7);
        
        disciplina4.adicionarAluno(aluno10);
        disciplina4.adicionarAluno(aluno2);
        disciplina4.adicionarAluno(aluno6);
        disciplina4.adicionarAluno(aluno3);
        disciplina4.adicionarAluno(aluno7);
        
        disciplina5.adicionarAluno(aluno1);
        disciplina5.adicionarAluno(aluno2);
        disciplina5.adicionarAluno(aluno6);
        disciplina5.adicionarAluno(aluno8);
        disciplina5.adicionarAluno(aluno5);
       
        imprimeMenuPrincipal(sc, alunos, disciplinas, professores);
        sc.close();
 }

    public static void imprimeMenuPrincipal(Scanner sc, ArrayList<Aluno> alunos, ArrayList<Disciplina> disciplinas, ArrayList<Professor> professores) {
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
                	imprimeMenuDisciplinas(sc, disciplinas, alunos);
                    loop = false; 
                    break;

                case 2:
                	imprimeMenuAlunos(sc, alunos, disciplinas, professores);
                    loop = false;
                    break;
                
                case 3:
                	imprimeMenuProfessores(sc, alunos, disciplinas, professores);
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

    public static void imprimeMenuDisciplinas(Scanner sc, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos) {
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
                        System.out.print("\t - " + disciplina.nome + " - Código: " + disciplina.codigo + " - Professor: " + nomeProfessor +" - Status: ");
                        disciplina.isAtiva();
                        System.out.println(); 
                    }
                    break;

                case 2:
                    System.out.println("Buscar disciplinas");
                    loop = false; 
                    break;

                case 3:
                	buscaAlunosPorDisciplina(sc, disciplinas, alunos);
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

    public static void imprimeMenuAlunos(Scanner sc, ArrayList<Aluno> alunos, ArrayList<Disciplina> disciplinas, ArrayList<Professor> professores) { 
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
                        System.out.print("\t - " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula() + " - status: ");
                        aluno.isCursando(); 
                        System.out.println(); 
                    }
                    break;

                case 2:
                	buscaAluno(sc, alunos); 
                    break;

                case 3:
                	imprimeMenuPrincipal(sc, alunos, disciplinas, professores);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 3.");
            }
        }
    }
    
    public static void imprimeMenuProfessores(Scanner sc, ArrayList<Aluno> alunos, ArrayList<Disciplina> disciplinas, ArrayList<Professor> professores) { 
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
                    System.out.println("Lista de Professores:");
                    for (Professor professor : professores) {
                        System.out.println("\t - " + professor.getNome() + " - Código: " + professor.getCodigoRH() + " - Titularidade: " + professor.getTitulo());
                    }
                    break;

                case 2:
                	imprimeMenuPrincipal(sc, alunos, disciplinas, professores);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 2.");
            }
        }
    }
    
    public static void buscaAluno(Scanner sc, ArrayList<Aluno> alunos) {
        System.out.println("-----BUSCA DE ALUNOS-----"
        		+ "\n[ 1 ] Por nome"
        		+ "\n[ 2 ] Por número de matrícula"
        		+ "\nSua escolha: ");
        int escolha = sc.nextInt();
        sc.nextLine();

        if (escolha == 1) {
            System.out.print("Digite o nome do aluno: ");
            String nomeBusca = sc.nextLine();
            boolean encontrado = false;
            for (Aluno aluno : alunos) {
                if (aluno.getNome().equalsIgnoreCase(nomeBusca)) {
                    System.out.println("Aluno encontrado: " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Aluno não encontrado.");
            }
        } else if (escolha == 2) {
            System.out.print("Digite o número de matrícula: ");
            String matriculaBusca = sc.nextLine();
            boolean encontrado = false;
            for (Aluno aluno : alunos) {
                if (aluno.getNumeroMatricula().equalsIgnoreCase(matriculaBusca)) {
                    System.out.println("Aluno encontrado: " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Aluno não encontrado.");
            }
        } else {
            System.out.println("Escolha inválida. Retornando ao menu anterior.");
        }
    }
    
    public static void buscaAlunosPorDisciplina(Scanner sc, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos) {
        System.out.println("-----LISTA DE ALUNOS-----"
        		+ "\n[ 1 ] Por nome da disciplina"
        		+ "\n[ 2 ] Pelo códgo da disciplina"
        		+ "\nSua escolha: ");
        
        int escolha = sc.nextInt();
        sc.nextLine();

        if (escolha == 1) {
            System.out.print("Digite o nome da disciplina: ");
            String nomeBusca = sc.nextLine();
            boolean encontrado = false;
            for (Disciplina disciplina : disciplinas) {
                if (disciplina.nome.equalsIgnoreCase(nomeBusca)) {
                    System.out.println("Alunos matriculados em " + disciplina.nome + ":");
                    for (Aluno aluno : alunos) {
                        if (aluno.getDisciplinas().contains(disciplina)) {
                            System.out.println("\t - " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula());
                            encontrado = true;
                        }
                    }
                }
            }
            if (!encontrado) {
                System.out.println("Nenhum aluno encontrado na disciplina " + nomeBusca + ".");
            }
        } else if (escolha == 2) {
            System.out.print("Digite o código da disciplina: ");
            String codigoBusca = sc.nextLine();
            boolean encontrado = false;
            for (Disciplina disciplina : disciplinas) {
                if (disciplina.codigo.equalsIgnoreCase(codigoBusca)) {
                    System.out.println("Alunos matriculados em " + disciplina.nome + ":");
                    for (Aluno aluno : alunos) {
                        if (aluno.getDisciplinas().contains(disciplina)) {
                            System.out.println("\t - " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula());
                            encontrado = true;
                        }
                    }
                }
            }
            if (!encontrado) {
                System.out.println("Nenhum aluno encontrado na disciplina com código " + codigoBusca + ".");
            }
        } else {
            System.out.println("Escolha inválida. Retornando ao menu anterior.");
        }
    }

}
