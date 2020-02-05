public class AppStart {
    public static void main(String[] args) {
        DocumentParser documentParser= new DocumentParser();
        String xml= "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<EsitoCensimentoBancomat xmlns=\"http://xmlbeans.weservice.it/cglobal\">\n" +
                "    <tipoMessaggio>7</tipoMessaggio>\n" +
                "    <idRichiesta>201</idRichiesta>\n" +
                "    <ndg>20803179</ndg>\n" +
                "    <numeroCarta>083525084436</numeroCarta>\n" +
                "    <statoCensimento>Y</statoCensimento>\n" +
                "</EsitoCensimentoBancomat>\n";
MqInput mq =documentParser.saveIncomingMessage(xml);
        System.out.println(mq.toString());
    }
}
