package example.builder;

/**
 * Created by Владислав on 01.04.2017.
 */
public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    void buildName() {
        website.setName("Visitcard");
    }

    void buildCms() {
website.setCms(Cms.WORDPRESS);
    }

    void buildPrice() {
website.setPrice(500);
    }
}
