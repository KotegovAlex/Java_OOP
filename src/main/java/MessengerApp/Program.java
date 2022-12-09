package MessengerApp;

import MessengerApp.ChatLib.ChatManager;
import MessengerApp.ChatLib.Chatroom;

public class Program {
    public static void main(String[] args) {
        ChatManager mng1 = new ChatManager();
        Chatroom chat1 = mng1.createChat("Start");

        User user1 = new User("Petya");
        User user2 = new User("Igor");
        User user3 = new User("Katya");
        User user4 = new User("Vasiliy");

        mng1.enterTheChat(chat1, user1);
        mng1.enterTheChat(chat1, user2);
        mng1.enterTheChat(chat1, user3);
        mng1.enterTheChat(chat1, user4);
        System.out.println();

        chat1.printUsers();
        System.out.println();

        mng1.getMassage(chat1, user1, "Hello!");
        mng1.getMassage(chat1, user2, "Hello world!");
        mng1.getMassage(chat1, user3, "Hi, all!");

        mng1.leaveTheChat(chat1, user3);
        System.out.println();
        chat1.printUsers();
        System.out.println();

        chat1.getHistory();
    }
}
