package parseaparment;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, GeneralSecurityException {
        // Apartments sorted by default, low to high, and high to low
        String[] url = { "https://www.apartments.com/1-bedrooms-500-to-1100/?sk=607be53c4e977f30d7ee63316960f724&bb=6v7w4xkovI570-40O",
                        "https://www.apartments.com/1-bedrooms-500-to-1100/?sk=ec950835389e6e896bf6b3a06d111691&bb=6v7w4xkovI570-40O&so=2",
                        "https://www.apartments.com/1-bedrooms-500-to-1100/?sk=66d733467b5998e00b65cf9e65722ac9&bb=6v7w4xkovI570-40O&so=1" };

        List<Apartment> apartments;
        ApartmentsFinder apartmentGetter = new ApartmentsFinder(url);
        apartments = apartmentGetter.getApartments();

//        for (int i = 0; i < apartments.size(); i++){
//            apartments.get(i).printApartmentInfo();
//        }
//        System.out.println(apartments.size());

        WriteToSpreadSheet writer = new WriteToSpreadSheet();
        writer.write(apartments);
    }

}
