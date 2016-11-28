package org.test.justpost.usecases;

import org.junit.Test;
import static org.junit.Assert.*;

import org.justpost.usecases.MessageListResponseObject;

public class TestMessageListResponseObject {

    @Test
    public void testCreateObject() {
        MessageListResponseObject response = new MessageListResponseObject(null);

        assertNotNull(response);
        assertTrue(response instanceof MessageListResponseObject);
        assertNull(response.getResult());
    }
}
