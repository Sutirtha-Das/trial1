package cognizant_fullStack_Challenge.com.hackerearth.processor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cognizant_fullStack_Challenge.com.hackerearth.helper.ReadCSVHelper;
import cognizant_fullStack_Challenge.com.hackerearth.model.HotelsVO;
import cognizant_fullStack_Challenge.com.hackerearth.util.CommonUtil;

@RestController
@RequestMapping("/hotels")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class HotelProcessor {
	
	@Autowired
	private ReadCSVHelper readCSVHelper;
	
	@Autowired
	private CommonUtil commonUtil;
	
	@RequestMapping(value="/fetchHotels", method=RequestMethod.GET)
	@ResponseBody
	public List<HotelsVO> fetchAllHotels(){
		List<HotelsVO> hotelsVO = readCSVHelper.readCSVHelper();
		Collections.sort(hotelsVO, new Comparator<HotelsVO>(){

			@Override
			public int compare(HotelsVO o1, HotelsVO o2) {
				return Double.compare(o2.getReview().getRating(), o1.getReview().getRating());
			}
			
		});
		return hotelsVO;
	}
	
	@RequestMapping(value="/fetchHotelsByCity", method=RequestMethod.POST)
	@ResponseBody
	public List<HotelsVO> fetchHotelsByCity(@RequestBody String city){
		List<HotelsVO> hotelsVO = new ArrayList<HotelsVO>();
		if(!commonUtil.isStringEmptyOrNull(city)){
			hotelsVO = readCSVHelper.readCSVHelper();
			for(HotelsVO hotel:hotelsVO){
				if(!commonUtil.isStringEmptyOrNull(hotel.getCity())
						&& city.equalsIgnoreCase(hotel.getCity())){
					hotelsVO.add(hotel);
				}
			}
		}
		
		return hotelsVO;
	}
	
	@RequestMapping(value="/fetchHotelsByProvince", method=RequestMethod.POST)
	@ResponseBody
	public List<HotelsVO> fetchHotelsByProvince(@RequestBody String province){
		List<HotelsVO> hotelsVO = new ArrayList<HotelsVO>();
		if(!commonUtil.isStringEmptyOrNull(province)){
			hotelsVO = readCSVHelper.readCSVHelper();
			for(HotelsVO hotel:hotelsVO){
				if(!commonUtil.isStringEmptyOrNull(hotel.getProvince()) 
						&& province.equalsIgnoreCase(hotel.getProvince()) ){
					hotelsVO.add(hotel);
				}
			}
		}
		
		return hotelsVO;
	}
}


