package com.innotech.i.webview_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout activity_main;
    private WebView mWebView;
    public static final String content1 = "<!DOCTYPE html> <html> <head> <title></title> <meta charset=\"utf-8\"> <style type=\"text/css\">*{padding:0;margin:0}a:link{text-decoration:none}</style></head> <body> <div> <img src=\"http://169.55.74.173/tracking/impression?bid_id=13418925336354423&ids=BMjQ1NH4zNjQ2Nn4yODI4MzR-MTA3M34tMX4xfjF-MH4wfklOfmlvc34tMX5hcHBsZX40LDF-MTI5ODUwfjE0Njg5NDE1NzI5NDF-c2J-MjU5NDI1flNhZmFyaX4wfjB-MH4wfjB-MA&bid_time=1472019465&chk=268874f43a6350e9c81feab7a79b44a7&ext=\" width=\"1\" height=\"1\" style=\"display:none;\" /></div> <script type=\"text/javascript\">var string=\"\";if(string.replace(/(^s*)|(s*$)/g,\"\").length>0&&\"$\"+\"{WINNOTICEURL}\"!=string){var iframe=document.createElement(\"iframe\");iframe.src=string,iframe.width=1,iframe.height=1,iframe.setAttribute(\"frameborder\",\"0\",0),iframe.onload=function(){iframe.parentNode.removeChild(iframe);},document.body.appendChild(iframe)}</script> <script type=\"text/javascript\">document.write(' <IFRAME FRAMEBORDER=0 MARGINWIDTH=0 MARGINHEIGHT=0 SCROLLING=NO WIDTH=320 HEIGHT=50 SRC=\"' + ('https:' == document.location.protocol ? 'https://' : 'http://') + 'carsrapid.com/rt?id=5&k=uHJMGFmbKPvAvyk\"></IFRAME>')</script></body></html>";
    public static final String content = "<html>\n" +
            "<head>\n" +
            "<meta http-equiv=\"Content-Type\" content=\"text/html;charset=gb2312\">\n" +
            "<script type=\"text/javascript\">\n" +
            "\n" +
            "function javacalljs(){\n" +
            "     document.getElementById(\"content\").innerHTML =\n" +
            "         \"<br\\>JAVA调用了JS的无参函数\";\n" +
            "}\n" +
            "\n" +
            "function javacalljswith(arg){\n" +
            "     document.getElementById(\"content\").innerHTML =\n" +
            "         (\"<br\\>\"+arg);\n" +
            "}\n" +
            "</script>\n" +
            "</head>\n" +
            "<body>\n" +
            "HTML 内容显示 <br/>\n" +
            "<h1><div id=\"content\">内容显示</div></h1>\n" +
            "<br/>\n" +
            "<input type=\"button\"  value=\"点击调用java代码\" onclick=\"window.android.startFunction()\" />\n" +
            "<br/>\n" +
            "<input type=\"button\"  value=\"点击调用java代码并传递参数\" onclick=\"window.android.startFunction('http://blog.csdn.net/Leejizhou')\"  />\n" +
            "</body>\n" +
            "</html>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity_main = (RelativeLayout)findViewById(R.id.activity_main);

        //得到WebView组件
//        mWebView = (WebView) findViewById(R.id.mail_open_html);
//        RelativeLayout relativeLayout = new RelativeLayout(MainActivity.this);
//        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        mWebView = new WebView(MainActivity.this);
        mWebView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        relativeLayout.addView(mWebView);
        activity_main.addView(mWebView);

        //能够的调用JavaScript代码
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setDefaultTextEncodingName("utf-8");// TODO: 2016/11/8  亦可："UTF-8"
//        mWebView.getSettings().setDefaultTextEncodingName("UTF-8") ;
        //加载HTML字符串进行显示
//        mWebView.loadData("<html>这是一段HTML的代码</html>","text/html", "utf-8");
//        mWebView.loadData("<html>this is the HTML code</html>","text/html", "utf-8");

//        mWebView.getSettings().setLoadsImagesAutomatically(true);
//        mWebView.getSettings().setBlockNetworkImage(true);
//        mWebView.getSettings(). setLoadWithOverviewMode(true); // 缩放至屏幕的大小
//        mWebView.getSettings().setLoadsImagesAutomatically(true);  //支持自动加载图片
//        mWebView.getSettings().setJavaScriptEnabled(true);
//        mWebView.getSettings().setBlockNetworkImage(false);
//
//        mWebView.getSettings().setAllowFileAccess(true);//设置可以访问文件
//        mWebView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        String body="<img  src=\"http://img03.3dmgame.com/uploads/allimg/141115/271_141115025804_1_lit.jpg\"/>";

        String html="<html><body>"+body+"</body></html>";
        mWebView.loadDataWithBaseURL(null, html, "text/html","utf-8", null);// TODO: 2016/11/8  这里null也可以是:""





//        setHtmlType();//html类型


    }


    private void setHtmlType() {
        Log.e("TAG", "setHtmlType()");
//        WebView mWebView = new WebView(MainActivity.this);
        Log.e("TAG", "1");
        mWebView.requestFocus();
        Log.e("TAG", "2");
        mWebView.getSettings().setDefaultTextEncodingName("UTF-8");
        Log.e("TAG", "3");
//        webView.getSettings().setSaveFormData(false);
        mWebView.getSettings().setSupportZoom(true);
        Log.e("TAG", "4");
        mWebView.getSettings().setBlockNetworkImage(false);//支持加载图片
//        Log.e("TAG", "5");
        mWebView.getSettings().setBuiltInZoomControls(true);
        Log.e("TAG", "6");
//        webView.setScrollBarStyle(WebView.SCROLL_AXIS_NONE);
        mWebView.getSettings().setJavaScriptEnabled(true);
        Log.e("TAG", "7");
//        if (mBannerContent.has("w_url")) {
//            try {
//                mW_url = mBannerContent.getString("w_url");
//
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//        }

//        webView.setWebViewClient(new WebViewClient() {
//
//
//            @Override
//            public void onPageStarted(WebView view, String url, Bitmap favicon) {
//                super.onPageStarted(view, url, favicon);
//            }
//
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                super.onPageFinished(view, url);
//            }
//
//            @Override
//            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
//                super.onReceivedError(view, request, error);
//            }
//
//            @Override
//            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
//                super.onReceivedSslError(view, handler, error);
//            }
//        });
        mWebView.loadDataWithBaseURL("", content, "text/html", "UTF-8", "");

//        webView.setWebViewClient(new WebViewClient(){
//
//
//            public boolean shouldOverrideUrlLoading(WebView view, String url){
//                view.loadUrl(url);
//                return true;
//            }
//        });
        mWebView.setWebChromeClient(new WebChromeClient());
        Log.e("TAG", "8");
//        webView.loadUrl("http://www.baidu.com");
//        mWebView.loadData("<html>这是一段HTML的代码</html>", "text/html", "utf-8");
        Log.e("TAG", "baidu");

    }
}
