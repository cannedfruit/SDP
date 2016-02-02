package Day05.strategy;

public class TextEditor {
    private TextFormatter formatter;

    public TextEditor(TextFormatter formatter){
        this.formatter = formatter;
    }

    public void publishText(String text){
        System.out.print(formatter.toString() + ": ");
        formatter.format(text);
    }
}
