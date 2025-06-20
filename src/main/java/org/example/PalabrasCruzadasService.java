package org.example;

import java.util.List;

public class PalabrasCruzadasService {

    public boolean validarTablero(char[][] board, List<String> diccionario) {
        int n = board.length;

        // PARA VALIDAR LAS FILAS
        for (int row = 0; row < n; row++) {
            StringBuilder palabra = new StringBuilder();
            for (int col = 0; col < n; col++) {
                char c = board[row][col];
                if (c != '#') {
                    palabra.append(c);
                } else {
                    if (palabra.length() >= 2) {
                        if (!diccionario.contains(palabra.toString())) {
                            return false;
                        }
                    }
                    palabra.setLength(0);
                }
            }
            // PARA VALIDAR LA PALABRA AL FINAL DE LA FILA
            if (palabra.length() >= 2 && !diccionario.contains(palabra.toString())) {
                return false;
            }
        }

        // PARA VALIDAR LAS COLUMNAS
        for (int col = 0; col < n; col++) {
            StringBuilder palabra = new StringBuilder();
            for (int row = 0; row < n; row++) {
                char c = board[row][col];
                if (c != '#') {
                    palabra.append(c);
                } else {
                    if (palabra.length() >= 2) {
                        if (!diccionario.contains(palabra.toString())) {
                            return false;
                        }
                    }
                    palabra.setLength(0);
                }
            }
            // PARA VALIDAR LA PALABRA AL FINAL DE LA COLUMNA
            if (palabra.length() >= 2 && !diccionario.contains(palabra.toString())) {
                return false;
            }
        }

        return true;
    }
}
