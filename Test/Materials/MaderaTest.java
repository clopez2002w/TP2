package Materials;

import org.junit.Assert;
import org.junit.Test;

public class MaderaTest {

//-------------------------------------------------------------------

    @Test
    public void test01InstanceOfMaderaIsCreated () {

        Wood madera = new Wood();
        Assert.assertNotNull(madera);
    }

//-------------------------------------------------------------------

    @Test
    public void test02TestMaderaDurability () {

        Wood madera = new Wood();
        Assert.assertEquals(10,madera.getDurability());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}