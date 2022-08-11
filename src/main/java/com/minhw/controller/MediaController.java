//package com.minhw.controller;
//
//import com.minhw.common.config.MedioHttpRequestHandler;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Random;
//
//
///**
// * @program: medioFlow
// * @description: 视频流
// * @author: MinHw or mz
// * @create: 2022-05-31 23:57
// **/
//@RestController
//class MediaController {
//
//    String url = "C:/zsb/static";
//
////    private final String videos[] = {"/advertise1.mp4","/advertise2.mp4","/advertise3.mp4"};
////
////    private Random random = new Random();
//
//    @Resource
//    private MedioHttpRequestHandler medioHttpRequestHandler;
//
//    /**
//     * 获取视频
//     *
//     * @param request
//     * @param response
//     * @throws Exception
//     */
//    @GetMapping("/video")
//    public void getPlayResource(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        Path path = Paths.get(url + "/video.mp4");
//        if (Files.exists(path)) {
//            String mimeType = Files.probeContentType(path);
//            if (!StringUtils.isEmpty(mimeType)) {
//                response.setContentType(mimeType);
//            }
//            request.setAttribute(MedioHttpRequestHandler.ATTR_FILE, path);
//            medioHttpRequestHandler.handleRequest(request, response);
//        } else {
//            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
//            response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
//        }
//    }
//
//    @GetMapping("/mp3")
//    public void getMp3PlayResource(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        Path path = Paths.get(url + "/music.mp3");
//        if (Files.exists(path)) {
//            String mimeType = Files.probeContentType(path);
//            if (!StringUtils.isEmpty(mimeType)) {
//                response.setContentType(mimeType);
//            }
//            request.setAttribute(MedioHttpRequestHandler.ATTR_FILE, path);
//            medioHttpRequestHandler.handleRequest(request, response);
//        } else {
//            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
//            response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
//        }
//    }
//}
//
