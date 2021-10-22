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
}
