package lab6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CountryDAimpl implements CountryDao {

    public List<Country> read(String fname) throws FileNotFoundException, IOException {
        List<Country> result = new LinkedList<Country>();
        
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

    public Country create(String[] metadata) {
            return new Country(metadata[0],metadata[1],metadata[2], Double.valueOf(metadata[3]),  Integer.valueOf(metadata[4]),Double.valueOf(metadata[5]),Integer.valueOf(metadata[6]))  ;  
    }

}
