package Tools;

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

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}