package edu.rosehulman.liw4;

import org.bytedeco.javacpp.*;
import org.bytedeco.opencv.opencv_core.*;
import org.bytedeco.opencv.opencv_stitching.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import static org.bytedeco.opencv.global.opencv_stitching.*;

public class TestingClass {

	static Mat imgs = new Mat();
	
	public void testing() {
//		imgs.resize(n);
		imgs = imread("name");
		imgs.resize(1024);
		imwrite("target", imgs);
	}
	
	public static void main(String[] args) {
		Mat image = new Mat();
		image.resize(1000);
		int h = image.size().height();
		System.out.println(h);
	}
}
