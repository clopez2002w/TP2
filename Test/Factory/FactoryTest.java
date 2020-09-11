package Factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTest {

//-------------------------------------------------------------------

    @Test
    public void test01FactoryInstanceCreated () {

        Factory factory = new Factory();
        Assert.assertNotNull(factory);
    }

//-------------------------------------------------------------------

    @Test
    public void test02FactoryCreateAxeOfWood () {

        Factory factory = new Factory();
        Assert.assertNotNull(factory.makeAxeOfStone());
    }

//-------------------------------------------------------------------

    @Test
    public void test03FactoryCreateAxeOfStone () {

        Factory factory = new Factory();
        Assert.assertNotNull(factory.makeAxeOfStone());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}