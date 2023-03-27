package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
  ISymptomReader reader;
  ISymptomWriter writer;

  public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
    this.reader = reader;
    this.writer = writer;
  }

  public List<String> getSymptoms() {
    return reader.getSymptoms();
  }
  
  public void writeSymptoms(Map<String, Integer> symptoms) {
    writer.writeSymptoms(symptoms); 
  }

  public Map<String, Integer> countSymptoms(List<String> symptoms) {
    Map<String, Integer> symptomsOccurencies = new HashMap<String, Integer>();
    
    for (int i = 0; i < symptoms.size(); i++) {
      if (symptomsOccurencies.containsKey(symptoms.get(i))) {
        symptomsOccurencies.put(symptoms.get(i), (symptomsOccurencies.get(symptoms.get(i)) + 1));
      } else {
        symptomsOccurencies.put(symptoms.get(i), 1);
      }
    }

    return symptomsOccurencies;
  }
  
  public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
    Map<String, Integer> sortedSymptoms = new TreeMap<String, Integer>();

    sortedSymptoms.putAll(symptoms);

    return sortedSymptoms;
  }
}