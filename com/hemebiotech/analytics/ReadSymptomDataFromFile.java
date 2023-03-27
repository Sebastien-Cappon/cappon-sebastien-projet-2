package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadSymptomDataFromFile implements ISymptomReader {
  private String filepath;

  public ReadSymptomDataFromFile(String filepath) {
    this.filepath = filepath;
  }

  /**
  * Read a file and put its content into a raw List, one line per line.
  *
  * @author [NPC]Caroline - Technical Director at HemeBiotech
  */
  @Override
  public List<String> getSymptoms() {
    ArrayList<String> result = new ArrayList<String>();

    if (filepath != null) {
      try {
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        String line = reader.readLine();

        while (line != null) {
          result.add(line);
          line = reader.readLine();
        }
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    return result;
  }
}