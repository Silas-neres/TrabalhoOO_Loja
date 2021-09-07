package trabalho;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        String recebeString, nome, marca, cor, tipoBico, material, nomeVendedor, dataNascVendedor;
        int opcao0, cpfVendedor, opcaoVendedor1, opcaoProduto, tamanho, i;
        int numProdutosCadas = 15;
        char opcaoVendedor, opcaoCliente, continuar;
        Double valorProduto, circunferenciaCano, alturaSalto;
        Vendedor novoVendedor = new Vendedor();
        Sapatilha novaSapatilha = new Sapatilha();
        Bota novaBota = new Bota();

        String listaMarca[] = new String[100];
        String listaNome[] = new String[100];
        int listaTamanho[] = new int[100];
        String listaCor[] = new String[100];
        Double listaValorProduto[] = new Double[100];
        int listaCategoria[] = new int[100];
        String listaTipoBico[] = new String[100];
        String listaMaterial[] = new String[100];
        Double listaCircunferenciaCano[] = new Double[100];
        Double listaAlturaSalto[] = new Double[100];

        do {
            menu();
            recebeString = ler.nextLine();
            opcao0 = Integer.parseInt(recebeString);

            switch (opcao0) {
                // VENDEDOR
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
                                    // APAGAR VENDEDOR
                                    case 1:
                                        break;
                                    // EDITAR VENDEDOR
                                    case 2:
                                        break;
                                    // ADICIONAR UM PRODUTO
                                    case 3:
                                        System.out.println("====QUE TIPO DE PRODUTO VOCE QUER ADICIONAR?====");
                                        tipoProduto();
                                        recebeString = ler.nextLine();
                                        opcaoProduto = Integer.parseInt(recebeString);
                                        switch (opcaoProduto) {
                                            // ADICIONAR SAPATILHA
                                            case 1:
                                                System.out.println("Digite o nome do produto.");
                                                nome = ler.nextLine().toUpperCase();
                                                System.out.println("Digite a marca do produto.");
                                                marca = ler.nextLine().toUpperCase();
                                                System.out.println("Digite o tamanho do produto.");
                                                recebeString = ler.nextLine();
                                                tamanho = Integer.parseInt(recebeString);
                                                System.out.println("Digite a cor do produto.");
                                                cor = ler.nextLine().toUpperCase();
                                                System.out.println("Digite o valor do produto.");
                                                recebeString = ler.nextLine();
                                                valorProduto = Double.parseDouble(recebeString);
                                                System.out.println("Digite o tipo de bico da sapatilha.");
                                                tipoBico = ler.nextLine().toUpperCase();
                                                System.out.println("Digite o material da sapatilha.");
                                                material = ler.nextLine().toUpperCase();

                                                novaSapatilha = new Sapatilha(nome, marca, cor, valorProduto, tamanho,
                                                        opcaoProduto, numProdutosCadas, tipoBico, material, listaNome,
                                                        listaMarca, listaTamanho, listaCor, listaValorProduto,
                                                        listaCategoria, listaTipoBico, listaMaterial);

                                                numProdutosCadas++;

                                                System.out.println("Digite B para voltar!");
                                                recebeString = ler.nextLine().toUpperCase();

                                                break;
                                            // ADICIONAR BOTA
                                            case 2:
                                                System.out.println("Digite o nome do produto.");
                                                nome = ler.nextLine().toUpperCase();
                                                System.out.println("Digite a marca do produto.");
                                                marca = ler.nextLine().toUpperCase();
                                                System.out.println("Digite o tamanho do produto.");
                                                recebeString = ler.nextLine();
                                                tamanho = Integer.parseInt(recebeString);
                                                System.out.println("Digite a cor do produto.");
                                                cor = ler.nextLine().toUpperCase();
                                                System.out.println("Digite o valor do produto.");
                                                recebeString = ler.nextLine();
                                                valorProduto = Double.parseDouble(recebeString);
                                                System.out.println("Digite circunferencia do cano da bota.");
                                                recebeString = ler.nextLine();
                                                circunferenciaCano = Double.parseDouble(recebeString);
                                                System.out.println("Digite a altura do salto.");
                                                recebeString = ler.nextLine();
                                                alturaSalto = Double.parseDouble(recebeString);

                                                novaBota = new Bota(nome, marca, cor, valorProduto, tamanho,
                                                        opcaoProduto, numProdutosCadas, circunferenciaCano, alturaSalto,
                                                        listaNome, listaMarca, listaTamanho, listaCor,
                                                        listaValorProduto, listaCategoria, listaCircunferenciaCano,
                                                        listaAlturaSalto);

                                                break;
                                            // ADICIONAR CHUTEIRA
                                            case 3:
                                                break;
                                            // ADICIONAR CHINELO
                                            case 4:
                                                break;
                                            // ADICIONAR TENIS
                                            case 5:
                                                break;
                                            // SAIR
                                            default:
                                        }
                                        System.out.println("Digite B para voltar!");
                                        recebeString = ler.nextLine().toUpperCase();
                                        break;
                                    // EDITAR UM PRODUTO
                                    case 4:
                                        tipoProduto();
                                        System.out.println("Qual produto voce quer editar?");
                                        recebeString = ler.nextLine();
                                        opcaoProduto = Integer.parseInt(recebeString);
                                        switch (opcaoProduto) {
                                            // EDITAR SAPATILHA
                                            case 1:

                                                System.out.println("Digite o nome do produto");
                                                nome = ler.nextLine().toUpperCase();
                                                System.out.println("O que voce deseja editar?");
                                                System.out.println("1)Nome");
                                                System.out.println("2)Marca");
                                                System.out.println("3)Cor");
                                                System.out.println("4)Valor");
                                                System.out.println("5)Tamanho");
                                                System.out.println("6)Tipo de bico");
                                                System.out.println("7)Material");

                                                recebeString = ler.nextLine();
                                                opcaoProduto = Integer.parseInt(recebeString);

                                                novaSapatilha = new Sapatilha(nome, numProdutosCadas, opcaoProduto,
                                                        listaNome, listaMarca, listaTamanho, listaCor,
                                                        listaValorProduto, listaCategoria, listaTipoBico, listaMaterial,
                                                        opcaoVendedor1);
                                                System.out.println("Digite B para voltar!");
                                                recebeString = ler.nextLine().toUpperCase();

                                                break;
                                            // EDITAR BOTA
                                            case 2:
                                                System.out.println("Digite o nome do produto");
                                                nome = ler.nextLine().toUpperCase();
                                                System.out.println("O que voce deseja editar?");
                                                System.out.println("1)Nome");
                                                System.out.println("2)Marca");
                                                System.out.println("3)Cor");
                                                System.out.println("4)Valor");
                                                System.out.println("5)Tamanho");
                                                System.out.println("6)Circunferencia do cano");
                                                System.out.println("7)Altura do salto");

                                                recebeString = ler.nextLine();
                                                opcaoProduto = Integer.parseInt(recebeString);

                                                novaBota = new Bota(nome, numProdutosCadas, opcaoProduto,
                                                        listaCircunferenciaCano, listaAlturaSalto, listaNome,
                                                        listaMarca, listaTamanho, listaCor, listaValorProduto,
                                                        listaCategoria, opcaoVendedor1);
                                                System.out.println("Digite B para voltar!");
                                                recebeString = ler.nextLine().toUpperCase();
                                                break;
                                            // EDITAR CHUTEIRA
                                            case 3:
                                                break;
                                            // EDITAR CHINELO
                                            case 4:
                                                break;
                                            // EDITAR TENIS
                                            case 5:
                                                break;
                                            // SAIR
                                            default:

                                        }
                                        System.out.println("Digite B para voltar!");
                                        recebeString = ler.nextLine().toUpperCase();
                                        break;
                                    // APAGAR PRODUTO
                                    case 5:
                                        tipoProduto();
                                        System.out.println("Qual produto voce quer apagar?");
                                        recebeString = ler.nextLine();
                                        opcaoProduto = Integer.parseInt(recebeString);
                                        switch (opcaoProduto) {
                                            // APAGAR SAPATILHA
                                            case 1:
                                                System.out.println("Qual o nome do produto que deseja apagar?");
                                                nome = ler.nextLine().toUpperCase();
                                                novaSapatilha = new Sapatilha(nome, numProdutosCadas, opcaoProduto,
                                                        listaNome, listaMarca, listaTamanho, listaCor,
                                                        listaValorProduto, listaCategoria, listaTipoBico, listaMaterial,
                                                        opcaoVendedor1);
                                                System.out.println("Digite B para voltar!");
                                                recebeString = ler.nextLine().toUpperCase();
                                                break;
                                            // APAGAR BOTA
                                            case 2:
                                                System.out.println("Qual o nome do produto que deseja apagar?");
                                                nome = ler.nextLine().toUpperCase();
                                                novaBota = new Bota(nome, numProdutosCadas, opcaoProduto,
                                                        listaCircunferenciaCano, listaAlturaSalto, listaNome,
                                                        listaMarca, listaTamanho, listaCor, listaValorProduto,
                                                        listaCategoria, opcaoVendedor1);
                                                System.out.println("Digite B para voltar!");
                                                recebeString = ler.nextLine().toUpperCase();
                                                break;
                                            // APAGAR CHUTEIRA
                                            case 3:
                                                break;
                                            // APAGAR CHINELO
                                            case 4:
                                                break;
                                            // APAGAR TENIS
                                            case 5:
                                                break;
                                            // SAIR
                                            default:

                                        }
                                        // VER ESTOQUE
                                    case 6:
                                        System.out.println("ESTOQUE DA LOJA:");
                                        System.out.println("SAPATILHA:");
                                        System.out.println("========================================");
                                        for (i = 0; i <= numProdutosCadas; i++) {
                                            if (listaCategoria[i] == 1) {

                                                System.out.println("Nome: " + listaNome[i]);
                                                System.out.println("Marca: " + listaMarca[i]);
                                                System.out.println("Tamanho: " + listaTamanho[i]);
                                                System.out.println("Cor: " + listaCor[i]);
                                                System.out.println("Valor: R$" + listaValorProduto[i]);
                                                System.out.println("Tipo de bico:" + listaTipoBico[i]);
                                                System.out.println("Material: " + listaMaterial[i]);
                                                System.out.println("========================================");
                                            }
                                        }
                                        System.out.println("BOTA:");
                                        System.out.println("========================================");
                                        for (i = 0; i <= numProdutosCadas; i++) {
                                            if (listaCategoria[i] == 2) {

                                                System.out.println("Nome: " + listaNome[i]);
                                                System.out.println("Marca: " + listaMarca[i]);
                                                System.out.println("Tamanho: " + listaTamanho[i]);
                                                System.out.println("Cor: " + listaCor[i]);
                                                System.out.println("Valor: R$" + listaValorProduto[i]);
                                                System.out.println(
                                                        "Circunferencia do cano:" + listaCircunferenciaCano[i]);
                                                System.out.println("Altura do salto: " + listaAlturaSalto[i]);
                                                System.out.println("========================================");
                                            }
                                        }

                                        System.out.println("Digite B para voltar!");
                                        recebeString = ler.nextLine().toUpperCase();
                                        break;
                                    default:
                                        System.out.println("Opcao invalida!");
                                        System.out.println("Digite B para voltar!");
                                        recebeString = ler.nextLine().toUpperCase();
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
                // CLIENTE
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

    private static void completarEditar(String nome, int numProdutosCadas, int opcao, String[] listaNome,
            String[] listaTipoBico, String[] listaMaterial) {
    }

    private static void editar(String nome, int numProdutosCadas, int opcao, String[] listaNome, String[] listaMarca,
            int[] listaTamanho, String[] listaCor, Double[] listaValorProduto, int[] listaCategoria) {
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
        System.out.println("1)SAPATILHA");
        System.out.println("2)BOTA");
        System.out.println("3)CHUTEIRA");
        System.out.println("4)CHINELO");
        System.out.println("5)TENIS");
        System.out.println("0)SAIR");
    }
}
