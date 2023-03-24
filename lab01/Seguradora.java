package lab01;
public class Seguradora{
    
    // lista de atributos 

    private String nome;
    private String telefone;
    private String email;
    private String endereco;

    // contrutor 

    public Seguradora(String nome, String telefone, String email, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    //metodos pq fazer os métodos como publico??

    public void setNome(String nome){
        this.nome = nome; 
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String setTelefone(){
        return telefone;
    }
    public String getNome(){
        return nome;
    }

    public String getemail(){
        return email;
    }

    public String getendereco(){
        return endereco;
    }
}