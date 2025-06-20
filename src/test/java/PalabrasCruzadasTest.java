import org.example.PalabrasCruzadasService;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertTrue;
public class PalabrasCruzadasTest {

    PalabrasCruzadasService service = new PalabrasCruzadasService();

    @Test
    public void testValidarTablero() {
        char[][] board = {
                {'H','E','L','L','O','#','#','#','#','#'},
                {'#','#','#','#','#','#','#','#','#','#'},
                {'W','O','R','L','D','#','#','#','#','#'},
                {'#','#','#','#','#','#','#','#','#','#'},
                {'J','A','V','A','#','#','#','#','#','#'},
                {'#','#','#','#','#','#','#','#','#','#'},
                {'C','O','D','E','#','#','#','#','#','#'},
                {'#','#','#','#','#','#','#','#','#','#'},
                {'P','Y','T','H','O','N','#','#','#','#'},
                {'#','#','#','#','#','#','#','#','#','#'}
        };

        List<String> diccionario = Arrays.asList(
                "HELLO", "WORLD", "JAVA", "CODE", "PYTHON"
        );

        assertTrue(service.validarTablero(board, diccionario));
    }
}