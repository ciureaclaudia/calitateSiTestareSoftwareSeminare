package sem13_14.dubluri;

import sem13_14.model.IPersoana;

public class StubPersoana implements IPersoana {
    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 17;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
