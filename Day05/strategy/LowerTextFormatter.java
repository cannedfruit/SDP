package Day05.strategy;


public class LowerTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println(text.toLowerCase());
    }

    @Override
    public String toString(){
        return "[LowerTextFormatter]";
    }
}
