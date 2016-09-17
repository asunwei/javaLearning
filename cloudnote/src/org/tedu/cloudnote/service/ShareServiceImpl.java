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
		//���ʼ��Ƿ��ظ�����
		Share has_share = shareDao.findByNoteId(noteId);
		if(has_share!=null){
			result.setStatus(1);
			result.setMsg("�ʼ��ѷ���");
			return result;
		}
		//�������
		Note note = noteDao.findById(noteId);
		Share share = new Share();
		share.setCn_note_id(noteId);//���ñʼ�ID
		//��ȡ�ʼǵ�title��body
		share.setCn_share_body(note.getCn_note_body());//���÷�������
		share.setCn_share_title(note.getCn_note_title());//���� �������
		String shareId = NoteUtil.creatId();
		share.setCn_share_id(shareId);//���÷���ID
		shareDao.save(share);//��ӷ����¼
		result.setStatus(0);
		result.setMsg("����ɹ�");
		return result;
	}
	

}
