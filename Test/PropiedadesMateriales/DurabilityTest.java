package PropiedadesMateriales;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DurabilityTest {

//-------------------------------------------------------------------

    @Test
    public void test01WeCreateInstanceOfDurability () {

        Durability durability = new Durability(10);
        Assert.assertNotNull(durability);
    }

//-------------------------------------------------------------------

    @Test
    public void test02GetDurability () {

        Durability durability = new Durability(100);
        Assert.assertEquals(100,durability.getDurability());
    }

//-------------------------------------------------------------------

    @Test
    public void test03AfterDurabilityWasCreatedNewValueIsSeted () {

        Durability durability = new Durability(100);
        durability.setDurability(95);
        Assert.assertEquals(95,durability.getDurability());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}