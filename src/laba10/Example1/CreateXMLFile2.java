package laba10.Example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import java.io.File;
import java.util.Scanner;

public class CreateXMLFile2 {
    public static <string> void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            //Создание корневого элемента
            Document doc = docBuilder.newDocument();

            Element rootElement = doc.createElement("motobikes");
            doc.appendChild(rootElement);
            // Нового мотоцикла
            Element vendor1 = doc.createElement("motobike");
            rootElement.appendChild(vendor1);

            Element model1;
            model1 = doc.createElement("model");
            System.out.println("Ввведите название модели мотоцикла: ");
            string inTerm1 = (string) in.next();
            model1.appendChild(doc.createTextNode((String) inTerm1));
            vendor1.appendChild(model1);

            Element engine1 = doc.createElement("engine");
            engine1.appendChild(doc.createTextNode("650"));
            vendor1.appendChild(engine1);

            Element year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode("2002"));
            vendor1.appendChild(year1);

            // Добавлнение второй книги
            Element vendor2 = doc.createElement("motobike");
            rootElement.appendChild(vendor2);

            Element model2 = doc.createElement("model");
            model2.appendChild(doc.createTextNode("Kawasaki KLE400"));
            vendor2.appendChild(model2);

            Element engine2 = doc.createElement("engine");
            engine2.appendChild(doc.createTextNode("400"));
            vendor2.appendChild(engine2);

            Element year2 = doc.createElement("year");
            year2.appendChild(doc.createTextNode("2010"));
            vendor2.appendChild(year2);

            //Запись XML-файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("src/laba10/Example1/example2.xml"));
            transformer.transform(source, result);
            System.out.println("Файл XML успешно создан!");
        } catch (Exception pce) {
            pce.printStackTrace();
        }
    }
}
