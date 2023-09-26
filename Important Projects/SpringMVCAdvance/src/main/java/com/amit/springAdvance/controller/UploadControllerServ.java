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
@RequestMapping("/singleUpload")
public class UploadControllerServ implements ServletContextAware {

	private ServletContext servletContext;

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;

	}

	@RequestMapping(value = "/uploadFile_serv", method = RequestMethod.GET)
	public ModelAndView uploadForm() {
		return new ModelAndView("upload_servletAware");
	}

	@RequestMapping(value = "/upload_submit", method = RequestMethod.POST)
	public @ResponseBody String uploadSubmit(@RequestParam("file") MultipartFile file,
			@RequestParam("fileName") String fileName) {

		if (!file.isEmpty()) {

			try {

				byte[] bytes = file.getBytes();

				String filePath = servletContext.getRealPath("/") + fileName;
				
				System.out.println(filePath);

				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(filePath)));
				stream.write(bytes);
			//	stream.flush();
				stream.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return "Upload Successfully done " + fileName;
	}

}
