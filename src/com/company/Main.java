package com.company;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            Document doc = null;
            String url = "https://www.wikidex.net/wiki/";

            doc = Jsoup.connect(url).get();
            System.out.println("Connected");

            Elements entradas = doc.select("//tr[@title=\\'Habilidades que puede conocer\\");

        }catch(IOException ioe){
            System.out.println("Unable to connect");
            ioe.printStackTrace();
        }
        
    }
}