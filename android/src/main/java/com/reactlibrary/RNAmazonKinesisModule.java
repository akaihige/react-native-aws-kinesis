
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.Map;
import java.util.HashMap;


import android.widget.Toast;

// aws kinesis video
import com.amazonaws.kinesisvideo.common.exception.KinesisVideoException;
import com.amazonaws.kinesisvideo.client.KinesisVideoClient;
import com.amazonaws.mobileconnectors.kinesisvideo.client.KinesisVideoAndroidClientFactory;
import com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android.AndroidCameraMediaSource;
import com.amazonaws.mobileconnectors.kinesisvideo.mediasource.android.AndroidCameraMediaSourceConfiguration;


public class RNAmazonKinesisModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  private static final String DURATION_SHORT_KEY = "SHORT";
  private static final String DURATION_LONG_KEY = "LONG";

  public RNAmazonKinesisModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNAmazonKinesis";
  }

  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT);
    constants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG);
    return constants;
  }

  public void configure() {
    // configure kinesis module
  }

  @ReactMethod
  public void start(String streamName, String tag) {
    // aws kinesis module start method
    Toast.makeText(getReactApplicationContext(), "Started", Toast.LENGTH_LONG).show();
  }

  @ReactMethod
  public void stop(String streamName, String tag) {
    // aws kinesis module stop method
    Toast.makeText(getReactApplicationContext(), "Stopped", Toast.LENGTH_LONG).show();
  }
}