package parseaparment;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class Main {

    public static void main(String[] args) throws IOException, GeneralSecurityException {
        // Apartments sorted by default, low to high, and high to low
//        String[] url = { "https://www.apartments.com/1-bedrooms-500-to-1100/?sk=607be53c4e977f30d7ee63316960f724&bb=6v7w4xkovI570-40O",
//                        "https://www.apartments.com/1-bedrooms-500-to-1100/?sk=ec950835389e6e896bf6b3a06d111691&bb=6v7w4xkovI570-40O&so=2",
//                        "https://www.apartments.com/1-bedrooms-500-to-1100/?sk=66d733467b5998e00b65cf9e65722ac9&bb=6v7w4xkovI570-40O&so=1" };
//
//        ApartmentsFinder apartmentGetter = new ApartmentsFinder(url);
//        List<Apartment> apartments = apartmentGetter.getApartments();

//        WriteToSpreadSheet writer = new WriteToSpreadSheet();
//        writer.write(apartments);

        DirectionsRequester directions = new DirectionsRequester();
    }

}
