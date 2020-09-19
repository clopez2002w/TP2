package Wear;

import Exceptions.NoMoreDurabilityException;
import PropiedadesMateriales.Durability;
import PropiedadesMateriales.Force;
import PropiedadesMateriales.Wear;

public class WearDecreasesLinearly extends Wear {

    private static final int NoMoreDurability = 0;

//-------------------------------------------------------------------

    @Override
    public void applyWear(Durability durability, Force force) throws NoMoreDurabilityException
    {
        durability.setDurability(durability.getDurability()-force.getForce());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

}
