package com.fire.fastdfs;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.border.StrokeBorder;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

import com.fire.utils.FastDFSClient;

/**
 * 图片上传测试
 * <p>Title: FastDFSTest</p>
 * <p>Description: </p>
 * <p>Company: www.fire.com</p> 
 * @author fire
 * @date	2017年5月21日上午9:01:01
 * @version 1.0
 */
public class FastDFSTest {

	@Test
	public void uploadFile() throws FileNotFoundException, IOException, MyException{
		//1.向工程中添加依赖的jar包
		//2.创建配置文件，配置tracker服务器地址。
		//3.加载配置文件
		ClientGlobal.init("D:/workspace-sts-3.8.4.RELEASE/fire-manager-web/src/main/resources/resource/client.conf");
		//4.创建一个trackerclient对象
		TrackerClient trackerClient = new TrackerClient();
		//5.使用trackerclient对象获得trackerserver对象
		TrackerServer trackerServer = trackerClient.getConnection();
		//6.创建一个storageserver的引用，null就可以
		StorageServer storageServer = null;
		//7.创建一个storageclient对象。trackerserver，storageserver两个参数
		StorageClient storageClient = new StorageClient(trackerServer, storageServer);
		//8.使用storageclient上传文件
		String[] strings = storageClient.upload_file("D:/test.jpg", "jpg", null);
		for (String string : strings) {
			System.out.println(string);
		}
	}
	
	@Test 
	public void testFastDFSClient() throws Exception{
		FastDFSClient fastDFSClient = new FastDFSClient("D:/workspace-sts-3.8.4.RELEASE/fire-manager-web/src/main/resources/resource/client.conf");
		String string = fastDFSClient.uploadFile("D:/demo.jpg");
		System.out.println(string);
	}
}
