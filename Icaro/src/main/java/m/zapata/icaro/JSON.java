package m.zapata.icaro;

import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by miguelo on 05-09-13.
 */
public class JSON {
    public static JSONObject descargarJSON(String URL, String metodo) {
        InputStream stream = null;

        try {

            if (metodo == "GET") {
                DefaultHttpClient httpClient = new DefaultHttpClient();
                HttpGet httpGet = new HttpGet(URL);

                HttpResponse httpResponse = httpClient.execute(httpGet);
                HttpEntity httpEntity = httpResponse.getEntity();
                stream = httpEntity.getContent();
            }

            if (metodo == "POST") {
                DefaultHttpClient httpClient = new DefaultHttpClient();
                HttpPost httpPost = new HttpPost(URL);

                HttpResponse httpResponse = httpClient.execute(httpPost);
                HttpEntity httpEntity = httpResponse.getEntity();
                stream = httpEntity.getContent();
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(stream, "iso-8859-1"), 10);
            StringBuilder sb = new StringBuilder();
            String line = null;

            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }

            stream.close();
            String result = sb.toString();
            JSONObject jsonResult = new JSONObject(result);

            return jsonResult;
        } catch (Exception e) {
            Log.e("Icaro", "error descargando JSON " + Log.getStackTraceString(e));
            return null;
        }
    }
}
