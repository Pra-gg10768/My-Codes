package com.util;

import com.exception.InvalidConsumerException;
import com.model.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class CreditScoreReport {

	List<Consumer> consumerList=new ArrayList<>();

	public List<Consumer> getConsumerList() {
		return consumerList;
	}
	public void setConsumerList(List<Consumer> consumerList) {
		this.consumerList = consumerList;
	}
		
 	  	 		  	     	      	 	
	public Map<Integer, Integer> totalConsumerCountForEachCreditScoreRange() throws InvalidConsumerException {
	    if (consumerList == null || consumerList.isEmpty()) {
	        throw new InvalidConsumerException("Consumer list is empty");
	    }

	    Map<Integer, Integer> scoreMap = new HashMap<>();
	    scoreMap.put(800, 0);
	    scoreMap.put(600, 0);
	    scoreMap.put(500, 0);
	    scoreMap.put(300, 0);

	    for (Consumer consumer : consumerList) {
	        int score = consumer.getCreditScore();
	        if (score >= 800) {
	            scoreMap.put(800, scoreMap.get(800) + 1);
	        } else if (score >= 600) {
	            scoreMap.put(600, scoreMap.get(600) + 1);
	        } else if (score >= 500) {
	            scoreMap.put(500, scoreMap.get(500) + 1);
	        } else {
	            scoreMap.put(300, scoreMap.get(300) + 1);
	        }
	    }
	    return scoreMap;
	}
	
	public String viewConsumerReportBasedOnCreditScore(int creditScore) throws InvalidConsumerException {
	    if (consumerList == null || consumerList.isEmpty()) {
	        throw new InvalidConsumerException("Consumer list is empty");
	    }

	    if (creditScore >= 800) {
	        return "EXCELLENT";
	    } else if (creditScore >= 700) {
	        return "GOOD";
	    } else if (creditScore >= 500) {
	        return "FAIR";
	    } else {
	        return "POOR";
	    }
	}	 		  	     	      	 	
}

