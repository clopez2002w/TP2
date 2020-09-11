package Factory;

import Materials.Stone;
import Materials.Wood;
import PropiedadesMateriales.Durability;
import PropiedadesMateriales.Force;
import Tools.Axe;
import Tools.Tool;
import Wear.WearDecreasesLinearly;

public class Factory {

    private static final int AxeOfWoodDurability = 100;
    private static final int AxeOfWoodForce = 2;

    private static final int AxeOfStoneDurability = 200;
    private static final int AxeOfStoneForce = 5;


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

//-------------------------------------------------------------------
}
