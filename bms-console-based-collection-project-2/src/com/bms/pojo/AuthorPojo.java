package com.bms.pojo;

public class AuthorPojo {
	private int authorId;
	private String authorFirstname;
	private String authorLastname;
	private String authorImageUrl;
	
	public AuthorPojo(int authorId, String authorFirstname, String authorLastname, String authorImageUrl) {
		super();
		this.authorId = authorId;
		this.authorFirstname = authorFirstname;
		this.authorLastname = authorLastname;
		this.authorImageUrl = authorImageUrl;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorFirstname() {
		return authorFirstname;
	}

	public void setAuthorFirstname(String authorFirstname) {
		this.authorFirstname = authorFirstname;
	}

	public String getAuthorLastname() {
		return authorLastname;
	}

	public void setAuthorLastname(String authorLastname) {
		this.authorLastname = authorLastname;
	}

	public String getAuthorImageUrl() {
		return authorImageUrl;
	}

	public void setAuthorImageUrl(String authorImageUrl) {
		this.authorImageUrl = authorImageUrl;
	}

	@Override
	public String toString() {
		return "AuthorPojo [authorId=" + authorId + ", authorFirstname=" + authorFirstname + ", authorLastname="
				+ authorLastname + ", authorImageUrl=" + authorImageUrl + "]";
	}
}
