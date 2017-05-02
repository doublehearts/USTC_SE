package com.ustc.se.bbs.dao;

import java.util.TreeSet;

import com.ustc.se.bbs.entity.Message;


/**
 * 
 *MessageDao.java
 *@Author Administrator
 *CreateTime 下午11:26:16
 *Updater Administrator
 *UpdateTime 下午11:26:16
 */
public interface MessageDao {
	
	/**
	 * 根据messageID查询数据库中对应的message
	 * @param messageID
	 * @return
	 */
	public Message selectMessageByMessageID(int messageID);
	/**
	 * 选择数据库内所有站内信
	 * @return
	 */
	public TreeSet<Message> selectAllMessage();
	/**
	 * 过呢句用户ID选择其站内信
	 * @param UserID
	 * @return
	 */
	public TreeSet<Message> selectMessageByUserID(int UserID);
	/**
	 * 根据已读和未读状态选择站内信
	 * @param massageunread
	 * @return
	 */
	public TreeSet<Message> selectMessageByReadStatu(int massageunread);
	/**
	 * 增加一条站内信信息
	 * @param message
	 * @return
	 */
	public int addMessage(Message message);
	/**
	 * 修改站内信信息
	 * @param message
	 * @return
	 */
	public int updateMessage(Message message);
	/**
	 * 根据id删除数据库内站内信信息
	 * @param messageID
	 * @return
	 */
	public int deleteMessageByMeaasgeID(int messageID);
	/**
	 * 根据时间删除站内信
	 * @param time
	 * @return
	 */
	public int deleteMessageByTime(String time);
	/**
	 * 根据阅读状态删除站内信
	 * @param messageUnread
	 * @return
	 */
	public int deleteMessageUnread(int messageUnread);
	
	
}
