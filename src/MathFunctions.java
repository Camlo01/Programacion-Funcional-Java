import java.util.function.Function;

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
    }
    static int square(int x){
        return x * x;

    }

}
