package Kursovaya;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Parser {
    //парсим сайт при помощи библиотеки Jsoup
    public static void main(String[] args) throws IOException {
        String url = "https://www.coingecko.com/";
        Document doc = Jsoup.connect(url).get();
        Elements tableRows = doc.select("table tr");
        //получаем нужные данные и создаем список через ArrayList
        List<List<String>> data = new ArrayList<>();
        for (Element row : tableRows) {
            List<String> rowData = new ArrayList<>();
            Elements cells = row.select("td");
            for (Element cell : cells) {
                rowData.add(cell.text());
            }
            data.add(rowData);
        }
        //создаем новый докумет Exel при помощи XSSFWorkbook
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Data");

        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setColor(IndexedColors.WHITE.getIndex());

        int rowIndex = 0;
        for (List<String> rowData : data) {
            Row row = sheet.createRow(rowIndex++);
            int cellIndex = 0;
            for (String cellData : rowData) {
                Cell cell = row.createCell(cellIndex++);
                cell.setCellValue(cellData);
            }
        }
        //сохраняем документ Exel в указаном месте
        FileOutputStream outputStream = new FileOutputStream("C:/Users/dantonenko/java_2022-2023/src/Kursovaya/Kripto.xlsx");
        workbook.write(outputStream);
        workbook.close();
    }
}







