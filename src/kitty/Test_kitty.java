package kitty;

public class Test_kitty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public static void getResponseBody(){
		 
		   given().queryParam("CUSTOMER_ID","68195")
		           .queryParam("PASSWORD","1234!")
		           .queryParam("Account_No","1")
		           .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
		           .body();
		}
	
	public static void getResponseStatus(){
		   int statusCode= given().queryParam("CUSTOMER_ID","68195")
		           .queryParam("PASSWORD","1234!")
		           .queryParam("Account_No","1") .when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
		   System.out.println("The response status is "+statusCode);

		   given().when().get(url).then().assertThat().statusCode(200);
		}

}
