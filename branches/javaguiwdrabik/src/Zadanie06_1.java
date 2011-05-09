/**
 * Zad 1. Właściwości komponentów (max. 5p)
 * 
 * Stworzyć okno ramowe JFrame z tytułem "Prosty edytor", zawierające komponent
 * JTextArea (wielowierszowe pole edycyjne).
 * Zapewnić możliwość ustawiania z wiersza poleceń (przy uruchamianiu aplikacji)
 * rodzaju i rozmiaru pisma oraz kolorów tła i pisma.
 * 
 * Argumenty wywołania:
 *  typ pisma (np. "Dialog", "Serif", "Monospaced")
 *  rozmiar pisma
 *  trójka RGB, określająca kolor tła
 *  trójka RGB, określająca kolor pisma Domyślne wartości
 * 
 * Jeśli w wywołaniu nie podano argumentów, domyślne wartości winny być takie:
 *  typ pisma = "Dialog"
 *  rozmiar pisma = 14
 *  kolor tła = niebieski
 *  kolor pisma = biały
 *  
 * Wywołanie aplikacji powinno być możliwe:
 *  bez argumentów
 *  tylko rodzaj pisma
 *  rodzaj pisma i rozmiar pisma
 *  jw. + kolor tła (trzy liczby)
 *  jw. + kolor pisma (trzy liczby)
 *  
 * Np.
 *  java Zad1 -> niebieski edytor z pismem Dialog 14 w kolorze białym
 *  java Zad1 Monospaced -> niebieski edytor z pismem Monospaced 14 w kolorze białym
 *  java Zad1 Dialog 18  -> niebieski edytor z pismem Dialog 18 w kolorze białym
 *  java Zad1 Dialog 18 0 0 0 -> czarny edytor z pismem Dialog 18 w kolorze białym
 *  java Zad1 Dialog 18 255 255 255 0 0 0 -> biały edytor z pismem jw.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie06_1 {

}
