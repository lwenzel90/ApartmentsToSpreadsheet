package parseaparment;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String url = "https://www.apartments.com/amherst-ny/900-to-1100/?bb=ozho_331uIl7jxj1D";
        ApartmentGetter apartmentGetter = new ApartmentGetter(url);

    }

}
