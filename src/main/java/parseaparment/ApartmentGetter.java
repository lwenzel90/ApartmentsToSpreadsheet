package parseaparment;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApartmentGetter {
    private List<String> apartmentUrls;
    private String amherstApartmentURL = "https://www.apartments.com/amherst-ny/900-to-1100/?bb=ozho_331uIl7jxj1D";

    public ApartmentGetter(String url){
        apartmentUrls = new ArrayList<>();
        Elements linkHTML;
        try {
            Document doc = Jsoup.connect(url).
                    userAgent("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36").get();
            linkHTML = doc.getElementsByClass("placardTitle");
            for (Element htmlLink : linkHTML) {
                apartmentUrls.add(htmlLink.attr("href"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<Apartment> getApartments(){
        List<Apartment> apartmentObjs = new ArrayList<>();
        
        for (String apartmentUrl : apartmentUrls){
            apartmentObjs.add(new Apartment(apartmentUrl));
        }
        return apartmentObjs;
    }
}
