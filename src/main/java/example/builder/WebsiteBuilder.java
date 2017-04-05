package example.builder;

/**
 * Created by Владислав on 01.04.2017.
 */
public abstract class WebsiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();

    abstract void buildCms();

    abstract void buildPrice();

    Website getWebsite() {
        return website;
    }
}
