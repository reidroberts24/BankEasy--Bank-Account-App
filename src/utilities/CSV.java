package src.utilities;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.plugins.bmp.BMPImageWriteParam;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    //This method will read data from a csv file and return as a list
    public static List<String[]> readFromUrl(String url) {
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;
        try {
            URL fileUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) fileUrl.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            while ((dataRow = br.readLine()) != null) {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
