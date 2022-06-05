package com.nc7.project00.controller;

import com.nc7.project00.entity.Bill;
import com.nc7.project00.service.BillService;
import com.nc7.project00.utils.WebResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/bill")
public class BillController {
    @Resource
    private BillService billService;

    @PostMapping("")
    public WebResponse addBill(@RequestBody Bill bill){
        int status=billService.add(bill);
        if(status>0){
            return new WebResponse(200,"添加账单成功");
        }else{
            return new WebResponse(500,"添加账单失败");
        }
    }

    @GetMapping("/{username}/{range}/{type}")
    public WebResponse getBill(@PathVariable String username, @PathVariable String range, @PathVariable String type) {
        return new WebResponse(200,billService.getBillStats(username,range,type));
    }
}
