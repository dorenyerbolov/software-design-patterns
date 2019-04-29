package Adapter;

import WM.Element;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class XmlParser implements AdvancedConfigManager{
    private static final String CONFIG_PATH = "config.txt";
    private ArrayList<Element> components;
    private int cursor;

    public XmlParser() {
        components = new ArrayList<>();
        cursor = 0;
    }

    @Override
    public void loadXML() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("xml_config.xml"));

            // getting information about each component
            gatherInformation(document, "Button");
            gatherInformation(document, "TextField");

            // components.forEach(x -> System.out.println(x));
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    private void gatherInformation(Document document, String elementTag) {
        // get a NodeList of the specified tagName nodes inside the root node
        NodeList tagElements = document.getDocumentElement().getElementsByTagName(elementTag);

        for (int i = 0; i < tagElements.getLength(); i++) {
            Node node = tagElements.item(i);
            NamedNodeMap attributes = node.getAttributes();

            components.add(new Element(elementTag, attributes.getNamedItem("value").getNodeValue(), attributes.getNamedItem("X").getNodeValue(), attributes.getNamedItem("X").getNodeValue()));
        }
    }

    @Override
    public boolean hasNext() {
        return cursor < components.size();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return components.get(cursor++).toString();
    }
}
