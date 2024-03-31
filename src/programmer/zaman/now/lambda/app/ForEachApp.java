package programmer.zaman.now.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {

        List<String> list = List.of("Alveino", "Farhan", "Prayogo");

        //for Loop
        for (String value : list) {
            System.out.println(value);
        }

        //forEach Annonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        //lambda
        list.forEach(value -> System.out.println(value));

        //lambda method reference
        list.forEach(System.out::println);
    }
}
