package model;
public class Dado {

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
        public int numPessoasCadas = 0;
        public String[] getListaMarca() {
            return listaMarca;
        }

        public void setListaMarca(String[] listaMarca) {
            this.listaMarca = listaMarca;
        }

        public String[] getListaNome() {
            return listaNome;
        }

        public void setListaNome(String[] listaNome) {
            this.listaNome = listaNome;
        }

        public int[] getListaTamanho() {
            return listaTamanho;
        }

        public void setListaTamanho(int[] listaTamanho) {
            this.listaTamanho = listaTamanho;
        }

        public String[] getListaCor() {
            return listaCor;
        }

        public void setListaCor(String[] listaCor) {
            this.listaCor = listaCor;
        }

        public Double[] getListaValorProduto() {
            return listaValorProduto;
        }

        public void setListaValorProduto(Double[] listaValorProduto) {
            this.listaValorProduto = listaValorProduto;
        }

        public int[] getListaCategoria() {
            return listaCategoria;
        }

        public void setListaCategoria(int[] listaCategoria) {
            this.listaCategoria = listaCategoria;
        }

        public String[] getListaTipoBico() {
            return listaTipoBico;
        }

        public void setListaTipoBico(String[] listaTipoBico) {
            this.listaTipoBico = listaTipoBico;
        }

        public String[] getListaMaterial() {
            return listaMaterial;
        }

        public void setListaMaterial(String[] listaMaterial) {
            this.listaMaterial = listaMaterial;
        }

        public Double[] getListaCircunferenciaCano() {
            return listaCircunferenciaCano;
        }

        public void setListaCircunferenciaCano(Double[] listaCircunferenciaCano) {
            this.listaCircunferenciaCano = listaCircunferenciaCano;
        }

        public Double[] getListaAlturaSalto() {
            return listaAlturaSalto;
        }

        public void setListaAlturaSalto(Double[] listaAlturaSalto) {
            this.listaAlturaSalto = listaAlturaSalto;
        }

        public String[] getListaDepartamento() {
            return listaDepartamento;
        }

        public void setListaDepartamento(String[] listaDepartamento) {
            this.listaDepartamento = listaDepartamento;
        }

        public String[] getListaTipoTrava() {
            return listaTipoTrava;
        }

        public void setListaTipoTrava(String[] listaTipoTrava) {
            this.listaTipoTrava = listaTipoTrava;
        }

        public String[] getListaModeloCadarco() {
            return listaModeloCadarco;
        }

        public void setListaModeloCadarco(String[] listaModeloCadarco) {
            this.listaModeloCadarco = listaModeloCadarco;
        }

        public String[] getListaTipoCorreia() {
            return listaTipoCorreia;
        }

        public void setListaTipoCorreia(String[] listaTipoCorreia) {
            this.listaTipoCorreia = listaTipoCorreia;
        }

        public String[] getListaEstetica() {
            return listaEstetica;
        }

        public void setListaEstetica(String[] listaEstetica) {
            this.listaEstetica = listaEstetica;
        }

        public Double[] getListaAlturaCano() {
            return listaAlturaCano;
        }

        public void setListaAlturaCano(Double[] listaAlturaCano) {
            this.listaAlturaCano = listaAlturaCano;
        }

        public String[] getListaModelo() {
            return listaModelo;
        }

        public void setListaModelo(String[] listaModelo) {
            this.listaModelo = listaModelo;
        }

        public String[] getListaNomePessoa() {
            return listaNomePessoa;
        }

        public void setListaNomePessoa(String[] listaNomePessoa) {
            this.listaNomePessoa = listaNomePessoa;
        }

        public String[] getListaDataNasc() {
            return listaDataNasc;
        }

        public void setListaDataNasc(String[] listaDataNasc) {
            this.listaDataNasc = listaDataNasc;
        }

        public String[] getListaCpf() {
            return listaCpf;
        }

        public void setListaCpf(String[] listaCpf) {
            this.listaCpf = listaCpf;
        }

        public String[] getListaTelefone() {
            return listaTelefone;
        }

        public void setListaTelefone(String[] listaTelefone) {
            this.listaTelefone = listaTelefone;
        }

        public String[] getListaTipoUsuario() {
            return listaTipoUsuario;
        }

        public void setListaTipoUsuario(String[] listaTipoUsuario) {
            this.listaTipoUsuario = listaTipoUsuario;
        }

        public int[] getListaQuantidade() {
            return listaQuantidade;
        }

        public void setListaQuantidade(int[] listaQuantidade) {
            this.listaQuantidade = listaQuantidade;
        }

        public String[] getListaId() {
            return listaId;
        }

        public void setListaId(String[] listaId) {
            this.listaId = listaId;
        }

        int listaQuantidade[] = new int[100];
        String listaId[] = new String[100];

    public Dado() {

        numPessoasCadas = 3;

        //Sapatilhas
        listaNome[0] = "SAPATILHA MOLECA LISTRADA";
        listaId[0] = "S1";
        listaMarca[0] = "MOLECA";
        listaTamanho[0] = 38;
        listaCor[0] = "BRANCO";
        listaValorProduto[0] = 62.91;
        listaTipoBico[0] = "FINO";
        listaMaterial[0] = "BORRACHA";
        listaQuantidade[0] = 5;

        listaNome[1] = "SAPATILHA FEMININA PICCADILLY 250132";
        listaId[1] = "S2";
        listaMarca[1] = "PICCADILLY";
        listaTamanho[1] = 37;
        listaCor[1] = "PRETO";
        listaValorProduto[1] = 109.99;
        listaTipoBico[1] = "QUADRADO";
        listaMaterial[1] =  "COURO";
        listaQuantidade[1] = 3;

        listaNome[2] = "SAPATILHA FEMININA LAÇO NOBUNK";
        listaId[2] = "s3";
        listaMarca[2] = "TORRICELLA";
        listaTamanho[2] = 37;
        listaCor[2] = "BRANCO";
        listaValorProduto[2] = 160.19;
        listaTipoBico[2] = "FINO";
        listaMaterial[2] = "BORRACHA";
        listaQuantidade[2] = 6;

        //BOTA
        listaNome[3] = "COTURNO PEGADA TRATORADO SHERPA";
        listaId[3] = "B1";
        listaMarca[3] = "PEGADA";
        listaTamanho[3] = 38;
        listaCor[3] = "PRETO";
        listaValorProduto[3] = 299.90;
        listaCircunferenciaCano[3] = 25.0;
        listaAlturaSalto[3] = 7.0;
        listaQuantidade[3] = 5;

        listaNome[4] = "BOTA PICCADILLY CANO CURTO";
        listaId[4] = "B2";
        listaMarca[4] = "PICCADILY";
        listaTamanho[4] = 36;
        listaCor[4] = "MARROM";
        listaValorProduto[4] = 159.90;
        listaCircunferenciaCano[4] = 20.0;
        listaAlturaSalto[4] = 5.0;
        listaQuantidade[4] = 4;

        listaNome[5] = "BOTA MISSISSIPI CANO CURTO";
        listaId[5] = "B3";
        listaMarca[5] = "MISSISSIPI";
        listaTamanho[5] = 38;
        listaCor[5] = "MARROM";
        listaValorProduto[5] = 164.50;
        listaCircunferenciaCano[5] = 25.0;
        listaAlturaSalto[5] = 5.0;
        listaQuantidade[5] = 8;

        //CHUTEIRAS
        listaNome[6] = "CHUTEIRA SOCIETY NIKE BECO 2 TF";
        listaId[6] = "C1";
        listaMarca[6] = "NIKE";
        listaTamanho[6] = 41;
        listaCor[6] = "VERMALHO";
        listaValorProduto[6] = 140.00;
        listaQuantidade[6] = 8;
        listaDepartamento[6] = "ESPORTE";
        listaTipoTrava[6] = "PEQUENA";
        listaModeloCadarco[6] = "TRADICINAL";

        listaNome[7] = "CHUTEIRA BOTINHA SOCIETY";
        listaId[7] = "C2";
        listaMarca[7] = "FRONTINNI";
        listaTamanho[7] =40;
        listaCor[7] = "LARANJA";
        listaValorProduto[7] = 109.90;
        listaQuantidade[7] = 8;
        listaDepartamento[7] = "ESPORTE";
        listaTipoTrava[7] = "PEQUENA";
        listaModeloCadarco[7] = "SEM";

        listaNome[8] = "CHUTEIRA FUTSAL MIZUNO MORELIA CLUB IN N";
        listaId[8] = "C3";
        listaMarca[8] = "MIZUNO";
        listaTamanho[8] = 40;
        listaCor[8] = "PRETO";
        listaValorProduto[8] = 110.0;
        listaQuantidade[8] = 8;
        listaDepartamento[8] = "ESPORTE";
        listaTipoTrava[8] = "SEM TRAVA";
        listaModeloCadarco[8] = "TRADICINAL";

        //CHINELO

        listaNome[9] = "CHINELO HOKA ONE ONE ORA RECOVERY SLIDE";
        listaId[9] = "CH1";
        listaMarca[9] = "HOKA ONE ONE";
        listaTamanho[9] = 38;
        listaCor[9] = "BRANCO";
        listaValorProduto[9] = 400.0;
        listaQuantidade[9] = 8;
        listaTipoCorreia[9] = "TIRA LARGA";
        listaEstetica[9]= "LISO";

        listaNome[10] = "SANDALIA FEMENINO MODARE SENSE FLEX";
        listaId[10] = "CH2";
        listaMarca[10] = "MODARE";
        listaTamanho[10] = 37;
        listaCor[10] = "VINHO";
        listaValorProduto[10] = 70.0;
        listaQuantidade[10] = 5;
        listaTipoCorreia[10] = "TRADICINAL";
        listaEstetica[10] = "LISO";

        listaNome[11] = "HAVAIANAS CONSERVAÇAO INTERNACIONAL";
        listaId[11] = "CH3";
        listaMarca[11] = "HAVAIANAS";
        listaTamanho[11] = 41;
        listaCor[11] = "AZUL";
        listaValorProduto[11] = 44.90;
        listaQuantidade[11] = 8;
        listaTipoCorreia[11] = "TRADICIONAL";
        listaEstetica[11]= "ESTAMPADA";

        //TENIS

        listaNome[12] = "TENIS NIKE PRECISION V";
        listaId[12] = "T1";
        listaMarca[12] = "NIKE";
        listaTamanho[12] = 41;
        listaCor[12] = "BRANCO";
        listaValorProduto[12] = 269.99;
        listaQuantidade[12] = 10;
        listaAlturaCano[12] = 0.0;
        listaModelo[12] = "ESPORTIVO";
        
        listaNome[13] = "TENIS ALL STAR CONVERSE CHUCK TAYLOR";
        listaId[13] = "T2";
        listaMarca[13] = "ALL STAR CONVERSE";
        listaTamanho[13] = 40;
        listaCor[13] = "BRANCO";
        listaValorProduto[13] = 179.99;
        listaQuantidade[13] = 8;
        listaAlturaCano[13] = 0.0;
        listaModelo[13] = "CANO BAIXO";

        listaNome[14] = "TENIS DIVERSAO CANVAS HI ZIPER";
        listaId[14] = "T3";
        listaMarca[14] = "DIVERSAO";
        listaTamanho[14] = 30;
        listaCor[14] = "AZUL";
        listaValorProduto[14] = 139.90;
        listaQuantidade[14] = 8;
        listaAlturaCano[14] = 22.1;
        listaModelo[14] = "CANO ALTO";

        //PESSOAS

        listaNomePessoa[0] = "SAMUEL VICTOR";
        listaCpf[0] = "11111111111";
        listaDataNasc[0] = "10/05/1999";
        listaTelefone[0] = "(61)98564-1546";
        listaTipoUsuario[0]= "VENDEDOR";

        listaNomePessoa[1] = "GABRIEL CARDOSO";
        listaCpf[1] = "22222222222";
        listaDataNasc[1] = "25/01/2000";
        listaTelefone[1] = "(61)999147586";
        listaTipoUsuario[1] = "CLIENTE";

        listaNomePessoa[2] = "CARLOS EDUARDO";
        listaCpf[2] = "33333333333";
        listaDataNasc[2] = "02/12/1998";
        listaTelefone[2] = "(61)983054789";
        listaTipoUsuario[2]= "CLIENTE";

    }

    public void Dado() {
    }
   
}