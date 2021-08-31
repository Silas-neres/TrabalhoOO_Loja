package trabalho;

public class Vendedor {
    String nomeVendedor, dataNascVendedor;
    int cpfVendedor;
    public Vendedor(){

    }
    public Vendedor(String nomeVendedor, int cpfVendedor, String dataNascVendedor){
        setNomeVendedor(nomeVendedor);
        setCpfVendedor (cpfVendedor);
        setDataNascVendedor (dataNascVendedor);
    }

    public String getNomeVendedo (){
        return nomeVendedor;
    }
    public void setNomeVendedor (String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }
    public int  getCpfVendedor (){
        return cpfVendedor;
    }
    public void setCpfVendedor (int cpfVendedor) {
        this.cpfVendedor = cpfVendedor;
    }
    public String  getDataNascVendedor (){
        return dataNascVendedor;
    }
    public void setDataNascVendedor (String dataNascVendedor) {
        this.dataNascVendedor = dataNascVendedor;
    }
    
}
