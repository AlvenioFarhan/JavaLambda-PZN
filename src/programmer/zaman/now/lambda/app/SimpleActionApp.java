package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action() {
//                return "Alvenio Tanpa Lambda";
//            }
//        };
//
//        System.out.println(simpleAction1.action());
//
//        //Dengan Lambda
//        SimpleAction simpleAction2 = () -> {
//            return "Alvenio Lambda";
//        };
//
//        System.out.println(simpleAction2.action());

        //=============================================================

        SimpleAction simpleAction1 = (String value) -> {
            return "Hello " + value;
        };

        SimpleAction simpleAction2 = (name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction3 = (String value) -> "Hello " + value;

        SimpleAction simpleAction4 = (value) -> "Hello " + value;

        SimpleAction simpleAction5 = value -> "Hello " + value;


    }
}
