package com.example.dzikirdoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.dzikirdoapp.model.Article

class MainActivity : AppCompatActivity() {
    private lateinit var vpArticle : ViewPager2
    private lateinit var llDotsArticle : LinearLayout

    private var listArticle: ArrayList<Article> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
        initView()
    }

    private fun initView() {
        vpArticle = findViewById(R.id.vp_article)
        llDotsArticle = findViewById(R.id.ll_dots_article)
    }

    private fun initData(){
        val imgArtikel = resources.obtainTypedArray(R.array.gambar_article)
        val titleArticle = resources.getStringArray(R.array.judul_article)
        val contentArticle = resources.getStringArray(R.array.content_article)

        listArticle.clear()
        for (data in titleArticle.indices){
            listArticle.add(
                Article(
                    imgArtikel.getResourceId(data,0),
                    titleArticle[data],
                    contentArticle[data]
                )
            )
        }
        imgArtikel.recycle()
    }

    private fun setupViewPager() {

    }
}