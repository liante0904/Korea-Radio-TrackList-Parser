package SBS;
import java.io.IOException;

import org.jsoup.Jsoup; //import Jsoup
import org.jsoup.nodes.Document; //import Jsoup
import org.jsoup.select.Elements; //import Jsoup


public class Html_Parsing {

	
	public void html() {
		try {
			String targetURL = "http://radio.sbs.co.kr/music/wizard_broadcast_renew.jsp?vod_id=V0000330602&year=2016&month=07&day=25&position_code=romanticage";
		      Document doc = Jsoup.connect(targetURL).get(); //웹에서 내용을 가져온다.
		      Elements title = doc.select("span.rml_songname");
		      Elements artist = doc.select("span.rml_singer_name"); 
		      String[] songTitle = new String [artist.size()]; 
		      String[] songArtist = new String [artist.size()]; 	
		      
		      for (int i = 0; i < songTitle.length; i++) {
				songTitle[i] = title.get(i).attr("title");
				songArtist[i] = artist.get(i).text();
			      System.out.println(songArtist[i]+ " - " +  songTitle[i] );								
			}

		} catch (IOException e) { //Jsoup의 connect 부분에서 IOException 오류가 날 수 있으므로 사용한다.
		      e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		Html_Parsing hp = new Html_Parsing();
		hp.html();
		
	}
	
	
}
