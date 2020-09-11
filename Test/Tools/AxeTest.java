package Tools;

import Factory.Factory;
import Materials.Materials;
import Materials.Wood;
import Materials.Stone;
import PropiedadesMateriales.Durability;
import PropiedadesMateriales.Force;
import Wear.WearDecreasesLinearly;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {

//-------------------------------------------------------------------

    @Test
    public void test01AxeInstanceCreated () {

        Axe axe = new Axe(new Wood(), new Durability(100),new Force(10),new WearDecreasesLinearly());
        Assert.assertNotNull(axe);
    }

//-------------------------------------------------------------------

    @Test
    public void test02TheMaterialOfTheOfAxeIsWood () {

        Factory factory = new Factory();
        Axe axe = factory.makeAxeOfWood();
        Assert.assertNotNull(axe.giveMeMateirial());
    }

//-------------------------------------------------------------------

    @Test
    public void test03TheDurabilityOfAnAxeOfWoodIs100 () {

        Factory factory = new Factory();
        Axe axe = factory.makeAxeOfWood();
        Assert.assertEquals(100,axe.giveMeDurability());
    }

//-------------------------------------------------------------------

    @Test
    public void test04TheForceOfAnAxeOfWoodIs2 () {

        Factory factory = new Factory();
        Axe axe = factory.makeAxeOfWood();
        Assert.assertEquals(2,axe.giveMeForce());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------



}