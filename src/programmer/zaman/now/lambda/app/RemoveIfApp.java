package programmer.zaman.now.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(List.of("Alvenio", "Farhan", "Prayogo"));

        //for loop -- SOLUSI GAGAL
        for (String name : names) {
            if (name.length() > 5) {
                names.remove(name);
            }
        }

        //remove if dengan annonymous class
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 5;
            }
        });

        // dengan lambda
        names.removeIf(name -> name.length() > 5);

        System.out.println(names);

    }
}
