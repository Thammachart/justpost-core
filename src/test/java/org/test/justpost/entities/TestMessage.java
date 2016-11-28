package org.test.justpost.entities;

import org.junit.Test;
import static org.junit.Assert.*;

import org.justpost.entities.Message;

public class TestMessage {
    @Test
    public void testCreateMessageObject() {
        Message message = new Message("Testing Title", "Testing Message");

        assertEquals("Testing Title", message.getTitle());
        assertEquals("Testing Message", message.getMessage());
    }
}
