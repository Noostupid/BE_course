package com.example.HenryIelts.service.impl;

import com.example.HenryIelts.model.Banner;
import com.example.HenryIelts.model.request.BannerRequest;
import com.example.HenryIelts.repository.BannerRepo;
import com.example.HenryIelts.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerRepo bannerRepo;

    @Override
    public List<Banner> getBanners() {
        return bannerRepo.findAll();
    }

    @Override
    public Banner createBanner(BannerRequest request) {
        Banner banner = new Banner();
        banner.setTitle(request.getTitle());
        banner.setContent(request.getContent());
        banner.setImageUrl(request.getImageURL());
        return bannerRepo.save(banner);
    }

    @Override
    public Banner updateBanner(Long id, BannerRequest request) {
        Banner banner = bannerRepo.findById(id).orElse(null);
        if (banner == null) {
           throw new RuntimeException("Không tìm thấy banner nào");
        }
        banner.setTitle(request.getTitle());
        banner.setContent(request.getContent());
        banner.setImageUrl(request.getImageURL());
        return bannerRepo.save(banner);
    }

    @Override
    public String deleteBanner(Long id) {
        Banner banner = bannerRepo.findById(id).orElse(null);
        if (banner == null) {
            throw new RuntimeException("Không tìm thấy banner nào");
        }
        bannerRepo.delete(banner);
        return "Xóa banner thành công";
    }


}
