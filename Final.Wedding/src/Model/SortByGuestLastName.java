package Model;

import java.io.*;
import java.text.Collator;
import java.util.*;

public class SortByGuestLastName extends Wedding{


    public void sortLastName() throws IOException {// this method reads lines from text file, sorts them in alphabetical order and writes them to the wedding file

            FileReader fileReader = new FileReader("Wedding guest list");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<String> lines = new ArrayList<String>();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();

            Collections.sort(lines, Collator.getInstance());

            for(String str: lines) {
                write(str);
            }

        }


    }
