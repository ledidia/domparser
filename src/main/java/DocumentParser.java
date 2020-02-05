import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Date;

public class DocumentParser {

    public MqInput saveIncomingMessage(String message){
        MqInput mqInput = new MqInput();
        mqInput.setInsertedDate(new Date());
        mqInput.setXmlRequest(message);
        mqInput.setStatus(0);
        if(checkIsKit(message)){
            mqInput.setIsKit(1);
        }else {
            mqInput.setIsKit(0);
        };
mqInput.setMessageType(Integer.parseInt(parseDocument(xmlToDocument(message),"tipoMessaggio")));
mqInput.setIdRequest(parseDocument(xmlToDocument(message),"idRichiesta"));
//		ApplicationBeans.getDataService().save(mqInput);

        return mqInput;
    }

    public Document xmlToDocument(String xml){
        DocumentBuilder db;
        Document doc = null;
        try {
            db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(xml));
            doc = db.parse(is);
        } catch (SAXException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ParserConfigurationException e) {
            System.out.println(e);
        }
        return doc;
    }

    public String parseDocument(Document document, String tag){
        Element root = null;
        root = document.getDocumentElement();
        NodeList n1 =document.getElementsByTagName(tag);
        if (n1.getLength()>0) {
            return n1.item(0).getTextContent();
        }
        return null;
    }


    private boolean checkIsKit(String xml) {
        Element root = null;
        Integer typeMessageId = null;
        String idRequest = null;
        String typeMessage;
        Document doc = xmlToDocument(xml);

        typeMessage = parseDocument(doc, "tipoMessaggio");
        if (typeMessage != null) {
            typeMessageId = Integer.valueOf(typeMessage);
        }

        return false;
    }
}
