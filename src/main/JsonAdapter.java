import padroesestruturais.adapter.WebService;

public class JsonAdapter implements WebService {
    private JsonLibrary jsonLibrary;

    public JsonAdapter(JsonLibrary jsonLibrary) {
        this.jsonLibrary = jsonLibrary;
    }

    public void sendData(String data) {
        // O adapter traduz a interface da biblioteca para a interface do WebService
        String jsonData = jsonLibrary.convertToJson(data);
        sendJsonData(jsonData);
    }

    private void sendJsonData(String jsonData) {
        // Envia os dados para o WebService
        // Implementação da interface do WebService
    }
}
