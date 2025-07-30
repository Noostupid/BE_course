package com.example.HenryIelts.model.request;

import com.example.HenryIelts.model.Account;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BannerRequest {
    @NotBlank(message = "Tiêu đề không được để trống")
    private String title;

    private String content;

    @NotBlank(message = "Liên kết ảnh không được để trống")
    private String imageURL;

//    @NotNull(message = "Tài khoản không được để trống")
//    private Account account;
}
