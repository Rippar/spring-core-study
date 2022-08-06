package by.murzo.springstudy.chapter3.annotation;

import by.murzo.springstudy.chapter2.decoupled.MessageProvider;
import by.murzo.springstudy.chapter2.decoupled.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class:"
                    + by.murzo.springstudy.chapter2.decoupled.StandardOutMessageRenderer.class.getName());

        }
        System.out.println(messageProvider.getMessage () );
    }

    @Override
    @Autowired
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider ;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}

