import java.util.List;
import java.util.Arrays;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.justpost.entities.Message;
import org.justpost.usecases.MessageListUseCase;
import org.justpost.repositories.MessageRepositoryInterface;

public class TestMessageListUseCase {
    private List<Message> managedList;

    @Before
    public void setUp() {
        managedList = Arrays.asList(new Message("T1", "M1"), new Message("T2", "M2"));
    }


    @Test
    public void testExecute() {
        MessageRepositoryInterface mockedRepo = mock(MessageRepositoryInterface.class);
        when(mockedRepo.get()).thenReturn(managedList);

        MessageListUseCase usecase = new MessageListUseCase(mockedRepo);
        List<Message> messages = usecase.execute();

        assertTrue(messages.equals(managedList));
    }
}
