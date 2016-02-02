package Day05.abstractFactory;

public class LondonErrorXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "London Parsing error XML...\nLondon Error XML Message";
    }
}
