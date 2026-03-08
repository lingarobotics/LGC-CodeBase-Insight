package com.lgc.codebaseinsight.learning.service;

import com.lgc.codebaseinsight.learning.repository.CodebaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LearningServiceImpl {

    private final CodebaseRepository codebaseRepository;

    public LearningServiceImpl(CodebaseRepository codebaseRepository) {
        this.codebaseRepository = codebaseRepository;
    }

}