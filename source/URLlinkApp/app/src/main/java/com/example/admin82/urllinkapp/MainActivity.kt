package com.example.admin82.urllinkapp

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Process.*
import android.view.View
import android.widget.TextView
import android.widget.Button
import android.view.View.OnClickListener
import android.content.UriPermission
import android.webkit.WebView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // URIを取得
        val uri = Uri.parse("http://help.g.pixiv-game.com/sp/")
        // Intent処理を呼び出す
        val intent = Intent(Intent.ACTION_VIEW, uri)
        // 指定ページに飛ぶ
        startActivity(intent)

        // 起動アプリを閉じる
        finish()
    }


}
