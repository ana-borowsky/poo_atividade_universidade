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
       
        imprimeMenuPrincipal(sc, disciplinas, alunos, professores);
        sc.close();
 }

    public static void imprimeMenuPrincipal(Scanner sc, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos, ArrayList<Professor> professores) {
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
                	imprimeMenuDisciplinas(sc, disciplinas, alunos, professores);
                    loop = false; 
                    break;

                case 2:
                	imprimeMenuAlunos(sc, disciplinas, alunos, professores);
                    loop = false;
                    break;
                
                case 3:
                	imprimeMenuProfessores(sc, disciplinas, alunos, professores);
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

    public static void imprimeMenuDisciplinas(Scanner sc, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos, ArrayList<Professor> professores) {
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
                        System.out.println("\t - " + disciplina.nome + " - Código: " + disciplina.codigo + " - Professor: " + nomeProfessor +" - Status: " + disciplina.isAtiva());
                    }
                    break;

                case 2:
                	imprimeMenuBuscaDisciplinas(sc, disciplinas, alunos, professores);
                    break;

                case 3:
                	menuAlunosPorDisciplina(sc, disciplinas, alunos, professores);
                    break;

                case 4:
                	imprimeMenuPrincipal(sc, disciplinas, alunos, professores);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 4.");
            }
        }
    }

    public static void imprimeMenuAlunos(Scanner sc, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos, ArrayList<Professor> professores) { 
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
                        System.out.println("\t - " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula() + " - status: " + aluno.isCursando());
                    }
                    break;

                case 2:
                	imprimeMenuBuscaAluno(sc, disciplinas, alunos, professores);
                    break;

                case 3:
                	imprimeMenuPrincipal(sc, disciplinas, alunos, professores);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 3.");
            }
        }
    }
    
    public static void imprimeMenuBuscaAluno(Scanner sc, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos, ArrayList<Professor> professores) { 
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
                	buscaAlunoPorNome(sc, disciplinas, alunos, professores);
                    break;

                case 2:
                	buscaAlunoPorMatricula(sc, disciplinas, alunos, professores);
                    break;

                case 3:
                	imprimeMenuAlunos(sc, disciplinas, alunos, professores);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 3.");
            }
        }
    }
    
    public static void imprimeMenuProfessores(Scanner sc, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos, ArrayList<Professor> professores) {
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
                	imprimeMenuPrincipal(sc, disciplinas, alunos, professores);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 2.");
            }
        }
    }
    
    
    public static void imprimeMenuBuscaDisciplinas(Scanner sc, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos, ArrayList<Professor> professores) { 
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
                	buscaDisciplinaPorNome(sc, disciplinas, alunos, professores);
                    break;

                case 2:
                	buscaDisciplinaPorCódigo(sc, disciplinas, alunos, professores);
                    break;

                case 3:
                	imprimeMenuDisciplinas(sc, disciplinas, alunos, professores);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 3.");
            }
        }
    }

    
    public static void menuAlunosPorDisciplina(Scanner sc, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos, ArrayList<Professor> professores) { 
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
                	buscaAlunoPorNomeDisciplina(sc, disciplinas, alunos, professores);
                    break;

                case 2:
                	buscaAlunoPorCodigoDisciplina(sc, disciplinas, alunos, professores);
                    break;

                case 3:
                	imprimeMenuDisciplinas(sc, disciplinas, alunos, professores);
                    loop = false; 
                    return;

                default:
                    System.out.println("Opção Inválida! Por favor, escolha uma opção de 1 a 3.");
            }
        }
    }   
        
    public static void buscaAlunoPorNome(Scanner sc, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos, ArrayList<Professor> professores) {      
        System.out.print("Digite o nome do aluno: ");
        String nomeBusca = sc.nextLine();
        boolean encontrado = false;
        for (Aluno aluno : alunos) {
        	if (aluno.getNome().equalsIgnoreCase(nomeBusca)) {
        	    System.out.println("Aluno encontrado: " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula() + "\n");
        	    encontrado = true;

        	    System.out.println("Deseja alterar os dados cadastrais? Digite (s) se sim e (n) para não: ");
        	    String alterar = sc.nextLine(); 

        	    if (alterar.equalsIgnoreCase("s")) {  
        	    	aluno.alteraDadosCadastrais(sc);
        	    }
        	}
        }
        
        System.out.println("\n");
        
        if (!encontrado) {
            System.out.println("Aluno não encontrado.\n");
            }
        
   }
            
    public static void buscaAlunoPorMatricula(Scanner sc, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos, ArrayList<Professor> professores) {               
        System.out.print("Digite o número de matrícula: ");
        String matriculaBusca = sc.nextLine();
        boolean encontrado = false;
        for (Aluno aluno : alunos) {
            if (aluno.getNumeroMatricula().equalsIgnoreCase(matriculaBusca)) {
                System.out.println("Aluno encontrado: " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula() + "\n");
                encontrado = true;
                System.out.println("Deseja alterar os dados cadastrais? Digite (s) se sim e (n) para não: ");
                String alterar = sc.nextLine();
                   
                if (alterar.equalsIgnoreCase("s")) {  
        	    	aluno.alteraDadosCadastrais(sc);
        	    }
            }
        }       
        
        System.out.println("\n");
        
        if (!encontrado) {
            System.out.println("Aluno não encontrado.\n");
        }
    }

    public static void buscaAlunoPorNomeDisciplina(Scanner sc, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos, ArrayList<Professor> professores) {
        System.out.print("Digite o nome da disciplina: ");
        String nomeBusca = sc.nextLine();
        boolean encontrado = false;
        
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.nome.equalsIgnoreCase(nomeBusca)) {
                System.out.println("Alunos matriculados em " + disciplina.nome + ":");
                for (Aluno aluno : disciplina.getAlunos()) { 
                    System.out.println("\t - " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula());
                    encontrado = true;
                }
                
                break;
            }
        }
        
        System.out.println("\n");
        
        if (!encontrado) {
            System.out.println("Nenhum aluno encontrado na disciplina " + nomeBusca + ".\n");
        }
    }
       
    public static void buscaAlunoPorCodigoDisciplina(Scanner sc, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos, ArrayList<Professor> professores) {
        System.out.print("Digite o código da disciplina: ");
        String codigoBusca = sc.nextLine();
        boolean encontrado = false;

        for (Disciplina disciplina : disciplinas) {
            if (disciplina.codigo.equalsIgnoreCase(codigoBusca)) {
                System.out.println("Alunos matriculados em " + disciplina.nome + ":");
                for (Aluno aluno : disciplina.getAlunos()) {
                    System.out.println("\t - " + aluno.getNome() + " - Matrícula: " + aluno.getNumeroMatricula());
                    encontrado = true;
                }
                
                break;
            }
        }
        
        System.out.println("\n");

        if (!encontrado) {
            System.out.println("Nenhum aluno encontrado na disciplina com código " + codigoBusca + ".\n");
        }
    }

    public static void buscaDisciplinaPorNome(Scanner sc, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos, ArrayList<Professor> professores) {
        System.out.print("Digite o nome da disciplina: ");
        String nomeBusca = sc.nextLine();
        boolean encontrado = false;

        for (Disciplina disciplina : disciplinas) {
            if (disciplina.nome.equalsIgnoreCase(nomeBusca)) {
                System.out.println("Disciplina encontrada: " + disciplina.nome + " - Código: " + disciplina.codigo + " - Status: " + (disciplina.ativa ? "ativa" : "inativa"));
                encontrado = true;
            }
            
        }
        System.out.println("\n");

        if (!encontrado) {
            System.out.println("Disciplina não encontrada.\n");
        }
    }

    public static void buscaDisciplinaPorCódigo(Scanner sc, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos, ArrayList<Professor> professores) {
        System.out.print("Digite o código da disciplina: ");
        String codigoBusca = sc.nextLine();
        boolean encontrado = false;

        for (Disciplina disciplina : disciplinas) {
            if (disciplina.codigo.equalsIgnoreCase(codigoBusca)) {
                System.out.println("Disciplina encontrada: " + disciplina.nome + " - Código: " + disciplina.codigo + " - Status: " + (disciplina.ativa ? "ativa" : "inativa"));
                encontrado = true;
            }
        }
        System.out.println("\n");

        if (!encontrado) {
            System.out.println("Disciplina não encontrada.\n");
        }
    }

    }

//