package core.testing.junit.fortune_cookie_factory;

import java.util.ArrayList;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FortuneCookieControllerTest {
    private static FortuneCookieController goodFactoryController;
    private static FortuneCookieController badFactoryController;

    @BeforeAll
    static void beforeAll() {
        ArrayList<String> positive = new ArrayList<>();
        positive.add("positive");
        ArrayList<String> negative = new ArrayList<>();
        negative.add("negative");

        FortuneConfig goodConfig = new FortuneConfig(true);
        FortuneConfig badConfig = new FortuneConfig(false);

        FortuneCookieFactory goodFactory = new FortuneCookieFactory(
            goodConfig,
            positive,
            negative
        );

        FortuneCookieFactory badFactory = new FortuneCookieFactory(
            badConfig,
            positive,
            negative
        );

        goodFactoryController = new FortuneCookieController(goodFactory);
        badFactoryController = new FortuneCookieController(badFactory);
    }

    @Test
    public void shouldReturnPositiveFortune() {
        FortuneCookie positiveFortuneCookie = goodFactoryController.tellFortune();
        assertEquals("positive", positiveFortuneCookie.getFortuneText());
    }

    @Test
    public void shouldReturnNegativeFortune() {
        FortuneCookie negativeFortuneCookie = badFactoryController.tellFortune();
        assertEquals("negative", negativeFortuneCookie.getFortuneText());
    }
}
