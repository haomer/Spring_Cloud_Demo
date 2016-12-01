package com.fahai.controllers;

import com.fahai.entities.JsonResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhanghao on 16/9/30.
 */
public class BaseController {

    protected ResponseEntity<String> makeResponseEntity(int errorCode, String errorMsg, HttpStatus status) {
        JsonResponse resp = new JsonResponse(errorCode, errorMsg, new HashMap<String,String>());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        return new ResponseEntity<String>(resp.toString(), headers, status);
    }

    protected ResponseEntity<String> makeResponseEntity(int errorCode, String errorMsg, HttpStatus status, Object extraData) {
        JsonResponse resp = new JsonResponse(errorCode, errorMsg, extraData);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        return new ResponseEntity<String>(resp.toString(), headers, status);
    }

    protected ResponseEntity<String> makeResponseEntity(int errorCode, String errorMsg, HttpStatus status, HttpHeaders headers) {
        JsonResponse resp = new JsonResponse(errorCode, errorMsg, new HashMap<String,String>());
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        ResponseEntity entity = new ResponseEntity<String>(resp.toString(), headers, status);
        return entity;
    }

    protected Map<String, Object> makeResponseData(String key, Object value) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(key, value);
        return map;
    }

}
