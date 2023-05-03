package Sem10.composite_exD9;

public interface IUnitateBancara {
    void adaugaUnitate(IUnitateBancara u);
    void stergeUnitate(IUnitateBancara u);
    IUnitateBancara getUnitate(int index);
    void printDescrierere(String indentare);
}
