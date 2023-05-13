package Sem11_extra.state_exF15.clase;

public class Bus {
    private IBusState state;
    private String licensePlate;

    public Bus(String licensePlate) {
        this.licensePlate = licensePlate;
        this.state=new BusAtEndOfRoute();
    }

    //getter si setter pt state

    //trebuie sa fie protected
    public IBusState getState() {
        return state;
    }

    protected void setState(IBusState state) {
        this.state = state;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    //facem pt fiecare request
    public void leaveForRoute(){
        IBusState route=new BusInRoute();
        //prin starea asta schimb noua stare
        route.changeState(this);
    }
    public void goInSevice(){
        IBusState route=new BusInService();
        //prin starea asta schimb noua stare
        route.changeState(this);
    }

    public void arriveAtTheEndOfTheRoute(){
        IBusState route=new BusAtEndOfRoute();
        //prin starea asta schimb noua stare
        route.changeState(this);
    }
}
