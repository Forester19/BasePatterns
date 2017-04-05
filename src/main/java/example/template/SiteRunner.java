package example.template;

import com.sun.org.apache.bcel.internal.generic.NEW;
import example.builder.Website;

/**
 * Created by Владислав on 04.04.2017.
 */
public class SiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate websiteTemplate = new WelcomePage();
        WebsiteTemplate websiteTemplate2 = new NewsPage();

        websiteTemplate.showPage();
        System.out.println("\n==================\n");
        websiteTemplate2.showPage();
    }
}
