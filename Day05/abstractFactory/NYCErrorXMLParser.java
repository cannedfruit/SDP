package Day05.abstractFactory;

public class NYCErrorXMLParser  implements XMLParser{
    @Override
    public String parse() {
        return "NYC Parsing error XML...\nNYC Error XML Message";
    }
}
