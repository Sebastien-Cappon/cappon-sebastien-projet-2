package com.hemebiotech.analytics;

import java.util.Map;


/**
 * Anything that will write symptom data on a valid data output format
 *
 */
public interface ISymptomWriter {
    // Toutes les méthodes d'une interface sont obligatoirement publiques
    void writeSymptoms(Map<String, Integer> symptoms);
}
