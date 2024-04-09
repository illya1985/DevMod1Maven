
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        person.DataObject dataObject = new person.DataObject();
        dataObject.name = "Illya";
        dataObject.lastName = "Zaharevich";

        Gson gson = new Gson();
        String json = gson.toJson(dataObject);


        System.out.println(json);
    }
}
