package com.sl.pojo;

import java.util.List;


public class MessageReply {
	private LeaveMessage leaveMessage;
	private List<Reply> replyList;
	public LeaveMessage getLeaveMessage() {
		return leaveMessage;
	}
	public void setLeaveMessage(LeaveMessage leaveMessage) {
		this.leaveMessage = leaveMessage;
	}
	public List<Reply> getReplyList() {
		return replyList;
	}
	public void setReplyList(List<Reply> replyList) {
		this.replyList = replyList;
	}
}
