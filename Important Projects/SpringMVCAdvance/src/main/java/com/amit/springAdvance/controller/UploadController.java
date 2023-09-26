package com.amit.springAdvance.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {
	
	public static final String UPLOAD_DIR="/imageUploaded";
	
	@RequestMapping(value="/uploadFile")
	public ModelAndView uploadForm() {
		return new ModelAndView("upload");
	}
	
	@RequestMapping(value="/saveFile", method=RequestMethod.POST)
	public ModelAndView saveFile(@RequestParam CommonsMultipartFile file, HttpSession session) throws IOException{
		
		ServletContext ctx= session.getServletContext();
		String uploadPath= ctx.getRealPath("/");
		
		System.out.println(uploadPath);
		
		byte[] b= file.getBytes();
		BufferedOutputStream stream= new BufferedOutputStream(
			                new FileOutputStream(new File(uploadPath + File.separator + file.getOriginalFilename())));

		stream.write(b);
		stream.flush();
		stream.close();
		
		return new ModelAndView("upload","fileSuccess","File Uploaded Successfully ");
	}

}
