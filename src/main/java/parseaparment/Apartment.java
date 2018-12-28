package parseaparment;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Apartment {

    private String name;
    private String priceMonthly;
    private String bedNumber;
    private String includedUtils;
    //private String features;
    private String address;


    public Apartment(String url){
        try {
            Document doc = Jsoup.connect(url).
                    userAgent("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36").get();
            name = parseName(doc);
            priceMonthly = parsePrice(doc);
            includedUtils = parseFreeUtils(doc);
            address = parseAddress(doc);
            bedNumber = parseBeds(doc);

        } catch (IOException e){
            e.printStackTrace();
        }
    }



    //Getters

    public String getName() {
        return name;
    }
    public String getPriceMonthly() {
        return priceMonthly;
    }
    public String getBedNumber() {
        return bedNumber;
    }
    public String getIncludedUtils() {
        return includedUtils;
    }
    public String getAddress() {
        return address;
    }

    private void parseDetails(String url){

    }

    private String parseName(Document doc){
        Element titleHTML = doc.getElementsByClass("propertyName").first();
        return titleHTML.text();
    }

    private String parsePrice(Document doc){
        Element rentHTML = doc.getElementsByClass("rent").first();
        return rentHTML.text();
    }

    private String parseFreeUtils(Document doc){
        Elements utilsHTML = doc.getElementsByClass("freeUtilities");
        if(!utilsHTML.toString().trim().replaceAll("\\s+","").equals("")){
            return utilsHTML.text();
        }
        return "";
    }

    private String parseAddress(Document doc){
        Elements rentHTML = doc.getElementsByClass("propertyAddress");
        return rentHTML.text();
    }

    private String parseBeds(Document doc){
        Element bedsHTML = doc.select("td.beds").first();
        return bedsHTML.text();
    }

}
