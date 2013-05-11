package com.example.gallerytest2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	
	private Integer[] imageids = new Integer[] {
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
		R.drawable.music_list,
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//		GalleryFlow gf = (GalleryFlow) this.findViewById(R.id.gf01);
		GalleryFlow gf = new GalleryFlow(this);
		setContentView(gf);
		gf.setHorizontalFadingEdgeEnabled(true);
		gf.setFadingEdgeLength(-60);
		gf.setSpacing(-100);
		ImageAdapter adapter = new ImageAdapter(this, imageids);
		adapter.createReflectedImages();
		gf.setAdapter(adapter);
		gf.setSelection(3);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
