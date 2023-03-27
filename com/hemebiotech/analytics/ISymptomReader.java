package com.hemebiotech.analytics;

import java.util.List;

/**
* Interface of ReadSymptomDataFromFile.
* Could evolve if new data sources are implemented in the project.
*
* @author [NPC]Caroline - Technical Director at HemeBiotech
*/
public interface ISymptomReader {
  List<String> getSymptoms();
}