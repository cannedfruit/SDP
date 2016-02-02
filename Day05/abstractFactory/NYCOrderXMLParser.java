package Day05.abstractFactory;

public class NYCOrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "NYC Parsing order XML...\nNYC Order XML Message";
    }
}
