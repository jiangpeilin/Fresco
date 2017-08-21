package com.hxl.lianwang;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.SurfaceView;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(MainActivity.this);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        //加载GIF图片
        Uri uri = Uri.parse("https://img03.sogoucdn.com/net/a/04/link?url=http%3A%2F%2Fi04.pictn.sogoucdn.com%2F491c9162797df430&appid=122");
        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);

        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setAutoPlayAnimations(true)
                .build();
        draweeView.setController(controller);
        //加载静态图片
        //http://img02.sogoucdn.com/app/a/100520024/7b54a8efe63fb39bea16a517255c4929
        SimpleDraweeView draweeView1= (SimpleDraweeView) findViewById(R.id.my_image_view1);
        Uri uri1=Uri.parse("http://img02.sogoucdn.com/app/a/100520024/7b54a8efe63fb39bea16a517255c4929");
        draweeView1.setImageURI(uri1);
    }
}
