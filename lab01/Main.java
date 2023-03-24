package lab01;

//import lab01.Sinistro;

class Main {
    public static void main(String[] args){
        if (args.length > 0) {
            System.out.println(args[0]);
        }

        Sinistro sinistro = new Sinistro("18/09/2020", "Rua da Felicidade");
        Seguradora seguradora = new Seguradora("Jurema", "122122212", "jurema@jurema.com", "ruas dos pobres numero 0");   
        Cliente cliente = new Cliente("111");
        Veiculo veiculo = new Veiculo("12D4345", "GOL", "ACER");
        
        System.out.println(cliente.verificarCpf());
    }
}