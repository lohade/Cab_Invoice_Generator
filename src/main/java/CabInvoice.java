public class CabInvoice {
    double COST_PER_KILOMETER=10;
    int COST_PER_MINUTE=1;
    double MINIMUM_FARE=5;

    public double totalFare(double kilometer,int minute){
        double fare=(COST_PER_KILOMETER*kilometer + COST_PER_MINUTE * minute);
        if(fare<5){
            return  MINIMUM_FARE;
        }
        return fare;
    }
}