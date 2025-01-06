package com.demo.project.service;

import org.springframework.stereotype.Service;

@Service
public class JwtService {

    public String generateToken() {
        return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InVzZXIxIiwicGFzc3dvcmQiOiIxMjMiLCJpYXQiOjE1MTYyMzkwMjJ9.u7spKPeYl71Un8qmZlFOFMUnTigckMv21zscbMNRD_k";
    }
}
