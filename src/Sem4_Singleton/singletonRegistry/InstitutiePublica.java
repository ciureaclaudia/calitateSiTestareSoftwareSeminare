package Sem4_Singleton.singletonRegistry;

import java.util.HashMap;
import java.util.Map;

public class InstitutiePublica {
    private String denumire;
    private int numarAngajati;
    private static Map<String, InstitutiePublica> registruInstitutii = new HashMap();

    private InstitutiePublica(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
    }

    public static synchronized InstitutiePublica getInstance(String denumire) {
        if (!registruInstitutii.containsKey(denumire)) {
            registruInstitutii.put(denumire, new InstitutiePublica(denumire, 0));
        }

        return (InstitutiePublica)registruInstitutii.get(denumire);
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InstitutiePublica{");
        sb.append("denumire='").append(this.denumire).append('\'');
        sb.append(", numarAngajati=").append(this.numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
