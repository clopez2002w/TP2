package Materials;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoneTest {


//-------------------------------------------------------------------

    @Test
    public void test01InstanceOfStoneIsCreated () {

        Stone stone = new Stone();
        Assert.assertNotNull(stone);
    }

//-------------------------------------------------------------------

    @Test
    public void test02DurabilityOfStoneIsTested () {

        Stone stone = new Stone();
        Assert.assertEquals(30,stone.getDurability());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------


//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}