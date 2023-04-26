package Sem9.facade_exA6;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade() {
        this.medic = new Medic();
        medic.adaugaPacient(new Pacient("Maria", 5));
        medic.adaugaPacient(new Pacient("AnanasPacient", 1));
        medic.adaugaPacient(new Pacient("CocosPcient", 2));
        this.salon = new Salon();
        salon.adaugaPatLiber(23);
        salon.adaugaPatLiber(31);
    }

    public void interneazaPacient(String numePacientInternat) {
        //verific daca pacientul are trimitere
        if (medic.verificaTrimitere(medic.getPacient(numePacientInternat))) {
            if (salon.verificarePatLiber()) {
                if (medic.getPacient(numePacientInternat).getGravitate() > 4) {
                    System.out.println("Pacientul " + numePacientInternat + " a fost internat");
                    salon.ocupaPat();//trebuie sa ocupam un pat in salon
                } else {
                    //pacientul nu egrav deci nu e internat
                    System.out.println("Pacientul " + numePacientInternat + " pleaca ba acasa ca esti sanatos tun");
                }
            } else {
                System.out.println("Nu sunt paturi libere pleaca de aici " + numePacientInternat);
            }
        } else {
            System.out.println("N ai trimitere de la medic nu e ok pleaca acasa "+ numePacientInternat);
        }

    }
}
