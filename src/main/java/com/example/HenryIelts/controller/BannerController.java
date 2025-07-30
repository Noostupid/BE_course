package com.example.HenryIelts.controller;

import com.example.HenryIelts.model.request.BannerRequest;
import com.example.HenryIelts.model.response.ApiResponse;
import com.example.HenryIelts.service.BannerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BannerController {

    @Autowired
    BannerService bannerService;

    @GetMapping("/banners")
    public ResponseEntity<?> getBanners() {
        return ResponseEntity.ok(bannerService.getBanners());
    }

    @GetMapping("/create-banner")
    public ResponseEntity<?> createBanner(@Valid @RequestBody BannerRequest bannerRequest, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().body(ApiResponse.errorBindingResult(bindingResult));
        }
        return ResponseEntity.ok(bannerService.createBanner(bannerRequest));
    }


}
