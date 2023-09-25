package Day3;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;



public class TC_searchHotel1  extends BaseSearch1{
	
	@Test
	public void searchhoteltest(){
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		LoginPage2 lp=new LoginPage2();
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickLogin();
		
		SearchHotel2 sh=new SearchHotel2(driver);
		
		sh.setLocation();
		
		sh.setSelectHotel();
		
		sh.setRoomType();
		
		sh.setNoofRooms();
		
		sh.setCheckinDate(checkindate);
		
		sh.setCheckoutDate(checkoutdate);
		
		sh.setAdultsperroom();
		sh.setChildrensperroom();
		
		sh.clickSearchbtn();
	}






}
