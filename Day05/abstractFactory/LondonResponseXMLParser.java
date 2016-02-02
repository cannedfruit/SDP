package Day05.abstractFactory;

public class LondonResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "London Parsing response XML...\nLondon Response XML Message";
    }
}
