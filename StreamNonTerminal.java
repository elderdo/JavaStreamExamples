import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamNonTerminal {

    public static void main(String[] args) throws IOException {
        List<String> stringList = new ArrayList<String>();

        stringList.add("ONE");
        stringList.add("TWO");
        stringList.add("THREE");

        Stream<String> stream = stringList.stream();
        // stream.map((value) -> {return value.toLowerCase();})
        // .map((value) -> {return value.toUpperCase();})
        // .map((value) -> {return value.substring(0,3);})
        // .forEach((value) -> System.out.println("value=" + value));
        // Stream<String> stringStream = stream.map((value) -> {
        //     System.out.println("value=" + value);
        //     return value.toLowerCase();
        // });
       
        // stringStream.forEach((value) -> System.out.println("value=" + value));
        Stream<String> longStringsStream = stream.filter((value) -> {
            return value.length() == 3;
        });
        longStringsStream.forEach((value) -> System.out.println("value=" + value));
    }
}