package Day05.abstractFactory;

public class LondonFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "London Parsing feedback XML...\nLondon Feedback XML Message";
    }
}
