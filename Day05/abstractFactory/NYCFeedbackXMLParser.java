package Day05.abstractFactory;

public class NYCFeedbackXMLParser implements XMLParser {
    @Override
    public String parse() {
        return "NYC Parsing Feedback XML...\nNYC Feedback XML Message";
    }
}
