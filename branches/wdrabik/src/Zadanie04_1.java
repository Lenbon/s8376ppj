import javax.swing.JOptionPane;

import zadanie04_1.*;

/**
 * Zad. 1
 * 
 * (10 p)
 * 
 * Zdefiniuj w programie klasę własnego wątku rozszerzajacą klasę Thread.
 * Watek ten ma w pętli nieskończonej wypisywać na konsolę okreslone znaki.
 * 
 * Zdefiniuj również klasę zadania  implementującąjącą interfejs Runnable.
 * Zadanie to ma w petli nieskończonej wypisywać na konsolę liczby.
 * 
 * Uruchom watek własny oraz wątek realizujący zadanie i zaobserwuj ich działanie.
 * 
 * Zmodyfikuj  klasę własnego wątku tak aby wątek usypiał na jakiś czas.
 * 
 * Zmodyfikuj klasę własnego wątku tak aby można było przerwać stan uśpienia z wątku głównego.
 * 
 * Zmodyfikuj klasę własnego wątku tak aby wątek można było zakończyć z wątku głównego.
 * 
 * Zmodyfikuj klasę własnego wątku aby wątek można było wstrzymać na synchronizatorze a potem uwolnić .
 * 
 * Napisz fragment programu który generuje w wątku głównym okienko dialogowe z menu pozwalającym na sterowanie wątkiem pobocznym.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie04_1 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		Thread t2 = new Thread(new MyRunnable());
		
		t1.start();
		t2.start();
		
		JOptionPane.showMessageDialog(null, "suspend");
		t1.suspendThread();
		
		JOptionPane.showMessageDialog(null, "resume");
		t1.resumeThread();

		
		JOptionPane.showMessageDialog(null, "stop");
		t1.stopThis();
		
//		switch dla wyboru parametrów
		
//		System.exit(0);
	}
}
