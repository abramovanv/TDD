import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

public class PhoneBookTest {

    @Test
    @DisplayName("Проверяем добавление номера в телефонную книгу")
    public void testAddPhone_validArgument_success() {

        int result = PhoneBook.getInstance().add("Ivan", "11111");  // when:
        Assertions.assertEquals(1, result);
    }
}
