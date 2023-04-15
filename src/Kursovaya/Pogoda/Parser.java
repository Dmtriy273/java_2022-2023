package Kursovaya.Pogoda;

// парсинг страницы сайта через библиотеку jsoup

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private static Document getPage() throws IOException { //создаем метод getPage
        String url = "https://yandex.ru/pogoda/yekaterinburg?lat=56.838011&lon=60.597465"; // сайт для парсинга
        //парсим страницу, формируем объект Document, тайминг запроса страницы 3000 сек.
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }
    /* регулярное выражение Pattern
    выводим нужные символы из текста через matcher
    где \\d{2}\W{4} - две цыфры и месяц, \\d\W{4} - одна цыфра и месяц,
    \\S{1,3} - от одного до трех символов для температуры днем и ночью.*/
    private static Pattern pattern = Pattern.compile("\\d{2}\\W{4}|\\d\\W{4}|\\S{1,3}");
        private static String getDateFromString (String stringDate) throws Exception {
        Matcher matcher = pattern.matcher(stringDate);
        if (matcher.find()) {
            return matcher.group();
        }
        throw new Exception("Can't extract date from string!");

    }
    // выводим нужные символы из текста дневной температуры
    private static String getTemperatureDey(String stringDay) throws Exception {
        Matcher matcher = pattern.matcher(stringDay);
        if (matcher.find()) {
            return matcher.group();
        }
        throw new Exception("Can't extract date from string!"); // ошибка при неудачном matcher !

    }

    // выводим нужные символы из текста ночной температуры
    private static String getTemperatureNight(String stringNight) throws Exception {
        Matcher matcher = pattern.matcher(stringNight);
        if (matcher.find()) {
            return matcher.group();
        }
        throw new Exception("Can't extract date from string!");

    }

    public static void main(String[] args) throws Exception {
        Document page = getPage();
        //выбирае из сайта данные которые нам потребуются
        Elements table = page.select("div[aria-hidden=true]");
        // time получаем даты
        Elements time = table.select("time");
        for (Element times : time) {
            String stringDate = times.select("time[datetime]").text();
            String date = getDateFromString(stringDate);
            System.out.println (date);
        }

        // a получаем температуру только днём
        Elements day = table.select("div[class=temp forecast-briefly__temp forecast-briefly__temp_day]");
        for (Element days : day) {
            String stringDay = days.select("span[class=temp__value temp__value_with-unit]").text();
            String d = getTemperatureDey(stringDay);
            System.out.println("День" + d);
        }

        // night получаем температуру только ночью
        Elements night = table.select("div[class=temp forecast-briefly__temp forecast-briefly__temp_night]");
        for (Element nights : night) {
            String stringNight = nights.select("span[class=temp__value temp__value_with-unit]").text();
            String n = getTemperatureNight(stringNight);
            System.out.println("Ночь" + n);
        }
    }
    // передаем данные в файл Exel




}

