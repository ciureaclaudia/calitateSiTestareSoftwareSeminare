package Sem10.strategy_exD11;

public class Operator {
    private ModVerificare modVerificare;
    public Operator(){
        this.modVerificare=new VerificarePErsFizica();
    }
    public void setModVerificare(ModVerificare mod){
        this.modVerificare=mod;
    }

    public void verificaClient(){
        modVerificare.verifica();
    }
}
