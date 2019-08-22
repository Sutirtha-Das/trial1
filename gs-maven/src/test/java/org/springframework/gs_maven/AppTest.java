package org.springframework.gs_maven;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.gs_maven.helper.ReadCSVHelper;
import org.springframework.gs_maven.processor.RequestProcessor;
import org.springframework.gs_maven.vo.TedVO;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.ModelAndView;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest 
{
	@Autowired
	RequestProcessor requestProcessor;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void readCSVtestHelper(){
    	ReadCSVHelper test = new ReadCSVHelper();
    	int count = test.readAllData().size();
    	assertTrue("Count Matches", count >= 6);
    }
    
    @Test
    public void readCSVPagination(){
    	List<TedVO> list = requestProcessor.fetchPaginatedResults("1", "10");
    	assertTrue("Count Matches", list.size() == 10);
    }
}