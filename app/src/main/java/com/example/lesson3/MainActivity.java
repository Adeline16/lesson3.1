package com.example.lesson3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvTask;
    RecyclerAdapter adapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvTask = findViewById(R.id.rv_task);
        rvTask.setLayoutManager(new LinearLayoutManager(this));
        List<String>list = new ArrayList<>();
        list.add("Фэнтези");
        list.add("Детективы");
        list.add("Ужасы");
        list.add("Приключения");
        list.add("Проза");
        adapter = new RecyclerAdapter(list,this);
        rvTask.setAdapter(adapter);
        recyclerView = findViewById(R.id.rv_task);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<String>list1 = new ArrayList<>();
        list1.add("Фэ́нтези — жанр современного искусства, разновидность фантастики. Фэнтези основывается на использовании мифологических и сказочных мотивов в современном виде.");
        list1.add("Детекти́вный рассказ, так же уголо́вный рассказ — преимущественно литературный и кинематографический жанр, произведения которого описывают процесс исследования загадочного происшествия с целью выяснения его обстоятельств и раскрытия загадки.");
        list1.add("Фильм ужасов — жанр художественного фильма. Тематически обширный и разнообразный круг фильмов, призванных вызвать у зрителей чувство страха, тревоги и неопределённости, создать напряжённую атмосферу ужаса или мучительного ожидания чего-либо ужасного — так называемый эффект «саспенс».");
        list1.add("Приключе́нческий фильм — остросюжетный вид игрового фильма, соответствующий приключенческому роману в литературе. Жанр близок боевику, но, в отличие от последнего, в приключенческих фильмах акцент смещён с грубого насилия на смекалку персонажей, умение перехитрить, обмануть злодея.");
        list1.add("Про́за — устная или письменная речь без деления на соизмеримые отрезки — стихи; в противоположность поэзии её ритм опирается на приблизительную соотнесенность синтаксических конструкций.");
        adapter = new RecyclerAdapter(list1,this);
        recyclerView.setAdapter(adapter);





    }
}