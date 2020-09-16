package Wear;

import Factory.Factory;
import PropiedadesMateriales.Durability;
import PropiedadesMateriales.Force;
import PropiedadesMateriales.Wear;

public class WearDecreasesDividedByFactor extends Wear {

    private

        int factor;

//-------------------------------------------------------------------

    public WearDecreasesDividedByFactor (int factor)
    {
        this.factor = factor;
    }

//-------------------------------------------------------------------

    @Override
    public int applyWear(Durability durability, Force force) {
        return durability.getDurability()-force.getForce()/factor;
    }







//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}
