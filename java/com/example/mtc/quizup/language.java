package com.example.mtc.quizup;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;



public class language extends Activity {
    private Button hindi, english;


    SQLiteDatabase sqLiteDatabaseObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        hindi = (Button) findViewById(R.id.hindi);
        english = (Button) findViewById(R.id.english);


        sqLiteDatabaseObj = openOrCreateDatabase("quiz_db", Context.MODE_PRIVATE, null);
        sqLiteDatabaseObj.execSQL("CREATE TABLE IF NOT EXISTS quiz_questions_new(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ,question VARCHAR, option1 VARCHAR , option2 VARCHAR, option3 VARCHAR , option4 VARCHAR,answer_nr INTEGER,lang VARCHAR)");
        final Cursor c3 = sqLiteDatabaseObj.rawQuery("SELECT *  from quiz_questions_new ", null);

        if(c3.getCount() > 0) {
        }
        else{

            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('The thief was sent to prison','a','an','no article','the' ,4 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('meat you cooked tasted good','a','an','no article','the' ,3 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Our city will have university soon','a','an','no article','the' ,1 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('This is car I bought yesterday','a','an','no article','the' ,4 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('elephant is a vegetarian','a','an','no article','the',4 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('He hopes to join  university soon','a','an','no article','the',1 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('I go to Madurai by Vaigai Express','a','an','some','the' ,4 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Let us go to a restaurant and have coffee','a','an','no article','the' ,1 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('It is absurd story','a','an','no article','the' ,1 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('I want to eat apple','a','an','no article','the' ,3 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Pandiyan Express is very popular','a','an','no article','the' ,4 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Please give me useful gift','a','an','no article','the' ,2 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Bolt from the blue','Thundering','A complete surprise','Inform something bad','No idea' ,2 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Blue blood','Belonging to low class society','Give complain in written','Member of high class society','Complain give verbally' ,3 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('The boy was cured typhoid.','from','of','for','through' ,2 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Voraciou','tenacious','truthful','spacious','ravenous' ,4 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Abortive','fruitful','familiar','unsuccessful','consuming' ,3 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('They listened to him','spellbinded','spellbind','spellbinding','spellbound' ,4 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Where is Bose Institute?','Dispur','Kolkata','Mumbai','New Delhi' ,2 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('When is the International Yoga Day celebrated?','June 21 ','March 21','April 22',' May 31' ,1 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('The super computer ‘PARAM’ was developed by','TATA','IIT-Kharagpur','IIT-Kanpur','C-DAC' ,4 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Shore temple is located at, Which City?','Calicut','Sanapur','Patna','Mahabalipuram' ,4 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('The highest peak in South India is, Which hill?','Everest','Doddabetta','Nilgiri hills','Anaimudi' ,4 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Red Cross was founded by, Which ?','A.Cursetji','Badel Powell','J.H.Durant','Trygve Lie' ,3 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('The largest part of the human brain part is? ','Cerebellum','Midbrain','Cerebrum','Medulla Oblongata' ,3 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Jamini Roy was a famous for','Dancer','Actor','Producer','Painter' ,4 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Who is Tania Sachdev?','Actress','Chess Player','Dancer','Singer' ,2 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('The term Lok Sabha is normally','2 years','4 years','5 years','7 years' ,3 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Frailty','energy','intensity','spellbound','strength' ,4 , 'end')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('A prepositional phrase consists of a preposition and its','object','subject','all of above','non of this' ,2 , 'end')");

            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('निम्न लिखित में से कौन भारत का पहला परमाणु रिएक्टर है?','अप्सारा','एक्तारा','स्वरूप','भरत' ,1 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('भारत की पहली महिला कार चालक कौन थी?','जॉनसन डे सैली',' थीम्मा वीकाजी टाटा','रतनबाई पेटिट','सुज़ैन ब्रियर' ,4 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES(' निम्नलिखित में से कौन सा देश का पहला कंप्यूटर है?','टीआईएफआरएसी','मेनफ्रेम कम्प्यूटर','माइक्रो कंप्यूटर','भरत कम्प्यूटर' ,1 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('भारतीय विज्ञान कांग्रेस के उदघाटन सत्र के पहले राष्ट्रपति कौन थे?','सर जे.सी बोस','होमी जे भाभा','आशुतोष मुखर्जी','सी.वी रमन' ,3 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('कार्यालय में मरने वाले पहले मुख्यमंत्री कौन थे?','सी एन.अन्नदुराई','श्री कृष्ण सिंह','मोहम्मद यूनुस','गोविंद बल्लभ पंत' ,1 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('प्रथम भारतीय जिसे मिस्टर यूनिवर्स से सम्मानित किया गया था?','रोहित खाडवाल','आर्यन वैद','मनोहर एईच','एच एच एस यदु' ,3 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('वर्तमान में भारतीय संविधान में कितनी राजभाषाएं वर्णित हैं??','24','22','14','25' ,2 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('भारतीय संविधान में राजभाषाएं किस अनुसूची में वर्णित है?','अनुसूची 5','अनुसूची 6','अनुसूची 7','अनुसूची 8' ,4 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('अरुणाचल प्रदेश में कौन सी मुख्य क्षेत्रीय भाषा है?','असमिया','बोडो','अंग्रेजी','डोगरी' ,3 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('‘डोगरी’ भाषा भारत के किस राज्य क्षेत्र में बोली जाती है?','जम्मू और कश्मीर प्रान्त','पुदुचेरी','अंदमान एवं निकोबार द्वीप समूह','नागालैंड' ,1 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('निम्नलिखित में से कौन पद्म भूषण पुरस्कार 2020 का विजेता नहीं है?','आनंद महिंद्रा','मैरी कॉम','पी.वी. सिंधु','एस.सी.जमीर' ,2 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES(' विजेताओं को पद्म पुरस्कार कौन देता है?','भारत के राष्ट्रपति','भारत के प्रधानमंत्री','स्पीकर','उपरोक्त में से कोई नहीं' ,1 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('निम्नलिखित में से क्या सही ढंग से मेल नहीं खाता है?','श्री छन्नूलाल मिश्र - कला','सर अनिरुद्ध जुगनौत GCSK- सार्वजनिक मामले','श्री विश्वश्रेष्ठ स्वामीजी - साहित्य और शिक्षा',' श्री जॉर्ज फर्नांडीस (मरणोपरांत) - सार्वजनिक मामले' ,3 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('भारत में तीसरा सबसे बड़ा पद्म पुरस्कार कौन सा है?','भारत रत्न','पद्म विभूषण','पद्म भूषण','पद्मश्री' ,4 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('पद्म पुरस्कारों की स्थापना कब हुई?','1948','1954','1965','1985' ,2 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('वर्ष 2020 में कितने पद्म पुरस्कार दिए गये हैं?','118','141','116','156' ,2 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES(' विश्व पर्यटन दिवस कब मनाया जाता है-','12 सितंबर','25 सितंबर','27 सितंबर','29 सितंबर' ,3 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('बोस संस्थान कहाँ है?','दिसपुर','कोलकाता','मुंबई','नई दिल्ली' ,2 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('अंतर्राष्ट्रीय योग दिवस कब मनाया जाता है?','21 जून','21 मार्च','22 अप्रैल','31 मई' ,1 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('संविधान के किस अनुच्छेद में बजट की बात कही गयी है??','अनुच्छेद 280','अनुच्छेद 110','अनुच्छेद 360','अनुच्छेद 112' ,4 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('भारत में आयकर किस दर से लगाया जाता है?','अधोगामी दर से','प्रगतिशील दर से','घटती हुई दर से','आनुपातिक दर से' ,1 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('बॉयल के नियम का पालन किस स्थिति में अच्छी तरह से होता है','सुश्रुत','च्यवन','धन्वन्तरी','चरक' ,3 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('पहला ज्ञात गुप्त शासक कौन था?','श्रीगुप्त','चन्द्रगुप्त 1 ','घटोत्कच','कुमारगुप्तप्रथम' ,1 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('उत्तर  गुप्त युग में जो विश्वविध्यालय प्रसिद्ध हो गया था','कांची','तक्षशिला','नालंदा','वल्लभी' ,3 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('भारतीय नेपोलियन की उपाधि कि से दी गई हैं? ','चन्द्रगुप्तमौर्य','समुद्रगुप्त','चन्द्रगुप्तप्रथम','हर्षवर्धन' ,2 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('इलाहाबाद के स्तंम्भ में किसकी उपलब्धिया उत्कीर्ण है?','चन्द्रगुप्तमौर्य','समुद्रगुप्त','विक्रमादित्य','स्कन्दगुप्त' ,2 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('कवी कालिदास किसके राजकवि थे?','चन्द्रगुप्तमौर्य','समुद्रगुप्त','चन्द्रगुप्त II ','कुमारगुप्त' ,3 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES(' गुप्त राजवंश किस लिए प्रसिद्ध था?','कलाऔरस्थापत्य','साम्राज्यवाद','राजस्वऔरभूमिसुधार ','कोईनहीं' ,1 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES('सबसे बड़ा ग्रह है ?','बृहस्पति',' पृथ्वी',' युरेनस ',' शुक्र' ,4 , 'hindi')");
            sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_new(question,option1,option2,option3,option4,answer_nr,lang) VALUES(' सबसे छोटा ग्रह है ?',' मंगल','शनि',' बुध ','नेप्चून' ,3 , 'hindi')");


        }

        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),hindi.class);
             startActivity(intent);

            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), com.example.mtc.quizup.english.class));

            }
        });


    }



}
