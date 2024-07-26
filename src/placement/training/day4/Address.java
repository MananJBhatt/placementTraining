package placement.training.day4;
//Contained Class
public class Address {

    private String house;
    private String street;
    private String city;
    private long postalCode;

    public Address() {
    }

    public Address(String house, String street, String city, long postalCode) {
        this.house = house;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(long postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "house='" + house + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
