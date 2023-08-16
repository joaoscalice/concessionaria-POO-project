/*João Victor Nunino Scalice
RA: 2475316
ADS 2022_02*/

public abstract class Usuario {
    private int cpf;
    private String nome;
    private Endereco ender;

    public Usuario(){
            cpf = 0;
            nome = "";
            ender = new Endereco();
        }
    public Usuario (int cpf, String nome, Endereco ender){
        this.cpf = cpf;
        this.nome = nome;
        this.ender = ender;
    }
    public int getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }


    public void setCpf(int cpf) throws NumberFormatException{
        if ( cpf > 0) {
            if (cpf <= 1000) {
                this.cpf = cpf;
            } else {
                throw new NumberFormatException();
            }
        } else {
            throw new NumberFormatException();
        }
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnder() {
        return ender;
    }

    public void setEnder(Endereco ender) {
        this.ender = ender;
    }
}

