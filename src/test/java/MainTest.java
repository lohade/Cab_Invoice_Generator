import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    CabInvoice invoice=new CabInvoice();

    @Test
    public void whenEnterValue_returnTotalFare(){

        double res=invoice.totalFare(0.8,2);
        Assert.assertEquals(10.0,res,0.0);
    }

    @Test
    public void whenMinimumDistance_returnMinimumFare(){
        double result=invoice.totalFare(0.2,2);
        Assert.assertEquals(5,result,0.0);
    }
    @Test
    public void whenEnterAllRide_returnTotalFare(){
        RideDetails[] ride={
                new RideDetails(0.9,3),
                new RideDetails(2.0,7),
        };
        double res=invoice.calculateTotalFare(ride);
        Assert.assertEquals(39.0,res,0.0);
    }
}
