package Attributes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DurabilityTest {

//-------------------------------------------------------------------

    @Test
    public void test01DurebilityInstanceCreated () {

        Durability durability = new Durability(10);
        Assert.assertNotNull(durability);
    }

//-------------------------------------------------------------------

    @Test
    public void test02getDurability () {

        Durability durability = new Durability(10);
        Assert.assertEquals(10,durability.getDurability());

    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}