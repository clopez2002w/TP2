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
    public void applyWear(Durability durability, Force force) throws NoMoreDurabilityException
    {
        if (durability.getDurability() <= NOMORDURABILITY)
            throw new NoMoreDurabilityException();
        durability.setDurability(durability.getDurability()-force.getForce()/factor);
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}
