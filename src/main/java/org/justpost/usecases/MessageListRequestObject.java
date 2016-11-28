package org.justpost.usecases;

import java.util.Map;

public class MessageListRequestObject {
    private Map<String, String> filters;

    public MessageListRequestObject(Map<String, String> filters) {
        this.filters = filters;
    }

    public Map<String, String> getFilter() {
        return filters;
    }
}
