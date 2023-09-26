package com.amit.springAdvance.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/multiUpload")
public class MultipleUploadController implements ServletContextAware {

	ServletContext servletContext;

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;

	}

	@RequestMapping(value = "/multiUploadFileForm", method = RequestMethod.GET)
	public ModelAndView uploadForm() {
		return new ModelAndView("multipleUpload");
	}

	@RequestMapping(value = "/multipleUpload_submit", method = RequestMethod.POST)
	public @ResponseBody String multipleUpload(@RequestParam("file") MultipartFile[] files,
			@RequestParam("fileName") String[] fileNames) {

		System.out.println("Multipart -> " + files.length);
		System.out.println("File name lengths -> " + fileNames.length);

		if (files.length != fileNames.length) {

			return "Required info missing..";
		}
		
		String message="";

		for (int i = 0; i < files.length; i++) {

			MultipartFile file = files[i];
			String fileName = fileNames[i];
			
			System.out.println("Multipart -> " + files);
			System.out.println("File name lengths -> " + fileName);


			try {
				byte[] b = file.getBytes();

				String filePath = servletContext.getRealPath("/") + fileName;

				System.out.println(filePath);

				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(filePath)));
				stream.write(b);
				stream.close();
				
				message= message + "File uploaded sucessfully " +fileName + "<br/>";

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return message;
	}
}
