package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {
  
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