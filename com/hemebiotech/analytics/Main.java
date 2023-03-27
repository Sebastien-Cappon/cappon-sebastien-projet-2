package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {

  /**
  * Take a raw list of symptoms as input.
  * Generates an ordered list of counted symptoms.
  * Put this list into a result.out file as input.
  *
  * @author Sébastien Cappon
  * @version 1.2
  */
  public static void main(String[] args) {
    List<String> rawSymptomsList;
    Map<String, Integer> countedSymptomsList;
    Map<String, Integer> orderedSymptomsList;

    ISymptomReader readSymptoms = new ReadSymptomDataFromFile("symptoms.txt");
    ISymptomWriter writeSymptoms = new WriteSymptomDataToFile();
    AnalyticsCounter analyticsCounter = new AnalyticsCounter(readSymptoms, writeSymptoms);

    rawSymptomsList = analyticsCounter.getSymptoms();
    countedSymptomsList = analyticsCounter.countSymptoms(rawSymptomsList);
    orderedSymptomsList = analyticsCounter.sortSymptoms(countedSymptomsList);
    analyticsCounter.writeSymptoms(orderedSymptomsList);
  }
}