package com.example.server.service;

import com.example.server.dao.CatDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CatService {

    private final CatDao catDao;

}
