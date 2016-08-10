package com.example.admin82.testwebview;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) findViewById(R.id.webView1);

        // javascriptを有効に
        myWebView.getSettings().setLoadWithOverviewMode(true);

        // スクロールバーの非表示
        myWebView.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);

        //リンクをタップしたときに標準ブラウザを起動させない
        myWebView.setWebViewClient(new WebViewClient());

        // 表示させたいページのリンク
        myWebView.loadUrl("http://help.g.pixiv-game.com/sp/");

        // http://help.g.pixiv-game.com/sp/
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        WebView myWebView = (WebView) findViewById(R.id.webView1);
        // 端末のBACKキーで一つ前のページヘ戻る
        if (keyCode == KeyEvent.KEYCODE_BACK && myWebView.canGoBack()) {
            myWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
