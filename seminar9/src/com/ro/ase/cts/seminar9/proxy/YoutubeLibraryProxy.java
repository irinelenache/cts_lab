package com.ro.ase.cts.seminar9.proxy;

public class YoutubeLibraryProxy implements YoutubeLibraryInterface{

	private YoutubeLibraryInterface libraryImplementation;
	public YoutubeLibraryProxy() {
		libraryImplementation = new YoutubeLibrary();
	}
	@Override
	public String listVideos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVideoInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}