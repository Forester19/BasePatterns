package example.builder;

/**
 * Created by Владислав on 01.04.2017.
 */
public class EnterpriseWebSiteBuilder extends WebsiteBuilder {
    void buildName() {
        website.setName("Enterprise website");
    }

    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    void buildPrice() {
        website.setPrice(500);
    }
}
