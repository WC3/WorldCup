package cn.edu.shu.worldcup.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;

/**
 * 新闻的持久化类，包含新闻的id，标题，新闻发布用户，新闻发布时间，以及内容及图片地址
 * @author 陈超
 *
 */
public class News {

	//标识
	private Integer id;
	//标题
	private String title;
	//发布用户
	private String name;
	//发布时间
	private Date time;
	//新闻内容地址
	private String content;
	//图片地址
	private String images;
	//根据文件地址读取的文件内容
	private List<String> list = new ArrayList<String>();
	//格式化date
	private String timeStr;
	
	public String getTimeStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		timeStr = format.format(time);
		return timeStr;
	}

	public void setTimeStr(String timeStr) {
		this.timeStr = timeStr;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	/**
	 * 读取指定地址的文件并存入List集合中
	 * @return
	 */
	public List<String> getList() {
		//获取服务器的绝对路径读取文件
		String dstPath = ServletActionContext.getServletContext().getRealPath("NewsFiles")+ "\\";
		String path = content;
		File file = new File(dstPath  + path);
		InputStreamReader read = null;
		BufferedReader reader = null;
		try {
			read = new InputStreamReader(new FileInputStream(file), "UTF-8");
			reader = new BufferedReader(read);
			String line;
			while((line = reader.readLine()) != null) {
				list.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(read != null) {
				try {
					read.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	public News() {}
	
	public News(String title) {
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}
}
