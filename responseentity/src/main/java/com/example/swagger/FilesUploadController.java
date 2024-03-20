package com.example.swagger;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import reactor.netty.http.server.HttpServerRequest;

import java.io.File;
import java.io.IOException;

@RestController
public class FilesUploadController {

    @PostMapping("/upload")
    public String upload(@RequestParam("uploadFile")MultipartFile
                         uploadFile,HttpServletRequest request){
        if(uploadFile ==null || uploadFile.isEmpty()){
            return "Null File";
        }
        String realPath=request.getServletContext().getRealPath("/uploadFile");
        System.out.println("rewr"+realPath);
        File parentDir=new File(realPath);
        if (!parentDir.isDirectory()){
            parentDir.mkdir();
        }

            String filename = uploadFile.getOriginalFilename();
            File target = new File(parentDir, filename);
            try {
                uploadFile.transferTo(target);
            } catch (IOException e) {
                e.printStackTrace();
            }

        return "SUCCESS";
    }
}
