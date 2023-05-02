package padroesestruturais.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdapterTest {
    @Test
    void testJsonAdapter() {
        // Cria um objeto da biblioteca que envia dados em formato JSON
        JsonLibrary jsonLibrary = new JsonLibrary();

        // Cria o Adapter com o objeto da biblioteca
        WebService adapter = new JsonAdapter(jsonLibrary);

        // Envia os dados para o WebService usando o Adapter
        adapter.sendData("dados");

        // Verifica se o Adapter converteu corretamente os dados para JSON
        Assertions.assertEquals("{\"data\":\"dados\"}", jsonLibrary.getJsonData());
    }
}
