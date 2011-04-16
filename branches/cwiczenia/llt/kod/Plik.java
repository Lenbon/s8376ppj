import java.io.*;

public class Plik {
	
	public static void main(String[] args)
	{
		String wiersz;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("in.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
			
			while((wiersz = br.readLine()) != null){
				System.out.println(wiersz);
			
				bw.write(wiersz);
				bw.newLine();
			}
			
			br.close();
			bw.close();
		}
		catch(IOException e) {
			System.out.println("Blad: " + e.getMessage());
		}
	}
}