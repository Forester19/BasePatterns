package example.abstractFactory.webSite;

import example.abstractFactory.Developer;

/**
 * Created by Владислав on 01.04.2017.
 */
public class PhpDeveloper implements Developer {
    public void writeCode() {
        System.out.println("php developer write code ...");
    }
}
