package parseaparment;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Directions {
    private OkHttpClient client = new OkHttpClient();
    private String apiKey = "BRLJg4NCNfGcz5UJD8We4G2AQ5WOXvMR";
    private String apiUrl = "http://www.mapquestapi.com/directions/v2/route";
    private String inputStartLocation = "261 Berwick Turnpike, Wellsburg, NY 14894";
    private String inputEndLocation = "1740 Wehrle Dr, Buffalo, NY 14221";
    private String inputTime;

    private String outputDistance;
    private String outputBestTime;
    private String outputRealTime;
    private String outputFuelUsed;

    public Directions() throws IOException {
        System.out.println(getDirectionJson(apiUrl));
    }

    String getDirectionJson(String url) throws IOException {
        url = apiUrl + "?key=" + apiKey + "&from=" + inputStartLocation + "&to=" + inputEndLocation;
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    String spacesToPluses(String str){
        return str.replace(" ", "+");
    }

}
