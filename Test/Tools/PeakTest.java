package Tools;

import Factory.Factory;
import Materials.Wood;
import PropiedadesMateriales.Durability;
import PropiedadesMateriales.Force;
import Wear.WearDecreasesLinearly;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeakTest {

//-------------------------------------------------------------------

    @Test
    public void test01PeakInstanceCreated () {


        Peak peak = new Peak(new Wood(),new Durability(100),new Force(2),new WearDecreasesLinearly());
        Assert.assertNotNull(peak);
    }

//-------------------------------------------------------------------

    @Test
    public void test02TheMaterialOfThePeakIsWood () {

        Factory factory = new Factory();
        Peak peak = factory.makePeakOfWood();
        Assert.assertNotNull(peak.giveMeMateirial());
    }

//-------------------------------------------------------------------

    @Test
    public void test03TheDurabilityOfAPeakOfWoodIs100 () {

        Factory factory = new Factory();
        Peak peak = factory.makePeakOfWood();
        Assert.assertEquals(100,peak.giveMeDurability());
    }


//-------------------------------------------------------------------

    @Test
    public void test04TheForceOfAPeakOfWoodIs2 () {

        Factory factory = new Factory();
        Peak peak = factory.makePeakOfWood();
        Assert.assertEquals(2,peak.giveMeForce());
    }

//-------------------------------------------------------------------

    @Test
    public void test05PeakOfWoodApplyWearSoDurabilityChangeFrom100To98 () {

        Factory factory = new Factory();
        Peak peak = factory.makePeakOfWood();
        peak.applyWear();
        Assert.assertEquals(98,peak.giveMeDurability());

    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}