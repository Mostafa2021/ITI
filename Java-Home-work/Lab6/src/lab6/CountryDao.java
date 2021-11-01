    package lab6;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface CountryDao {
        public List<Country> read(String fname)throws FileNotFoundException, IOException ;
        public Country create(String[] metadata) ;

    
}
