import controller.Load;
import controller.Save;
import models.data.City;
import models.data.Country;
import models.dataStructure.Cities;
import models.dataStructure.Countries;

public class main {

    public static void main(String[] args) {
        //Save
        Cities cities = new Cities();
        Countries countries = new Countries();

        Country usa = new Country(1, "United States", "USA");

        countries.addCountry(usa);
        cities.addCity(1, "New York", usa);

        Save save = new Save(null, null, null, null, cities, null, countries, null, null, null, null, null, null, null, null);


        //Load
        Load load = new Load();
        City city = load.getCities().getCityByIndex(0);
        System.out.println("Cities");
        System.out.println(city);
        System.out.println("Countries");
        System.out.println(load.getCountries().getCountryByIndex(0));

        System.out.println(load.getObjects());
    }
}
