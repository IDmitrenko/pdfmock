package com.example.demo.controllers;

import com.example.demo.services.DemoService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/documents")
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;

/*
    @GetMapping("/format")
    public ResponseEntity<byte[]> getPaymentOrderPDF() throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        return new ResponseEntity<>(demoService.getPaymentOrder(), headers, HttpStatus.OK);
    }
*/

    @GetMapping("/flyers")
    public ResponseEntity<byte[]> getFlyerPDF() throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        return new ResponseEntity<>(demoService.getFlyer(), headers, HttpStatus.OK);
    }

}