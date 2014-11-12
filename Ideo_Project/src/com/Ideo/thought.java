package com.Ideo;

import java.util.Set;
import java.util.Date;


public class thought {
	
	// Class thought: Properties----------------------------------------------------------------------
	
		// tagList: Set of strings (tags for the thought)
		private Set<String> tagList;
			// get_tagList(): accessor for tagList
			public Set<String> get_tagList() {
				return tagList;
			}
			// addTag(tag): adds tag to tagList
			public boolean addTag(String tag) {
				return tagList.add(tag); // returns TRUE if tag was added
			}
			// removeTag(tag): removes tag from tagList
			public boolean removeTag(String tag) {
				return tagList.remove(tag); // returns TRUE if tag was removed
			}
			// containsTag(tag): returns TRUE if tag is contained in tagList
			public boolean containsTag(String tag) {
				if(tagList.contains(tag)){ 
					return true;
				}
				else return false;
			}
			// clearTags(): removes all elements in tagList
			public void clearTags(){
				tagList.clear();
				return;
			}
			// shared_tags(T): returns all tags in common with thought T
			public Set<String> shared_tags(thought T) {
				Set<String> temp = T.get_tagList();
				temp.retainAll(tagList);
				return temp;
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
			
	// -----------------------------------------------------------------------------------------
			
			

	// class thought: constructors	------------------------------------------------------------
		// full
		public thought(Set<String> tags, String thoughtTitle, String thoughtContent, Date Thoughtdate ){
			tagList = tags;
			title = thoughtTitle;
			content = thoughtContent;
			dateCreated = Thoughtdate;
		}
		// these constructors use the current time when they are called
		public thought(String thoughtContent, Set<String> tags) {
			content = thoughtContent;
			tagList = tags;
			dateCreated = new Date();
		}
		public thought(String thoughtContent) {
			content = thoughtContent;
			dateCreated = new Date();
		}
		public thought() {
			content = "empty";
			dateCreated = new Date();
		}
		// copy constructor for duplicating a thought
		public thought(thought T) {
			content = T.get_content();
			tagList = T.get_tagList();
			dateCreated = T.get_dateCreated();
		}
}