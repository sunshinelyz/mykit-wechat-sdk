package io.mykit.wechat.mp.config;

/**
 * @Author: liuyazhuang
 * @Date: 2018/7/11 16:48
 * @Description: 储存配置的常量key，本项目中的配置文件可能有多个
 */

public class BaseProp {


    /**---------------------------------各模块的Key-----------------------------------------*/
    /**
     * core模块
     */
    public static final String MODEL_CORE = "model_core";


    /**---------------------------------各种文件的Key-----------------------------------------*/

    /**
     * 配置文件的标识
     */
    public static final String PROP_FILE_URL = "url.properties";
    /**
     * 配置各种参数
     */
    public static final String PROP_FILE_PARAMS = "params.properties";

    /**--------------------------------各种参数的key-------------------------------------------*/

    /**
     * 配置到微信服务器的token
     */
    public static final String WECHAT_TOKEN = "wechat_token";

    /**
     * 设置微信公众号的EncodingAESKey
     */
    public static final String WECHAT_AES_KEY = "wechat_aes_key";


    /**--------------------------------各种微信接口链接的key------------------------------------*/
    /**
     * 获取微信access_token
     */
    public static final String WEIXIN_TOKEN_GET = "weixin.token.get";

    /**
     * 获取微信服务器列表
     */
    public static final String WEIXIN_HOST_GET = "weixin.host.get";

    /**
     * 创建自定义菜单
     */
    public static final String WEIXIN_MENU_CREATE = "wexin.menu.create";

    /**
     * 查询自定义菜单
     */
    public static final String WEIXIN_MENU_GET = "weixin.menu.get";

    /**
     * 删除自定义菜单
     */
    public static final String WEIXIN_MENU_DELETE = "weixin.menu.delete";

    /**
     * 创建个性化菜单
     */
    public static final String WEIXIN_MENU_ADDCONDITIONAL = "wexin.menu.addconditional";
    /**
     * 删除个性化菜单
     */
    public static final String WEIXIN_MENU_DELCONDITIONAL = "weixin.menu.delconditional";
    /**
     * 测试个性化菜单匹配结果
     */
    public static final String WEIXIN_MENU_TRY_MATCH = "wexin.menu.trymatch";
    /**
     * 获取自定义菜单配置
     */
    public static final String WEIXIN_MENU_GET_INFO = "weixin.menu.get.info";

    /**
     *  添加客服账号
     */
    public static final String WEIXIN_MENU_KFACCOUNT_ADD = "weixin.kfaccount.add";
    /**
     * 修改客服账号
     */
    public static final String WEIXIN_MENU_KFACCOUNT_UPDATE = "weixin.kfaccount.update";
    /**
     * 删除客服账号
     */
    public static final String WEIXIN_MENU_KFACCOUNT_DEL = "weixin.kfaccount.del";
    /**
     * 设置客服账号头像
     */
    public static final String WEIXIN_MENU_KFACCOUNT_UPLOADHEADIMG = "weixin.kfaccount.uploadheadimg";
    /**
     * 获取所有客服账号
     */
    public static final String WEIXIN_MENU_KFACCOUNT_GETKFLIST = "weixin.kfaccount.getkflist";

    /**
     * 发送客服消息
     */
    public static final String WEIXIN_KFACCOUNT_MESSAGE = "weixin.kfaccount.message";

    /**
     * 上传图文消息内的图片获取URL
     */
    public static final String WEIXIN_GROUP_UPLOADIMG = "weixin.group.uploadimg";
    /**
     * 上传多媒体文件
     */
    public static final String WEIXIN_BASE_UPLOAD = "weixin.base.upload";
    /**
     * 上传多媒体文件
     */
    public static final String WEIXIN_BASE_UPLOAD_FILE = "weixin.base.upload.file";
    /**
     * 下载多媒体文件
     */
    public static final String WEIXIN_BASE_DOWNLOAD_FILE = "weixin.base.download.file";

    /**
     * 上传微信图文消息
     */
    public static final String WEIXIN_MEDIA_NEWS_UPLOAD = "weixin.media.news.upload";
    /**
     * 上传视频素材
     */
    public static final String WEIXIN_MEDIA_VIDEO_UPLOAD = "weixin.media.video.upload";

    /**
     * 根据标签进行群发
     */
    public static final String WEIXIN_MASS_SENDALL = "weixin.mass_sendall";

    /**
     * 根据OpenID群发
     */
    public static final String WEIXIN_MASS_SEND = "weixin.mass.send";

    /**
     * 删除群发消息
     */
    public static final String WEIXIN_MASS_DELETE = "weixin.mass.delete";

    /**
     * 预览群发
     */
    public static final String WEIXIN_MASS_PREVIEW = "weixin.mass.preview";

    /**
     * 查询群发消息发送状态
     */
    public static final String WEIXIN_MASS_GET = "wexin.mass.get";

    /**
     * 获取群发速度
     */
    public static final String WEIXIN_MASS_SPEED_GET = "weixin.mass.speed.get";
    /**
     * 设置群发速度
     */
    public static final String WEIXIN_MASS_SPEED_SET = "weixin.mass.speed.set";

    /**
     * 设置所属行业
     */
    public static final String WEIXIN_TEMPLATE_INDUSTRY_SET = "weixin.template.industry.set";

    /**
     * 获取所属行业
     */
    public static final String WEIXIN_TEMPLATE_INDUSTRY_GET = "weixin.template.industry.get";

    /**
     * 获得模板ID
     */
    public static final String WEIXIN_TEMPLATE_ID_GET = "weixin.template.id.get";

    /**
     * 获取模板列表
     */
    public static final String WEIXIN_TEMPLATE_ALL_GET = "weixin.template.all.get";

    /**
     * 删除模板
     */
    public static final String WEIXIN_TEMPLATE_ID_DELETE = "weixin.temmplate.id.delete";
    /**
     * 发送模板消息
     */
    public static final String WEIXIN_TEMPLATE_SEND = "weixin.template.send";

    /**
     * 一次性订阅消息,通过API推送订阅模板消息给到授权微信用户
     */
    public static final String WEIXIN_TEMPLATE_SUBSCRIBE = "weixin.template.subscribe";

    /**
     * 微信API调用次数清零
     */
    public static final String WEXIN_QUOTA_CLEAR = "weixin.quota.clear";
    /**
     * 获取公众号的自动回复规则
     */
    public static final String WEXIN_AUTOREPLY_INFO = "weixin.autoreply.info";

    /**
     * 通过code换取网页授权access_token
     */
    public static final String WEXIN_OAUTH2_TOKEN = "weixin.oauth2.token";
    /**
     * 刷新access_token
     */
    public static final String WEXIN_OAUTH2_REFRESH = "weixin.oauth2.refresh";
    /**
     * 拉取用户信息
     */
    public static final String WEXIN_OAUTH2_USER_GET = "weixin.oauth2.user.get";
    /**
     * 检验授权凭证（access_token）是否有效
     */
    public static final String WEXIN_OAUTH2_TOKEN_AUTH= "weixin.oauth2.token.auth";
    /**
     * 获取临时素材
     */
    public static final String WEXIN_MEDIA_GET = "weixin.media.get";

    /**
     * 高清语音素材获取接口
     */
    public static final String WEXIN_MEDIA_JSSDK_GET = "weixin.media.jssdk.get";

    /**
     * 新增永久图文素材
     */
    public static final String WEIXIN_MEDIA_NEWS_ADD = "weixin.media.news.add";
    /**
     *  新增其他类型永久素材
     */
    public static final String WEIXIN_MEDIA_MATERIAL_ADD = "weixin.media.material.add";
    /**
     * 获取永久素材
     */
    public static final String WEIXIN_MEDIA_MATERIAL_GET = "weixin.media.material.get";
    /**
     * 删除永久素材
     */
    public static final String WEIXIN_MEDIA_MATERIAL_DELETE = "weixin.media.materail.delete";

    /**
     * 修改永久素材
     */
    public static final String WEIXIN_MEDIA_MATERAIL_UPDATE = "weixin.media.materail.update";
    /**
     * 获取素材总数
     */
    public static final String WEIXIN_MEDIA_MATERAIL_COUNT = "weixin.media.materail.count";
    /**
     * 获取素材列表
     */
    public static final String WEIXIN_MEDIA_MATERAIL_BATCH_GET = "weixin.media.materail.batch.get";

    /**
     * 打开已群发文章评论
     */
    public static final String WEIXIN_COMMENT_OPEN = "weixin.comment.open";
    /**
     * 关闭已群发文章评论
     */
    public static final String WEIXIN_COMMENT_CLOSE = "weixin.comment.close";
    /**
     * 查看指定文章的评论数据
     */
    public static final String WEIXIN_COMMENT_LIST = "weixin.comment.list";

    /**
     * 将评论标记精选
     */
    public static final String WEIXIN_COMMENT_MARKELECT = "weixin.comment.markelect";
    /**
     *  将评论取消精选
     */
    public static final String WEIXIN_COMMENT_UNMARKELECT = "weixin.comment.unmarkelect";
    /**
     * 删除评论
     */
    public static final String WEIXIN_COMMENT_DELETE = "weixin.comment.delete";
    /**
     * 回复评论
     */
    public static final String WEIXIN_COMMENT_REPLY = "weixin.comment.reply";
    /**
     * 删除回复
     */
    public static final String WEIXIN_COMMENT_REPLY_DELETE = "weixin.comment.reply.delete";

    /**
     * 创建标签
     */
    public static final String WEXIN_TAG_CREATE = "weixin.tag.create";
    /**
     * 获取已创建的标签
     */
    public static final String WEXIN_TAG_GET = "weixin.tag.get";
    /**
     * 编辑标签
     */
    public static final String WEXIN_TAG_UPDATE = "weixin.tag.update";

    /**
     * 删除标签
     */
    public static final String WEIXIN_TAG_DELETE = "weixin.tag.delete";
    /**
     * 获取标签下粉丝列表
     */
    public static final String WEIXIN_TAG_USER_GET = "weixin.tag.user.get";
    /**
     * 批量为用户打标签
     */
    public static final String WEIXIN_TAG_BATCHTAGGING = "weixin.tag.batchtagging";
    /**
     * 批量为用户取消标签
     */
    public static final String WEIXIN_TAG_BATCHUNTAGGING = "weixin.tag.batchtunagging";
    /**
     * 获取用户身上的标签列表
     */
    public static final String WEIXIN_TAG_GET_LIST = "weixin.tag.get.list";
    /**
     * 设置用户备注名
     */
    public static final String WEIXIN_USER_INFO_UPDATEREMARK = "weixin.user.info.updateremark";
    /**
     * 获取用户基本信息（包括UnionID机制）
     */
    public static final String WEIXIN_USER_INFO = "weixin.user.info";
    /**
     * 批量获取用户基本信息
     */
    public static final String WEIXIN_USER_BATCHGET = "weixin.user.batchget";
    /**
     * 获取用户列表
     */
    public static final String WEIXIN_USER_GET = "weixin.user.get";
    /**
     * 获取公众号的黑名单列表
     */
    public static final String WEIXIN_USER_BLACK_LIST = "weixin.user.black.list";
    /**
     * 拉黑用户
     */
    public static final String WEIXIN_USER_BLACK_BATCHBLACKLIST = "weixin.user.black.batchblacklist";
    /**
     * 取消拉黑用户
     */
    public static final String WEIXIN_USER_BLACK_BATCHUNBLACKLIST = "weixin.user.black.batchunblacklist";

    /**
     *  二维码请求
     */
    public static final String WEIXIN_QRCODE_CREATE = "weixin.qrcode.create";

    /**
     * 通过ticket换取二维码
     */
    public static final String WEIXIN_QRCODE_SHOW = "weixin.qrcode.show";
    /**
     * 微信短连接
     */
    public static final String WEIXIN_SHORTURL = "weixin.shorturl";
    /**
     * 获取用户增减数据
     */
    public static final String WEIXIN_DATACUBE_GETUSERSUMMARY = "weixin.datacube.getusersummary";
    /**
     * 获取累计用户数据
     */
    public static final String WEIXIN_DATACUBE_GETUSERCUMULATE = "weixin.datacube.getusercumulate";
    /**
     * 获取图文群发每日数据
     */
    public static final String WEIXIN_NEWS_ARTICLE_SUMMARY = "weixin.news.article.summary";
    /**
     * 获取图文群发总数据
     */
    public static final String WEIXIN_NEWS_ARTICLE_TOTAL = "weixin.news.article.total";
    /**
     * 获取图文统计数据
     */
    public static final String WEIXIN_NEWS_USER_READ = "weixin.news.user.read";
    /**
     * 获取图文统计分时数据
     */
    public static final String WEIXIN_NEWS_USER_READ_HOUR = "weixin.news.user.read.hour";
    /**
     * 获取图文分享转发数据
     */
    public static final String WEIXIN_NEWS_USER_SHARE = "weixin.news.user.share";
    /**
     * 获取图文分享转发分时数据
     */
    public static final String WEIXIN_NEWS_USER_SHARE_HOUR = "weixin.news.user.share.hour";
    /**
     * 获取消息发送概况数据
     */
    public static final String WEIXIN_MSG_USTREAM_MSG = "weixin.msg.upstream.msg";
    /**
     * 获取消息分送分时数据
     */
    public static final String WEIXIN_MSG_USTREAM_MSG_HOUR = "weixin.msg.upstream.msg.hour";

    /**
     * 获取消息发送周数据
     */
    public static final String WEIXIN_MSG_UPSTREAM_MSG_WEEK = "weixin.msg.upstream.msg.week";
    /**
     * 获取消息发送月数据
     */
    public static final String WEIXIN_MSG_UPSTREAM_MSG_MONTH = "weixin.msg.upstream.msg.month";
    /**
     * 获取消息发送分布数据
     */
    public static final String WEIXIN_MSG_UPSTREAM_DIST = "weixin.msg.upstream.dist";
    /**
     * 获取消息发送分布周数据
     */
    public static final String WEIXIN_MSG_UPSTREAM_DIST_WEEK = "weixin.msg.upstream.dist.week";
    /**
     * 获取消息发送分布月数据
     */
    public static final String WEIXIN_MSG_UPSTREAM_DIST_MONTH = "weixin.msg.upstream.dist.month";
    /**
     * 获取接口分析数据
     */
    public static final String WEXIN_API_ANALYSIS_SUMMARY = "weixin.api.analysis.summary";
    /**
     * 获取接口分析分时数据
     */
    public static final String WEXIN_API_ANALYSIS_SUMMARY_HOUR = "weixin.api.analysis.summary.hour";

}
