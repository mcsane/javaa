package olio_ohjelmointi.week3_4;

import java.io.*;
import java.net.*;
public class Task1 {
    public static void main(String[] args) {
        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~olliv/olio/korvike.csv");
        }catch (MalformedURLException e){
            System.out.println(e);
            return;
        }
        try {
            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);
            String line;
            double sum = 0;
            int count = 0;

            StringBuilder response = new StringBuilder();
            reader.readLine();
            while ((line = reader.readLine()) != null){
                String[] parts = line.split(";");

            }

            reader.close();
            System.out.println(response.toString());
        }catch (IOException e){
            System.err.println(e);
        }
    }
}
