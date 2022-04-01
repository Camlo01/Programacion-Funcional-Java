package _12_optionals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        List<String> names = getNames();
//        {
//            if (names != = null) {
//                //Operar con Nombres
//            }
//            Optional<List<String>> optionalNames = getOptionalNames();
//            if (optionalNames.isPresent()) {
//
//            }
//            optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));
//            optionalNames.map();
//
//            Optional<String> valuablePlayer = optionalValuablePlayer();
//
//            String valuablePlayerName = valuablePlayer.orElseGet(() -> "No player");
//        }

    }

    static List<String> getNames() {
        List<String> list = new LinkedList<>();


//        De esta forma podemos retornar una lista en caso de que esté vacía
        return Collections.emptyList();

    }

    static String mostValuablePlayer() {
//        return "";
        return null;

    }

//    static int mostExpensiveItem() {
//        return 0;
//    }
//
//    static int mostExpensiveItem() {
//        return -1;
//    }

    static Optional<List<String>> getOptionalNames() {
        List<String> nameList = new LinkedList<>();
        // Obtencion de nombres
        return Optional.of(nameList);
    }

    static Optional<String> optionalValuablePlayer() {

        // podemos retornar un dato del que desconocemos si es nullo o no
//        return Optional.ofNullable()
        try {
            //Aceces
            return Optional.of("Sinue");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
