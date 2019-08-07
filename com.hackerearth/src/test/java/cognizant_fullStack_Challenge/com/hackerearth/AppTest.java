package cognizant_fullStack_Challenge.com.hackerearth;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import cognizant_fullStack_Challenge.com.hackerearth.helper.ReadCSVHelper;
import cognizant_fullStack_Challenge.com.hackerearth.model.HotelsVO;
import cognizant_fullStack_Challenge.com.hackerearth.processor.HotelProcessor;
import cognizant_fullStack_Challenge.com.hackerearth.util.CommonUtil;



/**
 * Unit test for simple App.
 */
public class AppTest 
{	
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    /*@Test
    public void checkSourcePath(){
    	 YAMLConfig yamlConfig = new YAMLConfig();
    	String source = "C:/hotels.csv";
    	yamlConfig.getSource();
    	assertTrue("Source Path Matches", yamlConfig.getSource().equalsIgnoreCase(source));
    }*/
    
    @Test
    public void testCommonUtilString(){
    	CommonUtil util = new CommonUtil();
    	String value = "TEST";
    	assertTrue("Valid", !util.isStringEmptyOrNull(value));
    }
    
    @Test
    public void readDataFromCSV(){
    	ReadCSVHelper read = new ReadCSVHelper();
    	List<HotelsVO> hotels = read.readCSVHelper();
    	assertTrue("Valid", hotels.size()>0);
    }
    
    /*@Test
    public void readDataFromCSVByProvince(){
    	HotelProcessor read = new HotelProcessor();
    	String province = "AK";
    	List<HotelsVO> hotels = read.fetchHotelsByProvince(province);
    	assertTrue("Value", hotels.size()> 3);
    }
    
    @Test
    public void readDataFromCSVByCity(){
    	HotelProcessor read = new HotelProcessor();
    	String city = "AK";
    	List<HotelsVO> hotels = read.fetchHotelsByCity(city);
    	assertTrue("Value", hotels.size()> 3);
    }*/
}
