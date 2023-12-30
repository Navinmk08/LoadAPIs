package com.load.LoadAPI.s.service;

import com.load.LoadAPI.s.model.PayLoad;

import java.util.List;

public interface PayLoadService {
    public String createPayLoad(PayLoad payLoad);
    public String updatePayLoad(PayLoad payLoad);
    public String deletePayLoad(String shipperId);
    public PayLoad getPayLoad(String shipperId);
    public List<PayLoad> getAllPayLoads();
}
