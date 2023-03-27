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

  /**
  * Count the occurrences of each symptom present in a list.
  *
  * @param symptoms raw list of symptoms
  *
  * @return HashMap of counted symptoms. One symptom and its occurrences per line. 
  * @author Sébastien Cappon
  * @version 1.3
  */
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

  /**
  * Sorts a Map in ascending order (alphabetical order in this case).
  *
  * @param symptoms Unordered Map (list of symptoms : occurrences in this case)
  *
  * @return Ordered TreeMap of counted symptoms.
  * @author Sébastien Cappon
  * @version 1.3
  */
  public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
    Map<String, Integer> sortedSymptoms = new TreeMap<String, Integer>();

    sortedSymptoms.putAll(symptoms);

    return sortedSymptoms;
  }
}