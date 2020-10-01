package Wear;

import Exceptions.NoMoreDurabilityException;
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
    public void test02WearDecreasesLinearlyApplyReturnDurability98WhenDurabilityIs100AndForceIs2 () throws NoMoreDurabilityException {

        WearDecreasesLinearly wear = new WearDecreasesLinearly();
        Force force = new Force(2);
        Durability durability = new Durability(100);
        wear.applyWear(durability,force);
        Assert.assertEquals(98,durability.getDurability());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}