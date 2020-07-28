package kr.co.lectopia;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	@Autowired
	@Qualifier("uploadPath")
	private String uploadPath;
	
	@RequestMapping(value="/upload", method=RequestMethod.GET)
	public String upload() {
		return "form";
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public void upload(@RequestParam("upfile")MultipartFile[] files, HttpServletResponse response) throws IOException{
		response.setContentType("text/plain; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(files);
		for(MultipartFile file : files) {
			out.print(file.getOriginalFilename());
			out.print(file.getSize());
			out.print(file.getContentType());
			File saveFile = new File(uploadPath, file.getOriginalFilename());
			FileCopyUtils.copy(file.getBytes(),saveFile);
		}
	}
}
