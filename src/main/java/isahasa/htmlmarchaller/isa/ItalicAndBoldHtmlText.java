package isahasa.htmlmarchaller.isa;

import isahasa.htmlmarchaller.HtmlText;

public class ItalicAndBoldHtmlText extends HtmlText {

    public ItalicAndBoldHtmlText(String plainText) {
        super(plainText);
    }

    public String getPlainText() {
        return "<i><b>" + super.getPlainText() + "</b></i>";
    }
}
