package com.ro.ase.cts.seminar9.proxy;

import java.util.ArrayList;

public class YoutubeLibrary implements YoutubeLibraryInterface{
	
	private VideoDatabase videoDatabase;
	
	public YoutubeLibrary() {
		this.videoDatabase = new VideoDatabase();
	}
	
	public String listVideos() {
		System.out.println("Fetching videos from database...");
		ArrayList<YoutubeVideo> videoList = videoDatabase.getVideoCollection();
		StringBuilder videoListBuilder = new StringBuilder();
		for(YoutubeVideo video : videoList) {
			videoListBuilder.append(video.getId())
							.append(" - ")
							.append(video.getTitle())
							.append("\n");
		}
		return videoListBuilder.toString();
	}
	public String getVideoInfo(int id) {
		System.out.println("Fetching video info...");
		return videoDatabase.getVideoInfo(id);
	}
}
