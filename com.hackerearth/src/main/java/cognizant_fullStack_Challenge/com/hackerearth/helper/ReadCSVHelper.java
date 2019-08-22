package cognizant_fullStack_Challenge.com.hackerearth.helper;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opencsv.CSVReader;

import cognizant_fullStack_Challenge.com.hackerearth.config.YAMLConfig;
import cognizant_fullStack_Challenge.com.hackerearth.model.HotelsVO;
import cognizant_fullStack_Challenge.com.hackerearth.model.ReviewVO;
import cognizant_fullStack_Challenge.com.hackerearth.util.CommonUtil;


@Component
public class ReadCSVHelper {
	
	
	
	@Autowired
	private CommonUtil commonUtil;
	private static final String CSV_FILE_PATH = "C:/hotels.csv";
	
	public List<HotelsVO> readCSVHelper(){
		List<HotelsVO> listOfHotels = new ArrayList<HotelsVO>();
		try{
			
			FileReader filereader = new FileReader(CSV_FILE_PATH); 
			  
	        CSVReader csvReader = new CSVReader(filereader); 
	        String[] nextRecord; 
	        int count = 0;
	        while((nextRecord = csvReader.readNext()) != null){
	        	
	        	if(count > 0){
	        		HotelsVO hotel = new HotelsVO();
	        		ReviewVO review = new ReviewVO();
	        		if(nextRecord[0] != null && nextRecord[0].length() > 0 && nextRecord[0] != ""){
	        			hotel.setId(Integer.parseInt(nextRecord[0]));
	        		}
	        		
	        		if(nextRecord[1] != null){
	        			hotel.setAddress(nextRecord[1]);
	        		}
	        		
	        		if(nextRecord[2] != null){
	        			String categories = nextRecord[2];
		        		hotel.setCategories(populateListOfCategories(categories));
	        		}
	        		
	        		if(nextRecord[3] != null){
	        			hotel.setCity(nextRecord[3]);
	        		}
	        		
	        		if(nextRecord[4] != null){
	        			hotel.setCountry(nextRecord[4]);
	        		}
	        		
	        		if(nextRecord[5] != null && nextRecord[5].length() > 0 && nextRecord[5] != ""){
	        			hotel.setLatitude(Double.valueOf(nextRecord[5]));
	        		}
	        		
	        		if(nextRecord[6] != null && nextRecord[6].length() > 0 &&  nextRecord[6] != ""){
	        			hotel.setLongitude(Double.valueOf(nextRecord[6]));
	        		}
	        		
	        		if(nextRecord[7] != null){
	        			hotel.setName(nextRecord[7]);
	        		}
	        		if(nextRecord[8] != null){
	        			hotel.setPostalCode(nextRecord[8]);
	        		}
	        		
	        		if(nextRecord[9] != null){
	        			hotel.setProvince(nextRecord[9]);
	        		}
	        		
	        		if(nextRecord[10] != null && nextRecord[10].length() > 0 && nextRecord[10] != ""){
	        			review.setRating(Double.valueOf(nextRecord[10]));
	        		}
	        		
	        		if(nextRecord[11] != null){
	        			review.setText(nextRecord[11]);
	        		}
	        		
	        		if(nextRecord[12] != null){
	        			review.setTitle(nextRecord[12]);
	        		}
	        		
	        		if(nextRecord[13] != null){
	        		review.setUserName(nextRecord[13]);
	        		}
	        		hotel.setReview(review);
	        		listOfHotels.add(hotel);
	        		
	        	}
	        	count++;
	        }
	        System.out.println("Total Count of Records:"+count);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return listOfHotels;
	}
	
	private ArrayList<String> populateListOfCategories(String param){
		String []arrayResult = param.split(",");
		ArrayList<String> listResult = new ArrayList<String>();
		for(String value:arrayResult){
			listResult.add(value);
		}
		return listResult;
	}
}
