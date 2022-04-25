package beer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeerTest {

    @Test
    void will2PintsGetYouDrunk() {
        Ale ale = new Ale(4, 4, 340, "Gold", "Oak");
        assertFalse(ale.will2PintsGetYouDrunk());
    }

    @Test
    void isDietFriendly() {
        Ale ale = new Ale(5, 4, 250, "Gold", "Oak");
        assertTrue(ale.isDietFriendly());
    }
}