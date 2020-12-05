package Factory;

import Tools.Axe.Axe;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.plaf.PanelUI;

import static org.junit.Assert.*;

public class FactoryToolsTest {

//-------------------------------------------------------------------

    @Test
    public void test01WoodAxeIsCreated () {

        FactoryTools factoryTools = new FactoryTools();
        Axe axe = factoryTools.buildWoodenAxe();
        Assert.assertNotNull(axe);
    }

//-------------------------------------------------------------------

    @Test
    public void test02StoneAxeIsCreated () {

        FactoryTools factoryTools = new FactoryTools();
        Axe axe = factoryTools.buildStoneAxe();
        Assert.assertNotNull(axe);
    }

//-------------------------------------------------------------------

    @Test
    public void test03MetalAxeCreated () {

        FactoryTools factoryTools = new FactoryTools();
        Axe axe = factoryTools.builMetalAxe();
        Assert.assertNotNull(axe);
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}