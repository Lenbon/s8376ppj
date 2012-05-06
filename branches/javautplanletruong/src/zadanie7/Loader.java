package zadanie7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Loader
 *
 * @version     $Id$
 */
public class Loader
{
    private final String _file;

    public Loader(String file)
    {
        _file = file;
    }

    public List<Param> load() throws IOException
    {
        List<Param> result = new ArrayList<Param>();

        BufferedReader br = new BufferedReader(new FileReader(_file));
        String rowRaw;

        while ((rowRaw = br.readLine()) != null) {
            String[] row = rowRaw.split(" ");

            if (row.length < 2) {
                continue;
            }

            Param param = new Param();

            param.setType(row[0]);
            param.setMethod(row[1]);

            String[] params = new String[row.length - 2];
            for (int i = 2; i < row.length; i++) {
                params[i - 2] = row[i];
            }
            param.setParams(params);

            result.add(param);
        }

        br.close();

        return result;
    }
}
