package Day05.composite;

public class HtmlElement extends HtmlTag {
    private String tagName;
    private String startTag;
    private String endTag;
    private String bodyTag;

    public HtmlElement(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public void setTagBody(String tagBody) {
        this.bodyTag = tagBody;
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag +  bodyTag + endTag);
    }
}
