package Sem10.strategy_exD11;

public class Main {
    public static void main(String[] args ){
        Operator operator=new Operator();
        operator.verificaClient();

        operator.setModVerificare(new VerificarePersJurisica());
        operator.verificaClient();
    }
}
