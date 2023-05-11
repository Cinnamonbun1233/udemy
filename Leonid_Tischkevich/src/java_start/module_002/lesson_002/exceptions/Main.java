package java_start.module_002.lesson_002.exceptions;

public class Main {
    public static void main(String[] args) {
        AccountRepository accountRepository = AccountRepository.getInstance();

        Account account_1 = new Account(1L, "Lori", 10000);
        Account account_2 = new Account(2L, "Baxter", 20000);
        Account account_3 = new Account(3L, "Martin", 30000);

        accountRepository.add(account_1);
        accountRepository.add(account_2);
        accountRepository.add(account_3);

        Account account = accountRepository.getById(4L);

    }
}