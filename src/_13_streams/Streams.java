package _13_streams;

import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

//
//        //                  método para traer listas
//        List<String> courseList = NombresUtils.getlist(
//                "Java", "FrontEnd", "BackEnd", "FullStack");
////        iteramos los elementos String de tipo course : en la lista courseList para ejecutar la
////        Para ejecutar lo que queramos como en el siguiente caso, agregarle un texto antes o convertir a minusculas
//        for (String course : courseList) {
//            course.toLowerCase().replace("!", "!!");
//            System.out.println("Platzi: " + course);
//
//            //De esta manera logramos anteponer en el texto Platzi e imprimimos todos los elementos course
//        }
//
////        Stream<String> courseStream = Stream.of("Java", "FrontEnd", "BackEnd", "FullStack");
////
////        Stream<Integer> courseLengthStream = courseStream.map(course -> course.length())
//
////        Optional<Integer> longest = courseLengthStream.max((x, y) -> x - y);
//
//
////        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");
//        Stream<String> justJavaCourses = coursesStream.filter(course -> course.contains("Java"));
//        emphasisCourses.forEach(System.out::println);
//        courseStream.forEach(System.out::println);
//    }
}
