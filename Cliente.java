
package Modelo;


public class Cliente {
    
    private String nome, cpf, endereço, telefone;
   
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCPF() {
        return cpf;
    }
    
    public void setCPF(String CPF){
        this.cpf = CPF;
    }
    
    public String getEndereço(){
        return endereço;
    }
    
    public void setEndereço(String Endereço){
        this.endereço = Endereço;
}
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String Telefone){
        this.telefone = Telefone;
    }
}
