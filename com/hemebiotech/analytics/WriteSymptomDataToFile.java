package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {
  
  /**
  * Write a Map in a file named result.out, one line per line.
  *
  * @author Sébastien Cappon
  * @version 1.4
  */
  @Override
  public void writeSymptoms(Map<String, Integer> symptoms) {
    try {
      FileWriter fileWriter = new FileWriter("result.out", false);
      BufferedWriter writer = new BufferedWriter(fileWriter);
      
      for (Map.Entry<String, Integer> symptom : symptoms.entrySet()) {
        writer.write(symptom.getKey() + " : " + symptom.getValue());
        writer.newLine();
      }

      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}