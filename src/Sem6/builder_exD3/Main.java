package Sem6.builder_exD3;

public class Main {
    public static void main(String[] args){

        ContBuilder contBuilder=new ContBuilder();
        contBuilder.setNumeClient("Andreea").setCardAtasat(true);

        ContBancar contBancar=contBuilder.build();
        System.out.println("Cont bancar: "+contBancar);

        ContBancar contBancar1=contBuilder.setNumeClient("Maria").setSalariu(true).build();
        System.out.println("Cont bancar: "+contBancar);
        System.out.println("cont bancar2: "+contBancar1); // -> SHALLOW COPY


        //A doua metoda -deep copy
        InterfataBuilder contbancarBuilder=new ContBancarBuilder();
        ContBancar cont=contbancarBuilder.setInternet(true).setNumeClient("MARILENA").build();
        ContBancar cont2=contbancarBuilder.setInternet(true).setNumeClient("Mirel").build();

        System.out.println(cont);
        System.out.println(cont2);

//        cont.setInternet(false);  -> ca sa corectam asta vom face setteri din ContBancar PROTECTED
//                                      Acum aici nu vom mai putea accesa setteri!

    }
}
