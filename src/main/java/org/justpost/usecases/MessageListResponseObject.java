package org.justpost.usecases;

import java.util.Collection;

import org.justpost.entities.Message;

public class MessageListResponseObject {
    private Collection<Message> result;
    public MessageListResponseObject(Collection<Message> result) {
        this.result = result;
    }

    public Collection<Message> getResult() {
        return result;
    }
}
