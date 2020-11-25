package Materials;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiamondTest {


//-------------------------------------------------------------------

    @Test
    public void test01DiamondInstanceCreated () {

        Diamond diamond = new Diamond();
        Assert.assertNotNull(diamond);
    }

//-------------------------------------------------------------------

    @Test
    public void test02DiamondDurabilityTested () {

        Diamond diamond = new Diamond();
        Assert.assertEquals(100,diamond.getDurability());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}