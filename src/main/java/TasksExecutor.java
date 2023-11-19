import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TasksExecutor {
    public List<String> task1(List<String> names){
        int[] indexArray = {1};
        return names.stream().map(name -> indexArray[0]++ + ". " + name)
                .collect(Collectors.toList())
                    .stream().filter(name ->{
                        int index = Integer.parseInt(name.split("\\. ")[0]);
                        return index % 2 != 0 ;
                    }).collect(Collectors.toList());
    }
    public List<String> task2(List<String> names){
        return names.stream().map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
    }
    public String task3(String[] strings){
        List<Integer> numbers = Arrays.stream(strings)
                                    .flatMap(s -> Arrays.stream(s.split(", "))
                                        .map(Integer::parseInt))
                                            .collect(Collectors.toList());
        return numbers.stream().sorted().map(Object::toString).collect(Collectors.joining(", "));
    }
    public Stream<Long> generateStreamOfRandoms(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();

        List<T> zippedList = new LinkedList<>();
        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()){
            zippedList.add(iteratorFirst.next());
            zippedList.add(iteratorSecond.next());
        }
        return zippedList.stream();
    }

}
