package zadanie1;

import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilter implements FilenameFilter {
	public boolean accept(File dir, String name) {
		return (name.endsWith(".class"));
	}
}
