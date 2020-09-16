package Wear;

import PropiedadesMateriales.Durability;
import PropiedadesMateriales.Force;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WearDecreasesLinearlyTest {

//-------------------------------------------------------------------

    @Test
    public void test01WearDecreasesLinearlyCreateInstance () {

        WearDecreasesLinearly wear = new WearDecreasesLinearly();
        Assert.assertNotNull(wear);
    }

//-------------------------------------------------------------------

    @Test
    public void test01WearDecreasesLinearlyApplyReturnDurability98WhenDurabilityIs100AndForceIs2 () {

        WearDecreasesLinearly wear = new WearDecreasesLinearly();
        Force force = new Force(2);
        Durability durability = new Durability(100);
        Assert.assertEquals(98,wear.applyWear(durability,force));
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}