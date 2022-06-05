package com.nc7.project00.controller;

import com.nc7.project00.entity.Tag;
import com.nc7.project00.service.TagService;
import com.nc7.project00.utils.WebResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/tag")
public class TagController {
    @Resource
    private TagService tagService;

    @PostMapping("")
    public WebResponse addTag(@RequestBody Tag params) {
        int status = tagService.add(params);
        if (status > 0) {
            return new WebResponse(200, "成功添加标签");
        } else {
            return new WebResponse(500, "添加标签失败");
        }
    }
}
