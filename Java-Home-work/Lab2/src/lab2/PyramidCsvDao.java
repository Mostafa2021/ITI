package lab2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface PyramidCsvDao {
//    public List<Pyramid>getPyramids();
    
    public Pyramid createPyramid(String[] metadate);
    public List<Pyramid> readPyramidsFromCsv(String fname) throws FileNotFoundException, IOException;
    
}
