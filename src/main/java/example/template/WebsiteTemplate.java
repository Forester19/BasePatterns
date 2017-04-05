package example.template;

import java.util.logging.Handler;

/**
 * Created by Владислав on 04.04.2017.
 */
public abstract class WebsiteTemplate {
public void showPage(){
    System.out.println("Header");
    pageContent();
    System.out.println("Footer");
}
public abstract void pageContent();
}
