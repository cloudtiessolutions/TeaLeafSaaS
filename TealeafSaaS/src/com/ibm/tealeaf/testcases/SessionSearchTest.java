/**
 *  
 */
package com.ibm.tealeaf.testcases;

/**
 * @author Manjusha Saju
 *
 */

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.tealeaf.commons.BrowserFactory;
import com.ibm.tealeaf.commons.PropertyReader;
import com.ibm.tealeaf.commons.SaaSBasePage;
import com.ibm.tealeaf.commons.TeaLeafCONSTANTS;
import com.ibm.tealeaf.pageobjects.LoginPage;
import com.ibm.tealeaf.pageobjects.SessionSearchPage;

public class SessionSearchTest extends SaaSBasePage {

	private static Logger logger = Logger.getLogger(SessionSearchTest.class);

	public SessionSearchTest() {

		// super();

	}
	
	/*@Test
	public void sessionSearchLast24hrs() {

		try {

			SessionSearchPage sessionsearch_page = PageFactory.initElements(
					driver, SessionSearchPage.class);
			sessionsearch_page.sessSearch();
			sessionsearch_page.clickonSearchButton();
			sessionsearch_page.selectBBRsession();
			sessionsearch_page.backToHome();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}*/

	@Test
	public void sessionSearchLast5Min() {

		try {

			SessionSearchPage sessionsearch_page = PageFactory.initElements(
					driver, SessionSearchPage.class);
			sessionsearch_page.sessSearch();

			sessionsearch_page.clickonDefaultOption_Last24hrs();
			sessionsearch_page.clickonOption_Last5min();
			sessionsearch_page.clickonSearchButton();
			sessionsearch_page.selectBBRsession();
			sessionsearch_page.backToHome();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	

}
