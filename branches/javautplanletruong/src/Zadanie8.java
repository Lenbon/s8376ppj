import zadanie8.*;

/**
 * Zadanie 8
 *
 * Korzystając ze środków JavaBeans, stworzyć klasę - ziarno Account,
 * reprezentującą obiekty - konta bankowe. Każde konto ma aktualny stan balance
 * oraz dostępne są operacje: wpłata deposit(double), wypłata withdraw(double),
 * przelew na inne konto transfer(Account, double). Napisać program symulacyjny
 * AccountTest, w którym obniżenie stanu konta poniżej zera jest automatycznie
 * raportowane, np. poprzez wyświetlenie informacji na konsoli - za pomocą klasy
 * AccountChange odpowiadającej za reakcje na zmiany właściwości, natomiast
 * w przypadku posiadania limitu debetu, wszystkie operacje powodujące obniżenie
 * stanu konta poniżej limitu debetu są automatycznie odrzucane - za pomocą
 * klasy AccountLimitator odpowiadającej za wetowanie niedopuszczalnych zmian
 * właściwości.
 *
 * @version     $Id$
 */
public class Zadanie8
{
    public static void main(String[] args)
    {
        AccountChange ac = new AccountChange();
        AccountLimitator al = new AccountLimitator();

        // konto z limitem debetowym 0
        Account accountA = new Account();
        accountA.addPropertyChangeListener(ac);
        accountA.addVetoableChangeListener(al);
        // konto z przesunietym limitem debetowym
        Account accountB = new Account(25);
        accountB.addPropertyChangeListener(ac);
        accountB.addVetoableChangeListener(al);

        accountA.deposit(150);

        accountB.deposit(200);

        accountB.withdraw(50);
        accountB.withdraw(170);
        accountB.withdraw(50);

//        accountA.transfer(accountB, 200);
    }
}
