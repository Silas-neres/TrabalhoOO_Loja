package trabalho;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        String recebeString, nome, marca, cor, tipoBico, material, nomePessoa, dataNasc, departamento, telefone,
                tipoUsuario, cpf, tipoTrava, modeloCadarco, tipoCorreia, estetica, modelo, identificador3 = "X",
                nomeCompra, id;
        int opcao0, opcaoVendedor1, opcaoProduto, tamanho, i, opcaoCliente1, opcaoEditarPessoa, identificador4 = 0,
                quantidade, quantidadeCompra;
        int numProdutosCadas = 15, numPessoasCadas = 3, identificador = 0, identificador2 = 0;
        char opcaoVendedor, opcaoCliente;
        Double valorProduto, circunferenciaCano, alturaSalto, alturaCano, rendaTotal = 0.0, limitePreco = 0.0;
        Pessoa novaPessoa = new Pessoa();
        Sapatilha novaSapatilha = new Sapatilha();
        Bota novaBota = new Bota();
        Chuteira novaChuteira = new Chuteira();
        Chinelo novoChinelo = new Chinelo();
        Tenis novoTenis = new Tenis();
        Vender novaVenda = new Vender();

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
        String listaDepartamento[] = new String[100];
        String listaTipoTrava[] = new String[100];
        String listaModeloCadarco[] = new String[100];
        String listaTipoCorreia[] = new String[100];
        String listaEstetica[] = new String[100];
        Double listaAlturaCano[] = new Double[100];
        String listaModelo[] = new String[100];
        String listaNomePessoa[] = new String[100];
        String listaDataNasc[] = new String[100];
        String listaCpf[] = new String[100];
        String listaTelefone[] = new String[100];
        String listaTipoUsuario[] = new String[100];
        int listaQuantidade[] = new int[100];
        String listaId[] = new String[100];

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
                            System.out.println("Digite seu nome.");
                            recebeString = ler.nextLine().toUpperCase();
                            for (i = 0; i < numPessoasCadas; i++) {
                                System.out.println(listaTipoUsuario[i]);
                                System.out.println(listaNomePessoa[i]);
                                if (listaTipoUsuario[i] != null && listaTipoUsuario[i].equalsIgnoreCase("VENDEDOR")) {
                                    if (recebeString.equalsIgnoreCase(listaNomePessoa[i])) {
                                        identificador = 1;
                                        identificador2 = i;
                                        identificador3 = recebeString;
                                    }
                                }
                            }
                            if (identificador != 0) {
                                identificador = 0;
                                do {
                                    menuVendedor();
                                    recebeString = ler.nextLine();
                                    opcaoVendedor1 = Integer.parseInt(recebeString);
                                    switch (opcaoVendedor1) {
                                        // APAGAR VENDEDOR
                                        case 1:
                                            novaPessoa = new Pessoa(listaNomePessoa, listaDataNasc, listaCpf,
                                                    listaTelefone, numPessoasCadas, identificador2, listaTipoUsuario);
                                            numPessoasCadas--;
                                            break;
                                        // EDITAR VENDEDOR
                                        case 2:
                                            System.out.println("O que deseja editar");
                                            System.out.println("1)NOME");
                                            System.out.println("2)DATA DE NASCIMENTO");
                                            System.out.println("3)CPF");
                                            System.out.println("4)TELEFONE");
                                            recebeString = ler.nextLine();
                                            opcaoEditarPessoa = Integer.parseInt(recebeString);
                                            novaPessoa = new Pessoa(opcaoEditarPessoa, listaNomePessoa, listaDataNasc,
                                                    listaCpf, listaTelefone, numPessoasCadas, identificador2,
                                                    listaTipoUsuario);
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
                                                    System.out.println("Digite o id do produto.");
                                                    id = ler.nextLine().toUpperCase();
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
                                                    System.out.println("Digite a quantidade do produto.");
                                                    recebeString = ler.nextLine();
                                                    quantidade = Integer.parseInt(recebeString);

                                                    novaSapatilha = new Sapatilha(nome, marca, cor, valorProduto,
                                                            tamanho, opcaoProduto, numProdutosCadas, tipoBico, material,
                                                            listaNome, listaMarca, listaTamanho, listaCor,
                                                            listaValorProduto, listaCategoria, listaTipoBico,
                                                            listaMaterial, quantidade, listaQuantidade, id, listaId);

                                                    numProdutosCadas++;

                                                    System.out.println("Digite B para voltar!");
                                                    recebeString = ler.nextLine().toUpperCase();

                                                    break;
                                                // ADICIONAR BOTA
                                                case 2:
                                                    System.out.println("Digite o nome do produto.");
                                                    nome = ler.nextLine().toUpperCase();
                                                    System.out.println("Digite o id do produto.");
                                                    id = ler.nextLine().toUpperCase();
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
                                                    numProdutosCadas++;
                                                    System.out.println("Digite a quantidade do produto.");
                                                    recebeString = ler.nextLine();
                                                    quantidade = Integer.parseInt(recebeString);

                                                    novaBota = new Bota(nome, marca, cor, valorProduto, tamanho,
                                                            opcaoProduto, numProdutosCadas, circunferenciaCano,
                                                            alturaSalto, listaNome, listaMarca, listaTamanho, listaCor,
                                                            listaValorProduto, listaCategoria, listaCircunferenciaCano,
                                                            listaAlturaSalto, quantidade, listaQuantidade, id, listaId);

                                                    break;
                                                // ADICIONAR CHUTEIRA
                                                case 3:
                                                    System.out.println("Digite o nome do produto.");
                                                    nome = ler.nextLine().toUpperCase();
                                                    System.out.println("Digite o id do produto.");
                                                    id = ler.nextLine().toUpperCase();
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
                                                    System.out.println("Digite o departamento da chuteira.");
                                                    departamento = ler.nextLine().toUpperCase();
                                                    System.out.println("Digite o tipo de trava.");
                                                    tipoTrava = ler.nextLine();
                                                    System.out.println("Digite o tipo de cadarco.");
                                                    modeloCadarco = ler.nextLine();
                                                    System.out.println("Digite a quantidade do produto.");
                                                    recebeString = ler.nextLine();
                                                    quantidade = Integer.parseInt(recebeString);

                                                    novaChuteira = new Chuteira(nome, marca, cor, valorProduto, tamanho,
                                                            opcaoProduto, numProdutosCadas, departamento, tipoTrava,
                                                            modeloCadarco, listaNome, listaMarca, listaTamanho,
                                                            listaCor, listaValorProduto, listaCategoria,
                                                            listaDepartamento, listaTipoTrava, listaModeloCadarco,
                                                            quantidade, listaQuantidade, id, listaId);
                                                    numProdutosCadas++;
                                                    break;
                                                // ADICIONAR CHINELO
                                                case 4:
                                                    System.out.println("Digite o nome do produto.");
                                                    nome = ler.nextLine().toUpperCase();
                                                    System.out.println("Digite o id do produto.");
                                                    id = ler.nextLine().toUpperCase();
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
                                                    System.out.println("Digite o tipo de correia do chinelo.");
                                                    tipoCorreia = ler.nextLine().toUpperCase();
                                                    System.out.println("Digite a estetica do chinelo.");
                                                    estetica = ler.nextLine();
                                                    System.out.println("Digite a quantidade do produto.");
                                                    recebeString = ler.nextLine();
                                                    quantidade = Integer.parseInt(recebeString);

                                                    novoChinelo = new Chinelo(nome, marca, cor, valorProduto, tamanho,
                                                            opcaoProduto, numProdutosCadas, tipoCorreia, estetica,
                                                            listaNome, listaMarca, listaTamanho, listaCor,
                                                            listaValorProduto, listaCategoria, listaTipoCorreia,
                                                            listaEstetica, quantidade, listaQuantidade, id, listaId);
                                                    numProdutosCadas++;
                                                    break;
                                                // ADICIONAR TENIS
                                                case 5:
                                                    System.out.println("Digite o nome do produto.");
                                                    nome = ler.nextLine().toUpperCase();
                                                    System.out.println("Digite o id do produto.");
                                                    id = ler.nextLine().toUpperCase();
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
                                                    System.out.println("Digite a altura do cano do tenis.");
                                                    recebeString = ler.nextLine();
                                                    alturaCano = Double.parseDouble(recebeString);
                                                    System.out.println("Digite o modelo do tenis.");
                                                    modelo = ler.nextLine();
                                                    System.out.println("Digite a quantidade do produto.");
                                                    recebeString = ler.nextLine();
                                                    quantidade = Integer.parseInt(recebeString);

                                                    novoTenis = new Tenis(nome, marca, cor, valorProduto, tamanho,
                                                            opcaoProduto, numProdutosCadas, alturaCano, modelo,
                                                            listaNome, listaMarca, listaTamanho, listaCor,
                                                            listaValorProduto, listaCategoria, listaAlturaCano,
                                                            listaModelo, quantidade, listaQuantidade, id, listaId);
                                                    numProdutosCadas++;
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
                                                    System.out.println("6)Quantidade");
                                                    System.out.println("7)Id");
                                                    System.out.println("8)Tipo de bico");
                                                    System.out.println("9)Material");

                                                    recebeString = ler.nextLine();
                                                    opcaoProduto = Integer.parseInt(recebeString);

                                                    novaSapatilha = new Sapatilha(nome, numProdutosCadas, opcaoProduto,
                                                            listaNome, listaMarca, listaTamanho, listaCor,
                                                            listaValorProduto, listaCategoria, listaTipoBico,
                                                            listaMaterial, opcaoVendedor1, listaQuantidade, listaId);

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
                                                    System.out.println("6)Quantidade");
                                                    System.out.println("7)Id");
                                                    System.out.println("8)Circunferencia do cano");
                                                    System.out.println("9)Altura do salto");

                                                    recebeString = ler.nextLine();
                                                    opcaoProduto = Integer.parseInt(recebeString);

                                                    novaBota = new Bota(nome, numProdutosCadas, opcaoProduto,
                                                            listaCircunferenciaCano, listaAlturaSalto, listaNome,
                                                            listaMarca, listaTamanho, listaCor, listaValorProduto,
                                                            listaCategoria, opcaoVendedor1, listaQuantidade, listaId);
                                                    break;
                                                // EDITAR CHUTEIRA
                                                case 3:
                                                    System.out.println("Digite o nome do produto");
                                                    nome = ler.nextLine().toUpperCase();
                                                    System.out.println("O que voce deseja editar?");
                                                    System.out.println("1)Nome");
                                                    System.out.println("2)Marca");
                                                    System.out.println("3)Cor");
                                                    System.out.println("4)Valor");
                                                    System.out.println("5)Tamanho");
                                                    System.out.println("6)Quantidade");
                                                    System.out.println("7)Id");
                                                    System.out.println("8)Departamento");
                                                    System.out.println("9)Tipo de trava");
                                                    System.out.println("10)Modelo de cadarco");

                                                    recebeString = ler.nextLine();
                                                    opcaoProduto = Integer.parseInt(recebeString);

                                                    novaChuteira = new Chuteira(nome, numProdutosCadas, opcaoProduto,
                                                            listaNome, listaMarca, listaTamanho, listaCor,
                                                            listaValorProduto, listaCategoria, listaDepartamento,
                                                            listaTipoTrava, listaModeloCadarco, opcaoVendedor1,
                                                            listaQuantidade, listaId);
                                                    break;
                                                // EDITAR CHINELO
                                                case 4:
                                                    System.out.println("Digite o nome do produto");
                                                    nome = ler.nextLine().toUpperCase();
                                                    System.out.println("O que voce deseja editar?");
                                                    System.out.println("1)Nome");
                                                    System.out.println("2)Marca");
                                                    System.out.println("3)Cor");
                                                    System.out.println("4)Valor");
                                                    System.out.println("5)Tamanho");
                                                    System.out.println("6)Quantidade");
                                                    System.out.println("7)Id");
                                                    System.out.println("8)Tipo de correia");
                                                    System.out.println("9)Estetica");

                                                    recebeString = ler.nextLine();
                                                    opcaoProduto = Integer.parseInt(recebeString);

                                                    novoChinelo = new Chinelo(nome, numProdutosCadas, opcaoProduto,
                                                            listaNome, listaMarca, listaTamanho, listaCor,
                                                            listaValorProduto, listaCategoria, listaTipoCorreia,
                                                            listaEstetica, opcaoVendedor1, listaQuantidade, listaId);
                                                    break;
                                                // EDITAR TENIS
                                                case 5:
                                                    System.out.println("Digite o nome do produto");
                                                    nome = ler.nextLine().toUpperCase();
                                                    System.out.println("O que voce deseja editar?");
                                                    System.out.println("1)Nome");
                                                    System.out.println("2)Marca");
                                                    System.out.println("3)Cor");
                                                    System.out.println("4)Valor");
                                                    System.out.println("5)Tamanho");
                                                    System.out.println("6)Quantidade");
                                                    System.out.println("7)Id");
                                                    System.out.println("8)Altura do cano");
                                                    System.out.println("9)Modelo");

                                                    recebeString = ler.nextLine();
                                                    opcaoProduto = Integer.parseInt(recebeString);

                                                    novoTenis = new Tenis(nome, numProdutosCadas, opcaoProduto,
                                                            listaNome, listaMarca, listaTamanho, listaCor,
                                                            listaValorProduto, listaCategoria, listaAlturaCano,
                                                            listaModelo, opcaoVendedor1, listaQuantidade, listaId);
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
                                                            listaValorProduto, listaCategoria, listaTipoBico,
                                                            listaMaterial, opcaoVendedor1, listaQuantidade, listaId);
                                                    numProdutosCadas--;
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
                                                            listaCategoria, opcaoVendedor1, listaQuantidade, listaId);
                                                    numProdutosCadas--;
                                                    System.out.println("Digite B para voltar!");
                                                    recebeString = ler.nextLine().toUpperCase();
                                                    break;
                                                // APAGAR CHUTEIRA
                                                case 3:
                                                    System.out.println("Qual o nome do produto que deseja apagar?");
                                                    nome = ler.nextLine().toUpperCase();
                                                    novaChuteira = new Chuteira(nome, numProdutosCadas, opcaoProduto,
                                                            listaNome, listaMarca, listaTamanho, listaCor,
                                                            listaValorProduto, listaCategoria, listaDepartamento,
                                                            listaTipoTrava, listaModeloCadarco, opcaoVendedor1,
                                                            listaQuantidade, listaId);
                                                    numProdutosCadas--;
                                                    System.out.println("Digite B para voltar!");
                                                    recebeString = ler.nextLine().toUpperCase();
                                                    break;
                                                // APAGAR CHINELO
                                                case 4:
                                                    System.out.println("Qual o nome do produto que deseja apagar?");
                                                    nome = ler.nextLine().toUpperCase();
                                                    novoChinelo = new Chinelo(nome, numProdutosCadas, opcaoProduto,
                                                            listaNome, listaMarca, listaTamanho, listaCor,
                                                            listaValorProduto, listaCategoria, listaTipoCorreia,
                                                            listaEstetica, opcaoVendedor1, listaQuantidade, listaId);
                                                    numProdutosCadas--;
                                                    System.out.println("Digite B para voltar!");
                                                    recebeString = ler.nextLine().toUpperCase();
                                                    break;
                                                // APAGAR TENIS
                                                case 5:
                                                    System.out.println("Qual o nome do produto que deseja apagar?");
                                                    nome = ler.nextLine().toUpperCase();
                                                    novoTenis = new Tenis(nome, numProdutosCadas, opcaoProduto,
                                                            listaNome, listaMarca, listaTamanho, listaCor,
                                                            listaValorProduto, listaCategoria, listaAlturaCano,
                                                            listaModelo, opcaoVendedor1, listaQuantidade, listaId);
                                                    numProdutosCadas--;
                                                    System.out.println("Digite B para voltar!");
                                                    recebeString = ler.nextLine().toUpperCase();
                                                    break;
                                                // SAIR
                                                default:

                                            }
                                            // VER ESTOQUE
                                        case 6:
                                            estoque(listaAlturaCano, listaAlturaSalto, listaCategoria,
                                                    listaCircunferenciaCano, listaCor, listaDepartamento, listaEstetica,
                                                    listaMarca, listaMaterial, listaModelo, listaModeloCadarco,
                                                    listaNome, listaTamanho, listaTipoBico, listaTipoCorreia,
                                                    listaTipoTrava, listaValorProduto, numProdutosCadas,
                                                    listaQuantidade, listaId);
                                            System.out.println("Digite B para voltar!");
                                            recebeString = ler.nextLine().toUpperCase();
                                            break;
                                        // RELATORIO
                                        case 7:
                                            System.out.println("A renda total da loja  é R$" + rendaTotal);
                                            System.out.println("Digite B para voltar!");
                                            recebeString = ler.nextLine().toUpperCase();
                                            break;
                                        default:
                                            System.out.println("Opcao invalida!");
                                            System.out.println("Digite B para voltar!");
                                            recebeString = ler.nextLine().toUpperCase();
                                    }
                                } while (opcaoVendedor1 != 0
                                        && identificador3.equalsIgnoreCase(listaNomePessoa[identificador2]));
                            } else {
                                System.out.println("VENDEDOR NAO CADASTRADOR!");
                            }
                            break;
                        case 'N':
                            // Cadastro do vendedor
                            System.out.println("Digite o nome do vendedor");
                            nomePessoa = ler.nextLine().toUpperCase();
                            System.out.println("Digite o CPF do vendedor");
                            cpf = ler.nextLine();
                            System.out.println("Digite a data de nascimento do vendedor.((XX/XX/XXXX) Com as barras)");
                            dataNasc = ler.nextLine();
                            System.out.println("Digite seu telefone)");
                            telefone = ler.nextLine();
                            tipoUsuario = "VENDEDOR";
                            novaPessoa = new Pessoa(nomePessoa, cpf, dataNasc, telefone, tipoUsuario, numPessoasCadas,
                                    listaNomePessoa, listaDataNasc, listaCpf, listaTelefone, listaTipoUsuario);
                            numPessoasCadas++;
                            break;

                    }

                    break;
                // CLIENTE
                case 2:
                    System.out.println("Voce ja e cadastrado? S/N");
                    recebeString = ler.nextLine().toUpperCase();
                    opcaoCliente = recebeString.charAt(0);
                    switch (opcaoCliente) {
                        case 'S':
                            System.out.println("Digite seu nome.");
                            recebeString = ler.nextLine().toUpperCase();
                            for (i = 0; i < numPessoasCadas; i++) {
                                if (listaTipoUsuario[i] != null && listaTipoUsuario[i].equalsIgnoreCase("CLIENTE")) {
                                    if (recebeString.equalsIgnoreCase(listaNomePessoa[i])) {
                                        System.out.println(recebeString + " dfdsfsdfsdf");
                                        identificador4 = 1;
                                        identificador2 = i;
                                        identificador3 = recebeString;
                                    }
                                }
                            }
                            if (identificador4 != 0) {
                                identificador4 = 0;
                                System.out.println(identificador4);
                                do {
                                    menuCliente();
                                    recebeString = ler.nextLine();
                                    opcaoCliente1 = Integer.parseInt(recebeString);
                                    switch (opcaoCliente1) {
                                        // BUSCAR PRODUTO POR NOME
                                        case 1:
                                            System.out.println("Digite o nome do produto que voce esta procurando.");
                                            recebeString = ler.nextLine().toUpperCase();
                                            for (i = 0; i <= numProdutosCadas; i++) {
                                                if (recebeString.equalsIgnoreCase(listaNome[i])) {

                                                    System.out.println("Nome: " + listaNome[i]);
                                                    System.out.println("Id: " + listaId[i]);
                                                    System.out.println("Marca: " + listaMarca[i]);
                                                    System.out.println("Tamanho: " + listaTamanho[i]);
                                                    System.out.println("Cor: " + listaCor[i]);
                                                    System.out.println("Valor: R$" + listaValorProduto[i]);
                                                    System.out.println("Tipo de bico:" + listaTipoBico[i]);
                                                    System.out.println("Material: " + listaMaterial[i]);
                                                    System.out.println("Quantidade: " + listaQuantidade[i]);
                                                    System.out.println("========================================");
                                                }
                                            }

                                            break;
                                        // BUSCAR PRODUTOR POR VALOR LIMITE
                                        case 2:
                                            System.out.println(
                                                    "Digite o valor maximo do produto que voce esta procurando.");
                                            recebeString = ler.nextLine();
                                            limitePreco = Double.parseDouble(recebeString);
                                            for (i = 0; i <= numProdutosCadas; i++) {
                                                if (listaValorProduto[i] <= limitePreco) {

                                                    System.out.println("Nome: " + listaNome[i]);
                                                    System.out.println("Id: " + listaId[i]);
                                                    System.out.println("Marca: " + listaMarca[i]);
                                                    System.out.println("Tamanho: " + listaTamanho[i]);
                                                    System.out.println("Cor: " + listaCor[i]);
                                                    System.out.println("Valor: R$" + listaValorProduto[i]);
                                                    System.out.println("Tipo de bico:" + listaTipoBico[i]);
                                                    System.out.println("Material: " + listaMaterial[i]);
                                                    System.out.println("Quantidade: " + listaQuantidade[i]);
                                                    System.out.println("========================================");
                                                }
                                            }
                                            break;
                                        // BUSCAR PRODUTO POR MARCA
                                        case 3:
                                            System.out.println("Digite marca do produto que voce esta procurando.");
                                            recebeString = ler.nextLine().toUpperCase();
                                            for (i = 0; i <= numProdutosCadas; i++) {
                                                if (recebeString.equalsIgnoreCase(listaMarca[i])) {

                                                    System.out.println("Nome: " + listaNome[i]);
                                                    System.out.println("Id: " + listaId[i]);
                                                    System.out.println("Marca: " + listaMarca[i]);
                                                    System.out.println("Tamanho: " + listaTamanho[i]);
                                                    System.out.println("Cor: " + listaCor[i]);
                                                    System.out.println("Valor: R$" + listaValorProduto[i]);
                                                    System.out.println("Tipo de bico:" + listaTipoBico[i]);
                                                    System.out.println("Material: " + listaMaterial[i]);
                                                    System.out.println("Quantidade: " + listaQuantidade[i]);
                                                    System.out.println("========================================");
                                                }
                                            }
                                            break;
                                        // COMPRAR
                                        case 4:
                                            System.out.println("Digite o id do produto que voce quer comprar.");
                                            id = ler.nextLine().toUpperCase();
                                            System.out.println("Digite a quantidade que voce quer comprar.");
                                            recebeString = ler.nextLine();
                                            quantidadeCompra = Integer.parseInt(recebeString);
                                            novaVenda = new Vender(id, quantidadeCompra, listaNome, listaQuantidade,
                                                    rendaTotal, listaId, listaValorProduto, numPessoasCadas);
                                            break;
                                        // EDITAR DADOS
                                        case 5:
                                            System.out.println("O que deseja editar");
                                            System.out.println("1)NOME");
                                            System.out.println("2)DATA DE NASCIMENTO");
                                            System.out.println("3)CPF");
                                            System.out.println("4)TELEFONE");
                                            recebeString = ler.nextLine();
                                            opcaoEditarPessoa = Integer.parseInt(recebeString);
                                            novaPessoa = new Pessoa(opcaoEditarPessoa, listaNomePessoa, listaDataNasc,
                                                    listaCpf, listaTelefone, numPessoasCadas, identificador2,
                                                    listaTipoUsuario);

                                            break;
                                        // APAGAR CLIENTE
                                        case 6:
                                            novaPessoa = new Pessoa(listaNomePessoa, listaDataNasc, listaCpf,
                                                    listaTelefone, numPessoasCadas, identificador2, listaTipoUsuario);
                                            numPessoasCadas--;
                                            opcaoCliente1 = 0;
                                            break;
                                        // LISTA DE PRODUTOS
                                        case 7:
                                            estoque(listaAlturaCano, listaAlturaSalto, listaCategoria,
                                                    listaCircunferenciaCano, listaCor, listaDepartamento, listaEstetica,
                                                    listaMarca, listaMaterial, listaModelo, listaModeloCadarco,
                                                    listaNome, listaTamanho, listaTipoBico, listaTipoCorreia,
                                                    listaTipoTrava, listaValorProduto, numProdutosCadas,
                                                    listaQuantidade, listaId);
                                            break;
                                        default:
                                            System.out.println("Opcao invalida!");

                                    }
                                } while (opcaoCliente1 != 0
                                        );
                            } else {
                                System.out.println("CLIENTE NAO CADASTRADOR!");
                            }
                            break;
                        case 'N':

                            // Cadastro do cliente
                            System.out.println("Digite o nome do cliente");
                            nomePessoa = ler.nextLine().toUpperCase();
                            System.out.println("Digite o CPF do cliente");
                            cpf = ler.nextLine();
                            System.out.println("Digite a data de nascimento do cliente.((XX/XX/XXXX) Com as barras)");
                            dataNasc = ler.nextLine();
                            System.out.println("Digite seu telefone)");
                            telefone = ler.nextLine();
                            tipoUsuario = "CLIENTE";
                            novaPessoa = new Pessoa(nomePessoa, cpf, dataNasc, telefone, tipoUsuario, numPessoasCadas,
                                    listaNomePessoa, listaDataNasc, listaCpf, listaTelefone, listaTipoUsuario);
                            numPessoasCadas++;
                            break;
                    }
                    break;

            }

        } while (opcao0 != 0);

    }

    private static void estoque(Double[] listaAlturaCano, Double[] listaAlturaSalto, int[] listaCategoria,
            Double[] listaCircunferenciaCano, String[] listaCor, String[] listaDepartamento, String[] listaEstetica,
            String[] listaMarca, String[] listaMaterial, String[] listaModelo, String[] listaModeloCadarco,
            String[] listaNome, int[] listaTamanho, String[] listaTipoBico, String[] listaTipoCorreia,
            String[] listaTipoTrava, Double[] listaValorProduto, int numProdutosCadas, int[] listaQuantidade,
            String[] listaId) {

        int i;

        System.out.println("ESTOQUE DA LOJA:");
        System.out.println("SAPATILHA:");
        System.out.println("========================================");
        for (i = 0; i <= numProdutosCadas; i++) {
            if (listaCategoria[i] == 1) {

                System.out.println("Nome: " + listaNome[i]);
                System.out.println("Id: " + listaId[i]);
                System.out.println("Marca: " + listaMarca[i]);
                System.out.println("Tamanho: " + listaTamanho[i]);
                System.out.println("Cor: " + listaCor[i]);
                System.out.println("Valor: R$" + listaValorProduto[i]);
                System.out.println("Tipo de bico:" + listaTipoBico[i]);
                System.out.println("Material: " + listaMaterial[i]);
                System.out.println("Quantidade: " + listaQuantidade[i]);
                System.out.println("========================================");
            }
        }
        System.out.println("BOTA:");
        System.out.println("========================================");
        for (i = 0; i <= numProdutosCadas; i++) {
            if (listaCategoria[i] == 2) {

                System.out.println("Nome: " + listaNome[i]);
                System.out.println("Id: " + listaId[i]);
                System.out.println("Marca: " + listaMarca[i]);
                System.out.println("Tamanho: " + listaTamanho[i]);
                System.out.println("Cor: " + listaCor[i]);
                System.out.println("Valor: R$" + listaValorProduto[i]);
                System.out.println("Circunferencia do cano:" + listaCircunferenciaCano[i]);
                System.out.println("Altura do salto: " + listaAlturaSalto[i]);
                System.out.println("Quantidade: " + listaQuantidade[i]);
                System.out.println("========================================");
            }
        }
        System.out.println("CHUTEIRA:");
        System.out.println("========================================");
        for (i = 0; i <= numProdutosCadas; i++) {
            if (listaCategoria[i] == 3) {

                System.out.println("Nome: " + listaNome[i]);
                System.out.println("Id: " + listaId[i]);
                System.out.println("Marca: " + listaMarca[i]);
                System.out.println("Tamanho: " + listaTamanho[i]);
                System.out.println("Cor: " + listaCor[i]);
                System.out.println("Valor: R$" + listaValorProduto[i]);
                System.out.println("Departamento:" + listaDepartamento[i]);
                System.out.println("Tipo de trava: " + listaTipoTrava[i]);
                System.out.println("Modelo de cadarco: " + listaModeloCadarco[i]);
                System.out.println("Quantidade: " + listaQuantidade[i]);
                System.out.println("========================================");
            }
        }
        System.out.println("CHINELO:");
        System.out.println("========================================");
        for (i = 0; i <= numProdutosCadas; i++) {
            if (listaCategoria[i] == 4) {

                System.out.println("Nome: " + listaNome[i]);
                System.out.println("Id: " + listaId[i]);
                System.out.println("Marca: " + listaMarca[i]);
                System.out.println("Tamanho: " + listaTamanho[i]);
                System.out.println("Cor: " + listaCor[i]);
                System.out.println("Valor: R$" + listaValorProduto[i]);
                System.out.println("Tipo de correia:" + listaTipoCorreia[i]);
                System.out.println("Estetica: " + listaEstetica[i]);
                System.out.println("Quantidade: " + listaQuantidade[i]);
                System.out.println("========================================");
            }
        }
        System.out.println("BOTA:");
        System.out.println("========================================");
        for (i = 0; i <= numProdutosCadas; i++) {
            if (listaCategoria[i] == 5) {

                System.out.println("Nome: " + listaNome[i]);
                System.out.println("Id: " + listaId[i]);
                System.out.println("Marca: " + listaMarca[i]);
                System.out.println("Tamanho: " + listaTamanho[i]);
                System.out.println("Cor: " + listaCor[i]);
                System.out.println("Valor: R$" + listaValorProduto[i]);
                System.out.println("Altura do cano:" + listaAlturaCano[i]);
                System.out.println("Modelo: " + listaModelo[i]);
                System.out.println("Quantidade: " + listaQuantidade[i]);
                System.out.println("========================================");
            }
        }

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
        System.out.println("5)EDITAR DADOS");
        System.out.println("6)APAGAR CLIENTE");
        System.out.println("7)LISTA DE PRODUTOS");
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
