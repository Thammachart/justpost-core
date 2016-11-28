package org.justpost.adapters.repositories;

import java.util.List;
import java.util.Map;

import org.justpost.entities.Message;

public interface MessageRepositoryInterface {
    public List<Message> get(Map<String, String> filters);
}
