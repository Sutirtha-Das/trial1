package org.springframework.gs_maven.helper;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.gs_maven.vo.RatingVO;
import org.springframework.gs_maven.vo.RelatedTalksVO;
import org.springframework.gs_maven.vo.TedVO;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
@Component
public class ReadCSVHelper {
	
	private static final String CSV_FILE_PATH = "C:/Users/Sutirtha/Downloads/TED-22kDataba41455 (1)/TED-22kData.csv";
	
	public List<TedVO> readAllData(){

	    try { 
	    	List<TedVO> tedVOList =  new ArrayList<TedVO>();
	        FileReader filereader = new FileReader(CSV_FILE_PATH); 
	  
	        CSVReader csvReader = new CSVReader(filereader); 
	        String[] nextRecord; 
	        int count = 0;
	        while ((nextRecord = csvReader.readNext()) != null) { 
	        	
	        	try{
	        	TedVO ted = new TedVO();
	        	ted.setDescription(nextRecord[0]);
	        	ted.setEvent(nextRecord[1]);
	        	ted.setMainSpeaker(nextRecord[2]);
	        	ted.setName(nextRecord[3]);
	        	ted.setPublishedDate(nextRecord[4]);
	        	String ratings = nextRecord[5];
	        	ted.setRatingVO(populateRatingsVO(ratings));
	        	String related_talks = nextRecord[6];
	        	ted.setRelatedTalksVO(populateRelatedTalksVO(related_talks));
	        	String speaker_occupation = nextRecord[7];
	        	ted.setSpeakerOccupation(populateListOfDetails(speaker_occupation));
	        	String tags = nextRecord[8];
	        	ted.setTags(populateListOfDetails(tags));
	        	ted.setTitle(nextRecord[9]);
	        	ted.setUrl(nextRecord[10]);
	        	ted.setViews(Long.valueOf(nextRecord[11]).longValue());
	        	
	            /*for (String cell : nextRecord) { 
	            	ted.setDescription(cell);
	            	System.out.print(cell + "\t"); 
	            	System.out.println("Description:"+ted.getDescription());
	                
	            } */
	        	tedVOList.add(ted);
	        	}
	        	
	        	catch(JsonMappingException jm){
	        		continue;
	        	}
	        	catch(JsonParseException jp){
	        		continue;
	        	}
	        	catch(IOException e){
	        		continue;
	        	}
	        	count++;
	            System.out.println(); 
	        }
	        csvReader.close();
	        return tedVOList;
	    } 
	    catch (Exception e) {
	    	
	    	e.printStackTrace();
	    } 
	    return null;
	}
	
	private ArrayList<RatingVO> populateRatingsVO(String ratings) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		TypeReference<ArrayList<RatingVO>> typeMap = new TypeReference<ArrayList<RatingVO>>() {};
		ArrayList<RatingVO> ratingVOList = objectMapper.readValue(ratings, typeMap);
		return ratingVOList;
	}
	
	private ArrayList<RelatedTalksVO> populateRelatedTalksVO(String relatedTalksVO) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		TypeReference<ArrayList<RelatedTalksVO>> typeMap = new TypeReference<ArrayList<RelatedTalksVO>>() {};
		ArrayList<RelatedTalksVO> relatedTalksVOList = objectMapper.readValue(relatedTalksVO, typeMap);
		return relatedTalksVOList;
	}
	
	private ArrayList<String> populateListOfDetails(String param){
		String []arrayResult = param.split(",");
		ArrayList<String> listResult = new ArrayList<String>();
		for(String value:listResult){
			listResult.add(value);
		}
		return listResult;
	}
}