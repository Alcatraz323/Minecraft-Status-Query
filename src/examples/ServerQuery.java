package examples;
import query.*;
import java.util.*;

public class ServerQuery
{
	public static void main(String[] args)
	{
		MCQuery query = new MCQuery();
		String status;
		
		//basic status
		/*ArrayList<String> ars=query.fullStat().getPlayerList();
		for(String i:ars){
			System.out.println(i);
		}*/
		System.out.println(query.fullStat().asJSON());
	}
}
