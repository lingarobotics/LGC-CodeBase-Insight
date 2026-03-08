package com.lgc.codebaseinsight.learning.service;

import com.lgc.codebaseinsight.learning.model.Codebase;
import java.util.List;

public interface LearningService {

    List<Codebase> getAllCodebases();

    Codebase getCodebaseById(String id);

}