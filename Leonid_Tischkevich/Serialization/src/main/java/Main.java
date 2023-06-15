import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/dima/IdeaProjects/udemy/" +
                "Leonid_Tischkevich/Serialization/src/main/resources/account.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Bill bill = new Bill(1L, 10000, true);
        Account account = new Account(10L, "Lori", 4, "+3462738", "lori@abc.ru", bill);
        objectOutputStream.writeObject(account);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("/Users/dima/IdeaProjects/udemy/" +
                "Leonid_Tischkevich/Serialization/src/main/resources/account.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Account accountFromFile = (Account) objectInputStream.readObject();
        System.out.println(accountFromFile);

        FileOutputStream fileOutputStream1 = new FileOutputStream("/Users/dima/IdeaProjects/udemy/" +
                "Leonid_Tischkevich/Serialization/src/main/resources/account_pretty.json");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream1);
        ObjectMapper objectMapper = new ObjectMapper();
        outputStreamWriter.write(objectMapper.writeValueAsString(account));
        outputStreamWriter.close();

        FileInputStream fileInputStream1 = new FileInputStream("/Users/dima/IdeaProjects/udemy/" +
                "Leonid_Tischkevich/Serialization/src/main/resources/account_pretty.json");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream1);
        Account accountFromJson = objectMapper.readValue(inputStreamReader, Account.class);
        System.out.println(accountFromJson.toString());
    }
}