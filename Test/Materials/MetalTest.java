package Materials;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MetalTest {


//-------------------------------------------------------------------

    @Test
    public void test01MetalInstanceCreated () {

        Metal metal = new Metal();
        Assert.assertNotNull(metal);
    }

//-------------------------------------------------------------------

    @Test
    public void test02MetalDurabilityTested () {

        Metal metal = new Metal();
        Assert.assertEquals(50,metal.getDurability());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------


//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}