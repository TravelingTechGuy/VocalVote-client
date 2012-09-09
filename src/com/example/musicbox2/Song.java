package com.example.musicbox2;

public class Song {

	
	String title;
	int imageResource;
	
	int voteNeg;
	int votePos;
	
	
	
	
	
	public Song(String title, int imageResource) {
		super();
		this.title = title;
		this.imageResource = imageResource;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getImageResource() {
		return imageResource;
	}
	public void setImageResource(int imageResource) {
		this.imageResource = imageResource;
	}
	public int getVoteNeg() {
		return voteNeg;
	}
	public void setVoteNeg(int voteNeg) {
		this.voteNeg = voteNeg;
	}
	public int getVotePos() {
		return votePos;
	}
	public void setVotePos(int votePos) {
		this.votePos = votePos;
	}
	
	
}
