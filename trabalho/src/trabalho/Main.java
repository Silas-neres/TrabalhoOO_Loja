package trabalho;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        String recebeString;
        int opcao0;
        char opcaoVendedor;
        int opcaoVendedor1;
        char opcaoCliente;
        

        do {
            menu();
            recebeString = ler.nextLine();
            opcao0 = Integer.parseInt(recebeString);

            switch(opcao0){
                case 1:
                    do{
                        System.out.println("Voce ja e cadastrado? S/N");
                        recebeString = ler.nextLine().toUpperCase();
                        opcaoVendedor = recebeString.charAt(0);

                        switch(opcaoVendedor){
                            case 'S':
                             //fazer a parte que ele pergunta o nome e buscar para ver se ele existe no cadastro
                                do{
                                menuVendedor();
                                recebeString = ler.nextLine();
                                opcaoVendedor1 = Integer.parseInt(recebeString);
                                switch(opcaoVendedor1){
                                    case 1:
                                    break;
                                    case 2:
                                    break;
                                    case 3:
                                    break;
                                }
                                }while(opcaoVendedor1 != 0);
                            break;
                            case 'N':
                            //Cadastro do vendedor
                            break;

                        }

                    }while(opcaoVendedor != 0);
                
                break;
                case 2:
                    
                    do{
                        System.out.println("Voce ja e cadastrado? S/N");
                        recebeString = ler.nextLine().toUpperCase();
                        opcaoCliente = recebeString.charAt(0);
                        switch(opcaoCliente){
                            case 'S':
                            //fazer a parte que ele pergunta o nome e buscar para ver se ele existe no cadastro
                            do{
                                menuVendedor();
                                recebeString = ler.nextLine();
                                opcaoVendedor1 = Integer.parseInt(recebeString);
                                switch(opcaoVendedor1){
                                    case 1:
                                    break;
                                    case 2:
                                    break;
                                    case 3:
                                    break;
                                }
                                }while(opcaoVendedor1 != 0);
                            break;
                            case 'N':
                            //Cadastro do cliente
                            break;
                        }

                    }while(opcaoCliente != 0);
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
        System.out.println("3)VER ESTOQUE");
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
}
