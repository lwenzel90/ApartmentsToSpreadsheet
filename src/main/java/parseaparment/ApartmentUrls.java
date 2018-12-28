package parseaparment;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.print.Doc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ApartmentUrls {
    private List<String> apartmentUrls;

    ApartmentUrls(String[] urls){
        apartmentUrls = new ArrayList<>();
        Elements linkToApartment;
        try {
            for (String url : urls) {
                Document doc = Jsoup.connect(url).
                        userAgent("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36").get();
                linkToApartment = doc.getElementsByClass("placardTitle");
                for (Element apartmentLink : linkToApartment) {
                    apartmentUrls.add(apartmentLink.attr("href"));
                }
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
        List<Apartment> apartmentsWithoutDuplicates = new ArrayList<>(new HashSet<>(apartmentObjs));
        return apartmentsWithoutDuplicates;
    }



}
