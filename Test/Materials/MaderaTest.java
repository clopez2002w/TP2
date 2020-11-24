package Materials;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaderaTest {

//-------------------------------------------------------------------

    @Test
    public void test01InstanceOfMaderaIsCreated () {

        Madera madera = new Madera();
        Assert.assertNotNull(madera);
    }

//-------------------------------------------------------------------

    @Test
    public void test02TestMaderaDurability () {

        Madera madera = new Madera();
        Assert.assertEquals(10,madera.getDurability());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}