package com.load.LoadAPI.s.service.impl;

import com.load.LoadAPI.s.model.PayLoad;
import com.load.LoadAPI.s.repository.PayLoadRepository;
import com.load.LoadAPI.s.service.PayLoadService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayLoadServiceImpl implements PayLoadService {


    PayLoadRepository payLoadRepository;

    public PayLoadServiceImpl(PayLoadRepository payLoadRepository) {
        this.payLoadRepository = payLoadRepository;
    }

    @Override
    public String createPayLoad(PayLoad payLoad) {
        payLoadRepository.save(payLoad);
        return "Success";
    }

    @Override
    public String updatePayLoad(PayLoad payLoad) {
        payLoadRepository.save(payLoad);
        return "Success";
    }

    @Override
    public String deletePayLoad(String shipperId) {
        payLoadRepository.deleteById(shipperId);
        return "Success";
    }

    @Override
    public PayLoad getPayLoad(String shipperId) {
        return payLoadRepository.findById(shipperId).get();
    }

    @Override
    public List<PayLoad> getAllPayLoads() {
        return payLoadRepository.findAll();
    }
}
