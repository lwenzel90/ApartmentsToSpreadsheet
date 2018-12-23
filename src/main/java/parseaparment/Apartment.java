package parseaparment;

public class Apartment {

    private String name;
    private String priceMonthly;
    private String bedNumber;
    private String includedUtils;
    private String features;
    private String address;


    public Apartment(String apartmentURL){

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

    public String getFeatures() {
        return features;
    }

    public String getAddress() {
        return address;
    }
}
