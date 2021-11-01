package lab2;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lab2 {

    public static void main(String[] args) throws IOException {

        PyramidCsvDao pDAO = new PyramidDAimpl();

        List<Pyramid> Pyramids = pDAO.readPyramidsFromCsv("C:\\Users\\20111\\Desktop\\pyramids.csv")
                .stream()
                .filter(p -> p.getHeight() > 0.0)
                .sorted(Comparator.comparingDouble(Pyramid::getHeight))
                .collect(Collectors.toList());

        Pyramids.forEach(System.out::println);

        Map<String, Long> PyrMap = Pyramids
                .stream()
                .collect(Collectors.groupingBy(Pyramid::getSite, Collectors.counting()));

        PyrMap.forEach((k, v) -> System.out.println(k + " = " + v));

    }

}
