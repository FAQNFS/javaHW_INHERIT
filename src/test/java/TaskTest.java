import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void simpleTuskMatchesTest() {
        SimpleTask simpleTask = new SimpleTask(3, "Написать другу");

        boolean actual = simpleTask.matches("Написать");

        Assertions.assertTrue(actual);
    }

    @Test
    public void simpleTuskMatchesTest1() {
        SimpleTask simpleTask = new SimpleTask(3, "Написать другу");

        boolean actual = simpleTask.matches("Позвонить");

        Assertions.assertFalse(actual);
    }

    @Test
    public void simpleMeetingMatchesTest() {
        Meeting meeting = new Meeting(2, "Отдых на природе", "Поход", "15 августа");

        boolean actual = meeting.matches("Поход");

        Assertions.assertTrue(actual);
    }

    @Test
    public void simpleMeetingMatchesTest1() {
        Meeting meeting = new Meeting(2, "Отдых на природе", "Поход", "15 августа");

        boolean actual = meeting.matches("Лес");

        Assertions.assertFalse(actual);
    }

    @Test
    public void simpleEpicMatchesTest() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Яйца");

        Assertions.assertTrue(actual);
    }

    @Test
    public void simpleEpicMatchesTest1() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Сыр");

        Assertions.assertFalse(actual);
    }
}
