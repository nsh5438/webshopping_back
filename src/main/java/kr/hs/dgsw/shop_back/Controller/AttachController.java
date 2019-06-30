package kr.hs.dgsw.shop_back.Controller;

import kr.hs.dgsw.shop_back.Domain.Product;
import kr.hs.dgsw.shop_back.Protocol.AttachmentPro;
import kr.hs.dgsw.shop_back.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

@RestController
public class AttachController {

    @Autowired
    ProductService productService;


    @PostMapping("/attachment")
    public AttachmentPro upload(@RequestPart MultipartFile uploadFile){
        String destFilename = "D:/3102_남가영/IdeaProjects/webshopping/shop_back/upload/" + UUID.randomUUID().toString() + " " + uploadFile.getOriginalFilename();
        try {
            File destFile = new File(destFilename);
            destFile.getParentFile().mkdirs();
            uploadFile.transferTo(destFile);
            return new AttachmentPro(destFilename, uploadFile.getOriginalFilename());
        }catch (Exception e){
            return null;
        }
    }

    @GetMapping("/download/{id}")
    public void download(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response){
        String filepath ;
        String filename;

        Product product = this.productService.findById(id);
        filepath = product.getImg_path();
        filename = product.getImg_name();

        try{
            File file =new File(filepath);
            if(file.exists() == false) return;
            String fileType = URLConnection.guessContentTypeFromName(file.getName());
            if(fileType == null) fileType = "application/octet-stream";
            response.setContentType(fileType);
            response.setHeader("Content-Disposition", "inline; filename=\'" + filename + "\'");
            response.setContentLength((int)file.length());
            InputStream ip = new BufferedInputStream(new FileInputStream(file));
            FileCopyUtils.copy(ip,response.getOutputStream());
        }catch( Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
