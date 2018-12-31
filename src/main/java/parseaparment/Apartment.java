package parseaparment;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Apartment {

    private String name;
    private String priceMonthly;
    private String bedNumber;
    private String includedUtils;
    private String address;



    private String squareFeet;

    public String getName() {
        return name;
    }
    public String getSquareFeet() {
        return squareFeet;
    }

    public Apartment(String url){
        try {
            Document doc = Jsoup.connect(url).
                    userAgent("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36").get();
            name = parseName(doc);
            priceMonthly = removePriceDashes(parsePrice(doc));
            includedUtils = filterUtilities(parseFreeUtils(doc));
            address = parseAddress(doc);
            bedNumber = parseBeds(doc);
            squareFeet = parseSquareFeet(doc);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    
    public void printApartmentInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Bed Number: " + this.bedNumber);
        System.out.println("Square ft: " + this.squareFeet);
        System.out.println("Free Utils: " + this.includedUtils);
        System.out.println("Price: " + this.priceMonthly);
        System.out.println("================================");
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

    private String parseSquareFeet(Document doc){
        Element sqftHTML = doc.select("td.sqft").first();
        return sqftHTML.text();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return Objects.equals(name, apartment.name);

    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }


    public List<Object> getApartment(){
        List<Object> apartments = new ArrayList<>();
        apartments.add(this.name);
        apartments.add(this.priceMonthly);
        apartments.add(this.bedNumber);
        apartments.add(this.includedUtils);
        apartments.add(this.address);
        apartments.add(this.squareFeet);

        return apartments;
    }

    private String removePriceDashes(String input){
        Pattern p = Pattern.compile("^(\\$[0-9,]+)");
        Matcher m = p.matcher(input);
        return (m.find()) ? m.group(1) : input;
    }

    private String filterUtilities(String input){
        return input.replace("Utilities Included ", "").replace(" Included", "");
    }
}
