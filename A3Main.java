package A3PSC;

import java.util.Scanner;

public class A3Main {

    static Usuario[] cadastrados;
    static int qtd, quant;
    static Romaneio[] orcamento;

    public static void inicializar() {
        Usuario novousuario = new Usuario();
        novousuario.setEmail("admin");
        novousuario.setSenha("admin");
        cadastrados = new Usuario[10];
        qtd = 1;
        cadastrados[0] = novousuario;
    }

    public static void cadastrar(String email, String senha) {
        Usuario novousuario = new Usuario();
        novousuario.setEmail(email);
        novousuario.setSenha(senha);

        cadastrados[qtd] = novousuario;
        qtd++;
    }

    public static Usuario pesquisar(String email) {
        for (int i = 0; i < qtd; i++) {
            if (email.equals(cadastrados[i].getEmail())) {
                return cadastrados[i];
            }
        }
        return null;
    }

    public static void inicializarromaneio() {
        Romaneio novoromaneio = new Romaneio();
        novoromaneio.setTitulo("Qualquer");
        novoromaneio.setTamanho("de 38 a 44");
        novoromaneio.setQuantidade(000);
        novoromaneio.setDataPedido("Futuro");
        orcamento = new Romaneio[10];
        quant = 1;
        orcamento[0] = novoromaneio;

    }

    public static void cadastrarromaneio(String titulo, String tamanho, int quantidade, String dataPedido) {
        Romaneio novoromaneio = new Romaneio();
        novoromaneio.setTitulo(titulo);
        novoromaneio.setTamanho(tamanho);
        novoromaneio.setQuantidade(quantidade);
        novoromaneio.setDataPedido(dataPedido);
        orcamento[quant] = novoromaneio;
        quant++;
        novoromaneio.imprimirromaneio();
    }

    public static Romaneio pesquisarromaneio(String titulo) {
        for (int i = 0; i < quant; i++) {
            if (titulo.equalsIgnoreCase(orcamento[i].getTitulo())) {
                return orcamento[i];
            }
        }
        return null;
    }
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        inicializar();
        inicializarromaneio();
        
        boolean parada = false;

        while (parada == false) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Bem vindo ao Emissor de Romaneio, selecione a opção desejada: \n" + "1 - Novo Cadastro \n" + "2 - Login \n" + "3 - Sair");
            System.out.println("---------------------------------------------------------------");

            int menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Você escolheu fazer um novo cadastro");
                    System.out.println("Digite seu e-mail");
                    String email = entrada.next();
                    System.out.println("Digite sua senha");
                    String senha = entrada.next();
                    cadastrar(email, senha);
                    System.out.println("Usuario cadastrado");
                    break;
                case 2:
                    System.out.println("Você escolheu fazer o login");
                    Usuario cadastrado = null;
                    do {
                        System.out.println("Digite seu e-mail");

                        String login = entrada.next();

                        cadastrado = pesquisar(login);
                        if (cadastrado != null) {

                            System.out.println("Usuario encontrado");

                        } else {
                            System.out.println("Tente Novamente");
                            entrada.next();
                        }
                    } while (cadastrado == null);

                    do {
                        System.out.println("Digite sua senha");
                        senha = entrada.next();
                        if (senha.equals(cadastrado.getSenha())) {
                            System.out.println("Senha Correta");

                        } else {
                            System.out.println("Tente Novamente");
                            entrada.next();
                        }
                    } while (!senha.equals(cadastrado.getSenha()));

                    boolean saida = false;
                    
                    do {
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("Escolha a opção para romaneios \n" + "1 - criar romaneio \n" + "2 - pesquisar romaneio \n" + "3 - sair");
                        System.out.println("---------------------------------------------------------------");
                        int menuromaneio = entrada.nextInt();
                        switch (menuromaneio) {
                            case 1:
                                
                                System.out.println("Para criar um Romaneio, primeiro digite um titulo: ");
                                String titulo = entrada.next();
                                
                                System.out.println("Qual o tamanho de peça desejada? Digite um tamanho entre 38 a 44.");
                                String tamanho = entrada.next();
                                System.out.println("Qual a quantidade de peças? ");
                                int quantidade = entrada.nextInt();

                                System.out.println("Para qual data?");
                                String dataPedido = entrada.next();

                                cadastrarromaneio(titulo, tamanho, quantidade, dataPedido);
                                
                                break;
                            case 2:
                                System.out.println("Para pesquisar um Romaneio, digite o titulo cadastrado: ");
                                Romaneio orcamentocadastrado = null;
                                do {
                                    System.out.println("digite o titulo cadastrado:");

                                    String tituloromaneio = entrada.next();

                                    orcamentocadastrado = pesquisarromaneio(tituloromaneio);

                                    if (orcamentocadastrado != null) {

                                        System.out.println("Romaneio encontrado: ");
                                        orcamentocadastrado.imprimirromaneio();

                                    } else {
                                        System.out.println("Tente Novamente");
                                        entrada.next();
                                    }
                                } while (orcamentocadastrado == null);
                                break;
                            case 3:
                               saida = true;
                                break;
                            default:
                                System.out.println("Item de menu inválido");
                                break;
                        }
                       } while (saida == false);
                    break;
                case 3:
                    parada = true;
                    break;
                default:
                    System.out.println("Item de menu inválido");
                    break;
            }
        }

    }
}
