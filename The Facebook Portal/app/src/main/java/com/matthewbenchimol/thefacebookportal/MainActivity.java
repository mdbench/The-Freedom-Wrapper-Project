package com.matthewbenchimol.thefacebookportal;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @SuppressLint({"ClickableViewAccessibility", "SetJavaScriptEnabled"})
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // take a look at the documentation on the android studio developer page: https://developer.android.com/docs
        webView = findViewById(R.id.webView); // take a look at the documentation on the android studio developer page: https://developer.android.com/docs
        webView.setBackgroundColor(Color.WHITE); // take a look at the documentation on the android studio developer page: https://developer.android.com/docs
        webView.setLayerType(View.LAYER_TYPE_HARDWARE, null); // take a look at the documentation on the android studio developer page: https://developer.android.com/docs
        webView.setWebViewClient(new WebViewClient()); // take a look at the documentation on the android studio developer page: https://developer.android.com/docs
        webView.getSettings().setLoadsImagesAutomatically(true); // automatically loads images to enhance wrapper experience
        webView.getSettings().setCacheMode( WebSettings.LOAD_NO_CACHE); // forces the wrapper to load from internet resources instead of cache which ensure you are seeing the most up-to-date information
        webView.getSettings().setSupportMultipleWindows(false); // take a look at the documentation on the android studio developer page: https://developer.android.com/docs
        webView.getSettings().getMediaPlaybackRequiresUserGesture(); // take a look at the documentation on the android studio developer page: https://developer.android.com/docs
        webView.getSettings().setJavaScriptEnabled(true); // enables javascript - normally, this is a security no-no - however, the web-page you are wrapping is protected in an application sandbox, an isolated process, and with a certificate. the website would have to be the culprit for you to be truly concerned.
        CookieManager.getInstance().setAcceptCookie(true); // gives the website you are wrapping the ability to set cookies so you don't have to log-in every time you open the wrapper
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, false); // prevents third-party cookies - usually these cookies are not necessary for a website to function
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setUserAgentString("Mozilla/5.0 (Linux; Android 9; Unspecified Device) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.0.0 Mobile Safari/537.36"); // sets a user-agent for your wrapper that always works but limits the amount of information websites can collect on you
        webView.getSettings().setSafeBrowsingEnabled(true); // uses google's safe browsing backbone to ensure you aren't vulnerable to malicious domains
        webView.setOverScrollMode(View.OVER_SCROLL_NEVER); // prevents choppy rendering when scrolling
        webView.getSettings().setAllowContentAccess(false); // take a look at the documentation on the android studio developer page: https://developer.android.com/docs
        webView.getSettings().setAllowFileAccess(false); // take a look at the documentation on the android studio developer page: https://developer.android.com/docs
        webView.getSettings().setDomStorageEnabled(false); // take a look at the documentation on the android studio developer page: https://developer.android.com/docs
        webView.clearHistory(); // a good practice to clear history - clears history every time the application boots up so you preserve your current session when in use
        webView.clearCache(true); // a good practice to clear all cache to prevent loading issues
        webView.clearFormData(); // a good practice to reset form data
        webView.setScrollbarFadingEnabled(false); // forces the scrollbar to stay visible
        webView.loadUrl("https://www.facebook.com"); // change this url to whatever you want to create your wrapper!
    }
    // this allows the wrapper to stay within the application when the back button is pressed
    // it uses your web-back-forward history to go back to the page you were just at
    public void onBackPressed(){
        if (webView.canGoBack()){
            webView.goBack();
        } else {
            super.onBackPressed();{
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        }
    }
}


