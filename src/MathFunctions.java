import groovyjarjarpicocli.CommandLine;
import org.codehaus.groovy.runtime.dgmimpl.arrays.BooleanArrayGetAtMetaMethod;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {

    //Método main
    public static void main(String[] args) {
        System.out.println("Hola Matt");
        //Function <Parametro de entrada, parametro de salida> nombre_de_la_funcion = new Function<Integer, Integer>(){


        //Manera de crear funciones en Java, característica agregada desde Java 8
        Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(squareFunction.apply(5));
        System.out.println(squareFunction.apply(25));
        System.out.println(square(5));
        System.out.println(square(25));
        //Funcion más corta y relativamente más legible


        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        //Preicate es un función que trabaja sobre un tipo y genera una función
        // Prueba si algo es valido, En este caso si un númro es par, y de ser así retorna true
        // Y estos se validan con el método test();
        Predicate<Integer> isEven = x -> x % 2 == 0;


        System.out.println(isEven.test(4));

//        método que define si un estudiante aprobó si su calificación es mayor a 6.0
//      De esta manera podemos hacer validaciones
        Predicate<Student> isApproved = student -> student.getCalification() > 6.0;

//        creamos un estudiante por su calificacion
        Student sinuhe =  new Student(5.9);

//       Imprimimos por pantalla si el estudiante calificó
        System.out.println(isApproved.test(sinuhe));

    } //FIN MAIN


    static class Student{
//      creamos una clase de estudiante
        private double calification;

        public Student(double calification) {
            this.calification = calification;
        }

        public double getCalification() {
            return calification;
        }
    }







    //Como se haría normalmente
    static int square(int x) {
        return x * x;

    }


}
