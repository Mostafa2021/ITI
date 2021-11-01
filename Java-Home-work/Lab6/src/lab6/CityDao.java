package lab6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface CityDao {
        public List<City> read(String fname)throws FileNotFoundException, IOException ;
        public City create(String[] metadata) ;
//        public List<City> City_List(List<City> L,City city);

}
