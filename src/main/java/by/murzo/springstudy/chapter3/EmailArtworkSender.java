package by.murzo.springstudy.chapter3;

public class EmailArtworkSender implements ArtworkSender{

    @Override
    public void sendArtwork(String artworkPath, Recipient recipient) {
        // здесь следует логика обмена данными по эл. почте
    }

    @Override
    public String getFriendlyName() {
        return "Electronic mail";
    }

    @Override
    public String getShortName() {
        return "email";
    }
}
