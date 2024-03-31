package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        //Static
//        Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("alvenio"));
        System.out.println(predicateIsLowerCase.test("Alvenio"));


        //Method Reference di Parameter

//        Function<String,String> functionToUpper = value -> value.toUpperCase();
        Function<String,String> functionToUpper = String::toUpperCase;

        System.out.println(functionToUpper.apply("alvenio"));

    }

    //NonStatic - Method dia sendiri
    public void run(){
        Predicate<String> predicateToLowerCase = MethodReferenceApp.this::isLowerCase;

        System.out.println(predicateToLowerCase.test("alvenio"));
        System.out.println(predicateToLowerCase.test("Alvenio"));
    }

    //dengan method orang lain
    public void run2(){
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateToLowerCase = app::isLowerCase;

        System.out.println(predicateToLowerCase.test("alvenio"));
        System.out.println(predicateToLowerCase.test("Alvenio"));

    }

    public boolean isLowerCase(String value){
        for (char c : value.toCharArray()){
            if (!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
}
