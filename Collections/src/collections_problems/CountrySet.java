package collections_problems;


import java.util.HashSet;
import java.util.Iterator;

public class CountrySet {
   
    HashSet<String> H1 = new HashSet<>();


    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

  
    public String getCountry(String countryName) {
        Iterator<String> it = H1.iterator();
        while (it.hasNext()) {
            String country = it.next();
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        CountrySet cs = new CountrySet();

        cs.saveCountryNames("India");
        cs.saveCountryNames("USA");
        cs.saveCountryNames("Canada");

        System.out.println("All Countries: " + cs.H1);

    
        String search1 = cs.getCountry("India");
        System.out.println("Search Result: " + (search1 != null ? search1 : "Country not found"));

        
        String search2 = cs.getCountry("Germany");
        System.out.println("Search Result: " + (search2 != null ? search2 : "Country not found"));
    }
}
