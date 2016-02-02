package Day05.abstractFactory;

public class NYCResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "NYC Parsing Response XML...\nNYC Response XML Message";
    }
}
