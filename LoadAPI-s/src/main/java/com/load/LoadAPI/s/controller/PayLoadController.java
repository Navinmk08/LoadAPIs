package com.load.LoadAPI.s.controller;

import com.load.LoadAPI.s.model.PayLoad;
import com.load.LoadAPI.s.service.PayLoadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/load")
public class PayLoadController
{
    PayLoadService payLoadService;

    public PayLoadController(PayLoadService payLoadService) {
        this.payLoadService = payLoadService;
    }
    //Read specific pay load details from DB
    @GetMapping("{shipperId}")
    public PayLoad getPayLoadDetails(@PathVariable("shipperId") String shipperId)
    {
        return payLoadService.getPayLoad(shipperId);
    }
    //Read all pay load details from DB
    @GetMapping()
    public PayLoad getAllPayLoadDetails(@RequestParam("shipperId") String shipperId)
    {
        return payLoadService.getPayLoad(shipperId);
    }

    @PostMapping
    public String createPayLoadDetails(@RequestBody PayLoad payLoad)
    {
        payLoadService.createPayLoad(payLoad);
        return "loads details added successfully";
    }
    @PutMapping("{shipperId}")
    public String updatePayLoadDetails(@PathVariable("shipperId") String shipperId,@RequestBody PayLoad payLoad)
    {
        payLoad.setShipperId(shipperId);
        payLoadService.updatePayLoad(payLoad);
        return "PayLoad Updated Successfully";
    }
    @DeleteMapping("{shipperId}")
    public String deletePayLoadDetails(@PathVariable("shipperId") String shipperId)
    {
        payLoadService.deletePayLoad(shipperId);
        return "PayLoad Deleted Successfully";
    }
}
