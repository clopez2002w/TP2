package Factory;

import Materials.Metal;
import Materials.Stone;
import Materials.Wood;
import PropiedadesMateriales.Durability;
import PropiedadesMateriales.Force;
import Tools.Axe;
import Tools.Peak;
import Tools.Tool;
import Wear.WearDecreasesDividedByFactor;
import Wear.WearDecreasesLinearly;

public class Factory {

    private static final int AxeOfWoodDurability = 100;
    private static final int AxeOfWoodForce = 2;

    private static final int AxeOfStoneDurability = 200;
    private static final int AxeOfStoneForce = 5;

    private static final int AxeOfMetalDurability = 400;
    private static final int AxeOfMetalForce = 10;
    private static final int AxeOfMetalFactor = 2;

    private static final int PeakOfWoodDurability = 100;
    private static final int PeakOfWoodForce = 2;


//-------------------------------------------------------------------

    public Axe makeAxeOfWood ()
    {
       return new Axe(new Wood(), new Durability(AxeOfWoodDurability),new Force(AxeOfWoodForce), new WearDecreasesLinearly());
    }

//-------------------------------------------------------------------

    public Axe makeAxeOfStone ()
    {
        return new Axe(new Stone(), new Durability(AxeOfStoneDurability),new Force(AxeOfStoneForce), new WearDecreasesLinearly());
    }

//-------------------------------------------------------------------

    public Axe makeAxeOfMetal ()
    {
        return new Axe(new Metal(),new Durability(AxeOfMetalDurability), new Force(AxeOfMetalForce), new WearDecreasesDividedByFactor(AxeOfMetalFactor));
    }

//-------------------------------------------------------------------
//-------------------------------------------------------------------
//-------------------------------------------------------------------

    public Peak makePeakOfWood ()
    {
        return new Peak(new Wood(), new Durability(PeakOfWoodDurability), new Force(PeakOfWoodForce), new WearDecreasesLinearly());
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

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------
}
