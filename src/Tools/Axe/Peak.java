package Tools.Axe;

import Attributes.Durability;
import Attributes.Strength;
import Materials.Material;
import Tools.Tool;

public class Peak extends Tool {

    private

        Material material2;

//-------------------------------------------------------------------

    public Peak(Material material, Durability durability, Strength strength)
    {
        super(material, durability, strength);
    }

//-------------------------------------------------------------------

    public void setSecondMaterial (Material oneMaterial)
    {
        this.material2 = oneMaterial;
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}
