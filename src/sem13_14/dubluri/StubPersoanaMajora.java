package sem13_14.dubluri;

import Sem11_extra.state_exF15.clase.IBusState;
import sem13_14.model.IPersoana;

public class StubPersoanaMajora implements IPersoana {
    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() {
        return 18;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
