import io.confluent.kafka.schemaregistry.client.rest.RestService;

public class App {
    public static void main(String[] args) {
        RestService service = new RestService("http://dev.typebook.adtech.studio");
        try {
            System.out.println(service.getAllSubjects());
            String subject = "smalgo-raw-deliver-imp-avro-v1";
            System.out.println(service.getLatestVersion(subject));
            System.out.println(service.getId(1144));
            System.out.println(service.getVersion(subject, "v2.0.31"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
