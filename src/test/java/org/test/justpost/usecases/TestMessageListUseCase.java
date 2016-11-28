package org.test.justpost.usecases;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.TreeMap;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.justpost.entities.Message;
import org.justpost.usecases.MessageListUseCase;
import org.justpost.usecases.MessageListRequestObject;
import org.justpost.usecases.MessageListResponseObject;
import org.justpost.adapters.repositories.MessageRepositoryInterface;

public class TestMessageListUseCase {
    private List<Message> managedList;
    private List<Message> subList;

    @Before
    public void setUp() {
        managedList = Arrays.asList(new Message("T1", "M1"), new Message("T2", "M2"));
        subList = Arrays.asList(managedList.get(0));
    }

    @Test
    public void testExecute() {
        MessageRepositoryInterface mockedRepo = mock(MessageRepositoryInterface.class);
        when(mockedRepo.get(null)).thenReturn(managedList);

        MessageListUseCase usecase = new MessageListUseCase(mockedRepo);
        MessageListRequestObject request = new MessageListRequestObject(null);

        MessageListResponseObject result = usecase.execute(request);

        verify(mockedRepo).get(null);
        assertTrue(result.getResult().equals(managedList));
    }

    @Test
    public void testExecuteWithFilters() {
        Map<String, String> filters = new TreeMap<>();
        filters.put("title", "T1");

        MessageRepositoryInterface mockedRepo = mock(MessageRepositoryInterface.class);
        when(mockedRepo.get(filters)).thenReturn(subList);

        MessageListUseCase usecase = new MessageListUseCase(mockedRepo);
        MessageListRequestObject request = new MessageListRequestObject(filters);

        MessageListResponseObject result = usecase.execute(request);

        verify(mockedRepo).get(filters);
        assertTrue(result.getResult().equals(subList));
        assertFalse(result.getResult().equals(managedList));
    }
}
