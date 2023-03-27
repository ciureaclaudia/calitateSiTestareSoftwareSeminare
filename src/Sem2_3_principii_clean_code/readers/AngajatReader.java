package Sem2_3_principii_clean_code.readers;



import Sem2_3_principii_clean_code.Angajat;
import Sem2_3_principii_clean_code.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {
    @Override
    public List<Aplicant> readAplicants(String fileName) throws FileNotFoundException {
        List<Aplicant> angajati = new ArrayList<Aplicant>();
        try{
            Scanner input2 = new Scanner(new File(fileName));
            input2.useDelimiter(",");

           while(input2.hasNext()){
               Angajat angajat=new Angajat();
               super.readAplicant(input2,angajat);

               angajat.setSalariu(input2.nextInt());
               angajat.setOcupatie(input2.next());
               angajati.add(angajat);
           }

            input2.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return angajati;
//        while (input2.hasNext()) {
//            Angajat angajat=new Angajat();
//            super.readAplicant(input2,angajat);

//            String nume = input2.next();
//            String prenume = input2.next();
//            int varsta = input2.nextInt();
//            int punctaj = input2.nextInt();
//            int nr = input2.nextInt();
//            String[] vect = new String[5];
//            for (int i = 0; i < nr; i++)
//                vect[i] = input2.next();
//            int salariu = input2.nextInt();
//            String ocupatie = input2.next();
//
//            angajati.add(angajat);
//        }
    }
}
