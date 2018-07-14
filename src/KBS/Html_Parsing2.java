package KBS;
import java.io.IOException;

import org.jsoup.Jsoup; //import Jsoup
import org.jsoup.nodes.Document; //import Jsoup
import org.jsoup.select.Elements; //import Jsoup


public class Html_Parsing2 {
 // 타깃 URL - > http://www.kbs.co.kr/radio/happyfm/7080/song/index.html?bbs_pr=/mode:2/seq:598546/goto_page:1
	
	public void html() {
		try {
			String targetURL = "http://nbbs.kbs.co.kr/section/board/bbs_view.html?bbs_cd=2r_7080_bbs07&seq=599716&goto_page=1";
		      Document doc = Jsoup.connect(targetURL).get(); //웹에서 내용을 가져온다.
		      Elements title = doc.select("div.view_title");
		      String txt = title.text();
		      System.out.println(txt); // 날짜 표시부
		      
		      Elements contents = doc.select("div.view_cont p"); //내용을 가져온다.
		      // String text = contents.attr("title"); //attr은 기본적으로 String형이다. 
//		      String text = contents.html().replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\s)*(/)?>", "\n").replaceAll("&nbsp;", "").replaceAll("&lt;", "").replaceAll("&gt;", "");
		      String text = contents.text();
		      System.out.println(text);
		      
		      String[] firstHalf = new String [10]; 
		      String[] secondHalf = new String [10]; 	
		      
		      System.out.println("★ 출력 테스트 " + text.indexOf("9."));
		      System.out.println("★ 출력 테스트2" + text.lastIndexOf("\n"));
		      
		      for (int i = 0; i < 15; i++) {
					String chk1 = "" , chk2 = "";
					chk1 += String.valueOf(i+1)+".";
					chk2 += String.valueOf(i+2)+".";
					if (text.indexOf(chk1) > 0  &&  text.indexOf(chk2) >0) {
						firstHalf[i] = text.substring(text.indexOf(chk1), text.indexOf(chk2));
						secondHalf[i] = text.substring(text.lastIndexOf(chk1), text.lastIndexOf(chk2));
					}
					
			}
		      System.out.println("1부");
		      for (int i = 0; i < secondHalf.length; i++) {
				System.out.println(firstHalf[i]);
			}
		      System.out.println("2부");
		      for (int i = 0; i < secondHalf.length; i++) {
		    	 
				System.out.println(secondHalf[i]);
			}

		      
		} catch (IOException e) { //Jsoup의 connect 부분에서 IOException 오류가 날 수 있으므로 사용한다.
		      e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		Html_Parsing2 hp = new Html_Parsing2();
		hp.html();
		
	}
	
	
}
