/*João Victor Nunino Scalice
RA: 2475316
ADS 2022_02*/

public class Moto extends Automovel{

    private int cilindrada;
    private String tipo;

    public Moto(){
        cilindrada = 0;
        tipo = "";
    }


    public Moto (String placa, int ano, String marca, String cor, int codVeic, int cilindrada, String tipo){
        super(placa, ano, marca, cor, codVeic);
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public int getCilin(){
        return cilindrada;
    }

    public String getType(){
        return tipo;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int totalRodas(){
        return 2;
    }
}
