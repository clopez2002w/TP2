package Tools.Axe;

import Attributes.Durability;
import Attributes.Strength;
import Materials.Wood;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {

//-------------------------------------------------------------------

    @Test
    public void test01AxeTestInstanceCreated () {

        Axe axe = new Axe(new Wood(),new Durability(100),new Strength(2));
        Assert.assertNotNull(axe);
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}