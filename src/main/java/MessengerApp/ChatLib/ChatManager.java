package MessengerApp.ChatLib;

import MessengerApp.User;

public class ChatManager {
    public Chatroom createChat(String chatName) {
        return new Chatroom(chatName);
    }

    public void enterTheChat(Chatroom chatroom, User user) {
        chatroom.addUser(user);
    }

    public void leaveTheChat(Chatroom chatroom, User user) {
        chatroom.removeUser(user);
    }

    public void getMassage(Chatroom chatroom, User user, String msg) {
        chatroom.printMessage(user, msg);
    }
}
