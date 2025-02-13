package com.genersoft.iot.vmp.service;

import com.alibaba.fastjson.JSONObject;
import com.genersoft.iot.vmp.gb28181.event.SipSubscribe;
import com.genersoft.iot.vmp.media.zlm.ZLMHttpHookSubscribe;
import com.genersoft.iot.vmp.vmanager.gb28181.play.bean.PlayResult;

/**
 * 点播处理
 */
public interface IPlayService {

    void onPublishHandlerForPlayBack(JSONObject resonse, String deviceId, String channelId, String uuid);
    void onPublishHandlerForPlay(JSONObject resonse, String deviceId, String channelId, String uuid);

    PlayResult play(String deviceId, String channelId, ZLMHttpHookSubscribe.Event event, SipSubscribe.Event errorEvent);
}
