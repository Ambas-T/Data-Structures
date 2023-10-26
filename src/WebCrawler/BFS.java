package WebCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BFS {
    private final Queue<String> queue;
    private final List<String> discoveredWebsites;

    public BFS() {
        this.queue = new LinkedList<>();
        this.discoveredWebsites = new ArrayList<>();
    }

    public void discoverWeb(String root){
        this.queue.add(root);
        this.discoveredWebsites.add(root);

        while (!queue.isEmpty())
        {
            String v = this.queue.remove();
            String rawHtml = readURL(v);

            String regExp = "https://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regExp);
            Matcher matcher = pattern.matcher(rawHtml);

            while (matcher.find())
            {
                String w = matcher.group();

                if(!discoveredWebsites.contains(w))
                {
                    discoveredWebsites.add(w);
                    System.out.println("Website found :" + w);
                    queue.add(w);
                }
            }

        }
    }

    private String readURL(String v) {
        StringBuilder rawHtml = new StringBuilder();
        try
        {
            URL url = new URL(v);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line = "";

            while((line = reader.readLine()) != null)
            {
                rawHtml.append(line);
            }
            reader.close();
        }catch (Exception e){
            System.out.println("Problem while crawling the website.");
        }

        return rawHtml.toString();
    }
}