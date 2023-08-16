/*João Victor Nunino Scalice
RA: 2475316
ADS 2022_02*/

public class Carro extends Automovel {
    private int nChassi;
    private int nAirbags;
    private String tracao;

    public Carro(){
        nChassi = 0;
        nAirbags = 0;
        tracao = "";
    }
    public Carro(String placa, int ano, String marca, String cor, int codVeic, int nChassi, int nAirbags, String tracao ){
        super(placa, ano, marca, cor, codVeic);
        this.nChassi = nChassi;
        this.nAirbags = nAirbags;
        this.tracao = tracao;
    }

    public int getNCHASSI(){
        return nChassi;
    }

    public int getNAIRBAGS(){
        return nAirbags;
    }

    public String getTRACAO(){
        return tracao;
    }

    public void setnChassi(int nChassi) {
        this.nChassi = nChassi;
    }

    public void setnAirbags(int nAirbags) {
        this.nAirbags = nAirbags;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    public int totalRodas(){
        return 4;
    }
}
