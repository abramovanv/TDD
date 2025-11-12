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

    @Test
    @DisplayName("Поиск контакта по номеру телефона")
    public void testFindContact_forPhoneNumber_success() {

        PhoneBook.getInstance().add("Ivan", "11111");
        String result = PhoneBook.getInstance().findByNumber("11111");
        Assertions.assertEquals("Ivan", result);
    }

    @Test
    @DisplayName("Поиск номера телефона по контакту")
    public void testFindNumber_forContactName_success() {

        PhoneBook.getInstance().add("Ivan", "11111");
        String result = PhoneBook.getInstance().findByName("Ivan");
        Assertions.assertEquals("11111", result);
    }


}
