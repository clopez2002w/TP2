package Tools;

import Materials.Materials;
import PropiedadesMateriales.Durability;
import PropiedadesMateriales.Force;
import PropiedadesMateriales.Wear;


public abstract class Tool {

    protected

        Materials material;
        Durability durability;
        Force force;
        Wear wear;                  // Desgaste


//-------------------------------------------------------------------

    public Tool (Materials oneMaterial, Durability durability, Force force, Wear wear)
    {
        this.material = oneMaterial;
        this.durability = durability;
        this.force = force;
        this.wear = wear;
    }

//-------------------------------------------------------------------

    public Materials giveMeMateirial ()
    {
        return this.material;
    }

//-------------------------------------------------------------------

    public int giveMeDurability ()
    {
        return this.durability.getDurability();
    }

//-------------------------------------------------------------------

    public int giveMeForce ()
    {
        return this.force.getForce();
    }

//-------------------------------------------------------------------




}
