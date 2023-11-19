import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        TasksExecutor tasksExecutor = new TasksExecutor();
        NamesFileReader namesFileReader = new NamesFileReader();


        System.out.println("Names: ");
        List<String> names = namesFileReader.readNamesFromFile("names.txt");
        names.forEach(System.out::println);


        System.out.println("Task 1:");
        List<String> namesWithOddIndexes = tasksExecutor.task1(names);
        namesWithOddIndexes.forEach(System.out::println);


        System.out.println("Task 2:");
        List<String> sortedUpperCaseNames = tasksExecutor.task2(names);
        sortedUpperCaseNames.forEach(System.out::println);


        System.out.println("Task 3:");
        String[] strings = {"1, 2, 0", "4, 5"};
        String numbers = tasksExecutor.task3(strings);
        System.out.println(numbers);


        System.out.println("Task 4:");
        Stream<Long> randomStream = tasksExecutor.generateStreamOfRandoms(1L, 25214903917L, 11L, (long) Math.pow(2, 48));
        randomStream.limit(15).forEach(System.out::println);


        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(10, 20, 30);
        System.out.println("Task 5:");
        Stream<Integer> zippedStream = tasksExecutor.zip(stream1, stream2);
        zippedStream.forEach(System.out::println);
    }
}
