import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgmentUtils {

    static void showHelp(CLIArguments cliArguments) {

        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {

            if (cliArguments1.isHelp()) {
                System.out.println("Manual solicitado");
            }
        };
        consumerHelper.accept(cliArguments);
    }
    //crearemos una funcion
//    static CLIArguments generateCLI(){
//
//        Supplier<CLIArguments> generator = () -> new CLIArguments(){
//
//            return generator.get();
//        };
//    };

}


//CONSUMER y SUPPLIER
//
//CONSUMER es una clase que nos permitira realizar operacion sobre un tipo de dato... dentro de un listado de datos
//y por cada dato vamos consumiendo y operando sobre ese dato en especifico por ejemplo borrar cada archivo de una lista
//
//SUPPLIER se encarga de generar objetos de un tipo, su unico metodo es el get(), es de tipo T y retorna una T
// A partir del Supplier podemos generar muchos datos de manera infinita
//
//Function<Entrada, salida>
//
//Consumer<Entrada>
//
//supplier<Salida>