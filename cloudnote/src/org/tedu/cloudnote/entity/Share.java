package org.tedu.cloudnote.entity;

import java.io.Serializable;

public class Share implements Serializable{
	 private String cn_share_id;
	 private String cn_share_title;
	 private String cn_share_body;
	 private String cn_note_id;
	public Share() {
	}
	public Share(String cnShareId, String cnShareTitle, String cnShareBody,
			String cnNoteId) {
		super();
		cn_share_id = cnShareId;
		cn_share_title = cnShareTitle;
		cn_share_body = cnShareBody;
		cn_note_id = cnNoteId;
	}
	public String getCn_share_id() {
		return cn_share_id;
	}
	public void setCn_share_id(String cnShareId) {
		cn_share_id = cnShareId;
	}
	public String getCn_share_title() {
		return cn_share_title;
	}
	public void setCn_share_title(String cnShareTitle) {
		cn_share_title = cnShareTitle;
	}
	public String getCn_share_body() {
		return cn_share_body;
	}
	public void setCn_share_body(String cnShareBody) {
		cn_share_body = cnShareBody;
	}
	public String getCn_note_id() {
		return cn_note_id;
	}
	public void setCn_note_id(String cnNoteId) {
		cn_note_id = cnNoteId;
	}
	 
}
