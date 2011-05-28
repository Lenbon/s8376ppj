/*

źródło -> stumień -> odbiornik

źródło -> strumień wyjściowy

stumień wejściowy -> odbiornik

java.io.*
FileReader
FileWriter

domyślnie plik znajduje się w katalogu głównym projektu.

FileReader fr = new FileReader("in.txt");
FileWriter fw = new FileWriter("out.txt"); - nadpisuje istniejacy plik
FileWriter fw = new FileWriter("out.txt", true); - dopisujemy do istniejacego pliku

BufferedReader br = new BufferedReader(fr);
BufferedWriter bw = new BufferedWriter(fw);

użycie bufora wymaga zamknięcia bufora po użyciu, w szczególności bw.
zamknięcie bufora powoduje jednoczesne zamknięcie strumienia

String linia;

linia = br.readLine();
linia == null oznacza koniec pliku
przykład - przepisywanie:

while((linia = br.readLine()) != null) {
	bw.write(linia); - linia musi być typu String
	bw.newLine(); - dodanie znaku końca linii (rozwiązanie odporne na różnice międzyplatformowe)
}

br.close();
bw.close();

*/