import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Рыкова",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        );

        Map<String, Integer> nameCounts = new HashMap<>();

        // Подсчитываем количество повторений каждого имени
        for (String employee : employees) {
            nameCounts.put(employee, nameCounts.getOrDefault(employee, 0) + 1);
        }

        // Сортируем по убыванию популярности
        List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(nameCounts.entrySet());
        sortedNames.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Выводим повторяющиеся имена с количеством повторений
        for (Map.Entry<String, Integer> entry : sortedNames) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " раз(а)");
            }
        }
    }
}