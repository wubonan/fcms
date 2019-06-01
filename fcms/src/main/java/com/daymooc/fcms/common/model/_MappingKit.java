package com.daymooc.fcms.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("article_type", "id", ArticleType.class);
		arp.addMapping("auth_code", "id", AuthCode.class);
		// Composite Primary Key order: friendId,userId
		arp.addMapping("friend", "friendId,userId", Friend.class);
		arp.addMapping("friend_link", "id", FriendLink.class);
		// Composite Primary Key order: accountId,refId,refType
		arp.addMapping("like_message_log", "accountId,refId,refType", LikeMessageLog.class);
		arp.addMapping("login_log", "id", LoginLog.class);
		arp.addMapping("menu", "id", Menu.class);
		arp.addMapping("message", "id", Message.class);
		arp.addMapping("news_feed", "id", NewsFeed.class);
		arp.addMapping("post_type", "id", PostType.class);
		arp.addMapping("posts", "id", Posts.class);
		arp.addMapping("posts_comment", "id", PostsComment.class);
		// Composite Primary Key order: refId,userId
		arp.addMapping("posts_like", "refId,userId", PostsLike.class);
		arp.addMapping("refer_me", "id", ReferMe.class);
		arp.addMapping("remind", "accountId", Remind.class);
		arp.addMapping("role", "id", Role.class);
		arp.addMapping("sensitive_words", "id", SensitiveWords.class);
		arp.addMapping("session", "id", Session.class);
		arp.addMapping("site_info", "id", SiteInfo.class);
		arp.addMapping("tags", "id", Tags.class);
		arp.addMapping("upload_counter", "uploadType", UploadCounter.class);
		arp.addMapping("user", "id", User.class);
		arp.addMapping("users_open_oauth", "id", UsersOpenOauth.class);
	}
}

