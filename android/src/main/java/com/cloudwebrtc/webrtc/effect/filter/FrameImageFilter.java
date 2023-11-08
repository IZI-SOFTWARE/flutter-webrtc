package com.cloudwebrtc.webrtc.effect.filter;


import com.cloudwebrtc.webrtc.effect.VideoEffectorContext;

public abstract class FrameImageFilter {

    public FrameImageFilter() {}

    abstract public void init();

    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    public void enable() {
        enabled = true;
    }

    public void disable() {
        enabled = false;
    }

    abstract public int filter(VideoEffectorContext context, int srcTextureId);

    abstract public void dispose();

}
