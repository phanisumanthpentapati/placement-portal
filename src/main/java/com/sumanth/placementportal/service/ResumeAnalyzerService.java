package com.sumanth.placementportal.service;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class ResumeAnalyzerService {

    public int analyzeResume(String filePath)
            throws Exception {

        File pdfFile = new File(filePath);

        PDDocument document =
                Loader.loadPDF(pdfFile);

        PDFTextStripper stripper =
                new PDFTextStripper();

        String text =
                stripper.getText(document)
                        .toLowerCase();
        System.out.println(text);

        document.close();

        int score = 0;

        if(text.contains("java"))
            score += 20;

        if(text.contains("spring"))
            score += 20;

        if(text.contains("sql"))
            score += 20;

        if(text.contains("html"))
            score += 10;

        if(text.contains("css"))
            score += 10;

        if(text.contains("project"))
            score += 10;

        if(text.contains("certificate"))
            score += 10;

        return score;
    }
}