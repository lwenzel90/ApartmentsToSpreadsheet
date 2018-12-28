package parseaparment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Apartments sorted by default, low to high, and high to low
        String[] url = { "https://www.apartments.com/1-bedrooms-500-to-1100/?sk=607be53c4e977f30d7ee63316960f724&bb=6v7w4xkovI570-40O",
                        "https://www.apartments.com/1-bedrooms-500-to-1100/?sk=ec950835389e6e896bf6b3a06d111691&bb=6v7w4xkovI570-40O&so=2",
                        "https://www.apartments.com/1-bedrooms-500-to-1100/?sk=66d733467b5998e00b65cf9e65722ac9&bb=6v7w4xkovI570-40O&so=1" };

        List<Apartment> apartment;
        ApartmentUrls apartmentGetter = new ApartmentUrls(url);
        apartment = apartmentGetter.getApartments();

        for (int i = 0; i < apartment.size(); i++){
            System.out.println("Name: " + apartment.get(i).getName());
            System.out.println("Address: " + apartment.get(i).getAddress());
            System.out.println("Bed Number: " + apartment.get(i).getBedNumber());
            System.out.println("Free Utils: " + apartment.get(i).getIncludedUtils());
            System.out.println("Price: " + apartment.get(i).getPriceMonthly());
            System.out.println("================================");
        }
        System.out.println(apartment.size());
    }

}
