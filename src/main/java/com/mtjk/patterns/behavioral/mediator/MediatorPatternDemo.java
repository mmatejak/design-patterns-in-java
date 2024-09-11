package com.mtjk.patterns.behavioral.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        Mediator chatMediator = new ChatMediator();

        User user1 = new ConcreteUser(chatMediator, "Alice");
        User user2 = new ConcreteUser(chatMediator, "Bob");
        User user3 = new ConcreteUser(chatMediator, "Charlie");
        User user4 = new ConcreteUser(chatMediator, "Diana");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.send("Hello everyone!");
        user2.send("Hi Alice!");
    }
}
