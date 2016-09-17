package org.tedu.cloudnote.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tedu.cloudnote.dao.NoteDao;
import org.tedu.cloudnote.dao.ShareDao;
import org.tedu.cloudnote.entity.Note;
import org.tedu.cloudnote.entity.Share;
import org.tedu.cloudnote.util.NoteResult;
import org.tedu.cloudnote.util.NoteUtil;
@Service("shareService")
@Transactional
public class ShareServiceImpl implements ShareService{
	@Resource
	private ShareDao shareDao;
	@Resource
	private NoteDao noteDao;
	public NoteResult shareNote(String noteId) {
		NoteResult result = new NoteResult();
		//检查笔记是否重复分享
		Share has_share = shareDao.findByNoteId(noteId);
		if(has_share!=null){
			result.setStatus(1);
			result.setMsg("笔记已分享");
			return result;
		}
		//分享操作
		Note note = noteDao.findById(noteId);
		Share share = new Share();
		share.setCn_note_id(noteId);//设置笔记ID
		//提取笔记的title和body
		share.setCn_share_body(note.getCn_note_body());//设置分享内容
		share.setCn_share_title(note.getCn_note_title());//设置 分享标题
		String shareId = NoteUtil.creatId();
		share.setCn_share_id(shareId);//设置分享ID
		shareDao.save(share);//添加分享记录
		result.setStatus(0);
		result.setMsg("分享成功");
		return result;
	}
	

}
