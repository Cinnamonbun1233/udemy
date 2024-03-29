package lesson_002;

import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    private static AccountRepository INSTANCE;
    private final List<Account> accountList = new ArrayList<>();

    private AccountRepository() {

    }

    public static AccountRepository getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AccountRepository();
        }
        return INSTANCE;
    }

    public void add(Account account) {
        accountList.add(account);
    }

    public Account getById(Long id) throws AccountNotFoundException{
        for (Account account : accountList) {
            if (account.getId().equals(id)) {
                return account;
            }
        }
        throw new AccountNotFoundException("Аккаунт с id: '" + id + "' не найден");
    }
}