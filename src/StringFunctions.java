import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";

        System.out.println(quote.apply("Hola Estudiante de platzi!"));
        System.out.println(quote.apply("Hola!!"));
        //UnaryOperator es una trabaja sobre el mismo tipo de dato y genera
        //el mismo tipo de dato


        // BiFunction es la funcion con la que que podemos hacer una funcion en la que podemos tomar dos tipos de dato
        // y va a generar otro tipo de dato

        //Esta funcion, recibe, un entero, otro entero y retorna un entero
        BiFunction<Integer, Integer, Integer> multiplicacion =
                (x, y) -> x * y;

        multiplicacion.apply(5, 4);

        System.out.println(multiplicacion.apply(5, 4));

        //Funciona de la misma manera que BiOperator, solo que las dos entradas y a salida es del mismo tipo
        BinaryOperator<Integer> multiplicacionBO = (x, y) -> x * y;

        System.out.println(multiplicacionBO.apply(2, 8));


        //Ejemplo con BiFuncion para agregar espacios a un String
        BiFunction<String, Integer, String> leftPad = (text, number) -> String.format("%" + number + "s", text);


        System.out.println(leftPad.apply("Java", 10));

        // Podemos tener una lista de BiFuntions
        List<BiFunction<String, Integer, String>> formateadores;

    }

}

