package zadanie1;

import java.util.*;
import java.io.*;

public class Plik extends File {

	public Plik(String path) {
		super(path);
	}

	private void _parse(List<File> list, File file, FilenameFilter filter) {
		Plik tmp;

		for (String s : file.list(filter)) {
			tmp = new Plik(file.getPath() + "/" + s);

			if (tmp.isFile()) {
				list.add(tmp);
			} else if (tmp.isDirectory()) {
				_parse(list, tmp, filter);
			}
		}
	}

	public List<File> listFilesRecurse() {
		List<File> list = new ArrayList<File>();
		_parse(list, this, null);

		return list;
	}

	public List<File> listFilesRecurse(FilenameFilter filter) {
		List<File> list = new ArrayList<File>();
		_parse(list, this, filter);

		return null;
	}

	public String getTree() {
		String fullPath = getPath();

		fullPath += getPath();

		return fullPath;
	}
}
