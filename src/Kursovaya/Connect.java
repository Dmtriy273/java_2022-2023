package Kursovaya;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Connect {
//body>div>div>div>div>div>table>tbody>tr
    public static void main(String[] args){
        try {
            // Получаем HTML код страницы
            var document = Jsoup.connect("https://www.coingecko.com/").get();
            // Извлекаем список топ 100 криптовалют
            var titleElements = document.select("body>div>div>div>div>div>table>tbody>tr");
            for (var element : titleElements) {
                String stringData = element.select("td").text();
                String data = getDataFromString(stringData);
                System.out.println(stringData);
            }
        }    catch (Exception e){
            e.printStackTrace();
        }
    }
    //\\d{2}\W{4}|\\d\W{4}|\\S{1,3}
    private static Pattern pattern = Pattern.compile("\\S{1,3}");
    private static String getDataFromString (String Data) throws Exception {
        Matcher matcher = pattern.matcher(Data);
        if (matcher.find()) {
            return matcher.group();
        }
        throw new Exception("Can't extract date from string!");
    }







}
