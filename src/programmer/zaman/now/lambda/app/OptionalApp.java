package programmer.zaman.now.lambda.app;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {

        sayHello("Alvenio");

        String name = null;
        sayHello(name);

    }

    public static void sayHello(String name) {
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresent(value -> System.out.println("HELLO " + value));


//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(
//                        value -> System.out.println("HELLO " + value),
//                        () -> System.out.println("HELLO"));


        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");
        System.out.println("HEllo " + upperName);

//
//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
//        optionalNameUpper.ifPresent(value -> System.out.println("HELLO " + value));

        //if check null
//        if (name != null) {
//            String uppername = name.toUpperCase();
//            System.out.println("HELLO " + uppername);
//        }

//        String nameUpper = name.toUpperCase();
//        System.out.println("HELLO " + nameUpper);
    }
}
