package Day05.abstractFactory;


public class ParserFactoryProducer {
    public static AbstractParserFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("NYCFactory")){
            return new NYCFactory();
        }else if(choice.equalsIgnoreCase("LondonFactory")){
            return new LondonFactory();
        }else{
            throw new IllegalArgumentException("Not a valid XML Parser Factory");
        }
    }
}
