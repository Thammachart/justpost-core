package org.justpost.repositories;

import java.util.List;

import org.justpost.entities.Message;

public interface MessageRepositoryInterface {
    public List<Message> get();
}
