package com.musalsou.counterapp;
import com.codename1.rad.annotations.RAD;
import com.codename1.rad.ui.AbstractEntityView;
import com.codename1.rad.ui.EntityView;
import com.codename1.rad.models.Entity;
import com.codename1.rad.nodes.Node;
import com.codename1.io.CharArrayReader;
import com.codename1.rad.ui.ViewContext;
@RAD
public abstract class AbstractStartPage<T extends Entity>  extends AbstractEntityView<T> {
    private static final String FRAGMENT_XML="<?xml version=\"1.0\" encoding=\"UTF-8\"?><y xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" rad-id=\"0\" safeArea=\"true\" scrollableY=\"true\" style.bgColor=\"0xffffff\" style.bgTransparency=\"0xff\" style.paddingBottom=\"5vw\" style.paddingLeft=\"5vw\" style.paddingRight=\"5vw\" style.paddingTop=\"5vw\" xsi:noNamespaceSchemaLocation=\"StartPage.xsd\">\r\n    <title hidden=\"true\" rad-id=\"1\"/>\r\n\r\n\r\n    <spanLabel rad-id=\"2\" style.marginBottom=\"1rem\" textUIID=\"StartPageText\">Login</spanLabel>\r\n\r\n    <spanLabel rad-id=\"3\" textUIID=\"StartPageText\">Username:</spanLabel>\r\n    <spanLabel rad-id=\"4\" textUIID=\"StartPageText\">Password:</spanLabel>\r\n\r\n\r\n\r\n</y>";
    public AbstractStartPage(ViewContext<T> context) {
        super(context);
    }

}
