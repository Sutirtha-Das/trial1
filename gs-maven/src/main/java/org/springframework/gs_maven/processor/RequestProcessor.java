package org.springframework.gs_maven.processor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.gs_maven.helper.ReadCSVHelper;
import org.springframework.gs_maven.vo.TedVO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/request")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class RequestProcessor {
	@Autowired
	private ReadCSVHelper readCSVHelper;
	
	@RequestMapping(value="/fetchDetails", method=RequestMethod.GET)
	@ResponseBody
	public List<TedVO> fetchDetails(){
		List<TedVO> tedVOList = readCSVHelper.readAllData();
		return tedVOList;
	}
	@RequestMapping(value="/fetchPaginatedResults", method=RequestMethod.GET)
	@ResponseBody
	public List<TedVO> fetchPaginatedResults(@RequestParam("startIndex") String startIndex, @RequestParam("endIndex") String endIndex){
		List<TedVO> tedVOList = readCSVHelper.readAllData();
		int sI = Integer.parseInt(startIndex);
		int eI = Integer.parseInt(endIndex);
		List<TedVO> subTedVOList = tedVOList.subList(Math.max(0, sI), Math.min(tedVOList.size(), eI +1));
		return subTedVOList;

	}
}
