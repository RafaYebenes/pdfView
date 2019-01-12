package com.example.rafa.pdfview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PDFView p = (PDFView)findViewById(R.id.pdfView);
        String pdf= "PDF/demo.pdf";
        p.fromAsset(pdf).load();

    }
}
