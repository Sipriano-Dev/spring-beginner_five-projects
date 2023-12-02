package di;

public class Client {

    public static void main(String[] args) {


        String message = "Hi, Good morning, have a nice day!";
        EmailService emailService = new EmailService();
        SMSService smsService = new SMSService();
        MessageSender messageSender = new MessageSender(emailService);

        messageSender.sendMessage(message);
    }

}
