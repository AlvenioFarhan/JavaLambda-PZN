package programmer.zaman.now.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

        Predicate<String> predicateCheckedBlank = value -> value.isBlank();

        System.out.println(predicateCheckedBlank.test(""));
        System.out.println(predicateCheckedBlank.test("Alvenio"));

    }
}
