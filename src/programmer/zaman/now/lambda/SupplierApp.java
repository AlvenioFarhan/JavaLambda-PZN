package programmer.zaman.now.lambda;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Alvenio Farhan Prayogo";

        System.out.println(supplier.get());

    }
}
