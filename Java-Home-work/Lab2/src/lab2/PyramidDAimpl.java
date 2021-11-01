package lab2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class PyramidDAimpl implements PyramidCsvDao {

    public PyramidDAimpl() {

    }

    public List<Pyramid> readPyramidsFromCsv(String fname) throws FileNotFoundException, IOException {
        List<Pyramid> result = new LinkedList<Pyramid>();
        
        BufferedReader br;
        br = new BufferedReader(new FileReader(fname));

        String line = br.readLine();

        do {
            line = br.readLine();
            if (line != null) {
                String[] p = line.split(",");
                result.add(createPyramid(p));
            }

        } while (line != null);
        return result;
    }

    public Pyramid createPyramid(String[] metadate) {
        double x=0.0;
        if(String.valueOf(metadate[7]).equals("")){
             x=0.0;
        }else{x=Double.valueOf(metadate[7]);}

            return (new Pyramid(metadate[0], metadate[2], metadate[4], x));
        
    }

}
