/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: PABLO DANIEL(University of Almeria)
 * License Type: Academic
 */
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class VideoDAO {
	public static Video loadVideoByORMID(int IDmedia) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadVideoByORMID(session, IDmedia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video getVideoByORMID(int IDmedia) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getVideoByORMID(session, IDmedia);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video loadVideoByORMID(int IDmedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadVideoByORMID(session, IDmedia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video getVideoByORMID(int IDmedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getVideoByORMID(session, IDmedia, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video loadVideoByORMID(PersistentSession session, int IDmedia) throws PersistentException {
		try {
			return (Video) session.load(Video.class, new Integer(IDmedia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video getVideoByORMID(PersistentSession session, int IDmedia) throws PersistentException {
		try {
			return (Video) session.get(Video.class, new Integer(IDmedia));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video loadVideoByORMID(PersistentSession session, int IDmedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Video) session.load(Video.class, new Integer(IDmedia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video getVideoByORMID(PersistentSession session, int IDmedia, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Video) session.get(Video.class, new Integer(IDmedia), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVideo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryVideo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVideo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryVideo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video[] listVideoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listVideoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video[] listVideoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listVideoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVideo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Video as Video");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVideo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Video as Video");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Video", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video[] listVideoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVideo(session, condition, orderBy);
			return (Video[]) list.toArray(new Video[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video[] listVideoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVideo(session, condition, orderBy, lockMode);
			return (Video[]) list.toArray(new Video[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video loadVideoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadVideoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video loadVideoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadVideoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video loadVideoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Video[] videos = listVideoByQuery(session, condition, orderBy);
		if (videos != null && videos.length > 0)
			return videos[0];
		else
			return null;
	}
	
	public static Video loadVideoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Video[] videos = listVideoByQuery(session, condition, orderBy, lockMode);
		if (videos != null && videos.length > 0)
			return videos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVideoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateVideoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVideoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateVideoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVideoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Video as Video");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVideoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Video as Video");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Video", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video createVideo() {
		return new Video();
	}
	
	public static boolean save(Video video) throws PersistentException {
		try {
			MDS1PersistentManager.instance().saveObject(video);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Video video) throws PersistentException {
		try {
			MDS1PersistentManager.instance().deleteObject(video);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Video video)throws PersistentException {
		try {
			Mensaje[] lContiene_videos = video.contiene_video.toArray();
			for(int i = 0; i < lContiene_videos.length; i++) {
				lContiene_videos[i].setVideos(null);
			}
			return delete(video);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Video video, org.orm.PersistentSession session)throws PersistentException {
		try {
			Mensaje[] lContiene_videos = video.contiene_video.toArray();
			for(int i = 0; i < lContiene_videos.length; i++) {
				lContiene_videos[i].setVideos(null);
			}
			try {
				session.delete(video);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Video video) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().refresh(video);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Video video) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().evict(video);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video loadVideoByCriteria(VideoCriteria videoCriteria) {
		Video[] videos = listVideoByCriteria(videoCriteria);
		if(videos == null || videos.length == 0) {
			return null;
		}
		return videos[0];
	}
	
	public static Video[] listVideoByCriteria(VideoCriteria videoCriteria) {
		return videoCriteria.listVideo();
	}
}
