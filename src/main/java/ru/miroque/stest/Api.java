package ru.miroque.stest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Api {
    private @Autowired
    Prp prp;

    @GetMapping("/api/sample")
    public Map<String, String> sample(){
        Map<String, String> sample = new HashMap<>();
        sample.put("foo", prp.getName());
        return sample;
    }
}
