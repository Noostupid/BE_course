package com.example.HenryIelts.service;

import com.example.HenryIelts.model.Banner;
import com.example.HenryIelts.model.request.BannerRequest;

import java.util.List;

public interface BannerService {
    List<Banner> getBanners();

    Banner createBanner(BannerRequest request);

    Banner updateBanner(Long id, BannerRequest request);

    String deleteBanner(Long id);
}
