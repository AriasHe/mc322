package lab01;

public class Cliente{
    // atributos 

    private String nome;
    private String cpf;
    private String dataNascimento; 
    private int idade;
    private String endereco;

    // construtor

    public Cliente(String cpf){

        this.cpf = cpf;
    }


    public void getNome(String nome){
        this.nome = nome;
    }
    
    public void getCpf(String cpf){
        this.cpf = cpf;
    } 

    public void getDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public void getEndereco(String endereco){
        this.endereco = endereco;
    }

    public void getIdade(int idade){
        this.idade = idade;
    }

    public int setIdade(){
        return idade;
    }

    public String setEndereco(){
        return endereco;
    }

    public String setDataNascimento(){
        return dataNascimento;
    }
    public String setCpf(){
        return cpf;

    }
    public String setNome(){
        return nome;
    }

    public boolean validacao_numero(String cpf_numero){
        if(cpf_numero.length()!= 11){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean validacao_igualdade(String cpf_numero){
        for(int i = 0; i < cpf_numero.length(); i++){
            if(cpf_numero.charAt(0)!=cpf_numero.charAt(i)){
                break;
            }
            if(i==10){
                return false;
            }
        }
        return true;
    }

    public int soma(int limite_sup,int limite_inf, String cpf_numero){
        int k =0,soma=0;
        for(int i=limite_sup;i>limite_inf;i--){
            soma = soma + i*(cpf_numero.charAt(k) - '0');
            k++; 
        }
        return soma;

    }


    public int verificador(int verificador){
        if((verificador) % 11 == 10 || verificador % 11 == 0 ){
            verificador = 0;
        } else{
            verificador = 11 - (verificador) % 11;
        }
        return verificador;
    }

    public boolean verificarVerificadores(int verificadorUm, int verificadorDois, String cpf_numero)
    {
        if(verificadorUm == (cpf_numero.charAt(9)-48) && verificadorDois == (cpf_numero.charAt(10)-48)){
            return true;
        }else{
            return false;
        }

    }
    public boolean verificarCpfDados(String cpf_numero){
        int verificadorUm = 0,verificadorDois = 0, limite_sup1=10,limite_sup2=11,limite_inf1=1,limite_inf2=2;

        verificadorUm=verificador(soma(limite_sup1,limite_inf1,cpf_numero));    

        verificadorDois = verificador(soma(limite_sup2,limite_inf2,cpf_numero) + 2*verificadorUm);

        return verificarVerificadores(verificadorUm, verificadorDois, cpf_numero);
        

    }
    
    public boolean verificarCpf(){
        String cpf_numero = cpf.replaceAll("\\D","");
       
       if(validacao_numero(cpf_numero)==false || validacao_igualdade(cpf_numero)== false){
            return false;
       }    
       return(verificarCpfDados(cpf_numero));

    }

}