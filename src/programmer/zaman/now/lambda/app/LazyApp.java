package programmer.zaman.now.lambda.app;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScore(65, () -> getName());
        testScore(90, () -> getName());

    }

    //Supplier<String> name adalah penerapan lambda
    public static void testScore(Integer value, Supplier<String> name) {
        if (value > 80) {
            System.out.println("Selamat " + name.get() + ", Anda Lulus");
        } else {
            System.out.println("Coba lagi tahun depan");
        }
    }

    public static String getName() {
        System.out.println("Method getName() dipanggil");
        return "Alvenio";
    }
}
