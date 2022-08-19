package by.murzo.springstudy.chapter3;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class ArtworkManager {
    private List<ArtworkSender> artworkSenderList;

    public void printAllAvailableSenders() {
        artworkSenderList.forEach(e -> System.out.println(e.getFriendlyName()));
    }

    public void setArtworkSenderList(List<ArtworkSender> artworkSenderList) {
        this.artworkSenderList = artworkSenderList;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();

        ArtworkManager artworkManager = (ArtworkManager) ctx.getBean("ArtworkManager");
        artworkManager.printAllAvailableSenders();

        ctx.close();

    }
}
