package patterns.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "admin");
        User userOne = new SimpleUser(chat, "userOne");
        User userTwo = new SimpleUser(chat, "userTwo");

        chat.setAdmin(admin);
        chat.addUser(userOne);
        chat.addUser(userTwo);



        userOne.sendMessage("Hello, I am User One!");
        admin.sendMessage("Roger that!");
    }
}
