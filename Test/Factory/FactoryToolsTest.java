package Factory;

import Tools.Axe.Axe;
import Tools.Axe.Peak;
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

    @Test
    public void test04WoodPeakCreated () {

        FactoryTools factoryTools = new FactoryTools();
        Peak peak = factoryTools.builWoodenPeak();
        Assert.assertNotNull(peak);
    }

//-------------------------------------------------------------------

    @Test
    public void test05StonePeakCreated () {

        FactoryTools factoryTools = new FactoryTools();
        Peak peak = factoryTools.builStonePeak();
        Assert.assertNotNull(peak);
    }

//-------------------------------------------------------------------

    @Test
    public void test06MetalPeakCreated () {

        FactoryTools factoryTools = new FactoryTools();
        Peak peak = factoryTools.builMetalPeak();
        Assert.assertNotNull(peak);
    }

//-------------------------------------------------------------------

    @Test
    public void test07FinePeakInstanceIsCreated () {

        FactoryTools factoryTools = new FactoryTools();
        Peak peak = factoryTools.buidFinePeak();
        Assert.assertNotNull(peak);
    }

//-------------------------------------------------------------------

}