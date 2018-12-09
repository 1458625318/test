/**
 * 
 * 
 * 创建时间：2016-11-22 下午3:16:54
 * @author：moshco zhu
 */
package cn.jbit.webbs.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.jbit.webbs.entity.Advert;
import cn.jbit.webbs.entity.AdvertAttachment;
import cn.jbit.webbs.entity.Announcement;
import cn.jbit.webbs.entity.BackupRecord;
import cn.jbit.webbs.entity.Book;
import cn.jbit.webbs.entity.BookBargain;
import cn.jbit.webbs.entity.BookBestseller;
import cn.jbit.webbs.entity.BookBestsellerSort;
import cn.jbit.webbs.entity.BookBookClassification;
import cn.jbit.webbs.entity.BookClassification;
import cn.jbit.webbs.entity.BookComment;
import cn.jbit.webbs.entity.BookCommentReply;
import cn.jbit.webbs.entity.BookHomePage;
import cn.jbit.webbs.entity.BookKeywords;
import cn.jbit.webbs.entity.BookPicture;
import cn.jbit.webbs.entity.BookSale;
import cn.jbit.webbs.entity.BookSalesDetail;
import cn.jbit.webbs.entity.BookTranslator;
import cn.jbit.webbs.entity.CommentHot;
import cn.jbit.webbs.entity.CommentRecommend;
import cn.jbit.webbs.entity.CooperationApply;
import cn.jbit.webbs.entity.Customer;
import cn.jbit.webbs.entity.CustomerAddress;
import cn.jbit.webbs.entity.Department;
import cn.jbit.webbs.entity.Employee;
import cn.jbit.webbs.entity.LeaveMessage;
import cn.jbit.webbs.entity.RegisterPassword;
import cn.jbit.webbs.entity.SaleOrder;
import cn.jbit.webbs.entity.SaleOrderDetail;
import cn.jbit.webbs.entity.StaticContent;
import cn.jbit.webbs.entity.StaticContentAttachment;
import cn.jbit.webbs.entity.SysAuthority;
import cn.jbit.webbs.entity.SysMenuOption;
import cn.jbit.webbs.entity.SysRole;
import cn.jbit.webbs.entity.SysRoleAuthority;
import cn.jbit.webbs.entity.SysUser;
import cn.jbit.webbs.entity.SysUserGroup;
import cn.jbit.webbs.entity.SysUserGroupRole;
import cn.jbit.webbs.entity.SysUserUserGroup;
import cn.jbit.webbs.entity.UserEnableRecord;
import cn.jbit.webbs.entity.VerifyCode;

/**
 * 公共业务（业务有关）
 * 
 * 创建时间：2016-11-22 下午3:16:54
 * 
 * @author moshco zhu
 * 
 */
@Repository
public interface WebBookStoreBaseDao extends Serializable {

	/**
	 * 新建广告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param advert
	 *            被保存的实体对象
	 * @return
	 */
	public void saveAdvert(Advert advert);

	/**
	 * 找寻广告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param advertId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public Advert findAdvert(Integer advertId);

	/**
	 * 更新广告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param advert
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateAdvert(Advert advert);

	/**
	 * 动态更新广告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param advert
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateAdvert2(Advert advert);

	/**
	 * 删除广告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param advert
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteAdvert(Advert advert);

	/**
	 * 查询广告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<Advert> queryAdvert(Map<String, Object> queryParamMap);

	/**
	 * 找寻广告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Advert findAdvert2(Map<String, Object> queryParamMap);

	/**
	 * 找寻广告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public Advert findAdvert3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询广告表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationAdvertCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询广告表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<Advert> queryPaginationAdvertList(Map<String, Object> queryParamMap);

	/**
	 * 新建广告附件表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param advertAttachment
	 *            被保存的实体对象
	 * @return
	 */
	public void saveAdvertAttachment(AdvertAttachment advertAttachment);

	/**
	 * 找寻广告附件表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param advertAttachmentId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public AdvertAttachment findAdvertAttachment(Integer advertAttachmentId);

	/**
	 * 更新广告附件表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param advertAttachment
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateAdvertAttachment(AdvertAttachment advertAttachment);

	/**
	 * 动态更新广告附件表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param advertAttachment
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateAdvertAttachment2(AdvertAttachment advertAttachment);

	/**
	 * 删除广告附件表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param advertAttachment
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteAdvertAttachment(AdvertAttachment advertAttachment);

	/**
	 * 查询广告附件表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<AdvertAttachment> queryAdvertAttachment(Map<String, Object> queryParamMap);

	/**
	 * 找寻广告附件表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public AdvertAttachment findAdvertAttachment2(Map<String, Object> queryParamMap);

	/**
	 * 找寻广告附件表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public AdvertAttachment findAdvertAttachment3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询广告附件表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationAdvertAttachmentCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询广告附件表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<AdvertAttachment> queryPaginationAdvertAttachmentList(Map<String, Object> queryParamMap);

	/**
	 * 新建公告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param announcement
	 *            被保存的实体对象
	 * @return
	 */
	public void saveAnnouncement(Announcement announcement);

	/**
	 * 找寻公告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param announcementId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public Announcement findAnnouncement(Integer announcementId);

	/**
	 * 更新公告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param announcement
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateAnnouncement(Announcement announcement);

	/**
	 * 动态更新公告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param announcement
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateAnnouncement2(Announcement announcement);

	/**
	 * 删除公告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param announcement
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteAnnouncement(Announcement announcement);

	/**
	 * 查询公告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<Announcement> queryAnnouncement(Map<String, Object> queryParamMap);

	/**
	 * 找寻公告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Announcement findAnnouncement2(Map<String, Object> queryParamMap);

	/**
	 * 找寻公告表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public Announcement findAnnouncement3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询公告表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationAnnouncementCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询公告表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<Announcement> queryPaginationAnnouncementList(Map<String, Object> queryParamMap);

	/**
	 * 新建系统备份记录的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param backupRecord
	 *            被保存的实体对象
	 * @return
	 */
	public void saveBackupRecord(BackupRecord backupRecord);

	/**
	 * 找寻系统备份记录的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param backupRecordId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public BackupRecord findBackupRecord(Integer backupRecordId);

	/**
	 * 更新系统备份记录的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param backupRecord
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBackupRecord(BackupRecord backupRecord);

	/**
	 * 动态更新系统备份记录的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param backupRecord
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBackupRecord2(BackupRecord backupRecord);

	/**
	 * 删除系统备份记录的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param backupRecord
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteBackupRecord(BackupRecord backupRecord);

	/**
	 * 查询系统备份记录的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<BackupRecord> queryBackupRecord(Map<String, Object> queryParamMap);

	/**
	 * 找寻系统备份记录的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public BackupRecord findBackupRecord2(Map<String, Object> queryParamMap);

	/**
	 * 找寻系统备份记录的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public BackupRecord findBackupRecord3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询系统备份记录的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationBackupRecordCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询系统备份记录的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<BackupRecord> queryPaginationBackupRecordList(Map<String, Object> queryParamMap);

	/**
	 * 新建图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param book
	 *            被保存的实体对象
	 * @return
	 */
	public void saveBook(Book book);

	/**
	 * 找寻图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public Book findBook(Integer bookId);

	/**
	 * 更新图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param book
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBook(Book book);

	/**
	 * 动态更新图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param book
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBook2(Book book);

	/**
	 * 删除图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param book
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteBook(Book book);

	/**
	 * 查询图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<Book> queryBook(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Book findBook2(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public Book findBook3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询图书表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationBookCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询图书表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<Book> queryPaginationBookList(Map<String, Object> queryParamMap);

	/**
	 * 新建特价书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBargain
	 *            被保存的实体对象
	 * @return
	 */
	public void saveBookBargain(BookBargain bookBargain);

	/**
	 * 找寻特价书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBargainId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public BookBargain findBookBargain(Integer bookBargainId);

	/**
	 * 更新特价书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBargain
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookBargain(BookBargain bookBargain);

	/**
	 * 动态更新特价书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBargain
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookBargain2(BookBargain bookBargain);

	/**
	 * 删除特价书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBargain
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteBookBargain(BookBargain bookBargain);

	/**
	 * 查询特价书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<BookBargain> queryBookBargain(Map<String, Object> queryParamMap);

	/**
	 * 找寻特价书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public BookBargain findBookBargain2(Map<String, Object> queryParamMap);

	/**
	 * 找寻特价书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public BookBargain findBookBargain3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询特价书的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationBookBargainCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询特价书的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<BookBargain> queryPaginationBookBargainList(Map<String, Object> queryParamMap);

	/**
	 * 新建图书畅销榜表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBestseller
	 *            被保存的实体对象
	 * @return
	 */
	public void saveBookBestseller(BookBestseller bookBestseller);

	/**
	 * 找寻图书畅销榜表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBestsellerId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public BookBestseller findBookBestseller(Integer bookBestsellerId);

	/**
	 * 更新图书畅销榜表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBestseller
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookBestseller(BookBestseller bookBestseller);

	/**
	 * 动态更新图书畅销榜表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBestseller
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookBestseller2(BookBestseller bookBestseller);

	/**
	 * 删除图书畅销榜表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBestseller
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteBookBestseller(BookBestseller bookBestseller);

	/**
	 * 查询图书畅销榜表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<BookBestseller> queryBookBestseller(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书畅销榜表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public BookBestseller findBookBestseller2(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书畅销榜表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public BookBestseller findBookBestseller3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询图书畅销榜表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationBookBestsellerCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询图书畅销榜表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<BookBestseller> queryPaginationBookBestsellerList(Map<String, Object> queryParamMap);

	/**
	 * 新建图书畅销榜分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBestsellerSort
	 *            被保存的实体对象
	 * @return
	 */
	public void saveBookBestsellerSort(BookBestsellerSort bookBestsellerSort);

	/**
	 * 找寻图书畅销榜分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBestsellerSortId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public BookBestsellerSort findBookBestsellerSort(Integer bookBestsellerSortId);

	/**
	 * 更新图书畅销榜分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBestsellerSort
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookBestsellerSort(BookBestsellerSort bookBestsellerSort);

	/**
	 * 动态更新图书畅销榜分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBestsellerSort
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookBestsellerSort2(BookBestsellerSort bookBestsellerSort);

	/**
	 * 删除图书畅销榜分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBestsellerSort
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteBookBestsellerSort(BookBestsellerSort bookBestsellerSort);

	/**
	 * 查询图书畅销榜分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<BookBestsellerSort> queryBookBestsellerSort(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书畅销榜分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public BookBestsellerSort findBookBestsellerSort2(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书畅销榜分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public BookBestsellerSort findBookBestsellerSort3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询图书畅销榜分类表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationBookBestsellerSortCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询图书畅销榜分类表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<BookBestsellerSort> queryPaginationBookBestsellerSortList(Map<String, Object> queryParamMap);

	/**
	 * 新建图书和图书分类的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBookClassification
	 *            被保存的实体对象
	 * @return
	 */
	public void saveBookBookClassification(BookBookClassification bookBookClassification);

	/**
	 * 找寻图书和图书分类的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBookClassificationId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public BookBookClassification findBookBookClassification(Integer bookBookClassificationId);

	/**
	 * 更新图书和图书分类的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBookClassification
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookBookClassification(BookBookClassification bookBookClassification);

	/**
	 * 动态更新图书和图书分类的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBookClassification
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookBookClassification2(BookBookClassification bookBookClassification);

	/**
	 * 删除图书和图书分类的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookBookClassification
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteBookBookClassification(BookBookClassification bookBookClassification);

	/**
	 * 查询图书和图书分类的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<BookBookClassification> queryBookBookClassification(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书和图书分类的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public BookBookClassification findBookBookClassification2(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书和图书分类的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public BookBookClassification findBookBookClassification3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询图书和图书分类的关系表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationBookBookClassificationCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询图书和图书分类的关系表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<BookBookClassification> queryPaginationBookBookClassificationList(Map<String, Object> queryParamMap);

	/**
	 * 新建图书分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookClassification
	 *            被保存的实体对象
	 * @return
	 */
	public void saveBookClassification(BookClassification bookClassification);

	/**
	 * 找寻图书分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookClassificationId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public BookClassification findBookClassification(Integer bookClassificationId);

	/**
	 * 更新图书分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookClassification
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookClassification(BookClassification bookClassification);

	/**
	 * 动态更新图书分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookClassification
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookClassification2(BookClassification bookClassification);

	/**
	 * 删除图书分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookClassification
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteBookClassification(BookClassification bookClassification);

	/**
	 * 查询图书分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<BookClassification> queryBookClassification(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public BookClassification findBookClassification2(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书分类表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public BookClassification findBookClassification3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询图书分类表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationBookClassificationCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询图书分类表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<BookClassification> queryPaginationBookClassificationList(Map<String, Object> queryParamMap);

	/**
	 * 新建图书评论表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookComment
	 *            被保存的实体对象
	 * @return
	 */
	public void saveBookComment(BookComment bookComment);

	/**
	 * 找寻图书评论表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookCommentId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public BookComment findBookComment(Integer bookCommentId);

	/**
	 * 更新图书评论表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookComment
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookComment(BookComment bookComment);

	/**
	 * 动态更新图书评论表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookComment
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookComment2(BookComment bookComment);

	/**
	 * 删除图书评论表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookComment
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteBookComment(BookComment bookComment);

	/**
	 * 查询图书评论表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<BookComment> queryBookComment(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书评论表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public BookComment findBookComment2(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书评论表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public BookComment findBookComment3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询图书评论表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationBookCommentCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询图书评论表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<BookComment> queryPaginationBookCommentList(Map<String, Object> queryParamMap);

	/**
	 * 新建图书评论回复表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookCommentReply
	 *            被保存的实体对象
	 * @return
	 */
	public void saveBookCommentReply(BookCommentReply bookCommentReply);

	/**
	 * 找寻图书评论回复表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookCommentReplyId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public BookCommentReply findBookCommentReply(Integer bookCommentReplyId);

	/**
	 * 更新图书评论回复表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookCommentReply
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookCommentReply(BookCommentReply bookCommentReply);

	/**
	 * 动态更新图书评论回复表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookCommentReply
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookCommentReply2(BookCommentReply bookCommentReply);

	/**
	 * 删除图书评论回复表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookCommentReply
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteBookCommentReply(BookCommentReply bookCommentReply);

	/**
	 * 查询图书评论回复表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<BookCommentReply> queryBookCommentReply(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书评论回复表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public BookCommentReply findBookCommentReply2(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书评论回复表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public BookCommentReply findBookCommentReply3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询图书评论回复表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationBookCommentReplyCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询图书评论回复表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<BookCommentReply> queryPaginationBookCommentReplyList(Map<String, Object> queryParamMap);

	/**
	 * 新建主页推荐图书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookHomePage
	 *            被保存的实体对象
	 * @return
	 */
	public void saveBookHomePage(BookHomePage bookHomePage);

	/**
	 * 找寻主页推荐图书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookHomePageId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public BookHomePage findBookHomePage(Integer bookHomePageId);

	/**
	 * 更新主页推荐图书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookHomePage
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookHomePage(BookHomePage bookHomePage);

	/**
	 * 动态更新主页推荐图书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookHomePage
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookHomePage2(BookHomePage bookHomePage);

	/**
	 * 删除主页推荐图书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookHomePage
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteBookHomePage(BookHomePage bookHomePage);

	/**
	 * 查询主页推荐图书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<BookHomePage> queryBookHomePage(Map<String, Object> queryParamMap);

	/**
	 * 找寻主页推荐图书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public BookHomePage findBookHomePage2(Map<String, Object> queryParamMap);

	/**
	 * 找寻主页推荐图书的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public BookHomePage findBookHomePage3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询主页推荐图书的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationBookHomePageCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询主页推荐图书的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<BookHomePage> queryPaginationBookHomePageList(Map<String, Object> queryParamMap);

	/**
	 * 新建图书的关键字表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookKeywords
	 *            被保存的实体对象
	 * @return
	 */
	public void saveBookKeywords(BookKeywords bookKeywords);

	/**
	 * 找寻图书的关键字表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookKeywordsId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public BookKeywords findBookKeywords(Integer bookKeywordsId);

	/**
	 * 更新图书的关键字表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookKeywords
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookKeywords(BookKeywords bookKeywords);

	/**
	 * 动态更新图书的关键字表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookKeywords
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookKeywords2(BookKeywords bookKeywords);

	/**
	 * 删除图书的关键字表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookKeywords
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteBookKeywords(BookKeywords bookKeywords);

	/**
	 * 查询图书的关键字表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<BookKeywords> queryBookKeywords(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书的关键字表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public BookKeywords findBookKeywords2(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书的关键字表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public BookKeywords findBookKeywords3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询图书的关键字表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationBookKeywordsCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询图书的关键字表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<BookKeywords> queryPaginationBookKeywordsList(Map<String, Object> queryParamMap);

	/**
	 * 新建图书图片表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookPicture
	 *            被保存的实体对象
	 * @return
	 */
	public void saveBookPicture(BookPicture bookPicture);

	/**
	 * 找寻图书图片表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookPictureId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public BookPicture findBookPicture(Integer bookPictureId);

	/**
	 * 更新图书图片表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookPicture
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookPicture(BookPicture bookPicture);

	/**
	 * 动态更新图书图片表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookPicture
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookPicture2(BookPicture bookPicture);

	/**
	 * 删除图书图片表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookPicture
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteBookPicture(BookPicture bookPicture);

	/**
	 * 查询图书图片表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<BookPicture> queryBookPicture(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书图片表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public BookPicture findBookPicture2(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书图片表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public BookPicture findBookPicture3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询图书图片表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationBookPictureCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询图书图片表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<BookPicture> queryPaginationBookPictureList(Map<String, Object> queryParamMap);

	/**
	 * 新建促销书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookSale
	 *            被保存的实体对象
	 * @return
	 */
	public void saveBookSale(BookSale bookSale);

	/**
	 * 找寻促销书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookSaleId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public BookSale findBookSale(Integer bookSaleId);

	/**
	 * 更新促销书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookSale
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookSale(BookSale bookSale);

	/**
	 * 动态更新促销书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookSale
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookSale2(BookSale bookSale);

	/**
	 * 删除促销书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookSale
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteBookSale(BookSale bookSale);

	/**
	 * 查询促销书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<BookSale> queryBookSale(Map<String, Object> queryParamMap);

	/**
	 * 找寻促销书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public BookSale findBookSale2(Map<String, Object> queryParamMap);

	/**
	 * 找寻促销书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public BookSale findBookSale3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询促销书表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationBookSaleCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询促销书表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<BookSale> queryPaginationBookSaleList(Map<String, Object> queryParamMap);

	/**
	 * 新建促销书附赠商品表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookSalesDetail
	 *            被保存的实体对象
	 * @return
	 */
	public void saveBookSalesDetail(BookSalesDetail bookSalesDetail);

	/**
	 * 找寻促销书附赠商品表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookSalesDetailId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public BookSalesDetail findBookSalesDetail(Integer bookSalesDetailId);

	/**
	 * 更新促销书附赠商品表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookSalesDetail
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookSalesDetail(BookSalesDetail bookSalesDetail);

	/**
	 * 动态更新促销书附赠商品表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookSalesDetail
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookSalesDetail2(BookSalesDetail bookSalesDetail);

	/**
	 * 删除促销书附赠商品表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookSalesDetail
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteBookSalesDetail(BookSalesDetail bookSalesDetail);

	/**
	 * 查询促销书附赠商品表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<BookSalesDetail> queryBookSalesDetail(Map<String, Object> queryParamMap);

	/**
	 * 找寻促销书附赠商品表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public BookSalesDetail findBookSalesDetail2(Map<String, Object> queryParamMap);

	/**
	 * 找寻促销书附赠商品表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public BookSalesDetail findBookSalesDetail3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询促销书附赠商品表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationBookSalesDetailCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询促销书附赠商品表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<BookSalesDetail> queryPaginationBookSalesDetailList(Map<String, Object> queryParamMap);

	/**
	 * 新建图书作译者表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookTranslator
	 *            被保存的实体对象
	 * @return
	 */
	public void saveBookTranslator(BookTranslator bookTranslator);

	/**
	 * 找寻图书作译者表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookTranslatorId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public BookTranslator findBookTranslator(Integer bookTranslatorId);

	/**
	 * 更新图书作译者表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookTranslator
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookTranslator(BookTranslator bookTranslator);

	/**
	 * 动态更新图书作译者表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookTranslator
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateBookTranslator2(BookTranslator bookTranslator);

	/**
	 * 删除图书作译者表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param bookTranslator
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteBookTranslator(BookTranslator bookTranslator);

	/**
	 * 查询图书作译者表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<BookTranslator> queryBookTranslator(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书作译者表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public BookTranslator findBookTranslator2(Map<String, Object> queryParamMap);

	/**
	 * 找寻图书作译者表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public BookTranslator findBookTranslator3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询图书作译者表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationBookTranslatorCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询图书作译者表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<BookTranslator> queryPaginationBookTranslatorList(Map<String, Object> queryParamMap);

	/**
	 * 新建热评图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param commentHot
	 *            被保存的实体对象
	 * @return
	 */
	public void saveCommentHot(CommentHot commentHot);

	/**
	 * 找寻热评图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param commentHotId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public CommentHot findCommentHot(Integer commentHotId);

	/**
	 * 更新热评图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param commentHot
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateCommentHot(CommentHot commentHot);

	/**
	 * 动态更新热评图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param commentHot
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateCommentHot2(CommentHot commentHot);

	/**
	 * 删除热评图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param commentHot
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteCommentHot(CommentHot commentHot);

	/**
	 * 查询热评图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<CommentHot> queryCommentHot(Map<String, Object> queryParamMap);

	/**
	 * 找寻热评图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public CommentHot findCommentHot2(Map<String, Object> queryParamMap);

	/**
	 * 找寻热评图书表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public CommentHot findCommentHot3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询热评图书表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationCommentHotCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询热评图书表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<CommentHot> queryPaginationCommentHotList(Map<String, Object> queryParamMap);

	/**
	 * 新建推荐书评表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param commentRecommend
	 *            被保存的实体对象
	 * @return
	 */
	public void saveCommentRecommend(CommentRecommend commentRecommend);

	/**
	 * 找寻推荐书评表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param commentRecommendId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public CommentRecommend findCommentRecommend(Integer commentRecommendId);

	/**
	 * 更新推荐书评表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param commentRecommend
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateCommentRecommend(CommentRecommend commentRecommend);

	/**
	 * 动态更新推荐书评表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param commentRecommend
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateCommentRecommend2(CommentRecommend commentRecommend);

	/**
	 * 删除推荐书评表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param commentRecommend
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteCommentRecommend(CommentRecommend commentRecommend);

	/**
	 * 查询推荐书评表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<CommentRecommend> queryCommentRecommend(Map<String, Object> queryParamMap);

	/**
	 * 找寻推荐书评表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public CommentRecommend findCommentRecommend2(Map<String, Object> queryParamMap);

	/**
	 * 找寻推荐书评表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public CommentRecommend findCommentRecommend3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询推荐书评表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationCommentRecommendCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询推荐书评表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<CommentRecommend> queryPaginationCommentRecommendList(Map<String, Object> queryParamMap);

	/**
	 * 新建合作商加盟申请表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param cooperationApply
	 *            被保存的实体对象
	 * @return
	 */
	public void saveCooperationApply(CooperationApply cooperationApply);

	/**
	 * 找寻合作商加盟申请表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param cooperationApplyId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public CooperationApply findCooperationApply(Integer cooperationApplyId);

	/**
	 * 更新合作商加盟申请表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param cooperationApply
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateCooperationApply(CooperationApply cooperationApply);

	/**
	 * 动态更新合作商加盟申请表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param cooperationApply
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateCooperationApply2(CooperationApply cooperationApply);

	/**
	 * 删除合作商加盟申请表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param cooperationApply
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteCooperationApply(CooperationApply cooperationApply);

	/**
	 * 查询合作商加盟申请表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<CooperationApply> queryCooperationApply(Map<String, Object> queryParamMap);

	/**
	 * 找寻合作商加盟申请表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public CooperationApply findCooperationApply2(Map<String, Object> queryParamMap);

	/**
	 * 找寻合作商加盟申请表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public CooperationApply findCooperationApply3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询合作商加盟申请表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationCooperationApplyCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询合作商加盟申请表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<CooperationApply> queryPaginationCooperationApplyList(Map<String, Object> queryParamMap);

	/**
	 * 新建客户表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param customer
	 *            被保存的实体对象
	 * @return
	 */
	public void saveCustomer(Customer customer);

	/**
	 * 找寻客户表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param customerId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public Customer findCustomer(Integer customerId);

	/**
	 * 更新客户表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param customer
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateCustomer(Customer customer);

	/**
	 * 动态更新客户表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param customer
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateCustomer2(Customer customer);

	/**
	 * 删除客户表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param customer
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteCustomer(Customer customer);

	/**
	 * 查询客户表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<Customer> queryCustomer(Map<String, Object> queryParamMap);

	/**
	 * 找寻客户表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Customer findCustomer2(Map<String, Object> queryParamMap);

	/**
	 * 找寻客户表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public Customer findCustomer3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询客户表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationCustomerCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询客户表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<Customer> queryPaginationCustomerList(Map<String, Object> queryParamMap);

	/**
	 * 新建客户地址表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param customerAddress
	 *            被保存的实体对象
	 * @return
	 */
	public void saveCustomerAddress(CustomerAddress customerAddress);

	/**
	 * 找寻客户地址表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param customerAddressId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public CustomerAddress findCustomerAddress(Integer customerAddressId);

	/**
	 * 更新客户地址表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param customerAddress
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateCustomerAddress(CustomerAddress customerAddress);

	/**
	 * 动态更新客户地址表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param customerAddress
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateCustomerAddress2(CustomerAddress customerAddress);

	/**
	 * 删除客户地址表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param customerAddress
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteCustomerAddress(CustomerAddress customerAddress);

	/**
	 * 查询客户地址表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<CustomerAddress> queryCustomerAddress(Map<String, Object> queryParamMap);

	/**
	 * 找寻客户地址表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public CustomerAddress findCustomerAddress2(Map<String, Object> queryParamMap);

	/**
	 * 找寻客户地址表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public CustomerAddress findCustomerAddress3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询客户地址表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationCustomerAddressCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询客户地址表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<CustomerAddress> queryPaginationCustomerAddressList(Map<String, Object> queryParamMap);

	/**
	 * 新建部门表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param department
	 *            被保存的实体对象
	 * @return
	 */
	public void saveDepartment(Department department);

	/**
	 * 找寻部门表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param departmentId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public Department findDepartment(Integer departmentId);

	/**
	 * 更新部门表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param department
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateDepartment(Department department);

	/**
	 * 动态更新部门表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param department
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateDepartment2(Department department);

	/**
	 * 删除部门表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param department
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteDepartment(Department department);

	/**
	 * 查询部门表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<Department> queryDepartment(Map<String, Object> queryParamMap);

	/**
	 * 找寻部门表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Department findDepartment2(Map<String, Object> queryParamMap);

	/**
	 * 找寻部门表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public Department findDepartment3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询部门表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationDepartmentCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询部门表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<Department> queryPaginationDepartmentList(Map<String, Object> queryParamMap);

	/**
	 * 新建员工表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param employee
	 *            被保存的实体对象
	 * @return
	 */
	public void saveEmployee(Employee employee);

	/**
	 * 找寻员工表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param employeeId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public Employee findEmployee(Integer employeeId);

	/**
	 * 更新员工表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param employee
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateEmployee(Employee employee);

	/**
	 * 动态更新员工表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param employee
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateEmployee2(Employee employee);

	/**
	 * 删除员工表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param employee
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteEmployee(Employee employee);

	/**
	 * 查询员工表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<Employee> queryEmployee(Map<String, Object> queryParamMap);

	/**
	 * 找寻员工表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Employee findEmployee2(Map<String, Object> queryParamMap);

	/**
	 * 找寻员工表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public Employee findEmployee3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询员工表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationEmployeeCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询员工表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<Employee> queryPaginationEmployeeList(Map<String, Object> queryParamMap);

	/**
	 * 新建留言板的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param leaveMessage
	 *            被保存的实体对象
	 * @return
	 */
	public void saveLeaveMessage(LeaveMessage leaveMessage);

	/**
	 * 找寻留言板的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param leaveMessageId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public LeaveMessage findLeaveMessage(Integer leaveMessageId);

	/**
	 * 更新留言板的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param leaveMessage
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateLeaveMessage(LeaveMessage leaveMessage);

	/**
	 * 动态更新留言板的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param leaveMessage
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateLeaveMessage2(LeaveMessage leaveMessage);

	/**
	 * 删除留言板的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param leaveMessage
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteLeaveMessage(LeaveMessage leaveMessage);

	/**
	 * 查询留言板的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<LeaveMessage> queryLeaveMessage(Map<String, Object> queryParamMap);

	/**
	 * 找寻留言板的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public LeaveMessage findLeaveMessage2(Map<String, Object> queryParamMap);

	/**
	 * 找寻留言板的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public LeaveMessage findLeaveMessage3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询留言板的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationLeaveMessageCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询留言板的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<LeaveMessage> queryPaginationLeaveMessageList(Map<String, Object> queryParamMap);

	/**
	 * 新建注册密码的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param registerPassword
	 *            被保存的实体对象
	 * @return
	 */
	public void saveRegisterPassword(RegisterPassword registerPassword);

	/**
	 * 找寻注册密码的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param registerPasswordId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public RegisterPassword findRegisterPassword(Integer registerPasswordId);

	/**
	 * 更新注册密码的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param registerPassword
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateRegisterPassword(RegisterPassword registerPassword);

	/**
	 * 动态更新注册密码的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param registerPassword
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateRegisterPassword2(RegisterPassword registerPassword);

	/**
	 * 删除注册密码的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param registerPassword
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteRegisterPassword(RegisterPassword registerPassword);

	/**
	 * 查询注册密码的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<RegisterPassword> queryRegisterPassword(Map<String, Object> queryParamMap);

	/**
	 * 找寻注册密码的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public RegisterPassword findRegisterPassword2(Map<String, Object> queryParamMap);

	/**
	 * 找寻注册密码的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public RegisterPassword findRegisterPassword3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询注册密码的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationRegisterPasswordCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询注册密码的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<RegisterPassword> queryPaginationRegisterPasswordList(Map<String, Object> queryParamMap);

	/**
	 * 新建订单表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param saleOrder
	 *            被保存的实体对象
	 * @return
	 */
	public void saveSaleOrder(SaleOrder saleOrder);

	/**
	 * 找寻订单表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param saleOrderId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public SaleOrder findSaleOrder(Integer saleOrderId);

	/**
	 * 更新订单表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param saleOrder
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSaleOrder(SaleOrder saleOrder);

	/**
	 * 动态更新订单表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param saleOrder
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSaleOrder2(SaleOrder saleOrder);

	/**
	 * 删除订单表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param saleOrder
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteSaleOrder(SaleOrder saleOrder);

	/**
	 * 查询订单表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<SaleOrder> querySaleOrder(Map<String, Object> queryParamMap);

	/**
	 * 找寻订单表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public SaleOrder findSaleOrder2(Map<String, Object> queryParamMap);

	/**
	 * 找寻订单表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public SaleOrder findSaleOrder3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询订单表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationSaleOrderCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询订单表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<SaleOrder> queryPaginationSaleOrderList(Map<String, Object> queryParamMap);

	/**
	 * 新建订单明细表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param saleOrderDetail
	 *            被保存的实体对象
	 * @return
	 */
	public void saveSaleOrderDetail(SaleOrderDetail saleOrderDetail);

	/**
	 * 找寻订单明细表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param saleOrderDetailId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public SaleOrderDetail findSaleOrderDetail(Integer saleOrderDetailId);

	/**
	 * 更新订单明细表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param saleOrderDetail
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSaleOrderDetail(SaleOrderDetail saleOrderDetail);

	/**
	 * 动态更新订单明细表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param saleOrderDetail
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSaleOrderDetail2(SaleOrderDetail saleOrderDetail);

	/**
	 * 删除订单明细表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param saleOrderDetail
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteSaleOrderDetail(SaleOrderDetail saleOrderDetail);

	/**
	 * 查询订单明细表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<SaleOrderDetail> querySaleOrderDetail(Map<String, Object> queryParamMap);

	/**
	 * 找寻订单明细表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public SaleOrderDetail findSaleOrderDetail2(Map<String, Object> queryParamMap);

	/**
	 * 找寻订单明细表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public SaleOrderDetail findSaleOrderDetail3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询订单明细表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationSaleOrderDetailCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询订单明细表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<SaleOrderDetail> queryPaginationSaleOrderDetailList(Map<String, Object> queryParamMap);

	/**
	 * 新建静态内容的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param staticContent
	 *            被保存的实体对象
	 * @return
	 */
	public void saveStaticContent(StaticContent staticContent);

	/**
	 * 找寻静态内容的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param staticContentId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public StaticContent findStaticContent(Integer staticContentId);

	/**
	 * 更新静态内容的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param staticContent
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateStaticContent(StaticContent staticContent);

	/**
	 * 动态更新静态内容的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param staticContent
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateStaticContent2(StaticContent staticContent);

	/**
	 * 删除静态内容的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param staticContent
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteStaticContent(StaticContent staticContent);

	/**
	 * 查询静态内容的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<StaticContent> queryStaticContent(Map<String, Object> queryParamMap);

	/**
	 * 找寻静态内容的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public StaticContent findStaticContent2(Map<String, Object> queryParamMap);

	/**
	 * 找寻静态内容的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public StaticContent findStaticContent3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询静态内容的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationStaticContentCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询静态内容的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<StaticContent> queryPaginationStaticContentList(Map<String, Object> queryParamMap);

	/**
	 * 新建静态内容附件的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param staticContentAttachment
	 *            被保存的实体对象
	 * @return
	 */
	public void saveStaticContentAttachment(StaticContentAttachment staticContentAttachment);

	/**
	 * 找寻静态内容附件的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param staticContentAttachmentId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public StaticContentAttachment findStaticContentAttachment(Integer staticContentAttachmentId);

	/**
	 * 更新静态内容附件的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param staticContentAttachment
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateStaticContentAttachment(StaticContentAttachment staticContentAttachment);

	/**
	 * 动态更新静态内容附件的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param staticContentAttachment
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateStaticContentAttachment2(StaticContentAttachment staticContentAttachment);

	/**
	 * 删除静态内容附件的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param staticContentAttachment
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteStaticContentAttachment(StaticContentAttachment staticContentAttachment);

	/**
	 * 查询静态内容附件的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<StaticContentAttachment> queryStaticContentAttachment(Map<String, Object> queryParamMap);

	/**
	 * 找寻静态内容附件的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public StaticContentAttachment findStaticContentAttachment2(Map<String, Object> queryParamMap);

	/**
	 * 找寻静态内容附件的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public StaticContentAttachment findStaticContentAttachment3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询静态内容附件的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationStaticContentAttachmentCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询静态内容附件的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<StaticContentAttachment> queryPaginationStaticContentAttachmentList(Map<String, Object> queryParamMap);

	/**
	 * 新建系统权限表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysAuthority
	 *            被保存的实体对象
	 * @return
	 */
	public void saveSysAuthority(SysAuthority sysAuthority);

	/**
	 * 找寻系统权限表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysAuthorityId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public SysAuthority findSysAuthority(Integer sysAuthorityId);

	/**
	 * 更新系统权限表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysAuthority
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysAuthority(SysAuthority sysAuthority);

	/**
	 * 动态更新系统权限表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysAuthority
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysAuthority2(SysAuthority sysAuthority);

	/**
	 * 删除系统权限表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysAuthority
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteSysAuthority(SysAuthority sysAuthority);

	/**
	 * 查询系统权限表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<SysAuthority> querySysAuthority(Map<String, Object> queryParamMap);

	/**
	 * 找寻系统权限表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public SysAuthority findSysAuthority2(Map<String, Object> queryParamMap);

	/**
	 * 找寻系统权限表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public SysAuthority findSysAuthority3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询系统权限表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysAuthorityCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询系统权限表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<SysAuthority> queryPaginationSysAuthorityList(Map<String, Object> queryParamMap);

	/**
	 * 新建菜单项的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysMenuOption
	 *            被保存的实体对象
	 * @return
	 */
	public void saveSysMenuOption(SysMenuOption sysMenuOption);

	/**
	 * 找寻菜单项的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysMenuOptionId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public SysMenuOption findSysMenuOption(Integer sysMenuOptionId);

	/**
	 * 更新菜单项的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysMenuOption
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysMenuOption(SysMenuOption sysMenuOption);

	/**
	 * 动态更新菜单项的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysMenuOption
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysMenuOption2(SysMenuOption sysMenuOption);

	/**
	 * 删除菜单项的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysMenuOption
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteSysMenuOption(SysMenuOption sysMenuOption);

	/**
	 * 查询菜单项的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<SysMenuOption> querySysMenuOption(Map<String, Object> queryParamMap);

	/**
	 * 找寻菜单项的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public SysMenuOption findSysMenuOption2(Map<String, Object> queryParamMap);

	/**
	 * 找寻菜单项的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public SysMenuOption findSysMenuOption3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询菜单项的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysMenuOptionCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询菜单项的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<SysMenuOption> queryPaginationSysMenuOptionList(Map<String, Object> queryParamMap);

	/**
	 * 新建角色表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysRole
	 *            被保存的实体对象
	 * @return
	 */
	public void saveSysRole(SysRole sysRole);

	/**
	 * 找寻角色表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysRoleId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public SysRole findSysRole(Integer sysRoleId);

	/**
	 * 更新角色表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysRole
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysRole(SysRole sysRole);

	/**
	 * 动态更新角色表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysRole
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysRole2(SysRole sysRole);

	/**
	 * 删除角色表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysRole
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteSysRole(SysRole sysRole);

	/**
	 * 查询角色表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<SysRole> querySysRole(Map<String, Object> queryParamMap);

	/**
	 * 找寻角色表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public SysRole findSysRole2(Map<String, Object> queryParamMap);

	/**
	 * 找寻角色表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public SysRole findSysRole3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询角色表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysRoleCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询角色表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<SysRole> queryPaginationSysRoleList(Map<String, Object> queryParamMap);

	/**
	 * 新建角色和权限之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysRoleAuthority
	 *            被保存的实体对象
	 * @return
	 */
	public void saveSysRoleAuthority(SysRoleAuthority sysRoleAuthority);

	/**
	 * 找寻角色和权限之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysRoleAuthorityId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public SysRoleAuthority findSysRoleAuthority(Integer sysRoleAuthorityId);

	/**
	 * 更新角色和权限之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysRoleAuthority
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysRoleAuthority(SysRoleAuthority sysRoleAuthority);

	/**
	 * 动态更新角色和权限之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysRoleAuthority
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysRoleAuthority2(SysRoleAuthority sysRoleAuthority);

	/**
	 * 删除角色和权限之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysRoleAuthority
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteSysRoleAuthority(SysRoleAuthority sysRoleAuthority);

	/**
	 * 查询角色和权限之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<SysRoleAuthority> querySysRoleAuthority(Map<String, Object> queryParamMap);

	/**
	 * 找寻角色和权限之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public SysRoleAuthority findSysRoleAuthority2(Map<String, Object> queryParamMap);

	/**
	 * 找寻角色和权限之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public SysRoleAuthority findSysRoleAuthority3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询角色和权限之间的关系表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysRoleAuthorityCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询角色和权限之间的关系表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<SysRoleAuthority> queryPaginationSysRoleAuthorityList(Map<String, Object> queryParamMap);

	/**
	 * 新建帐号表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUser
	 *            被保存的实体对象
	 * @return
	 */
	public void saveSysUser(SysUser sysUser);

	/**
	 * 找寻帐号表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public SysUser findSysUser(Integer sysUserId);

	/**
	 * 更新帐号表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUser
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUser(SysUser sysUser);

	/**
	 * 动态更新帐号表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUser
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUser2(SysUser sysUser);

	/**
	 * 删除帐号表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUser
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteSysUser(SysUser sysUser);

	/**
	 * 查询帐号表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<SysUser> querySysUser(Map<String, Object> queryParamMap);

	/**
	 * 找寻帐号表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public SysUser findSysUser2(Map<String, Object> queryParamMap);

	/**
	 * 找寻帐号表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public SysUser findSysUser3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询帐号表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysUserCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询帐号表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<SysUser> queryPaginationSysUserList(Map<String, Object> queryParamMap);

	/**
	 * 新建用户组表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroup
	 *            被保存的实体对象
	 * @return
	 */
	public void saveSysUserGroup(SysUserGroup sysUserGroup);

	/**
	 * 找寻用户组表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroupId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public SysUserGroup findSysUserGroup(Integer sysUserGroupId);

	/**
	 * 更新用户组表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroup
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUserGroup(SysUserGroup sysUserGroup);

	/**
	 * 动态更新用户组表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroup
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUserGroup2(SysUserGroup sysUserGroup);

	/**
	 * 删除用户组表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroup
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteSysUserGroup(SysUserGroup sysUserGroup);

	/**
	 * 查询用户组表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<SysUserGroup> querySysUserGroup(Map<String, Object> queryParamMap);

	/**
	 * 找寻用户组表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public SysUserGroup findSysUserGroup2(Map<String, Object> queryParamMap);

	/**
	 * 找寻用户组表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public SysUserGroup findSysUserGroup3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询用户组表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysUserGroupCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询用户组表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<SysUserGroup> queryPaginationSysUserGroupList(Map<String, Object> queryParamMap);

	/**
	 * 新建用户组和角色之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroupRole
	 *            被保存的实体对象
	 * @return
	 */
	public void saveSysUserGroupRole(SysUserGroupRole sysUserGroupRole);

	/**
	 * 找寻用户组和角色之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroupRoleId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public SysUserGroupRole findSysUserGroupRole(Integer sysUserGroupRoleId);

	/**
	 * 更新用户组和角色之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroupRole
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUserGroupRole(SysUserGroupRole sysUserGroupRole);

	/**
	 * 动态更新用户组和角色之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroupRole
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUserGroupRole2(SysUserGroupRole sysUserGroupRole);

	/**
	 * 删除用户组和角色之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserGroupRole
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteSysUserGroupRole(SysUserGroupRole sysUserGroupRole);

	/**
	 * 查询用户组和角色之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<SysUserGroupRole> querySysUserGroupRole(Map<String, Object> queryParamMap);

	/**
	 * 找寻用户组和角色之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public SysUserGroupRole findSysUserGroupRole2(Map<String, Object> queryParamMap);

	/**
	 * 找寻用户组和角色之间的关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public SysUserGroupRole findSysUserGroupRole3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询用户组和角色之间的关系表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysUserGroupRoleCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询用户组和角色之间的关系表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<SysUserGroupRole> queryPaginationSysUserGroupRoleList(Map<String, Object> queryParamMap);

	/**
	 * 新建用户和用户组之间关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserUserGroup
	 *            被保存的实体对象
	 * @return
	 */
	public void saveSysUserUserGroup(SysUserUserGroup sysUserUserGroup);

	/**
	 * 找寻用户和用户组之间关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserUserGroupId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public SysUserUserGroup findSysUserUserGroup(Integer sysUserUserGroupId);

	/**
	 * 更新用户和用户组之间关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserUserGroup
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUserUserGroup(SysUserUserGroup sysUserUserGroup);

	/**
	 * 动态更新用户和用户组之间关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserUserGroup
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateSysUserUserGroup2(SysUserUserGroup sysUserUserGroup);

	/**
	 * 删除用户和用户组之间关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param sysUserUserGroup
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteSysUserUserGroup(SysUserUserGroup sysUserUserGroup);

	/**
	 * 查询用户和用户组之间关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<SysUserUserGroup> querySysUserUserGroup(Map<String, Object> queryParamMap);

	/**
	 * 找寻用户和用户组之间关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public SysUserUserGroup findSysUserUserGroup2(Map<String, Object> queryParamMap);

	/**
	 * 找寻用户和用户组之间关系表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public SysUserUserGroup findSysUserUserGroup3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询用户和用户组之间关系表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationSysUserUserGroupCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询用户和用户组之间关系表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<SysUserUserGroup> queryPaginationSysUserUserGroupList(Map<String, Object> queryParamMap);

	/**
	 * 新建帐号激活表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param userEnableRecord
	 *            被保存的实体对象
	 * @return
	 */
	public void saveUserEnableRecord(UserEnableRecord userEnableRecord);

	/**
	 * 找寻帐号激活表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param userEnableRecordId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public UserEnableRecord findUserEnableRecord(Integer userEnableRecordId);

	/**
	 * 更新帐号激活表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param userEnableRecord
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateUserEnableRecord(UserEnableRecord userEnableRecord);

	/**
	 * 动态更新帐号激活表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param userEnableRecord
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateUserEnableRecord2(UserEnableRecord userEnableRecord);

	/**
	 * 删除帐号激活表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param userEnableRecord
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteUserEnableRecord(UserEnableRecord userEnableRecord);

	/**
	 * 查询帐号激活表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<UserEnableRecord> queryUserEnableRecord(Map<String, Object> queryParamMap);

	/**
	 * 找寻帐号激活表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public UserEnableRecord findUserEnableRecord2(Map<String, Object> queryParamMap);

	/**
	 * 找寻帐号激活表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public UserEnableRecord findUserEnableRecord3(@Param("paramName") String paramName,
			@Param("paramValue") Object paramValue);

	/**
	 * 分页查询帐号激活表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationUserEnableRecordCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询帐号激活表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<UserEnableRecord> queryPaginationUserEnableRecordList(Map<String, Object> queryParamMap);

	/**
	 * 新建验证码表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param verifyCode
	 *            被保存的实体对象
	 * @return
	 */
	public void saveVerifyCode(VerifyCode verifyCode);

	/**
	 * 找寻验证码表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param verifyCodeId
	 *            要找寻的实体记录的主键值
	 * @return
	 */
	public VerifyCode findVerifyCode(Integer verifyCodeId);

	/**
	 * 更新验证码表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param verifyCode
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateVerifyCode(VerifyCode verifyCode);

	/**
	 * 动态更新验证码表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param verifyCode
	 *            被编辑更新的实体对象
	 * @return
	 */
	public void updateVerifyCode2(VerifyCode verifyCode);

	/**
	 * 删除验证码表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param verifyCode
	 *            被删除的实体对象
	 * @return
	 */
	public void deleteVerifyCode(VerifyCode verifyCode);

	/**
	 * 查询验证码表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public List<VerifyCode> queryVerifyCode(Map<String, Object> queryParamMap);

	/**
	 * 找寻验证码表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public VerifyCode findVerifyCode2(Map<String, Object> queryParamMap);

	/**
	 * 找寻验证码表的实体记录
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param paramName
	 *            参数名称
	 * @param paramValue
	 *            匹配的参数值
	 * @return
	 */
	public VerifyCode findVerifyCode3(@Param("paramName") String paramName, @Param("paramValue") Object paramValue);

	/**
	 * 分页查询验证码表的实体记录：统计总记录数
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param queryParamMap
	 *            查询参数集合
	 * @return
	 */
	public Integer queryPaginationVerifyCodeCount(Map<String, Object> queryParamMap);

	/**
	 * 分页查询验证码表的实体记录：查询当前页的列表
	 * 
	 * 
	 * 开发时间：2017-09-12 14:35
	 * 
	 * @author：moshco zhu
	 * @param pageSize
	 *            页面尺寸
	 * @return
	 */
	public List<VerifyCode> queryPaginationVerifyCodeList(Map<String, Object> queryParamMap);

	/**
	 * 通过唯一索引字段找寻用户
	 * 
	 * 
	 * 开发时间：2017年9月25日 下午2:20:32
	 * 
	 * @author：moshco zhu
	 * @param userName
	 * @return
	 */
	SysUser findSysUserByUserName(String userName);

	/**
	 * 找寻验证编码
	 * 
	 * 
	 * 开发时间：2017年9月25日 下午2:20:41
	 * 
	 * @author：moshco zhu
	 * @param queryParam
	 * @return
	 */
	VerifyCode findVerifyCodeByParams(Map<String, Object> queryParam);

	/**
	 * 找寻员工对象
	 * 
	 * 
	 * 开发时间：2017年9月25日 下午2:20:48
	 * 
	 * @author：moshco zhu
	 * @param userId
	 * @return
	 */
	Employee findEmployeeByUserId(Integer userId);

}
