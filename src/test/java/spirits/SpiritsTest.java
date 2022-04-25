package spirits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiritsTest {

    @Test
    void isLiqueur() {
        Gin gin = new Gin("Blackberry", 25, 40, 200, "elderflower tonic");
        assertFalse(gin.isLiqueur());
    }

    @Test
    void will2ShotsGetYouDrunk() {
        Gin gin = new Gin("Blackberry", 25, 40, 200, "elderflower tonic");
        assertFalse(gin.will2ShotsGetYouDrunk());
    }
}