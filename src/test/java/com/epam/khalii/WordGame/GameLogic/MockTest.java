package com.epam.khalii.WordGame.GameLogic;

/**
 * Created by Anhelina_Khalii on 18.05.2015.
 */

import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.Expectations;
import org.junit.Test;

public class MockTest {
    @Test
    public void testMove() throws Exception {
        final char LAST = 'a';
        Mockery context = new JUnit4Mockery();
        final Players fake_player = context.mock(Players.class);
        context.checking(new Expectations() {{ oneOf(fake_player).move(LAST); }});
        char ch = fake_player.move(LAST);
        context.assertIsSatisfied();
    }
}
