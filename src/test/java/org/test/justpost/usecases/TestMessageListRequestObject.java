package org.test.justpost.usecases;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import org.justpost.usecases.MessageListRequestObject;

public class TestMessageListRequestObject {

    @Test
    public void testCreateObjectWithEmptyFilter() {
        Map<String, String> filters = new TreeMap<>();
        MessageListRequestObject request = new MessageListRequestObject(filters);

        assertNotNull(request);
        assertTrue(request.getFilter() instanceof Map);
        assertTrue(request.getFilter().isEmpty());
        assertTrue(request instanceof MessageListRequestObject);
    }

    @Test
    public void testCreateObjectWithNullFilter() {
        MessageListRequestObject request = new MessageListRequestObject(null);

        assertNotNull(request);
        assertNull(request.getFilter());
    }

    @Test
    public void testCreateObjectWithFilters() {
        Map<String, String> filters = new TreeMap<>();
        filters.put("a", "1");
        filters.put("b", "2");
        MessageListRequestObject request = new MessageListRequestObject(filters);

        assertNotNull(request);
        assertTrue(request.getFilter() instanceof Map);
        assertFalse(request.getFilter().isEmpty());

        assertTrue(request.getFilter().containsKey("a"));
        assertTrue(request.getFilter().containsKey("b"));
        assertFalse(request.getFilter().containsKey("c"));
        assertTrue(request.getFilter().equals(filters));
    }
}
