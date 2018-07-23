package io.mykit.wechat.mp.beans.xml.send.music;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import io.mykit.wechat.mp.beans.xml.send.base.WxBaseSendMessage;
import io.mykit.wechat.utils.xml.XStreamCDataConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Author: liuyazhuang
 * @Date: 2018/7/18 19:53
 * @Description: 回复音乐消息
 */
@XStreamAlias("xml")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class WxSendMusicMessage extends WxBaseSendMessage {
    private static final long serialVersionUID = 4189078785982085539L;

    @XStreamAlias("MsgType")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String msgType = "music";

    @XStreamAlias("Title")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String title;

    @XStreamAlias("Description")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String description;

    @XStreamAlias("MusicURL")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String musicURL;

    @XStreamAlias("HQMusicUrl")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String HQMusicUrl;

    @XStreamAlias("ThumbMediaId")
    @XStreamConverter(value = XStreamCDataConverter.class)
    private String thumbMediaId;
}
