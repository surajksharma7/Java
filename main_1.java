class vehicle{
    int noOfTyres;
    String type;
    abstract void runsOn();
}

class P_V extends vehicle{
    float mileage;
    float powerOutput;
    public void runsOn(){
        System.out.println("Runs on Petrol ");
    }
}

class E_V extends vehicle{
    int charging_time;
    float mileage;
    public void runsOn(){
        System.out.println("Runs of Electricity");
    }
}

public class main_1 {
    public static void main(String[] args) {
        P_V v1 = new P_V();
        v1.runsOn();
        vehicle v2 = new E_V();
        v2.runsOn();
    }
}
