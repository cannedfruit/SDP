package Day05.composite;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {

    List<HtmlTag> children;
    private String tagName;
    private String startTag;
    private String endTag;
    private String bodyTag;

    public HtmlParentElement(String nameTag) {
        this.tagName = tagName;
        children = new ArrayList<>();
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
        System.out.println(startTag);
        children.stream().forEach(HtmlTag::generateHtml);
        System.out.println(endTag);
    }

    @Override
    public void setTagBody(String tagBody) {
        this.bodyTag = tagBody;
    }

    @Override
    public void addChildTag(HtmlTag htmlTag) {
        children.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag) {
        children.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return children;
    }
}
