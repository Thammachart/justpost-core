package org.justpost.usecases;

import java.util.List;
import java.util.Map;

import org.justpost.adapters.repositories.MessageRepositoryInterface;
import org.justpost.entities.Message;
import org.justpost.usecases.MessageListRequestObject;
import org.justpost.usecases.MessageListResponseObject;

public class MessageListUseCase {
    private MessageRepositoryInterface messageRepo;

    public MessageListUseCase(MessageRepositoryInterface messageRepo) {
        this.messageRepo = messageRepo;
    }

    public MessageListResponseObject execute(MessageListRequestObject request) {
        Map<String, String> filters = request.getFilter();
        List<Message> messages = messageRepo.get(filters);

        return new MessageListResponseObject(messages);
    }
}
