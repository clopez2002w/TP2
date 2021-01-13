package Factory;

import Attributes.Durability;
import Attributes.Strength;
import Materials.Material;
import Materials.Metal;
import Materials.Stone;
import Materials.Wood;
import Tools.Axe.Axe;

public class FactoryTools {

    private static final int WOOD_AXE_DURABILITY = 100;
    private static final int STONE_AXE_DURABILITY = 200;
    private static final int METAL_AXE_DURABILITY = 400;
    private static final int WOOD_AXE_STRENGTH = 2;
    private static final int STONE_AXE_STRENGTH = 5;
    private static final int METAL_AXE_STRENGTH = 10;


//-------------------------------------------------------------------

    public Axe buildWoodenAxe ()
    {
        return new Axe(new Wood(),new Durability(WOOD_AXE_DURABILITY),new Strength(WOOD_AXE_STRENGTH));
    }

//-------------------------------------------------------------------

    public Axe buildStoneAxe ()
    {
        return new Axe(new Stone(), new Durability(STONE_AXE_DURABILITY),new Strength(STONE_AXE_STRENGTH));
    }

//-------------------------------------------------------------------

    public Axe builMetalAxe ()
    {
        return new Axe(new Metal(), new Durability(METAL_AXE_DURABILITY), new Strength(METAL_AXE_STRENGTH));
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
}
