package com.example.springhomework.controller;

import com.example.springhomework.controller.dto.TransferRequestDto;
import com.example.springhomework.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferController {
    private final TransferService transferService;

    @Autowired
    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/transfers")
    public Object transfer(@RequestBody TransferRequestDto transferRequestDto) {
        return transferService.transfer(transferRequestDto.getAccountIdFrom(), transferRequestDto.getAccountIdTo(),
                transferRequestDto.getAmount());
    }
}