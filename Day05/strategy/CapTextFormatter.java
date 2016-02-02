package Day05.strategy;

public class CapTextFormatter implements TextFormatter {
    @Override
    public void format(String text) {
        System.out.println(text.toUpperCase());
    }

    @Override
    public String toString(){
        return "[CapTextFormatter]";
    }
}
