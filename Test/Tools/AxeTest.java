package Tools;

import Exceptions.NoMoreDurabilityException;
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

    @Test
    public void test05AxeOfWoodApplyWearSoDurabilityChangeFrom100To98 () throws NoMoreDurabilityException {

        Factory factory = new Factory();
        Axe axe = factory.makeAxeOfWood();
        axe.applyWear();
        Assert.assertEquals(98,axe.giveMeDurability());

    }

//-------------------------------------------------------------------

    @Test
    public void test06AxeOfStoneDurebilityIs200 () {

        Factory factory = new Factory();
        Axe axe = factory.makeAxeOfStone();
        Assert.assertEquals(200,axe.giveMeDurability());
    }

//-------------------------------------------------------------------

    @Test
    public void test065AxeOfStoneForceIs5 () {

        Factory factory = new Factory();
        Axe axe = factory.makeAxeOfStone();
        Assert.assertEquals(5,axe.giveMeForce());
    }

//-------------------------------------------------------------------

    @Test
    public void test07AxeOfStoneForceIs5 () {

        Factory factory = new Factory();
        Axe axe = factory.makeAxeOfStone();
        Assert.assertEquals(5,axe.giveMeForce());
    }

//-------------------------------------------------------------------

    @Test
    public void test08AxeOfStoneDurabilityChangeFrom200To195WhenWearIsApply () throws NoMoreDurabilityException {

        Factory factory = new Factory();
        Axe axe = factory.makeAxeOfStone();
        axe.applyWear();
        Assert.assertEquals(195,axe.giveMeDurability());
    }

//-------------------------------------------------------------------

    @Test
    public void test09AxeOfMetalIsCreated () {

        Factory factory = new Factory();
        Axe axe = factory.makeAxeOfMetal();
        Assert.assertNotNull(axe);
    }

//-------------------------------------------------------------------

    @Test
    public void test10AxeOfMetalDurabilityIs400 () {

        Factory factory = new Factory();
        Axe axe = factory.makeAxeOfMetal();
        Assert.assertEquals(400,axe.giveMeDurability());
    }

//-------------------------------------------------------------------

    @Test
    public void test11AxeOfMetalForceIs10 () {

        Factory factory = new Factory();
        Axe axe = factory.makeAxeOfMetal();
        Assert.assertEquals(10, axe.giveMeForce());
    }

//-------------------------------------------------------------------

    @Test
    public void test12AxeOfMetalDurabilityIs395AfterApplyWear () throws NoMoreDurabilityException{

        Factory factory = new Factory();
        Axe axe = factory.makeAxeOfMetal();
        axe.applyWear();
        Assert.assertEquals(395, axe.giveMeDurability());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}