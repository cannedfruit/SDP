package Day05.abstractFactory;


public class NYCFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParserInstance(String parserType) {
        if(parserType.equalsIgnoreCase("NYCError")){
            return new NYCErrorXMLParser();
        }else if(parserType.equalsIgnoreCase("NYCFeedback")){
            return new NYCFeedbackXMLParser();
        }else if (parserType.equalsIgnoreCase("NYCOrder")){
            return new NYCOrderXMLParser();
        }else if(parserType.equalsIgnoreCase("NYCResponse")){
            return new NYCResponseXMLParser();
        }else{
            throw new IllegalArgumentException("Input is not a valid NYC XML Parser");
        }
    }
}
