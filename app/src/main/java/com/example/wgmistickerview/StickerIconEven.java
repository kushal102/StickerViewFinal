package com.example.wgmistickerview;

import android.view.MotionEvent;

import StickerView.StickerView;

public interface StickerIconEven {
    void onActionDown(StickerView stickerView, MotionEvent event);

    void onActionMove(StickerView stickerView, MotionEvent event);

    void onActionUp(StickerView stickerView, MotionEvent event);
}
