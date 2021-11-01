package lab6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CityDAimpl implements CityDao {

    public List<City> read(String fname) throws FileNotFoundException, IOException {
        List<City> result = new LinkedList<City>();
        
        BufferedReader br;
        br = new BufferedReader(new FileReader(fname));

        String line = br.readLine();

        do {
            line = br.readLine();
            if (line != null) {
                String[] p = line.split(",");
                result.add(create(p));
            }

        } while (line != null);
        return result;
    }

    public City create(String[] metadata) {
        return new City(Integer.valueOf(metadata[0]), metadata[1], Integer.valueOf(metadata[2]),  metadata[3]);
    }
//public List<City> City_List(List<City>L,City city){
//    L.add(city);
//return L;
//}
}
