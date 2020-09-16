package Wear;

import PropiedadesMateriales.Durability;
import PropiedadesMateriales.Force;
import PropiedadesMateriales.Wear;

public class WearDecreasesLinearly extends Wear {

//-------------------------------------------------------------------

    @Override
    public void applyWear(Durability durability, Force force)
    {
        durability.setDurability(durability.getDurability()-force.getForce());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}
