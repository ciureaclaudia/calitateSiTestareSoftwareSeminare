package sem13_14.dubluri;

import sem13_14.model.IPersoana;

public class FakePersoana implements IPersoana {
    private int getVarsta;
    private boolean checkCNPVarsta;

    @Override
    public String getSex() {
        return null;
    }

    @Override
    public int getVarsta() {
        return getVarsta;
    }

    @Override
    public boolean checkCNP() {
        return checkCNPVarsta;
    }

    public void setGetVarsta(int getVarsta) {
        this.getVarsta = getVarsta;
    }

    public void setCheckCNPVarsta(boolean checkCNPVarsta) {
        this.checkCNPVarsta = checkCNPVarsta;
    }
}
