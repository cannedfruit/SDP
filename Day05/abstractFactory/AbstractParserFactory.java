package Day05.abstractFactory;


public interface AbstractParserFactory {
    public XMLParser getParserInstance(String parserType);
}
