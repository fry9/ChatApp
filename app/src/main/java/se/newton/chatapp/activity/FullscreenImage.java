package se.newton.chatapp.activity;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import se.newton.chatapp.R;

public class FullscreenImage extends Activity {
    private static final String TAG = "FullscreenImage";
    private String uri;

    public FullscreenImage() {
        // Required empty public constructor
    }

    public static FullscreenImage newInstance(String uri) {
        Log.d(TAG, "Creating a new fragment");
        FullscreenImage fragment = new FullscreenImage();
        fragment.uri = uri;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_image);

        Intent intent = this.getIntent();
        String uri = intent.getStringExtra("uri");

        ImageView imageView = findViewById(R.id.largeImageView);
        Glide.with(this).load(uri).into(imageView);
    }
}
