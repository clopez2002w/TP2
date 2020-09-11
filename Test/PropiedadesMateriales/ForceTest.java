package PropiedadesMateriales;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ForceTest {

//-------------------------------------------------------------------

    @Test
    public void test01ForceInstanceCreated () {

        Force force = new Force(10);
        Assert.assertNotNull(force);
    }



//-------------------------------------------------------------------

    @Test
    public void test02GetForceValue () {

        Force force = new Force(500);
        Assert.assertEquals(500,force.getForce());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}