package com.hemebiotech.analytics;

import java.util.Map;

/**
* Interface of WriteSymptomDataToFile.
* Could evolve if new output formats are implemented in the project.
*
* @author Sébastien Cappon
* @version 1.4
*/
public interface ISymptomWriter {
  public void writeSymptoms(Map<String, Integer> symptoms);
}
