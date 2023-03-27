package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {
  private String filepathTo;
	
	public WriteSymptomDataToFile (String filepathTo) {
		this.filepathTo = filepathTo;
	}
}