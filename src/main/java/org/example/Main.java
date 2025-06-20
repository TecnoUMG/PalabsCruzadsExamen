package org.example;
import java.util.Arrays;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        char[][] board = {
                {'H', 'E', 'L', 'L', 'O', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'W', 'O', 'R', 'L', 'D', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'J', 'A', 'V', 'A', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'C', 'O', 'D', 'E', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'P', 'Y', 'T', 'H', 'O', 'N', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
        };

        List<String> diccionario = Arrays.asList(
                "HELLO", "WORLD", "JAVA", "CODE", "PYTHON"
        );

        PalabrasCruzadasService service = new PalabrasCruzadasService();

        boolean resultado = service.validarTablero(board, diccionario);

        System.out.println("Resultado de la validación del tablero: " + resultado);
    }
}
