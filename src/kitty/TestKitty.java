package kitty;

import java.util.Arrays;

public abstract class TestKitty {

//	System.setProperty("webdriver.gecko.driver",Path_of_Firefox_Driver"); // Setting system properties of FirefoxDriver
//	WebDriver driver = new FirefoxDriver();


//WebDriver driver= new ChromeDriver();
//driver.get("https://www.flipkart.com/");
//WebElement ele =driver.findbyElement(By.xpath("//span[text()='Electronics']"));
//WebDriverWait wait = new WebDriverWait():
//wait.untill().ExpectedContion().visbile(ele);
//ele.click();

	// /Code_practice
	public static void main(String[] args) {
		
		String str="123 Welcome to the Capgemini 456";
		StringBuffer num = new StringBuffer();
		StringBuffer number = new StringBuffer();
		StringBuffer str2= new StringBuffer(str);
		//str= str.split("\\s");
		//alp.reverse();
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));
			}
		}
		String num1 = num.toString();
		int n= Integer.parseInt(num1);
		int sum= 0;
		while(!(n%10==0)) {
			sum =sum+(n%10);
			number.append(n%10);
			n=n/10;
		}
		System.out.println(sum+" total sum program 1");
		System.out.println(number+" reverse of number program1 ");
 /////////////////////////////////////////////////////////////////////////////////////////////
		
		int numr[] = {20,78,4,6,8,90,7,10,1};
		
		int low =numr[0];
		int hig =0;
		
		for(int nu: numr) {
			if(low> nu) {
				
				low=nu;
			}
			else if(hig <nu) {
				hig =nu;
			}
		}
		System.out.println(low +" lower value of array");
		System.out.println(hig +" higher value of array");
		
		System.out.println(Arrays.stream(numr).sorted().sum()+" Sum of arrays");
		System.out.println(Arrays.stream(numr).max().getAsInt()+" max num of arrays");
		System.out.println(Arrays.stream(numr).min().getAsInt()+" min num of arrays");
		Arrays.sort(numr); // sort the arrays
		System.out.println(Arrays.toString(numr));
	}

	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
