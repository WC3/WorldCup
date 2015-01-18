package cn.edu.shu.worldcup.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

import cn.edu.shu.worldcup.domain.News;
import cn.edu.shu.worldcup.service.NewsService;

public class ManageNewsProAction implements Action {
	private List<File> upload;      		
	private List<String> uploadFileName;	
		
	private News news=new News(); ;
	private NewsService newsService;
	private Boolean flag;
	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public NewsService getNewsService() {
		return newsService;
	}

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	public List<File> getUpload() {
		return upload;
	}
	
	public void setUpload(List<File> upload) {
		this.upload=upload;
	}
	
	public List<String> getUploadFileName() {
		return uploadFileName;
	}
	
	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName=uploadFileName;
	}
	public String execute() throws Exception {
		System.out.println("start");
		System.out.println("title:"+news.getTitle());
		System.out.println("name:"+news.getName());
		System.out.println("content:"+news.getContent());
		System.out.println("image:"+news.getImages());
		System.out.println("time:"+news.getTime());
		//long time=-1800; 
		news.setTime(new Date()); 
		System.out.println("time:"+news.getTime());
		
			if(upload!=null)
			{
				for (int i=0; i < upload.size(); i++) {  
					String dstPath = ServletActionContext.getServletContext().getRealPath("NewsFiles")+ "\\";
					InputStream is=new FileInputStream(upload.get(i));
					OutputStream os= new FileOutputStream(dstPath + getUploadFileName().get(i));
					byte buffer[]=new byte[1024];
					int count=0;
					while((count=is.read(buffer))>0){
						os.write(buffer,0,count);
					}
					os.close();
					is.close();
				}
				news.setContent(getUploadFileName().get(0));
				news.setImages(getUploadFileName().get(1));
				newsService.save(getNews());
				
				return SUCCESS;
			}
			else
			{
				return ERROR;
			}
		
	}
}
