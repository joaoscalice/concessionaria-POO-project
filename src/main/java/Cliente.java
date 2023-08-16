/*João Victor Nunino Scalice
RA: 2475316
ADS 2022_02*/

public class Cliente extends Usuario{

    private int idCliente;

    public Cliente(){
        idCliente = 0;
    }

    public Cliente (int cpf , String nome, Endereco ender, int idCliente){
        super(cpf, nome, ender);
        this.idCliente = idCliente;
    }

    public int getIdCliente(){
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
