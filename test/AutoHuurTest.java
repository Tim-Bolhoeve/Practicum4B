import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    private AutoHuur autoHuur;
    private Klant klant;
    private Auto auto;

    @BeforeEach
    public void init() {
        autoHuur = new AutoHuur();
        klant = new Klant("Tim Bolhoeve");
        auto = new Auto("Mini Cooper 1971", 400.0);
    }

    @Test
    void checkGeenHuurderWelAuto() {
        autoHuur.setGehuurdeAuto(auto);
        assertEquals(0.0, autoHuur.totaalPrijs());
    }

    @Test
    void checkGeenHuurderGeenAuto(){
        assertEquals(0.0, autoHuur.totaalPrijs());
    }

    @Test
    void checkWelHuurderGeenAuto(){
        autoHuur.setHuurder(klant);
        assertEquals(0.0, autoHuur.totaalPrijs());
    }

    @Test
    void checkKortingAutoHuur(){
        autoHuur.setGehuurdeAuto(auto);
        autoHuur.setHuurder(klant);
        klant.setKorting(90.0);
        autoHuur.setAantalDagen(10);
        assertEquals(400.0, autoHuur.totaalPrijs());
    }

    @Test
    void checkGeenKortingAutoHuur(){
        autoHuur.setGehuurdeAuto(auto);
        autoHuur.setHuurder(klant);
        klant.setKorting(0.0);
        autoHuur.setAantalDagen(10);
        assertEquals(4000.0, autoHuur.totaalPrijs());
    }

    @Test
    void checkAantalDagen(){
        autoHuur.setAantalDagen(0);
        autoHuur.setHuurder(klant);
        autoHuur.setGehuurdeAuto(auto);
        assertEquals(0.0, autoHuur.totaalPrijs());
    }
}