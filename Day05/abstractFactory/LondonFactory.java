package Day05.abstractFactory;

public class LondonFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        if(parserType.equalsIgnoreCase("LondonError")){
            return new LondonErrorXMLParser();
        }else if(parserType.equalsIgnoreCase("LondonFeedback")){
            return new LondonFeedbackXMLParser();
        }else if (parserType.equalsIgnoreCase("LondonOrder")){
            return new LondonOrderXMLParser();
        }else if(parserType.equalsIgnoreCase("LondonResponse")){
            return new LondonResponseXMLParser();
        }else{
            throw new IllegalArgumentException("Input is not a valid NYC XML Parser");
        }
    }
}
