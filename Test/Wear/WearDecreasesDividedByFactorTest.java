package Wear;

import PropiedadesMateriales.Durability;
import PropiedadesMateriales.Force;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WearDecreasesDividedByFactorTest {

//-------------------------------------------------------------------

    @Test
    public void test01WearDecreasesDividedByFactorInstanceCreated () {

        WearDecreasesDividedByFactor wear = new WearDecreasesDividedByFactor(2);
        Assert.assertNotNull(wear);
    }

//-------------------------------------------------------------------

    @Test
    public void test02WearDecreasesDividedByFactorReturnXWhenDurabilityIs400AndForceIs10 () {

        WearDecreasesDividedByFactor wear = new WearDecreasesDividedByFactor(2);
        Durability durability = new Durability(400);
        Force force = new Force(10);
        wear.applyWear(durability,force);
        Assert.assertEquals(395,durability.getDurability());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}