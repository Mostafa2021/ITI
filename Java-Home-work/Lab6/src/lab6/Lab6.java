package lab6;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab6 {

    public static void main(String[] args) throws IOException {

        CountryDAimpl CsvDao = new CountryDAimpl();

        List<Country> countries = CsvDao.read("C:\\Users\\20111\\Desktop\\country.csv");

        CityDAimpl CsvDao2 = new CityDAimpl();
        List<City> cities = CsvDao2.read("C:\\Users\\20111\\Desktop\\city.csv");

        Map<String, List<City>> countryMap = cities
                .stream()
                .collect(Collectors.groupingBy(City::getCountrycode));

        countryMap.forEach((k, v) -> System.out.println(k + " = " + v));

        System.out.print("==================\nPlease Enter Country Code: ");
        Scanner sc = new Scanner(System.in);
        String counrty_code = sc.nextLine();

        cities
                .stream()
                .filter((c) -> counrty_code.equals(c.getCountrycode()))
                .sorted((c1, c2) -> Integer.compare(c2.getPopulation(), c1.getPopulation()))
                .collect(Collectors.toList())
                .forEach((c) -> System.out.println(c.getName() + " => " + c.getPopulation()));

        Map<String, Integer> result = new HashMap<>();
        countries
                .stream()
                .forEach(entry -> result.put(entry.getName(), entry.getPopulation()));

        Double avg = result.values().stream().collect(Collectors.averagingInt((t) -> t));
        Optional<Integer> max = result.values().stream().max(Comparator.comparing((t) -> t));

        List<Optional<City>> Highest = new LinkedList<>();
        countryMap.values().stream().forEach(t ->Highest.add( t.stream().max(Comparator.comparing(c->c.getPopulation()))));

        System.out.println("List of Countries Population "+ result);
        System.out.println("average " + avg);
        System.out.println("Maximum"+max);
        System.out.println("Highest Population of each Country"+Highest);
        
        List<Integer> capitals = new LinkedList<>();
       countries.stream().forEach(c->capitals.add(c.getCapital()));
        System.err.println(capitals);
        
        List<Optional<City>> Capital_Cities = new LinkedList<>();
        Highest.stream().forEach(c->capitals.contains(Capital_Cities.add(c)));
        
        Optional<Optional<City>> max_capitl=Capital_Cities.stream().max(Comparator.comparing(c->c.get().getPopulation()));
        System.err.println("Highest Capital Population"+max_capitl);


    }

}
