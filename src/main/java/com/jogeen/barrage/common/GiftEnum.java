package com.jogeen.barrage.common;

/**
 * 礼物的枚举类型
 * @author jogeen
 * @version 1.0
 * @date 2018年10月18日
 */
public enum GiftEnum {
	ROSE("rose","玫瑰","感谢%s送来的一朵玫瑰"),CAR("car","跑车","感谢%s送出的辆跑车"),YACHT("Yacht","游艇","感谢%s送出的一艘游艇"),ROCKET("rocket","火箭","感谢%s送出的一发火箭");
	
	private String type;
	private String name;
	private String thanksMessage;
	private GiftEnum(String type, String name,String thanksMessage) {
		this.type=type;
		this.thanksMessage=thanksMessage;
		this.name=name;
	}
	public String getType() {
		return type;
	}
	
	public String getThanksMessage() {
		return thanksMessage;
	}
	
	public String getName() {
		return name;
	}
	public static GiftEnum getGiftByType(String type) {
		for (GiftEnum gift : GiftEnum.values()) {
			if(gift.getType().equals(type)) {
				return gift;
			}
		}
		return null;
	}
	
	public static String getThanksMessageByType(String type) {
		for (GiftEnum gift : GiftEnum.values()) {
			if(gift.getType().equals(type)) {
				return gift.getThanksMessage();
			}
		}
		return "";
	}
	
	public static String getNameMessageByType(String type) {
		for (GiftEnum gift : GiftEnum.values()) {
			if(gift.getType().equals(type)) {
				return gift.getName();
			}
		}
		return "";
	}
}
