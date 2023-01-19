package Homeworks.Homework_16;

public class Email {

    public void email(String emailAddress) {
        for (int i = 0; i < emailAddress.length(); i++) {
            if (emailAddress.charAt(i) == '@') {
                int beginIndex = i + 1;
                int endIndex = emailAddress.indexOf('.', i);
                String address = emailAddress.substring(beginIndex, endIndex);
                System.out.println(address);
            }
        }
    }
}

class EmailTest {

    public static void main(String[] args) {

        Email email = new Email();
        email.email("ya@yahoo.com; on@mail.ru; ona@gmail.com; ono@yandex.ru;");
    }
}