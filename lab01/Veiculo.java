package lab01;
public class Veiculo{

    // atributos 

    private String placa;
    private String marca;
    private String modelo;

    //construtor

    public Veiculo(String placa, String marca, String modelo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }


    public void getPlaca(String placa){
        this.placa = placa;
    }

    public void getMarca(String marca){
        this.marca = marca;
    }

    public void getModelo(String modelo){
        this.modelo = modelo;
    }

    public String setPlaca(){
        return placa;
    }
    public String setMarca(){
        return marca;
    }
    
    public String setModelo(){
        return modelo;
    }


}   