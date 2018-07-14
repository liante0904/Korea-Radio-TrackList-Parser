package MBC;
import java.io.IOException;

import org.jsoup.Jsoup; //import Jsoup
import org.jsoup.nodes.Document; //import Jsoup
import org.jsoup.select.Elements; //import Jsoup


public class Html_Parsing {

	// 타깃 URL ->  http://wizard2.sbs.co.kr/w3/template/tpl_iframetype.jsp?vVodId=V0000330602&vProgId=1000456&vMenuId=1009772
	
	public void html() {
		try {
		      Document doc = Jsoup.connect("http://mini.imbc.com/manager/SelectView.asp?PROG_CD=FM4U000001271&SeqNo=1061&PG=1").get(); //웹에서 내용을 가져온다.
		      Elements title = doc.select("td p");
		      Elements artist = doc.select("td.td_artist"); 
		      Elements programTitle = doc.select("h3.tit");
		      
		      String[] songTitle = new String [title.size()]; 
		      String[] songArtist = new String [title.size()]; 		      
		      
		      System.out.println(programTitle.text());		      
		      for (int i = 0; i < songTitle.length; i++) {
				songTitle[i] = title.get(i).text();
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
