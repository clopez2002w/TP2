package PropiedadesMateriales;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HitsTest {

//-------------------------------------------------------------------

    @Test
    public void test01HitsInstanceIsCreated () {

        Hits hits = new Hits();
        Assert.assertNotNull(hits);
    }

//-------------------------------------------------------------------

    @Test
    public void test02HitsHasZeroAsDefaultValue () {

        Hits hits = new Hits();
        Assert.assertEquals(0,hits.getNumberOfHits());
    }

//-------------------------------------------------------------------

    @Test
    public void test03NumberOfHitsGetIncrementedWhenWeIncrement () {

        Hits hits = new Hits();
        hits.incrementHits();
        Assert.assertEquals(1,hits.getNumberOfHits());
    }

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------

//-------------------------------------------------------------------


}