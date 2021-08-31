package trabalho;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        String recebeString, nomeSapatilha, marcaSapatilha, corSapatilha, tipoBicoSapatilha, materialSapatilha, nomeVendedor,dataNascVendedor;
        int opcao0, cpfVendedor, opcaoVendedor1, opcaoProduto, tamanhoSapatilha;
        char opcaoVendedor, opcaoCliente;
        Double valorSapatilha;
        Vendedor novoVendedor = new Vendedor();
        Sapatilha novaSapatilha = new Sapatilha();

        do {
            menu();
            recebeString = ler.nextLine();
            opcao0 = Integer.parseInt(recebeString);

            switch (opcao0) {
                case 1:

                    System.out.println("Voce ja e cadastrado? S/N");
                    recebeString = ler.nextLine().toUpperCase();
                    opcaoVendedor = recebeString.charAt(0);

                    switch (opcaoVendedor) {
                        case 'S':
                            /*
                             * fazer a parte que ele pergunta o nome e buscar para ver se ele existe no
                             * cadastro
                             */
                            do {
                                menuVendedor();
                                recebeString = ler.nextLine();
                                opcaoVendedor1 = Integer.parseInt(recebeString);
                                switch (opcaoVendedor1) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        do {
                                            tipoProduto();
                                            recebeString = ler.nextLine();
                                            opcaoProduto = Integer.parseInt(recebeString);
                                            switch (opcaoProduto) {
                                                case 1:
                                                    System.out.println("Digite o nome da sapatilha.");
                                                    nomeSapatilha = ler.nextLine().toUpperCase();
                                                    System.out.println("Digite a marca da sapatilha.");
                                                    marcaSapatilha = ler.nextLine().toUpperCase();
                                                    System.out.println("Digite o tamanho da sapatilha.");
                                                    recebeString = ler.nextLine();
                                                    tamanhoSapatilha = Integer.parseInt(recebeString);
                                                    System.out.println("Digite a cor da sapatilha.");
                                                    corSapatilha = ler.nextLine().toUpperCase();
                                                    System.out.println("Digite o tipo de bico da sapatilha.");
                                                    tipoBicoSapatilha = ler.nextLine().toUpperCase();
                                                    System.out.println("Digite o material da sapatilha.");
                                                    materialSapatilha = ler.nextLine().toUpperCase();
                                                    System.out.println("Digite o valor da sapatilha.");
                                                    recebeString = ler.nextLine();
                                                    valorSapatilha = Double.parseDouble(recebeString);
                                                    novaSapatilha = Sapatilha(nomeSapatilha,marcaSapatilha,tamanhoSapatilha,corSapatilha,tipoBicoSapatilha,materialSapatilha,valorSapatilha);
                                                break;
                                                case 2:
                                                break;
                                                case 3:
                                                break;
                                                case 4:
                                                break;
                                                case 5:
                                                break;
                                                default:
                                            };
                                        } while (opcaoProduto != 0);
                                        break;
                                    case 4:
                                        break;
                                    case 5:
                                        break;
                                    case 6:
                                        break;
                                    default:
                                        System.out.println("Opcao invalida!");
                                }
                            } while (opcaoVendedor1 != 0);
                            break;
                        case 'N':
                            // Cadastro do vendedor
                            System.out.println("Digite o nome do vendedor");
                            nomeVendedor = ler.nextLine().toUpperCase();
                            System.out.println("Digite o CPF do vendedor");
                            recebeString = ler.nextLine();
                            cpfVendedor = Integer.parseInt(recebeString);
                            System.out.println("Digite a data de nascimento do vendedor.((XX/XX/XXXX) Com as barras)");
                            dataNascVendedor = ler.nextLine();
                            novoVendedor = new Vendedor(nomeVendedor, cpfVendedor, dataNascVendedor);

                            break;

                    }

                    break;
                case 2:

                    do {
                        System.out.println("Voce ja e cadastrado? S/N");
                        recebeString = ler.nextLine().toUpperCase();
                        opcaoCliente = recebeString.charAt(0);
                        switch (opcaoCliente) {
                            case 'S':
                                // fazer a parte que ele pergunta o nome e buscar para ver se ele existe no
                                // cadastro
                                menuVendedor();
                                recebeString = ler.nextLine();
                                opcaoVendedor1 = Integer.parseInt(recebeString);
                                switch (opcaoVendedor1) {
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    default:
                                        System.out.println("Opcao invalida!");

                                }
                                break;
                            case 'N':
                                // Cadastro do cliente
                                break;
                        }

                    } while (opcaoCliente != 0);
                    break;

            }

        } while (opcao0 != 0);

    }

    public static void menu() {
        System.out.println("====VOCE E QUE TIPO DE USUARIO?====");
        System.out.println("1)VENDEDOR");
        System.out.println("2)CLIENTE");
        System.out.println("0)SAIR");
    }

    public static void menuVendedor() {
        System.out.println("====ESCOLHA UMA OPCAO====");
        System.out.println("1)APAGAR VENDEDOR");
        System.out.println("2)EDITAR VENDEDOR");
        System.out.println("3)ADICIONAR UM PRODUTO");
        System.out.println("4)EDITAR UM PRODUTO");
        System.out.println("5)APAGAR UM PRODUTO");
        System.out.println("6)VER ESTOQUE");
        System.out.println("0)SAIR");
    }

    public static void menuCliente() {
        System.out.println("====ESCOLHA UMA OPCAO====");
        System.out.println("1)BUSCAR PRODUTO POR NOME");
        System.out.println("2)BUSCAR PRODUTO POR VALOR LIMITE");
        System.out.println("3)BUSCAR PRODUTO POR MARCA");
        System.out.println("4)COMPRAR");
        System.out.println("0)SAIR");
    }

    public static void tipoProduto() {
        System.out.println("====QUE TIPO DE PRODUTO VOCE QUER ADICIONAR?====");
        System.out.println("1)SAPATILHA");
        System.out.println("2)BOTA");
        System.out.println("3)CHUTEIRA");
        System.out.println("4)CHINELO");
        System.out.println("5)TENIS");
        System.out.println("0)SAIR");
    }
}
