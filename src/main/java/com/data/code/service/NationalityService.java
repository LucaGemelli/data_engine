package com.data.code.service;

import com.data.code.model.response.NationalityResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NationalityService {

    public List<NationalityResponse> getNationalities() {
        // TODO - Lista de todas as nacionalidades, em ordem decrescente de vitórias
        return new ArrayList<>();
    }
}
