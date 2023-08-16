/*João Victor Nunino Scalice
RA: 2475316
ADS 2022_02*/

public abstract class Automovel implements QntdRodas {

    private int codVeic;
    private String placa;
    private int ano;
    private String marca;
    private String cor;

    public Automovel(){
        placa = "";
        ano = 0;
        marca = "";
        cor = "";
        codVeic = 0;
    }

    public Automovel (String placa, int ano, String marca, String cor, int codVeic){
        this.placa = placa;
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
        this.codVeic = codVeic;
    }

    public int getCodVeic() {
        return codVeic;
    }

    public void setCodVeic(int codVeic) {
        this.codVeic = codVeic;
    }

    public String getPlaca(){
        return placa;
    }

    public int getAno(){
        return ano;
    }

    public String getMarca(){
        return marca;
    }

    public String getCor(){
        return cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

