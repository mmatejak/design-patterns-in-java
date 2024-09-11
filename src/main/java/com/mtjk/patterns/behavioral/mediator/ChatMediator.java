package com.mtjk.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {
    private List<User> users;

    public ChatMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            // Nie wysyłaj wiadomości do siebie
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
