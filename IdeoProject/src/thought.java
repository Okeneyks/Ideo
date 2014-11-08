import java.util.ArrayList;
import java.util.Date;


public class thought {
	
	// Class thought: Properties----------------------------------------------------------------------
	
		// Array of strings that represent tags for a thought
		private ArrayList<String> tagList;
			//access methods
			public ArrayList<String> get_tagList(){
				return this.tagList;
				}
			public void set_tagList(int position, String text ){ 
				this.tagList.set(position, text);
				}
		
		// The title of a thought
		private String title;
			//access methods
			public String get_title(){
				return this.title;
			}
			public void set_title(String thoughtTitle){
				this.title = thoughtTitle;
			}
		
		// The content of a thought
		private String content;
			//access methods
			public String get_content(){
				return this.content;
				}
			public void set_content(String thoughtContent){ 
			this.content = thoughtContent;
		}
	
		// The date a thought was created.
		private Date dateCreated;
			//access methods
			public Date get_dateCreated(){
				return this.dateCreated;
			}
			public void set_dateCreated(Date thoughtCreatedDate){
				this.dateCreated = thoughtCreatedDate;
			}

		
		
		
		
	public thought(ArrayList<String> tags, String thoughtTitle, String thoughtContent, Date Thoughtdate ){
		tagList = tags;
		title = thoughtTitle;
		content = thoughtContent;
		dateCreated = Thoughtdate;
	}
		

}
