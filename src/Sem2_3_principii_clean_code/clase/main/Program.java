package Sem2_3_principii_clean_code.clase.main;


import Sem2_3_principii_clean_code.clase.Aplicant;
import Sem2_3_principii_clean_code.clase.readers.AngajatReader;
import Sem2_3_principii_clean_code.clase.readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AplicantReader aplicantReader=new AngajatReader();
			listaAngajati= ((AngajatReader) aplicantReader).readAplicants("angajati.txt");

			for(Aplicant aplicant:listaAngajati){
				System.out.println(aplicant.toString());
				aplicant.afisareFinantare();


			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
