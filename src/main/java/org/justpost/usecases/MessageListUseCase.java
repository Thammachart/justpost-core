package org.justpost.usecases;

import java.util.List;

import org.justpost.repositories.MessageRepositoryInterface;
import org.justpost.entities.Message;

public class MessageListUseCase {
    private MessageRepositoryInterface messageRepo;

    public MessageListUseCase(MessageRepositoryInterface messageRepo) {
        this.messageRepo = messageRepo;
    }

    public List<Message> execute() {
        return messageRepo.get();
    }
}
