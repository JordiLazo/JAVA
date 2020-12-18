import Problem_1.AlreadyDefined;
import Problem_1.DictionaryImpl;
import Problem_1.NotDefinedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryImplTest {
    public DictionaryImpl d1;

    @BeforeEach
    void setUp() throws AlreadyDefined{
        d1 = new DictionaryImpl();

    }

    @Test
    void defineWordTest() throws AlreadyDefined, NotDefinedException {
        d1.defineWord("Jordi","estudiant de informaticajnj");
        d1.defineWord("Jordi","estudiant de informatica");
        d1.defineWord("qwe","qwe");

    }

    @Test
    void getDefinitions() throws AlreadyDefined {
        d1.defineWord("p1","definicio 1");
        assertDoesNotThrow(()-> d1.getDefinitions("123"));
    }
}