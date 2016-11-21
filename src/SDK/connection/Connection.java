package SDK.connection;

import SDK.Config;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by Sanggaard on 17/11/2016.
 */
public class Connection {

    public static String serverURL = Config.getDbUrl();
    private CloseableHttpClient httpClient;

    public Connection() {this.httpClient = HttpClients.createDefault();}

    public void execute(HttpUriRequest uriRequest, final ResponseParser methods) {

        // Opretter en ResponseHandler
        ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

            public String handleResponse(final HttpResponse response) throws IOException {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    methods.error(status);
                }
                return null;
            }

        };

        try {
            String json = this.httpClient.execute(uriRequest, responseHandler);
            methods.payload(json);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    //Slet gson to Json (så det ikke står 2 gange på server endpoints)

}
