package lab01;

import java.lang.Math;

public class Sinistro{
    //lista de atributos

    private int id;
    private String data;
    private String endereco;

    //construtor 

    public Sinistro(String data, String endereco) { // quais atributos eu defino no construtor vao ser os minimos pra construir o objeto        
        this.id = Sinistro.random();
        this.data = data;
        this.endereco = endereco;
    }

    //metodos 

    public void setData(String data) {
        this.data = data;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getData() {
        return data;
    }

    public int getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public static int random() {
        int id = (int) (Math.random() * 10000);
        return id;
    }
}