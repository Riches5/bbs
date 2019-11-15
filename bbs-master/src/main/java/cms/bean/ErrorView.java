package cms.bean;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * 前台错误提示
 *
 */
public enum ErrorView {
	
	_1("路径来路错误"),
	_11("令牌为空"),
	_12("令牌过期"),
	_13("令牌错误"),
	_14("验证码参数错误"),
	_15("验证码错误"),
	_16("请输入验证码"),
	_17("验证码过期"),
	_18("密钥错误"),
	_20("字符超长"),
	
	/**-------------------------------- 评论 -----------------------------------**/	
	_101("内容不能为空"),
	_103("话题Id不能为空"),
	_104("引用评论不能为空"),
	_105("评论不存在"),
	_106("禁止评论"),
	_107("话题不存在"),
	_108("实名用户才允许评论"),
	_109("实名用户才允许提交话题"),
	_110("不允许提交话题"),
	_111("已发布话题才允许评论"),
	
	/**-------------------------------- 在线留言 -----------------------------------**/	
	_301("不能超过100个字符"),
	_302("名称不能为空"),
	_303("联系方式不能为空"),
	_304("内容不能为空"),
	_305("在线留言已关闭"),
	_306("字符超长"),
	
	/**-------------------------------- 修改用户 -----------------------------------**/	
	_801("密码长度错误"),
	_802("旧密码错误"),
	_803("旧密码不能为空"),
	_804("只允许输入数字"),
	_805("只允许输入字母"),
	_806("只允许输入数字和字母"),
	_807("只允许输入汉字"),
	_808("输入错误"),
	_809("必填项"),
	_810("修改用户失败"),
	_811("用户名称小于3个字符"),
	_812("用户名称大于25个字符"),
	_813("用户名只能输入由数字、26个英文字母或者下划线组成"),
	_814("该用户名已注册"),
	_815("用户名称不能为空"),
	_816("密码不能为空"),
	_817("密码提示问题不能超过50个字符"),
	_818("密码提示问题不能为空"),
	_819("密码提示答案长度错误"),
	_820("密码提示答案不能为空"),
	_821("邮箱地址不正确"),
	_822("邮箱地址不能超过60个字符"),
	_823("注册会员出错"),
	_824("禁止用户"),
	_825("用户名错误"),
	_826("密码错误"),
	_827("密码提示答案错误"),
	_828("找回密码错误"),
	_829("呢称不能超过15个字符"),
	_830("该呢称已存在"),
	_831("不允许修改呢称"),
	_832("该呢称不允许使用"),
	_833("呢称不能和其他用户名相同"),
	_850("手机验证码错误"),
	_851("手机号不能为空"),
	_852("手机验证码不能为空"),
	_853("手机号码不正确"),
	_854("手机号码超长"),
	_855("手机验证码超长"),
	_856("手机验证码不存在或已过期"),
	_857("手机号码不能重复绑定"),
	_858("你还没有绑定手机"),
	_859("用户不存在"),
	_860("新手机号码不能和旧用机号码相同"),
	_861("旧手机号码校验失败"),
	_862("不允许注册"),
	_863("该用户名不允许注册"),
	_910("用户不存在"),
	_1000("不允许给当前用户发私信"),
	_1010("不允许给自己发私信"),
	_1020("对方用户名称不能为空"),
	_1030("私信内容不能超过1000个字符"),
	_1040("私信内容不能为空"),
	_1050("删除私信失败"),
	_1100("订阅系统通知Id不能为空"),
	_1110("删除系统通知失败"),
	_1200("不能超过8位数字"),
	_1210("宽度必须大于0"),
	_1230("高度必须大于0"),
	_1250("X轴必须大于或等于0"),
	_1270("Y轴必须大于或等于0"),
	_1290("超出最大宽度"),
	_1300("超出最大高度"),
	_1310("当前文件类型不允许上传"),
	_1320("文件超出允许上传大小"),
	_1330("文件不能为空"),
	_1400("提醒不存在"),
	_1500("重复收藏"),
	_1510("话题收藏Id不能为空"),
	_1520("当前话题已经收藏"),
	_1530("收藏Id不存在"),
	_1540("删除收藏失败"),
	_1550("收藏不存在"),
	_1560("本收藏不属于当前用户"),
	_1600("话题重复取消隐藏"),
	_1610("当前话题已经取消隐藏"),
	_1620("隐藏标签不存在"),
	_1630("密码错误"),
	_1640("提交过于频繁，请稍后再提交"),
	_1650("密码不能为空"),
	_1660("话题内容不含当前标签"),
	_1670("用户不存在"),
	_1680("用户积分不足"),
	_1685("用户余额不足"),
	_1690("不允许解锁自已发表的话题"),
	_1700("重复点赞"),
	_1710("话题点赞Id不能为空"),
	_1720("当前话题已经点赞"),
	_1730("点赞Id不存在"),
	_1740("删除点赞失败"),
	_1750("点赞不存在"),
	_1760("本点赞不属于当前用户"),
	_1800("重复关注"),
	_1810("关注Id不能为空"),
	_1820("当前用户已关注对方"),
	_1830("关注Id不存在"),
	_1840("删除关注失败"),
	_1850("关注不存在"),
	_1860("本关注不属于当前用户"),
	_1870("不能关注自身"),
	_1900("规格Id不能为空"),
	_1910("规格不存在"),
	_1920("会员卡不存在"),
	_1930("会员卡已下架"),
	_1940("创建会员卡订单错误"),
	_1950("角色不存在"),
	_1960("库存不足"),
	_1970("积分不足"),
	_1980("预存款不足"),
	_1990("此规格已下架"),
	_2000("此会员卡已下架");
	
	
	private ErrorView(String content) {
        this.content = content;
    }
    /** 内容 **/
    private String content;

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	private static final Map<String,String> lookup = new HashMap<String,String>();
	static {
	    for(ErrorView s : EnumSet.allOf(ErrorView.class)){
	
	         lookup.put(s.name(), s.getContent());
	
	    }

	}
	public static String get(String code) { 
	
	    return lookup.get(code); 
	
	}

	
}
