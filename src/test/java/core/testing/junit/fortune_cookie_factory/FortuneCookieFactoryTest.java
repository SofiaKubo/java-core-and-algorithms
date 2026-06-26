package core.testing.junit.fortune_cookie_factory;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class FortuneCookieFactoryTest {
    private FortuneCookieFactory factory;

    @BeforeEach
    public void beforeEach() {
        ArrayList<String> positive = new ArrayList<>();
        positive.add("positive");
        ArrayList<String> negative = new ArrayList<>();
        negative.add("negative");

        FortuneConfig config = new FortuneConfig(true);
        factory = new FortuneCookieFactory(
            config,
            positive,
            negative
        );
    }

    @Test
    public void shouldIncrementCountByOneAfterOneCookieBaked() {
        factory.bakeFortuneCookie();
        assertEquals(1, factory.getCookiesBaked());
    }

    @Test
    public void shouldIncrementCountByTwoAfterTwoCookiesBaked() {
        factory.bakeFortuneCookie();
        factory.bakeFortuneCookie();
        assertEquals(2, factory.getCookiesBaked());
    }

    @Test
    public void shouldSetCounterToZeroAfterResetCookieCreatedCall() {
        factory.bakeFortuneCookie();
        assertEquals(1, factory.getCookiesBaked());
        factory.resetCookiesCreated();
        assertEquals(0, factory.getCookiesBaked());
    }
}
