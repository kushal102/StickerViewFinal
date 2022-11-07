package com.example.wgmistickerview;

import android.view.MotionEvent;
import android.widget.Toast;



import StickerView.StickerView;
import StickerView.StickerIconEvent;


public class HelloIconEvent implements StickerIconEven {
  @Override public void onActionDown(StickerView stickerView, MotionEvent event) {

  }

  @Override public void onActionMove(StickerView stickerView, MotionEvent event) {

  }

  @Override public void onActionUp(StickerView stickerView, MotionEvent event) {
    Toast.makeText(stickerView.getContext(), "Hello World!", Toast.LENGTH_SHORT).show();
  }
}
