package com.cloud2014.assignment.shared;

import java.util.ArrayList;

public class FileDTO {
	private FileDTO parent;
	private ArrayList<FileDTO> child;
	
	private String fileName;
	private String uploadTime;
	private int fileSize;
	private int type;
}