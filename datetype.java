package datetype;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
public class datetype {
	/*public void date(String time) {
		  System.out.println("DATE AND TIME " + time);
	}*/
	public void msg () {
		//System.out.print("eh");
	  LocalDateTime myDateObj = LocalDateTime.now();
      DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
      String formattedDate = myDateObj.format(myFormatObj);
      //date(formattedDate);
	  System.out.println("DATE AND TIME " + formattedDate);

	}

}
