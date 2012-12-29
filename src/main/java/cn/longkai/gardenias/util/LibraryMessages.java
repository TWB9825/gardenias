package cn.longkai.gardenias.util;

/**
 * 记录一些常用的字符串-_-.
 * 
 * @author longkai
 * @since 2012-12-29
 */
public class LibraryMessages {

	/** 账号已经被注册过了 */
	public static final String ACCOUNT_HAS_BEEN_REGISTERED = "对不起，改账号已经被注册过啦！";
	
	/** 登录失败 */
	public static final String LOGIN_FAIL = "对不起，登录失败！";
	
	/** 由于有欠款，操作失败 */
	public static final String FAIL_FOR_HAS_CHARGES = "对不起，您有欠款未交付，操作失败！";
	
	/** 因为有剩余图书，预约图书失败 */
	public static final String BOOKING_FAIL_FOR_HAS_BOOKS_REMAIN = "对不起，这本书还未被借阅，您可以借阅，不需要预约！";
	
	/** 由于预约的图书数目已经达到最大值，预约图书失败 */
	public static final String BOOKING_FAIL_FOR_MAX_BOOKING_NUMBER = "对不起，您所预约的图书数目已经达到最大值，预约失败！";
	
	/** 由于预约图书被借光了，借阅图书失败 */
	public static final String LEND_FAIL_FOR_NONE_BOOKS = "对不起，您想借阅的图书已经被全部借出，请等待其返还！";
	
	/** 借阅的图书数目已经达到最大值，借阅失败 */
	public static final String LEND_FAIL_FOR_MAX_BOOK_BORROWED = "对不起，您所借阅的图书数目已经达到最大值，借阅失败！";
	
	/** 借阅的图书已经被预定了，借书失败 */
	public static final String LEND_FAIL_FOR_HAS_BEEN_BOOKED = "对不起，您所借阅的图书已经被预定了，借书失败！";
	
}
