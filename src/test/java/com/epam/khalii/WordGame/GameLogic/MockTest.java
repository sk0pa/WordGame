package com.epam.khalii.WordGame.GameLogic;

/**
 * Created by Anhelina_Khalii on 18.05.2015.
 */

import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.Expectations;
import org.junit.Test;

public class MockTest {
    final char LAST = 'a';

    @Test
    public void testMove() throws Exception {
        Mockery context = new JUnit4Mockery();
        final Movable fake_player = context.mock(Movable.class);
        context.checking(new Expectations() {{ oneOf(fake_player).move(LAST); }});
        char ch = fake_player.move(LAST);
        context.assertIsSatisfied();
    }
}
