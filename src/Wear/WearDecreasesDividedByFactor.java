package Wear;

import Exceptions.NoMoreDurabilityException;
import Factory.Factory;
import PropiedadesMateriales.Durability;
import PropiedadesMateriales.Force;
import PropiedadesMateriales.Wear;

public class WearDecreasesDividedByFactor extends Wear {

    private static final int NOMORDURABILITY = 0;

    private

        int factor;

//-------------------------------------------------------------------

    public WearDecreasesDividedByFactor (int factor)
    {
        this.factor = factor;
    }

//-------------------------------------------------------------------

    @Override
    public void applyWear(Durability durability, Force force)
    {
        durability.setDurability(durability.getDurability()-force.getForce()/factor);
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}
