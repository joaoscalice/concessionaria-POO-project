/*João Victor Nunino Scalice
RA: 2475316
ADS 2022_02*/

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.showInputDialog;

public class GerConcessionaria{

    private Usuario user;
    private List<Usuario> bdUser = null;
    private static GerConcessionaria gerConcessionaria = null;

    public List<Usuario> getBdUser(){
        return bdUser;
    }
    
    private GerConcessionaria(){
        bdUser = new ArrayList();
    }
    
    public static GerConcessionaria getGerConcessionaria(){
        if(gerConcessionaria == null){
           gerConcessionaria = new GerConcessionaria();
            return gerConcessionaria;
        }
        return gerConcessionaria;
    }

    public Usuario cadUser(Usuario user){

        if(consUser(user)== null){
            bdUser.add(user);
            return user;
        }
        else{
            return null;
        }

    }

    public Usuario consUser(Usuario user){
        for(int i = 0; i < bdUser.size(); i++){
            if(user.getCpf() == bdUser.get(i).getCpf() && user.getClass() == bdUser.get(i).getClass()){
                return bdUser.get(i);
            }
        }
        return null;
    }

    public Usuario removeUser(Usuario user){
        Usuario aux = consUser(user);
        if(aux != null){
            bdUser.remove(aux);
            return null;
        }
        else{
            return user;
        }

    }

    public Usuario attUser(Usuario user){
        for(int i = 0; i < bdUser.size(); i++){
            if(user.getCpf() == bdUser.get(i).getCpf()){
                String nome = showInputDialog(null, "Informe o NOVO nome", "Atualização", JOptionPane.QUESTION_MESSAGE);
                user.setNome(nome);
                String rua = showInputDialog(null, "Informe a NOVA rua", "Atualização", JOptionPane.QUESTION_MESSAGE);
                user.getEnder().setRua(rua);
                int num = Integer.parseInt(showInputDialog(null, "Informe o NOVO número", "Atualização", JOptionPane.QUESTION_MESSAGE));
                user.getEnder().setNum(num);
                int cep = Integer.parseInt(showInputDialog(null, "Informe o NOVO cep", "Atualização", JOptionPane.QUESTION_MESSAGE));
                user.getEnder().setCep(cep);
                
                if(bdUser.get(i).getClass() == new Cliente().getClass())
                    ((Cliente)user).setIdCliente(Integer.parseInt(showInputDialog(null, "Informe o NOVO ID de Cliente", "Atualização", JOptionPane.QUESTION_MESSAGE)));
                
                
                if(bdUser.get(i).getClass() == new Funcionario().getClass())
                    ((Funcionario)user).setIdFuncio(Integer.parseInt(showInputDialog(null, "Informe o NOVO ID de Funcionário", "Atualização", JOptionPane.QUESTION_MESSAGE)));
                
                bdUser.set(i, user);
                return bdUser.get(i);
            }
        }
        return null;
    }

    private Automovel auto;
    private List<Automovel> bdAuto = new ArrayList<>();

    public List<Automovel> getBdAuto(){
        return bdAuto;
    }

    public Automovel cadAuto(Automovel auto){

        if(consAuto(auto)== null){
            bdAuto.add(auto);
            return auto;
        }
        else{
            return null;
        }

    }

    public Automovel consAuto(Automovel auto){
        for(int i = 0; i < bdAuto.size(); i++){
            if(auto.getCodVeic() == bdAuto.get(i).getCodVeic() && auto.getClass() == bdAuto.get(i).getClass()){
                return bdAuto.get(i);
            }
        }
        return null;
    }

    public Automovel removeAuto(Automovel auto){
        auto = consAuto(auto);
        if(auto != null){
            bdAuto.remove(auto);
            return null;
        }
        else{
            return auto;
        }

    }

    public Automovel attAuto(Automovel auto){
        for(int i = 0; i < bdAuto.size(); i++){
            if(auto.getCodVeic() == bdAuto.get(i).getCodVeic()){
                String marca = showInputDialog(null, "Informe a NOVA marca", "Atualização", JOptionPane.QUESTION_MESSAGE);
                auto.setMarca(marca);
                String placa = showInputDialog(null, "Informe a NOVA placa", "Atualização", JOptionPane.QUESTION_MESSAGE);
                auto.setPlaca(placa);
                String cor = showInputDialog(null, "Informe a NOVA cor", "Atualização", JOptionPane.QUESTION_MESSAGE);
                auto.setCor(cor);
                int ano = Integer.parseInt(showInputDialog(null, "Informe o NOVO ano", "Atualização", JOptionPane.QUESTION_MESSAGE));
                auto.setAno(ano);
                int codVeic = Integer.parseInt(showInputDialog(null, "Informe o NOVO código", "Atualização", JOptionPane.QUESTION_MESSAGE));
                auto.setCodVeic(codVeic);

                if(bdAuto.get(i).getClass() == new Moto().getClass()){
                    ((Moto)auto).setTipo(showInputDialog(null, "Informe o NOVO tipo", "Atualização", JOptionPane.QUESTION_MESSAGE));
                    ((Moto)auto).setCilindrada(Integer.parseInt(showInputDialog(null, "Informe a NOVA cilindrada", "Atualização", JOptionPane.QUESTION_MESSAGE)));
                }

                if(bdAuto.get(i).getClass() == new Carro().getClass()){
                    ((Carro)auto).setnAirbags(Integer.parseInt(showInputDialog(null, "Informe a NOVA quantidade de Airbags", "Atualização", JOptionPane.QUESTION_MESSAGE)));
                    ((Carro)auto).setnChassi(Integer.parseInt(showInputDialog(null, "Informe o NOVO número do Chassi", "Atualização", JOptionPane.QUESTION_MESSAGE)));
                    ((Carro)auto).setTracao(showInputDialog(null, "Informe a NOVA tração", "Atualização", JOptionPane.QUESTION_MESSAGE));
                }

                bdAuto.set(i, auto);
                return bdAuto.get(i);

            }
        }
        return null;
    }
}


