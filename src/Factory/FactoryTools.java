package Factory;

import Attributes.Durability;
import Attributes.Strength;
import Materials.Material;
import Materials.Metal;
import Materials.Stone;
import Materials.Wood;
import Tools.Axe.Axe;
import Tools.Axe.Peak;

public class FactoryTools {

    private static final int WOOD_AXE_DURABILITY = 100;
    private static final int STONE_AXE_DURABILITY = 200;
    private static final int METAL_AXE_DURABILITY = 400;

    private static final int WOOD_AXE_STRENGTH = 2;
    private static final int STONE_AXE_STRENGTH = 5;
    private static final int METAL_AXE_STRENGTH = 10;

    private static final int WOOD_PEAK_DURABILITY = 100;
    private static final int STONE_PEAK_DURABILITY = 200;
    private static final int METAL_PEAK_DURABILITY = 400;

    private static final int WOOD_PEAK_STRENGTH = 2;
    private static final int STONE_PEAK_STRENGTH = 4;
    private static final int METAL_PEAK_STRENGTH = 12;



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

    public Peak builWoodenPeak ()
    {
        return new Peak(new Wood(), new Durability(WOOD_PEAK_DURABILITY), new Strength(WOOD_PEAK_STRENGTH));
    }

//-------------------------------------------------------------------

    public Peak builStonePeak ()
    {
        return new Peak(new Stone(), new Durability(STONE_PEAK_DURABILITY), new Strength(STONE_PEAK_STRENGTH));
    }

//-------------------------------------------------------------------

    public Peak builMetalPeak ()
    {
        return new Peak(new Metal(), new Durability(METAL_PEAK_DURABILITY), new Strength(METAL_PEAK_STRENGTH));
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
